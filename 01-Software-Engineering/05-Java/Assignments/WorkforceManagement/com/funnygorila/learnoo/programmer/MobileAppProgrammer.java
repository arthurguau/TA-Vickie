package com.funnygorila.learnoo.programmer;

import com.funnygorila.learnoo.Employee;
import com.funnygorila.learnoo.ProgrammerIF;

public class MobileAppProgrammer extends Employee implements ProgrammerIF{

	public MobileAppProgrammer(int emoloyeeId, String name) {
		super(emoloyeeId, name);
	}
	
	// do not expect return anything.
	public void startWork () {
	    System.out.println("Mobile Programmer work starts");
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
    	deliverMobileApplication(); 
    }
    
    private void deliverMobileApplication() {
	    System.out.println("Programmer deliver Mobile app");
    }
}
