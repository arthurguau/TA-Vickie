from datetime import datetime, timedelta

from airflow import DAG
#from airflow.sensors.filesystem import FileSensor
from airflow.providers.standard.sensors.filesystem import FileSensor
from airflow.providers.standard.operators.empty import EmptyOperator

# DAG config
DEFAULT_ARGS = {
    "owner": "FunnygorillaLab",
    "retries": 1,
    "retry_delay": time delta(minutes=5),
}

with DAG(
    dag_id="file_sensor_example",
    description="Apache Airflow file sensor example that waits for a daily drop",
    default_args=DEFAULT_ARGS,
    start_date=datetime(2026, 5, 23),
    schedule='@daily',
    catchup=False,
    max_active_runs=1,
    tags=["sensors", "filesystem"],
) as dag:

    # Wait for a file like /opt/ingest/funnygorilla/sales_2025-10-04.csv
    wait_for_file = FileSensor(
        task_id="wait_for_daily_sales_file",
        filepath="/opt/ingest/funnygorilla/sales_{{ ds_nodash }}.csv",
        fs_conn_id="fs_default",          # or leave None for local FS
        poke_interval=90,                 # check every 90 seconds
        timeout=6 * 60 * 60,              # give up after 6 hours
        mode="reschedule",                # free up the worker between pokes
        soft_fail=False,                  # set True if you want downstream to skip instead of fail
    )

    process_file = EmptyOperator(task_id="process_file_placeholder")

    wait_for_file >> process_file