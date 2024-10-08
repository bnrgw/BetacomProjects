package com.betacom.projectinner;

public class Inner {
  private String fatherClass;
  
  private int numero;

  public Figlio f ;// mi permette ad amdare su la classe figlio
  
  
  
  public class Figlio{
	  private int numero2;
	  final Nipote n = new Nipote();
	  
	  
	  //local class
	  class Nipote{
		  private int numero3;
		  
		  public void showNipoteParams() {
			  System.out.println("nipote numero3:" + numero3 + " numero2:" + numero2 + " padre numeero" + numero);
		  }

		public int getNumero3() {
			return numero3;
		}

		public void setNumero3(int numero3) {
			this.numero3 = numero3;
		}
	  }
	  
	  public void showFiglioParameters() {
		  System.out.println("figlio numero 2:" + numero2 + "padre numero:" + numero);
	  }

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
  }
  
  
  
  
  
  
  public Figlio setInstance() {
	  f= new Figlio();
	  return f;
  }
  
  
public Figlio getF() {
	return f;
}

public void setF(Figlio f) {
	this.f = f;
}

public String getFatherClass() {
	return fatherClass;
}

public void setFatherClass(String fatherClass) {
	this.fatherClass = fatherClass;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}
}
