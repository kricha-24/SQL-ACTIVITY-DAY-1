package com.ltts.model;

import java.time.LocalDate;
import java.util.Date;

public class Player {
	private String name;
	private LocalDate dateOfBirth;
	private String skill;
	private int noOfMatch;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getNoOfMatch() {
		return noOfMatch;
	}
	public void setNoOfMatch(int noOfMatch) {
		this.noOfMatch = noOfMatch;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	public Player(String name, LocalDate dateOfBirth, String skill, int noOfMatch, int runs, int wickets, String nationality,
			double powerRating) {
		super();
		this.name = name;
		this.skill = skill;
		this.dateOfBirth = dateOfBirth;
		this.noOfMatch = noOfMatch;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	@Override
	public String toString() {
	return "Name: " + name +"\n" + "Skill: " + skill +"\n"+ " DOB: " +"\n"+ dateOfBirth+"\n" + " Number of Matches: " + noOfMatch+"\n"+ " Runs: " + runs+"\n" +" Wickets: " + wickets+"\n" + " Nationality: " + nationality+"\n" + " Power Rating: "
				+ powerRating + "";
	}
	
	public boolean equals(Object obj) {
	      if (obj == this) {
	         return true;
	      }
	      if (!(obj instanceof Compare)) {
	         return false;
	      }
	     Player emp = (Player) obj;
	      return name.equals(emp.name)&& skill.equals(emp.skill)  && nationality.equals(emp.nationality);
	   }
	
	
	
}