package com.betacom.exercise.mains;

public class MainExercise {

	public static void main(String[] args) {
	
		MainAzienda ma = new MainAzienda();
		MainCsv mc = new MainCsv();
		
		Thread t1= new Thread(ma);
		Thread t2= new Thread(mc);
		
		t1.start();
		t2.start();

	}

}
