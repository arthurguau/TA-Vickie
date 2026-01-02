package com.funnygorila.learnoo;

import java.util.ArrayList;
import java.util.List;

import com.funnygorila.learnoo.programmer.JavaProgrammer;
import com.funnygorila.learnoo.programmer.MobileAppProgrammer;
import com.funnygorila.learnoo.director.Director;
import com.funnygorila.learnoo.manager.*;
import com.funnygorila.learnoo.team.*;

public class Main {
	
	public static void main (String[] args) {

		//-- [toDo]
		//-- add company logic to wrap team and Dirctor to provide company level services

				
		// variable/reference type (MobileAppExpert) vs object type (Manager)
		ManagerIF Peter = new Manager(1, "Peter");
		
		ProgrammerIF Mike = new JavaProgrammer (2, "Mike");	
		ProgrammerIF Susan = new MobileAppProgrammer (3, "Susan");	
		
		// setup team
		Team team = new ProjectTeam();
		team.assignManager(Peter);
		team.assignProgrammer(Susan);
		team.assignProgrammer(Mike);
				
		// kickoff a project
		team.kickOffProject();	
		
		// everyone need to come to office
		List <EmployeeIF> employees = new ArrayList <EmployeeIF>();		
		employees.add(Peter);
		employees.add(Mike);
		employees.add(Susan);
				
		// programming to interface
		for (EmployeeIF employee : employees) {
			employee.reachOffice();
		}
		
		System.out.println("Hello, Funnygorilla!");
	}

}
