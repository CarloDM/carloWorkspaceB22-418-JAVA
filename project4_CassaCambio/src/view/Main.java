package view;

import java.util.List;
import java.util.Scanner;

import controller.CassaCtrl;
import controller.RegistroCtrl;
import model.Cambio;


public class Main {
	
	private static Scanner scann;
	private static CassaCtrl cassaCtrl;
	
	public static void main(String[] args) {
		
		scann = new Scanner(System.in);
		
		//Creo una cassa controller e aggiungo i fondi
		cassaCtrl = new CassaCtrl("Aeroporto", 2500);
		
		
		System.out.println("======= CASSA di CAMBIO =======");
		
		boolean mostra = true;
		
		while(mostra) {
			mostra = mostraMenu();
		}
		
	}
	
	private static boolean mostraMenu() {
		
		System.out.println("---- Menu principale GESTORE ----");
		System.out.println("1. Esegui Cambio Euro/Dollari");
		System.out.println("2. Aggiungi Fondi in Dollari");
		System.out.println("3. Stampa storico cambi");
		System.out.println("6. Esci");

		int scelta = scann.nextInt();
		
		switch(scelta) {
		case 1:
			eseguiCambio();
			break;
		case 2:
			aggiungiDollari();
			break;
		case 3:
			getStoricoCambi();
			break;
		case 6:
			System.out.println("Arrivederci, grazie");
			return false;

		default:
			System.out.println("Comando non riconosciuto");
		}
		
		return true;
	}
	
	private static void eseguiCambio() {
			System.out.println("Inserisci l'importo per il cambio");
			double importoCambio = scann.nextDouble();
			scann.nextLine();
			
			String risultato = cassaCtrl.eseguiCambio(importoCambio);
			
			System.out.println(risultato);
	}
	
	private static void aggiungiDollari() {
		System.out.println("Inserisci importo per il fondo in dollari");
		double importo = scann.nextDouble();
		scann.nextLine();
		
		if(cassaCtrl.aggiungiDollari(importo)) {
			System.out.println("Fondi aggiunti con successo");
		}else {
			System.out.println("Errore in aggiunta fondi. Non è possibile inserire un fondo negativo");
		}	
	}
	
	
	private static void getStoricoCambi() {
		System.out.println(cassaCtrl.getStoricoCambi());
	}
}
