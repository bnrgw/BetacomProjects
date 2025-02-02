package com.betacom.json.object;

public class Data {
	private int giorno;
	private int mese;
	private int anno;
	public int getGiorno() {
		return giorno;
	}
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}
	public int getMese() {
		return mese;
	}
	public void setMese(int mese) {
		this.mese = mese;
	}
	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	public Data(int giorno, int mese, int anno) {
		super();
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Data [giorno=" + giorno + ", mese=" + mese + ", anno=" + anno + "]";
	}
}
