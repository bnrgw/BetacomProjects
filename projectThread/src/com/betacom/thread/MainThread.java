package com.betacom.thread;

public class MainThread {

	public static void main(String[] args) {
		
		AutoGrande gs = new AutoGrande("Mercedes", "Model 1", "AX3456X", 2500);
		AutoPiccola pc = new AutoPiccola("Fiat","500", "CGFUNH877",1500);
		Moto mt = new Moto("Susuki","Ninja","EF123FHX", 900);

		
		Thread t1 = new Thread(gs);
		Thread t2 = new Thread(pc);
		
		t1.start();
		t2.start();
		mt.start();
		
		
	}
	//fare class run che chiama l'ex mainn del progetto che e diventato una classe normale

}
