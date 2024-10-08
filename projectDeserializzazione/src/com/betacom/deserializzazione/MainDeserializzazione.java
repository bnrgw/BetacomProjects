package com.betacom.deserializzazione;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.betacom.serializzazione.Address;

public class MainDeserializzazione {

	public static void main(String[] args) {
		
		Address address;
		
		try {
			FileInputStream fin = new FileInputStream("/C:\\Users\\Betacom\\Desktop\\address.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			
			address = (Address)ois.readObject();
			ois.close()
;
		System.out.println(address);	
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
