package classiMetodiFileUno;

import java.util.ArrayList;
import java.util.List;


public class Schedina {
	public static void main(String[] args) {
		// test
		List<Integer> numEstrattiNow = new ArrayList<>();
		int[][]  schedina =  new int[3][5];
		int extractionCounter = 0;
		

		
		for (int i = 0; i < 15; i++) {
			System.out.println("for " + i );
			
			int numCasuale = EstrattoreNumCasuali.generaNumRandomDaA(1, 90);
			
			boolean isGiaEstratto = verificaSeGiaEstratto(numCasuale,numEstrattiNow);
			
			while (isGiaEstratto) {
				numCasuale = EstrattoreNumCasuali.generaNumRandomDaA(1, 90);
				isGiaEstratto = verificaSeGiaEstratto(numCasuale,numEstrattiNow);
				System.out.println("riprova" + isGiaEstratto);
			}
			
			numEstrattiNow.add(numCasuale);
			System.out.println(numEstrattiNow);
			
		
		// aggiungi a schedina magari usando un contatore per semplicita
			if(extractionCounter >= 0 && extractionCounter <= 4) {
				
				System.out.println("prima riga");
				schedina[0][extractionCounter] = numCasuale;
				System.out.println(schedina[0][extractionCounter]);
				extractionCounter++;
				
			} else if (extractionCounter >= 5 && extractionCounter <= 9) {
				
				System.out.println("seconda riga");
				schedina[1][extractionCounter - 5] = numCasuale;
				System.out.println(schedina[0][extractionCounter - 5]);
				extractionCounter++;
				
			} else if (extractionCounter >= 10 && extractionCounter <= 14){
				
				System.out.println("terza riga");
				schedina[2][extractionCounter - 10] = numCasuale;
				System.out.println(schedina[0][extractionCounter - 10]);
				extractionCounter++;
				
			}else {
				System.err.println("numero estratto non valido");
			}	
		}//for
		System.out.println("schedina lenght 1 " + schedina[0].length);
		
		for (int i = 0; i < schedina.length ; i++) {
			
			System.out.println("schedina riga " + i);
			
			for (int j = 0; j < schedina[i].length ; j++) {

				System.out.print(schedina[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		
	} // MAIN
	
	public static boolean verificaSeGiaEstratto (int nRnd, List<Integer> estratti) {
		boolean res = estratti.contains(nRnd);
		
		return res;
		
	};
	// usa estrattore per raccogliere numeri casuali e non ripetibili 
	// in 3 righe da 5 colonne di numeri non ripetibili in tutte le righe... come schedina della topbola.
	// qui potrei implementare primo ciclo wild che chiede una serie di numeri non ripetuti
	

	
	
}//class
