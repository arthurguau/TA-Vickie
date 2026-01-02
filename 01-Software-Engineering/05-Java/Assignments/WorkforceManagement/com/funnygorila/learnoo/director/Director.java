package com.funnygorila.learnoo.director;

import com.funnygorila.learnoo.Employee;

public class Director extends Employee {
	
	public Director(int emoloyeeId, String name) {
		super(emoloyeeId, name);
	}
		
	
    public void startWork() {
	     xx();
	     yy();
	     zz();
    }

    private void xx() { 
        System.out.println("Meet xx"); 
    }

    private void yy() { 
        System.out.println("execute Project yy"); 
    }

   private void zz() { 
      System.out.println("Discuss with zz"); 
   } 
}
