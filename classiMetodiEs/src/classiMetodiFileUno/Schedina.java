package classiMetodiFileUno;

import java.util.ArrayList;


public class Schedina {
	public static void main(String[] args) {
		// test
		tornaSchedina(1, 90);
	} // MAIN
	
	
	// usa estrattore per raccogliere numeri casuali e non ripetibili 
	// in 3 righe da 5 colonne di numeri non ripetibili in tutte le righe... come schedina della topmbola.
	// qui potrei implementare primo ciclo wild che chiede una serie di numeri non ripetuti
	
	public static void tornaSchedina(int min, int max) {
		
	//creare 1 array composto di 3 array composti di 5 cifre int diverse tra 1 e 90 presenti in tutti i sotto array di schedina cioe':
	//univoco rispetto tutti i numeri presenti nell array schedina, non puo comparire 2 volte lo stesso numero in tutto array schedina.
		
		
	int[][]  schedina =  new int[3][5];	
	// ci vuole un array dinamico dei numeri gia estratti bisoga importare : java.util.ArrayList;
	// <Integer> = tipo degli elementi contenuti nella lista. quest integer sembrerebbe esser un oggetto quindi chiamato tra < e >	
	// ArrayList<> e' un array non dinamico.
	
	ArrayList<Integer> numEstrattiNow = new ArrayList<>();
	
	
		
//	-=----------------------------------------------------------------------------------------FUNZIONE asegna solo un numero 	
	//dato un arrayDinamico anche vuoto produci un numero non esistente nell arrayDinamico e aggiongilo
	//questa funzione deve ricevere un array  e restituire un array
	//quindi devo generare un numero e scartarlo se presente in numeriEstrattNow, se no aggiungierlo.
	int nRnd = EstrattoreNumCasuali.generaNumRandomDaA(1,90); // compresi
	System.out.println(nRnd);
		
		
	//------> funzione assegnaaione numero random agli estratti
	// porta per rendere valido o gia estratto il numero ... flag.
	boolean nRndValido = true;
	
	//se ancora nessun numero estratto...
	if(numEstrattiNow.isEmpty()) {
			
		System.out.println("nessuna prima estrazione" );
		
		//fatta prima estrazione e inserire numero nell array
		numEstrattiNow.add(nRnd);
		System.out.println(numEstrattiNow);
		
	// DAnGER--------
	}else{ // occhio serve sorting se no non funziona bene perche non ricerca; solo cicla le 90 possibilita' ...sequenzialmente da 1 a 90.
		   //per funzionare correttamente ha bisogno di un array di int ordinati dal piu grande al piu piccolo ...dimodo che possa controllare tutte le possibilita'
		System.out.println("else???? ciclo controllo");
		//dando per scontato che abbiamo un array di numeri int ordinati dal piu grande al piu' piccolo.... 
		//lopzione index 0 deve essere la maggiore possibile nell array e discendendo le altre opzioni...
		for (int i = 0; i <= 89; i++) {
			// sto usando arrayList quindi devo per accedere all indice usare metodo .get(index)
			if(nRnd ==  numEstrattiNow.get(i)) {
				// trovata corrispondenza
				// non assegnare numero fermarsi...
				nRndValido = false;
				break;
			}
		}//for
	}
	
	if(!nRndValido) {
		
		System.out.println("numero gia estratto riprovare....");
		
	}else{
				// Solo se proprio non c e' aggiungilo. POST-CONTROLLO. 
				if(numEstrattiNow.isEmpty()) { 
					
					System.out.println("nessuna prima estrazione SECONDO controllo" );
					//inserire numero nell array
					numEstrattiNow.add(nRnd);
					System.out.println(numEstrattiNow);
					System.out.println("secondo controlloooo!!!!!");
				};
				
				System.out.println("aggiunto numero " + nRnd + " ad schedinaNow"  + numEstrattiNow );
		
	};
	
//	-=----------------------------------------------------------------------------------------FUNZIONE	
	
	
	
	
	// funzione assegnaaione numero random agli estratti <------
		
	// eseguire estrazione dei 5 numeri 3 volte senza mai ripetersi?
	//mi serve un operatore di confronto ciclato alla lunghezza dell array numeriEstrattNow.
		
	//int[] numero1 = numEstrattiNow;
	
	}// tornaSchedina();
	
	
}//class
