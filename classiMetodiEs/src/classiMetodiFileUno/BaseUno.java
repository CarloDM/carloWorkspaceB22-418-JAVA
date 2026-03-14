package classiMetodiFileUno;

import java.util.Scanner;

public class BaseUno {
	public static void main(String[] args) {
		
	
		Scanner mioScann = new Scanner(System.in);
		
		char scelta;
		
		do {
			System.out.println("==== MENU ====");
			System.out.println("1. Lancia i Dadi");
			System.out.println("2. Estrai dei Numeri");
			System.out.println("3. Tombola");
			System.out.println("4. ESCI");
			System.out.println("==============");

			scelta = mioScann.next().charAt(0);
			
			switch(scelta) {
			case '1':
				System.out.println("Hai scelto qualcosa di non implementato ancora 1" );
				break;
			case '2':
				System.out.println("Hai scelto qualcosa di non implementato ancora 2 ");
				break;
			case '3':
				
				System.out.println("Stai giocando con la tombola");
				
				
				break;
			case '4':
			case 'q':
			case 'Q':
				System.out.println("Hai scelto di uscire...");
				break;
			default:
				System.out.println("Non capisco la tua scelta");
			}
			
		}while(scelta != '4' && scelta != 'q' && scelta != 'Q');
		
		System.out.println("ALLA PROSSIMA !!!!");
	}
	
		
		
		
	}

