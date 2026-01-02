package com.funnygorila.learnoo;

public abstract class Employee implements EmployeeIF{
	
	private int emoloyeeId;
	private String name;

	public Employee(int emoloyeeId, String name) {
		this.emoloyeeId = emoloyeeId;
		this.name = name;
	}
	
	public int getEmoloyeeId() {
		return emoloyeeId;
	}

	public void setEmoloyeeId(int emoloyeeId) {
		this.emoloyeeId = emoloyeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void reachOffice() {
	     System.out.println(this.getName() + " reached office - Sydney, Australia");
    }
	
	public abstract void startWork ();

}
