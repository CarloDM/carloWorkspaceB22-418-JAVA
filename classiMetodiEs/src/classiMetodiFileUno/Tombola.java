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
// sa escludere i numeri random gia estratti
// verifica le condizioni di vittoria
// avvia l estrazione e le verifiche
// avvisa delle vincite
// chiude la partita quando almeno un giocatore ha fatto tombola while


public class Tombola {
	
	
	
	
	static final int 	  numeroGiocatori    = DidacticData.STUDENTI_22418.length;
	static List<Integer> numEstratti        = new ArrayList<>();
	static int[][][]     schedineGiocatori  = new int[numeroGiocatori][3][5];
	static boolean[][]   risultatiGiocatori = new boolean[numeroGiocatori][4];
	static boolean       isPartitaFinita    = false;
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		ciaoTombola();
		isPartitaFinita = false;
		schedineGiocatori = tornaSchedine(schedineGiocatori);
		
		while (!isPartitaFinita) {
			turnoStep();
			//intervallare temporalmente il ciclo
			Thread.sleep(600);
		}
		
	}// main
	
	public static void turnoStep() {
		
		// generare schedine per giocatore
		
		
		// estrai un numero con verifica di non ripetizione
		numEstratti.add(tornaNumNonRipetuto(numEstratti));
		
		// ogni giocatore deve verificare se ha nella schedina i numeri estratti

		if(numEstratti.size() >= 2) {
			
			risultatiGiocatori = giocatoriNumEstratti(numeroGiocatori, numEstratti, schedineGiocatori, risultatiGiocatori );
			
			// verifica condizioni partita
			for (int i = 0; i < risultatiGiocatori.length; i++) {
				System.out.println(" ===  " + DidacticData.STUDENTI_22418[i]);	
				// verifica discendente 
				for (int j = 3; j >= 0; j--) {
					
					if(risultatiGiocatori[i][3]){
//						System.out.print(DidacticData.STUDENTI_22418[i ]);
						System.out.print("_TOMBOLA!!!");
						System.out.print(" ==== PARTITA FINITA ==== ");
						isPartitaFinita = true;
						break;
					}else if(risultatiGiocatori[i][2]) {
//						System.out.print(DidacticData.STUDENTI_22418[i ]);
						System.out.print("QUATERNA!!");
						
						break;
					}else if(risultatiGiocatori[i][1]) {
//						System.out.print(DidacticData.STUDENTI_22418[i ]);
						System.out.print("TERNA!!");
						
						break;
					}else if(risultatiGiocatori[i][0]) {
//						System.out.print(DidacticData.STUDENTI_22418[i]);
						System.out.print("AMBO!!");
						
						break;
					}	

				}// for in for	
				System.out.println(" ");
			}// for
			
		}// if numeri estratti maggiore di 1
		System.out.println(" ");
		System.err.println("NUM EXT : " + numEstratti.getLast().toString());
		// si puo velocemente mettere in ordine per maggior leggibilita
		numEstratti.sort(null);
		
		System.out.println(" ");
		System.out.print("NUM EXTS  ");
		System.out.println(numEstratti.toString());
		System.out.println(" ");
		
	}
	
	
	
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
				
				numCasuale = EstrattoreNumCasuali.generaNumRandomDaA(1, 90);
				isGiaEstratto = verificaSeGiaEstratto(numCasuale, numEstratti);

			};
			
		}
		
		return numCasuale;
	};
	
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
