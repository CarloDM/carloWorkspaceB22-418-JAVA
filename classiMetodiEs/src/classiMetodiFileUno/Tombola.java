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
		
		final int 	  numeroGiocatori    = DidacticData.STUDENTI_22418.length;
		List<Integer> numEstratti        = new ArrayList<>();
		int[][][]     schedineGiocatori  = new int[numeroGiocatori][3][5];
		boolean[][]   risultatiGiocatori = new boolean[numeroGiocatori][4];
		boolean       isPartitaFinita    = false;
		
		// generare schedine per giocatore
		schedineGiocatori = tornaSchedine(schedineGiocatori);
		
		// estrai un numero con verifica di non ripetizione
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));

		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		numEstratti.add(tornaNumNonRipetuto(numEstratti));


		
		// ogni giocatore deve verificare se ha nella schedina i numeri estratti

		if(numEstratti.size() >= 2) {
			
			risultatiGiocatori = giocatoriNumEstratti(numeroGiocatori, numEstratti, schedineGiocatori, risultatiGiocatori );
			
			// verifica condizioni partita
			for (int i = 0; i < risultatiGiocatori.length; i++) {
				
				// verifica discendente 
				for (int j = 3; j >= 0; j--) {
					
					if(risultatiGiocatori[i][3]){
						
						System.out.println("tombola!!! partita finita");
						isPartitaFinita = true;
						break;
					}else if(risultatiGiocatori[i][2]) {
						
						System.out.println("qudris!!");
						
						break;
					}else if(risultatiGiocatori[i][1]) {
						
						System.out.println("tris!!");
						
						break;
					}else if(risultatiGiocatori[i][0]) {
						
						System.out.println("ambo!!");
						
						break;
					}	
				}// for in for		
			}// for
			
		}// if numeri estratti maggiore di 1
		
	
		
	}// main
	
	
	
	public static boolean[][] giocatoriNumEstratti(int nGiocatori, List<Integer> nEstratti, int[][][] schedGiocatori, boolean[][] resGiocatori ){
		
		boolean[][] rGiocatori= resGiocatori;
		
		for (int ng = 0; ng < nGiocatori; ng++) {
			
			boolean[] completati = 
				GiocatoreTombola.tornaVerifiche(nEstratti, schedGiocatori[ng], DidacticData.STUDENTI_22418[ng]);
			
			rGiocatori[ng] = completati;
			
			};
			
		return rGiocatori;
		
	};
	
	public static int tornaNumNonRipetuto(List<Integer> numEstratti) {
		
		int numCasuale = EstrattoreNumCasuali.generaNumRandomDaA(1, 90);
		
		if(numEstratti.size() > 0) {
			
			boolean isGiaEstratto = verificaSeGiaEstratto(numCasuale, numEstratti);
			
			while (isGiaEstratto) {
				
				System.out.println("num gia estratto riprova");
				numCasuale = EstrattoreNumCasuali.generaNumRandomDaA(1, 90);
				isGiaEstratto = verificaSeGiaEstratto(numCasuale, numEstratti);

			};
			
		}
		
		return numCasuale;
	}
	
	public static boolean verificaSeGiaEstratto (int nRnd, List<Integer> estratti) {
		
		boolean res = estratti.contains(nRnd);
		return res;
		
	};
	
	public static int[][][] tornaSchedine(int[][][] schedine){
		
		int[][][] schedineRes = schedine;
		
		for (int i = 0; i < schedineRes.length; i++) {
			System.out.println("schedina di " + DidacticData.STUDENTI_22418[i]);
			schedineRes[i] = Schedina.generaSchedina();
		}
		
		return  schedineRes;
	};
	
	public static void studenteSaluta(){
		
		String styudente1 = DidacticData.STUDENTI_22418[0];
		System.out.println(styudente1);
		
	};
	
	public static void ciaoTombola(){
	
		System.out.println("ciao io sono tombola");
		
	};	
	
}// class
