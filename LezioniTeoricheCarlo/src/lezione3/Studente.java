package lezione3;

import java.util.ArrayList;

public class Studente {
	
	/**
		studente nome cognome email int matricolola
		arrya li st materie
		alla creazione dello studente il matricolatore deve generare la matricola
		
		 Studente(nome, cognome, email) {
		 ...quando lo creo calcolo la matricola con il metodo matricolatore }
		 matricolatore() --- metodo casuale da 0 a 100
		 saluta()
		 studia() --- Questo metodo stampa le materie che sta studiando lo studente
		 aggiungiMateria(String materia) --- Questo metodo aggiunge una materia
	
	*/
	
	String nome;
	String cognome;
	String email;
	int    matricola ;
	ArrayList<String> materie;
	
	public Studente(String nome, String cognome, String email, int matrixIndex) {
		this.nome 	   = nome;
		this.cognome   = cognome;
		this.email 	   = email;
		this.matricola = matricolatore(matrixIndex);
	};
	
	public static int matricolatore(int mIndex){
		
		return 0;
	};	
	
	public void saluta(){
		System.out.println("Buongiorno, sono lo studente" + this.nome + this.cognome);
	};
	
	public void studia(){
		System.out.println(this.materie.toString());
	}	
	
	public void aggiungiMateria(String materiaInserita){
		this.materie.add(materiaInserita);
	}
	
}
