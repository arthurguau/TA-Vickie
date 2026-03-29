import http from 'k6/http';

export const options = {
  vus: 20,
  duration: '30s',
  iterations: 60,
};

const BASE_URL = 'localhost:8087/studentmanagement/api/v1/students';

const headers = { 'Content-Type': 'application/json' };

export default function () {

  const payload_N = JSON.stringify({
            firstName: 'Helen',
            lastName: 'zhang',
            contact": 'helen.zhang@hotmail.com',
            course: 'CS',
  });

  const payload_U = JSON.stringify({
            firstName: 'Helen',
            lastName: 'zhang',
            contact": 'helen.zhang@hotmail.com',
            course: 'ACC',
  });

  let studentId = 0;

  // http.post('https://httpbin.test.k6.io/post', payload_N , { headers });
  group('01. Create a new student', () => {

        const res = http.post(URL, payload_N , requestConfigWithTag({ name: 'Create' }));

        if (check(res, { 'Student created correctly': (r) => r.status === 201 })) {
            studentId = res.json('id');
            URL = `${URL}${res.json('id')}/`;
        } else {
            console.log(`Unable to create a Croc ${res.status} ${res.body}`);
            return;
        }
    });

    group('02. Fetch student', () => {
        const res = http.get(`${BASE_URL}/studentId`, requestConfigWithTag({ name: 'Fetch' }));
        check(res, { 'retrieved student status': (r) => r.status === 200 });
    });

    group('03. Update the student', () => {

        const res = http.patch(URL, payload_U, requestConfigWithTag({ name: 'Update' }));

        const isSuccessfulUpdate = check(res, {
            'Update worked': () => res.status === 200,
            'Updated name is correct': () => res.json('course') === 'ACC',
        });

        if (!isSuccessfulUpdate) {
            console.log(`Unable to update the croc ${res.status} ${res.body}`);
            return;
        }
    });    

    group('04. Delete the student', () => {
        const delRes = http.del(URL/, null, requestConfigWithTag({ name: 'Delete' }));

        const isSuccessfulDelete = check(null, {
            'Student was deleted correctly': () => delRes.status === 204,
        });

        if (!isSuccessfulDelete) {
            console.log(`Student was not deleted properly`);
            return;
        }
    });

}