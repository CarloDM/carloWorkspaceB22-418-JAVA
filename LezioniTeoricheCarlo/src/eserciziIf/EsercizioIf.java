package eserciziIf;

public class EsercizioIf {
	public static void main(String[] args) {
		
	/**
	* Un negozio offre uno sconto se si soddisfano almeno una delle due condizioni: 
	* 1. essere membri del club fedeltà
	* 2. avere una spesa superiore a 100 euro nell'ultimo acquisto
	* 
	* Quando si verificano queste condizioni calcola uno sconto del 20% sul totale
	*/
		
		byte 	scontoNegozio = 20;
		boolean isMembro 	  = true;
		boolean isSconto 	  = false;
		float 	ultimaSpesa   = 150.4f ;
		float 	attualeSpesa  = 67.9f ;
		
		
		if(isMembro || ultimaSpesa >= 100 ) {
			
			System.out.println("hai diritto a uno sconto!");
			
			isSconto = true;
			
		};
		
		
		if(isSconto) {
			
				// se soddisfa entrambe cumula percentuale sconto
				if ( isMembro && ultimaSpesa >= 100 ) {
					// calcolo percentuale di un numero si fa con V = (N x P) / 100,
					float  scontoCalcolato = (attualeSpesa * (scontoNegozio + scontoNegozio )) / 100 ;
					float  prezzoFinale    = attualeSpesa - scontoCalcolato;
					System.out.println("Prezzo iniziale: "+ attualeSpesa + " $");
					System.out.println("sconto: "+ (scontoNegozio * 2) + "% " );
					System.out.println("sconto: "+  scontoCalcolato + "$ di sconto ");
					System.out.println("Prezzo finale: "+ prezzoFinale + " $");
				
				// se soddisfa solo una	
				}else{
					
					float  scontoCalcolato = ( attualeSpesa * scontoNegozio ) / 100 ;
					float  prezzoFinale    = attualeSpesa - scontoCalcolato;
					System.out.println("Prezzo iniziale: "+ attualeSpesa + " $");
					System.out.println("sconto: "+ scontoNegozio  + "% " );
					System.out.println("sconto: "+  scontoCalcolato + "$ di sconto ");
					System.out.println("Prezzo finale: "+ prezzoFinale + " $");
					
				}
		}else{
			
			System.err.println("nessuno sconto!");
			System.out.println("Prezzo da pagare: " + attualeSpesa + " $");
			
		};
		
		
		
	/**
	* Annaffiare le piante: Un dispositivo annaffia le piante in automatico quando la temperatura è superiore a 30° e l'umidità del suolo è inferiore al 40. Manda un messaggio all'utente
	*/
		int tempSuperioreDegree = 34;
		int umiditaSuolo 		= 33;
		
		if(tempSuperioreDegree > 30 && umiditaSuolo < 40) {
			
			System.out.println("irrigazione attiva");
			
		}else {
			
			System.out.println("irrigazione disattiva");
			
		};
		
		
	
	/**
	* Crea una variabile numeroFortunato. Questo numero per essere fortunato deve trovarsi in un intervallo compreso tra 20 e 50. Se il numero fortunato scelto è il 42 manda un avviso con scritto "Sei stato fortunatissimo ma NIENTE PANICO"
	*/
		int numeroFortunato = 42; 
		
		if (numeroFortunato >= 20 && numeroFortunato <= 50 ) {
			
			if(numeroFortunato == 42) {
				
				System.out.println("Sei stato fortunatissimo ma NIENTE PANICO");
				
			}
		};
		
	} //main 
} // class EsercizioIf
