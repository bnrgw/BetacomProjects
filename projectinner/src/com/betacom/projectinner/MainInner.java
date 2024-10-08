package com.betacom.projectinner;

import com.betacom.projectinner.Inner.Figlio;

public class MainInner {

	public static void main(String[] args) {
		
		Inner inner = new Inner();
		inner.setFatherClass("load father");
		inner.setNumero(5);
		
		System.out.println("execute class:"  + inner.getFatherClass() + " numero:" + inner.getNumero());
		
		/*inner.setF(inner.new Figlio());
		
		inner.getF().setNumero2(20);
		inner.getF().showFiglioParameters();*/

	   /* inner.setInstance();	
	    inner.getF().setNumero2(20);
		inner.getF().showFiglioParameters();*/
		
		Inner.Figlio figlio = inner.new Figlio();
		figlio.setNumero2(20);
		figlio.showFiglioParameters();
		
		figlio.n.setNumero3(50);
		figlio.n.showNipoteParams();
		
	}

}
