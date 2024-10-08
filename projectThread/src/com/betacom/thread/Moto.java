package com.betacom.thread;

public class Moto extends Thread{
	
	private String marca;
	private String modello;
	private String targa;
	private int cilindrata;
	
	
	public Moto(String marca, String modello, String targa, int cilindrata) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.cilindrata = cilindrata;
	}
	
	public String getMessage() {
		return "" + this +  this.marca + " Modello "
				+ this.modello +" cilindrata " + this.cilindrata;
	}

	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", targa=" + targa + ", cilindrata=" + cilindrata
				+ "]";
	}
	
	@Override
	public void run() {
		System.out.println("Il thread " + this + "ha iniziato l'esecuzione");
		System.out.println(this.getMessage());
		
		
		
		System.out.println("Moto before sleep");
		try {
			Thread.sleep(3000,1);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Il thread " + this + " sta per terminare......");
		}
	}
	
	
	
	//l'unica differenza tra quersta classe e auto grande e picccola è che gli altri implementano direttamente runnable 
	//mentre questa implemenmta thread che usa tutti i metodi di runnable
	

