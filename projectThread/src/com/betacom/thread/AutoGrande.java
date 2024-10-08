package com.betacom.thread;

public class AutoGrande extends Automobile implements Runnable{

	public AutoGrande(String marca, String modello, String targa, int cilindrata) {
		super(marca, modello, targa, cilindrata);
		
	}

	@Override
	public String getType() {
		
		return "AutoGrande";
	}

	@Override
	public void run() {
	System.out.println("Il thread " + this + "ha iniziato l'esecuzione");
	System.out.println(this.getMessage());
	
	
	
	System.out.println("AutoGrande before sleep");
	try {
		Thread.sleep(1000,1);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	System.out.println("Il thread " + this + " sta per terminare......");
	}

}
