package com.funnygorila.learnoo.manager;

import com.funnygorila.learnoo.Employee;
import com.funnygorila.learnoo.ManagerIF;


public class Manager extends Employee implements ManagerIF
{
	public Manager(int emoloyeeId, String name) {
		super(emoloyeeId, name);
	}	
	
   //------------------------------------------------ interface methods	
   public void startWork() {
	   System.out.println("Manager work starts"); 
	   meetingWithCustomer();
	   defineProjectSchedule();
	   assignRespToTeam();
   }
   
   public void deliverApplication() {
	   System.out.println("Manager deliver app");
   }

   //------------------------------------------------ private methods	
   private void meetingWithCustomer() { 
      System.out.println("-- meet Customer"); 
   }

   private void defineProjectSchedule() { 
      System.out.println("-- Project Schedule"); 
   }

   private void assignRespToTeam() { 
      System.out.println("-- team work starts"); 
   } 

}
