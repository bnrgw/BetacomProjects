package com.betacom.car;
import com.betacom.car.oggetti.singleton.ReadFile;



import java.util.ArrayList;
import java.util.List;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Bici;
import com.betacom.car.oggetti.Macchina;
import com.betacom.car.oggetti.Moto;
import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.oggetti.singleton.Mysingleton;
import com.betacom.car.servizi.implementazione.GestionSingleton;
import com.betacom.car.servizi.implementazione.GestionSystem;
import com.betacom.car.servizi.implementazione.GestioneBici;
import com.betacom.car.servizi.implementazione.GestioneMacchina;
import com.betacom.car.servizi.implementazione.GestioneMoto;
import com.betacom.car.serviziinterface.IGestioneVeicolo;
public class Main {
	
	private static IGestioneVeicolo gm = new GestioneMacchina();
	private static IGestioneVeicolo gmo = new GestioneMoto();
	private static IGestioneVeicolo gmb = new GestioneBici();
	private static GestionSystem gs= new GestionSystem();
	
	/*private static  Macchina createMacchina(Macchina paramcar) {
		
		
		 Macchina mac = null;
		 try {
			 mac = (Macchina)gm.createVeicolo(paramcar);// CAST del veicolo ritornato dal metodo createVeicolo in una macchina
		 }catch (AcademyException e) {
			 System.out.println("Error" + " " + e.getMessage());
		 }finally {
			System.out.println("metodo create macchina eseguito");
		 }
		return mac;
	}*/
	
	private static  Moto createMoto(Moto paramoto) {
		
		
		 Moto moto = null;
		 try {
			 moto = (Moto)gmo.createVeicolo(paramoto);// CAST del veicolo ritornato dal metodo createVeicolo in una macchina
		 }catch (AcademyException e) {
			 System.out.println("Error" + " " + e.getMessage());
		 }finally {
			System.out.println("metodo  create moto eseguito");
		 }
		return moto;
	}
	
	private static  Bici createBici(Bici parambici) {
		
		
		 Bici bici = null;
		 try {
			 bici = (Bici)gmb.createVeicolo(parambici);// CAST del veicolo ritornato dal metodo createVeicolo in una macchina
		 }catch (AcademyException e) {
			 System.out.println("Error" + " " + e.getMessage());
		 }finally {
			System.out.println("metodo create bici eseguito");
		 }
		return bici;
	}
	
	
	/*private static	Macchina getMacchina(Integer id) {
		Macchina mac = null;
		 try {
		mac = (Macchina) gm.getVeicolo(id);
			 
		 }catch(AcademyException e ){
			 System.out.println("Error" + " " + e.getMessage());
		 }finally {
			System.out.println("metodo get macchina eseguito");
		 }
		 return mac;
	}
	

	private static	Moto getMoto(Integer id) {
		Moto mot = null;
		 try {
		mot = (Moto) gmo.getVeicolo(id);
			 
		 }catch(AcademyException e ){
			 System.out.println("Error" + " " + e.getMessage());
		 }finally {
			System.out.println("metodo get Moto eseguito");
		 }
		 return mot;
	}
	
	

	private static	Bici getBici(Integer id) {
		Bici bici = null;
		 try {
		bici = (Bici) gm.getVeicolo(id);
			 
		 }catch(AcademyException e ){
			 System.out.println("Error" + " " + e.getMessage());
		 }finally {
			System.out.println("metodo get bici eseguito");
		 }
		 return bici;
	}*/
	
private static	void removeMacchina(Integer id) {
		 try {
			 gm.removeVeicolo(id);
		 }catch(AcademyException e ){
			 System.out.println("Error" + " " + e.getMessage());
		 }finally {
			System.out.println("metodo remove macchina eseguito");
		 }
	}

private static	void removeMoto(Integer id) {
	
	 try {
		 gmo.removeVeicolo(id);
	 }catch(AcademyException e ){
		 System.out.println("Error" + " " + e.getMessage());
	 }finally {
		System.out.println("metodo remove moto eseguito");
	 }
}

private static	void removeBici(Integer id) {
	 
	 try {
		 gmb.removeVeicolo(id);
	 }catch(AcademyException e ){
		 System.out.println("Error" + " " + e.getMessage());
	 }finally {
		System.out.println("metodo remove bici eseguito");
	 }
}
	/////////METODO MAIN//////////////////////////////////////////////

	public static void main(String[] args) {
		
	
	/////SPECIFICARE  IN COMMENTO TUTTO CIO CHE SERVE PER CREARE UN VEICOLO E ILO SUOI TIPI

		
		Macchina paramcar = new Macchina();
		Moto paramoto = new Moto();
		Bici parambici = new Bici();

		paramcar.setNumeroRuote(4);
		paramcar.setVelocità(30);
		paramcar.setId(1);
		paramcar.setTipoAlimentazione("benzina");
		paramcar.setTipoVeicolo("Fuosistrada");
		paramcar.setNumeroPorte(4);
		paramcar.setTarga("targa");
		paramcar.setCc(70);
		
		//Macchina mac = createMacchina(paramcar);
		
		paramoto.setVelocità(20);
		paramoto.setTipoAlimentazione("gasolio");
		paramoto.setNumeroRuote(2);
		paramoto.setId(3);
		//Moto mot = createMoto(paramoto);
		
		parambici.setVelocità(10);
		parambici.setId(3);
		parambici.setTipoAlimentazione("elettricità");
		parambici.setNumeroRuote(2);
		//Bici bici = createBici(parambici);
		
		//Macchina macch = getMacchina(3);
		
		//Mysingleton.getInstance().updateList(bici);
		/*Mysingleton.getInstance().updateList(mot);
		Mysingleton.getInstance().updateList(mac);*/
		
		//removeBici(2);
		
		gs.createVeicolo(paramcar);
		//gs.showListVeicoli();
		
		
		//gs.removeVeicolo(paramcar);
		gs.showListVeicoli();
		//gs.showListVeicoli();
		gs.getVeicolo(1);
		
		
		
		
		
		
		//Mysingleton.getInstance().displayList();
		
		/*for(Veicolo it: veicoli) {
		
			System.out.println("velocità: " + it.getVelocità() + ", Tipo alimentazione: " + it.getTipoAlimentazione() + ", numero ruote: " + it.getNumeroRuote() + it.getDataCreazione());
		}*/
			
			
			
			
			
			
			
      
	}
	

}
