package com.betacom.serializzazione;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainSer {

	public static void main(String[] args) {
	/*
	 * un client deve parlare con un server tramitte la rete, e non si puo usare json , deve passare un oggetto
	 * un oggetto non puo esere passsata sulla rete
	 * il cambio dell''oggetto in binario (byte)
	 * per il server al client si fa l'inverso(deserializazione) da linguaggio macchina (byte) a oggetto java
	 */
		
		Address address = new Address();
		address.setCity("Torino");
		address.setStreet("Via Roma");
		address.setName("Alex");
		
		try {
			FileOutputStream fout = new FileOutputStream("/C:\\Users\\Betacom\\Desktop\\address.ser");
			ObjectOutputStream  oos = new ObjectOutputStream(fout);// per cambiare l'oggetto in binario
			oos.writeObject(address);//questo metodo writeobject è applicabile solo a metodi serializzabili
			oos.close();
			
			System.out.println("Done");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
