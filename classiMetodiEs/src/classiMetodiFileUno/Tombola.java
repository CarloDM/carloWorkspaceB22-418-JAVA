package classiMetodiFileUno;

import java.util.ArrayList;
import java.util.List;

// simula il gioco della tombola reale in modo automatico
// stampa in console i risultati e procedimenti importanti


// abbiamo il giocatore con la sua unica schedina
// giocatore sa verificare se numero dato e' presente nella sua schedina
// sa flaggare i propri numeri presenti per ogni riga della sua schedina
// sa verificare e dichiarare se ha fatto ambo tris quadris o tombola

// abbiamo il Banco con l array dei numeri estratti
// sa escludere i numeri rundom gia estratti
// verifica le condizioni di vittoria
// avvia l estrazione e le verifiche
// avvisa delle vincite
// chiude la partita quando almeno un giocatore ha fatto tombola while

public class Tombola {
	
	public static void main(String[] args) {

		ciaoTombola();
		
		final int numeroGiocatori = DidacticData.STUDENTI_22418.length;
		List<Integer> numEstratti = new ArrayList<>();
		int[][][] schedineGiocatori = new int[numeroGiocatori][3][5];
		boolean[][] risultatiGiocatori = new boolean[numeroGiocatori][4];
		
		//generare le schedine per giocatore
		for (int i = 0; i < schedineGiocatori.length; i++) {
			System.out.println("schedina di " + DidacticData.STUDENTI_22418[i]);
			schedineGiocatori[i] = Schedina.generaSchedina();
		}
		
		// estrai un numero e ogni giocatore deve verificare se ha nella schedina i numeri estratti
		// prima simuliamo un minimo il funzionamento con un cilio for prima di convertirlo in while
		System.out.println("estraiamo 8 numeri");
		numEstratti.add(14);numEstratti.add(48);numEstratti.add(56);numEstratti.add(66);
		numEstratti.add(12);numEstratti.add(33);numEstratti.add(50);numEstratti.add(63);
		
		if(numEstratti.size() >= 2) {

			for (int ng = 0; ng < numeroGiocatori; ng++) {
				
				boolean[] completati = 
					GiocatoreTombola.tornaVerifiche(numEstratti, schedineGiocatori[ng], DidacticData.STUDENTI_22418[ng]);
				
				risultatiGiocatori[ng] = completati;
 			}
		}
		
		// verifica condizioni partita
		
		

		
		
		
	}
	
	
	
	public static void studenteSaluta(){
		
		String styudente1 = DidacticData.STUDENTI_22418[0];
		System.out.println(styudente1);
		
	}
	
	public static void ciaoTombola(){
	
		System.out.println("ciao io sono tombola");
		
	}	
	
}// class
