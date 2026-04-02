package model;

public class ContoCorrente {
	private String 		numConto ;
	private double 	    saldo;
	private Correntista correntista;
	
	

	public ContoCorrente(String numConto, double saldo, Correntista correntista) {
		
		this.numConto    = numConto;
		this.saldo 	     = saldo;
		this.correntista = correntista;
		
	}



	public String getNumConto() {
		return numConto;
	}



	public void setNumConto(String numConto) {
		this.numConto = numConto;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public Correntista getCorrentista() {
		return correntista;
	}



	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	
	public double preleva(double money) {
		return money;
	};	
	public double deposita(double money) {
		return money;
	};	
	
	
	
	
	
}
