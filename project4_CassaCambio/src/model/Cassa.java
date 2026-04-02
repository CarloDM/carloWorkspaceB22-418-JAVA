package model;

public class Cassa {

	private String nome;
	private double saldoEuro, fondoDollari;
	private static final double TASSO_CAMBIO = 1.15;
	
	public Cassa(String nome, double fondoDollari) {
		this.nome = nome;
		this.fondoDollari = fondoDollari;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldoEuro() {
		return saldoEuro;
	}

	public double getFondoDollari() {
		return fondoDollari;
	}

	public boolean aggiungiDollari(double importo) {
		if(importo > 0) {
			this.fondoDollari += importo;
			return true;
		}
		return false;
	}
	
	
	public Cambio eseguiCambio(double importoEuro) {
		
		double dollariDaScambiare = importoEuro * TASSO_CAMBIO;
		
		if(dollariDaScambiare <= fondoDollari) {
			this.fondoDollari -= dollariDaScambiare;
			this.saldoEuro += importoEuro;
			return new Cambio(importoEuro, dollariDaScambiare, TASSO_CAMBIO);
		}
		return null;
	}
	
	
	public boolean verificaDisponibilita(double importoEuro) {
		double dollariNecessari = importoEuro * TASSO_CAMBIO;
		if(fondoDollari < dollariNecessari) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Cassa [nome=" + nome + ", saldoEuro=" + saldoEuro + ", fondoDollari=" + fondoDollari + "]";
	}
	
	
	
	
	
	
}
