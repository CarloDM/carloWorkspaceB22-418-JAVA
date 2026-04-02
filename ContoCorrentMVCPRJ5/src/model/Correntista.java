package model;


import java.util.List;



public class Correntista {
	
	private static int   ccIndex = 0;
	private int 		 id;
	private String 	     nome ;
	private String 	   	 cognome ;
	private String 	   	 codiceFiscale ;
	private List<ContoCorrente> cCorrenti ;
	
	
	
	//	construct
	public Correntista(String nome, String cognome, String codiceFiscale, List<ContoCorrente> cCorrenti) {
		this.id 		   = ccIndex++;
		this.nome          = nome;
		this.cognome       = cognome;
		this.codiceFiscale = codiceFiscale;
		this.cCorrenti     = cCorrenti;
		System.out.println(toString());
	}; //	construct
	
	// getSet
	public static int getIndex() {
		return ccIndex;
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

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}


	public List<ContoCorrente> getcCorrenti() {
		return cCorrenti;
	}


	public void setcCorrenti(List<ContoCorrente> cCorrenti) {
		this.cCorrenti = cCorrenti;
	}


	public int getId() {
		return id;
	}
	
	//---------------------
	
	


	public static void main(String[] args) {
		
		Correntista c1 = new Correntista("Pippo", "Pallino", "pplln", null);
		System.out.println(c1.getNome());
	}


	@Override
	public String toString() {
		return "Correntista [nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + "]";
	};//mainT

}
