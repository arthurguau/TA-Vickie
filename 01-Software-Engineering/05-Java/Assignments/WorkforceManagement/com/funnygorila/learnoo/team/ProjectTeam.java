package com.funnygorila.learnoo.team;

import java.util.List;
import java.util.ArrayList;

import com.funnygorila.learnoo.ProgrammerIF;
import com.funnygorila.learnoo.Team;
import com.funnygorila.learnoo.ManagerIF;

public class ProjectTeam implements Team {
	
	private ManagerIF manager;    
	private List <ProgrammerIF> programmers;
	
	public ProjectTeam() {
		programmers = new ArrayList<ProgrammerIF>();
	}
	
	public ProjectTeam(ManagerIF manager, List <ProgrammerIF> programmers) {
		this.programmers = programmers;
		this.manager = manager;
	}
	
	public void kickOffProject() {
		
		this.manager.startWork();
		System.out.println(" ");
		
		//-- programming to interface
		for (ProgrammerIF programmer : this.programmers) {			
			 programmer.startWork();
			 System.out.println(" ");
		}						
	}
	
	public void assignProgrammer (ProgrammerIF member) {
		programmers.add(member);
	}
	
	public void assignManager(ManagerIF manager) {
		this.manager = manager;
	}
}
