package com.betacom.thread;

public class AutoPiccola extends Automobile implements Runnable{

	public AutoPiccola(String marca, String modello, String targa, int cilindrata) {
		super(marca, modello, targa, cilindrata);
		
	}

	@Override
	public String getType() {
		
		return "AutoPiccola";
	}

	@Override
	public void run() {
	System.out.println("Il thread " + this + "ha iniziato l'esecuzione");
	System.out.println(this.getMessage());
	

	System.out.println("AutoPiccola before sleep");
	try {
		Thread.sleep(2000,1);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	System.out.println("Il thread " + this + " sta per terminare......");
	}
	}


