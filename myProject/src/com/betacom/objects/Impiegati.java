package com.betacom.objects;

public class Impiegati extends User{
	Long Salary;
	@Override
	public void setTipo(Integer tipo) {
		super.setTipo(tipo);
	}
	public Long getSalary() {
		return Salary;
	}

	public void setSalary(Long salary) {
		Salary = salary;
	}
	
}
