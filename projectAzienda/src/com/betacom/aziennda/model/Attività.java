package com.betacom.aziennda.model;

public class Attività {
     private Integer id;
     private String attività;
     
     
   
	public Attività() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAttività() {
		return attività;
	}
	public void setAttività(String attività) {
		this.attività = attività;
	}
	
	@Override
	public String toString() {
		return "Attività [id=" + id + ", attività=" + attività + "]";
	}
	
	
     
}
