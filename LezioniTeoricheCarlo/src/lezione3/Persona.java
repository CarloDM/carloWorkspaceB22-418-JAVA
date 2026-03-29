package lezione3;

public class Persona {

	//STATO DELLA CLASSE
	public String nome;
	public String cognome;
	public int eta;
	public String codFisc;
	
	public Persona(String nome, String cognome, int eta, String codFisc) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.codFisc = codFisc;
	}
		
	//COMPORTAMENTO
	/**
	 * Il metodo presentati permette all'oggetto di presentarsi e basta
	 * @return
	 */
	public String presentati() {
		String presentazione = "Ciao, mi chiamo " + nome + " " + cognome + ", ho " + eta + " anni.\nIl mio codice fiscale è: " + codFisc;
		
		return presentazione;
	}
	
	
	/**
	 * Il metodo presentati(nome) prima di presentarsi saluta una persona
	 * @return
	 */
	public String presentati(String nome) {
		//In questo caso fa confusione tra il parametro "nome" e la prop "nome". Per evitare questa confusione utilizzo il this.nome per far riferimento alla prop di classe
		String presentazione = "Ciao " + nome + ", mi chiamo " + this.nome + " " + cognome + ", ho " + eta + " anni.";
		
		return presentazione;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", codFisc=" + codFisc + "]";
	}
	
	
	
	
	
}
