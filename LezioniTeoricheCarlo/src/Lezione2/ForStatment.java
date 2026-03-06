package Lezione2;

public class ForStatment {
	public static void main(String[] args) {
		// For statement. Ciclo for. Serve a ripetere, in un numero finito di volte, una
		// porzione di algoritmo

		/**
		 * SINTASSI inizializzazione condizione aggiornamento for(int i = 0; i < 3;
		 * i++){ ..corpo del for viene eseguito fino a che la condizione è true }
		 * 
		 * 
		 * 1° giro -> i = 0 ; 0 < 3 (true); 1 2° giro -> i = 1 ; 1 < 3 (true); 2 3° giro
		 * -> i = 2 ; 2 < 3 (true); 3 4° giro -> i = 3 ; 3 < 3 (false) XXXXXXXXX
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println("Ciao " + i);
		}

		// For inverso
		for (int i = 10; i >= 0; i--) {
			System.out.println("Ciao al contrario " + i);
		}

		// For con doppia variabile
		for (int a = 0, b = 10; b >= 0 && a <= 10; b--, a++) {
			System.out.println("a vale: " + a + " - b vale: " + b);
		}

		// for con break e continue
		// break interrompe il ciclo ed esce
		// continue salta un giro

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("Mi trovo al giro: " + i);
		}

		System.out.println("Stesso for con il continue");

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("Sono al giro: " + i);
		}

		System.out.println("==== ESEMPIO CONTINUE ====");

		for (int i = 1; i <= 100; i++) {

			if (i == 20) {
				System.out.println("Numero: VENTI");
				continue; //tutto ciò che è dopo il continue non viene eseguito
			} 
			
			System.out.println("Numero: " + i);
			
		}

	}

}
