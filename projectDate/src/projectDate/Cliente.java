package projectDate;

import java.util.Date;
import java.util.GregorianCalendar;

public class Cliente {

	private String nome;
	private String cognome;
	private Date nascita;
	private int eta;
	
	
	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public Cliente(String nome,String cognome,int anno, int mese,int giorno) {
		this.nome= nome;
		this.cognome = cognome;
		GregorianCalendar c = new GregorianCalendar(anno, mese, giorno);
		this.nascita =c.getTime();
	}
	
	public Cliente(String nome,String cognome,int anno) {
		
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", nascita=" + nascita + "]";
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getNascita() {
		return nascita;
	}
	public void setNascita(Date nascita) {
		this.nascita = nascita;
	}
	
	
}
