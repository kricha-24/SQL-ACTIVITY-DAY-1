package com.ltts.model;

public class Compare {
	private String name, skill, nl; 
	   Compare(String name, String skill, String nl){
	      this.name = name;
	      this.skill = skill;
	      this.nl = nl;
	   }
	   public boolean equals(Object obj) {
	      if (obj == this) {
	         return true;
	      }
	      if (!(obj instanceof Compare)) {
	         return false;
	      }
	      Compare emp = (Compare) obj;
	      return name.equals(emp.name)&& skill.equals(emp.skill)  && nl.equals(emp.nl);
	   }
}
