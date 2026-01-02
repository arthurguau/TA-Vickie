package com.funnygorila.learnoo.programmer;

import com.funnygorila.learnoo.Employee;
import com.funnygorila.learnoo.ProgrammerIF;

public class JavaProgrammer extends Employee implements ProgrammerIF{
	
	public JavaProgrammer(int emoloyeeId, String name) {
		super(emoloyeeId, name);
	}
	
	// do not expect return anything.
	public void startWork () {
	    System.out.println("Java Programmer work starts");
		defineClasses();
		unitTestCode();
	}
	
	private void defineClasses() { 
		System.out.println("-- define classes"); 
	}

	private void unitTestCode() { 
		System.out.println("-- unit test code"); 
	} 
	 
    //------------------------------------------------ interface methods
    public void deliverApplication() {
    	deliverJavaApplication();
    }
    
    private void deliverJavaApplication() {
	    System.out.println("Java Programmer deliver Java app");
    }

}


