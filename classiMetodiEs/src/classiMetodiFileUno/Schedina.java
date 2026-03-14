package classiMetodiFileUno;

import java.util.ArrayList;
import java.util.List;

// usa estrattore per raccogliere numeri casuali e non ripetibili 
// in 3 righe da 5 colonne di numeri non ripetibili in tutte le righe... come schedina della topbola.
// qui potrei implementare primo ciclo wild che chiede una serie di numeri non ripetuti

public class Schedina {
	public static void main(String[] args) {
		// test	
	} // MAIN
	
	public static int[][] generaSchedina(){
		
		List<Integer> numEstrattiNow = new ArrayList<>();
		int[][]  schedina =  new int[3][5];
		int extractionCounter = 0;
		

		
		for (int i = 0; i < 15; i++) {
			
			int numCasuale = EstrattoreNumCasuali.generaNumRandomDaA(1, 90);
			
			boolean isGiaEstratto = verificaSeGiaEstratto(numCasuale,numEstrattiNow);
			
			while (isGiaEstratto) {
				
				numCasuale = EstrattoreNumCasuali.generaNumRandomDaA(1, 90);
				isGiaEstratto = verificaSeGiaEstratto(numCasuale,numEstrattiNow);
				//System.out.println("riprova" + isGiaEstratto);	
			};
			
			numEstrattiNow.add(numCasuale);
			
			// aggiungi a schedina magari usando un contatore per semplicita
			if(extractionCounter >= 0 && extractionCounter <= 4) {
				
				schedina[0][extractionCounter] = numCasuale;
				extractionCounter++;
				
			} else if (extractionCounter >= 5 && extractionCounter <= 9) {
				
				schedina[1][extractionCounter - 5] = numCasuale;
				extractionCounter++;
				
			} else if (extractionCounter >= 10 && extractionCounter <= 14){
				
				schedina[2][extractionCounter - 10] = numCasuale;
				extractionCounter++;
				
			}else {
				System.err.println("numero estratto non valido");
			}	
		}//for
		
		for (int i = 0; i < schedina.length ; i++) {
			
			
			for (int j = 0; j < schedina[i].length ; j++) {

				System.out.print(schedina[i][j] + " ");
			}
			
			System.out.println(" ");
			
		}
		
		System.out.println("-------------------");
		return schedina;
		
	};
	
	
	public static boolean verificaSeGiaEstratto (int nRnd, List<Integer> estratti) {
		
		boolean res = estratti.contains(nRnd);
		return res;
		
	};

		
}//class
