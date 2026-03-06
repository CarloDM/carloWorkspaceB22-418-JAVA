package Lezione2;


import java.util.Scanner;

public class EsercizioIfForSwtchWhileEcc {
	public static void main(String[] args) {

		/* 
		 * Esercizio2.
		 * Scrivi un programma che chiede all'utente di inserire un numero compreso tra 10 e 20. Usa l'operatore || 
		*/

		final byte NUMMIN = 10;
		final byte NUMMAX = 30;
		
		Scanner askNum = new Scanner(System.in);
		
		System.out.println("=== inserire un numero compreso tra " + NUMMIN + " e " + NUMMAX + " ===");
		
		byte answerNum = askNum.nextByte();
		
		if(answerNum >= NUMMIN && answerNum <= NUMMAX) {
			
			System.out.println("bene hai inserito il numero: " + answerNum);
				
		} else {
			
			System.err.println("non hai inserito un numero compreso nell intervallo indicato");
			
			if(!(answerNum >= NUMMIN)) {
				System.out.println( answerNum  + " e' minore di  " + NUMMIN);
			}else {
				System.out.println( answerNum  + " e' maggiore di  " + NUMMAX);
			}	
		}
		
		// askNum.close();
		askNum.reset();

		//----------------------------------------------------------------------------------------------//
		
		/* 
			Esercizio3
			Sono un docente devo assegnare dei voti. Se il voro è sotto il 70 assegno F,
			se il voro è sotto 80 assegno C, se il voto è sotto 90 assegno B, se è maggiore di 90 assegno A
		*/
		
		final char AVOTE = 'A';
		final int  ACONDITION = 90;
		final char BVOTE = 'B';
		final int  BCONDITION = 80;
		final char CVOTE = 'C';
		final int  CCONDITION = 70;
		final char FVOTE = 'F';
		
		char assScore;
		
		int studentNumberVote = 97; 
		
		if		(studentNumberVote >= ACONDITION) {
			
			assScore = AVOTE;
			
		}else if(studentNumberVote >= BCONDITION ){
			
			assScore = BVOTE;
			
		}else if(studentNumberVote >= CCONDITION) {
			
			assScore = CVOTE;
			
		}else {
			
			assScore = FVOTE;
			
		};
		
		System.out.println("lo studente ha totalizzato "  + studentNumberVote + " punti.");
		System.out.println("voto assegnato "  + assScore);
		
		
		//----------------------------------------------------------------------------------------------//
		
		/* Esercizio4
			Scrivi un programma che prenda in input il numero del mese (1-12) e stampi la stagione corrispondente:
	    	Dicembre, Gennaio, Febbraio: "Inverno"
	    	Marzo, Aprile, Maggio: "Primavera"
	    	Giugno, Luglio, Agosto: "Estate"
	    	Settembre, Ottobre, Novembre: "Autunno"
		 */
		
		final String[] SEASONS = {"Inverno","Primavera","Estate","Autunno"};
		String seasonNow ;
		
		
		//chiedere mese
		System.out.println("=== in che mese siamo tra 1 e 12? ===");
		Scanner askMese = new Scanner(System.in);
		
		byte mese = askMese.nextByte();
		askMese.close();
		
		
		//se il numero non e' compreso tra 1 e 12
		if (!(mese >= 1 && mese <= 12)) {
			
			System.err.println("non hai scritto un numero compreso tra 1 e 12");
			
		//altrimenti assegna stagione
		}else {
			
			if(mese >= 1 && mese <= 3) {
			
				seasonNow = SEASONS[0];
				
			}else if(mese >= 4 && mese <= 6) {
			
				seasonNow = SEASONS[1];
				
			}else if(mese >= 7 && mese <= 9) {
			
				seasonNow = SEASONS[2];
				
			}else {
			
				seasonNow = SEASONS[3];
				
			}
			
			System.out.println("siamo in " + seasonNow);
		}
		
		
		//----------------------------------------------------------------------------------------------//
		
		/* Esercizio5
			Scrivi tutti i numeri da 1 a 100. Per tutti i multipli di 3 stampa "Zoom", per tutti i multipli di 5 stampa "Boom". 
			Per tutti i multipli di 3 e 5 stampa "Zoom Boom"
		 */
		
		for (int i = 1; i <= 100; i++) {
			
			System.out.print(i);
			
			if(i % 3 == 0 && i % 5 == 0 ) {
				
				System.out.print(" zoom boom !!!");
				
			}else if(i % 3 == 0) {
				
				System.out.print(" zoom");
				
			}else if(i % 5 == 0) {
				
				System.out.print(" boom");
				
			}
			
			System.out.println();
		}
		
		//----------------------------------------------------------------------------------------------//
		
		
	
		
		
		
		
	}
}
