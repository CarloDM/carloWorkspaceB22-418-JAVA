package classiMetodiFileUno;

import java.util.List;

//dato l array dei numeri estratti giocatore verifica se presenti e conta se ha ambi tris quadris per ogni riga

public class GiocatoreTombola {
	
	public static void main(String[] args) {
		
	};
	
	public static boolean[] tornaVerifiche(List<Integer> numEstratti , int[][]  schedina, String nomeGiocatore ) {
		
		final List<Integer> numEstrattiNow = numEstratti;
		final int[][]  schedinagiocatore = schedina;

		int[][] numeriPosseduti = new int[3][1];
		boolean[] completati = {false,false,false,false};
		
		
		System.out.print(" -- " + nomeGiocatore + " -- ");
		// dati i numeri estratti e la propria schedina addizionare a numeri posseduti le corrispondenze
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				boolean isPresente = verificaSePresente(schedinagiocatore[i][j] , numEstrattiNow);
				
				if(isPresente) {
					
					numeriPosseduti[i][0] += 1;
					
//					System.out.println(schedinagiocatore[i][j] + " ce l'ho a riga " + i);
					
				};
				
			};
			
		};// for
		
		// a questo punto numeri posseduti[3][1] ci dice quanto il giocatore possiede corrispondenze per linea
		// giocatore verifica se ha ambi tris quadris o tombole
		
		for (int x = 0; x < numeriPosseduti.length; x++) {
			
			//ambo
			if(numeriPosseduti[x][0] == 2) {
				System.out.print(nomeGiocatore + " ho fatto AMBO su riga : "    + x + "  ");
				completati[0] = true;
			//tris	
			}else if(numeriPosseduti[x][0] == 3) {
				System.out.print(nomeGiocatore + " ho fatto TERNO su riga : " 	 + x  + "  ");
				completati[1] = true;
			//quadris	
			}else if(numeriPosseduti[x][0] == 4) {
				System.out.print(nomeGiocatore + " ho fatto QUATERNA su riga : " + x  + "  ");
				completati[2] = true;
		    //tombola	
			}else if(numeriPosseduti[x][0] == 5) {
				System.out.print(nomeGiocatore + " ho fatto TOMBOLA su riga : " + x  + "  ");
				completati[3] = true;
			}

		}//for
		
		// now decidere cosa restituire a invocatore Tombola
		// restituiamo l array dei completati completati[false,false,false,false]
		System.out.println(" ");
		return completati ;
		
	};
	
	public static boolean verificaSePresente (int numero, List<Integer> estratti) {
		
		boolean res = estratti.contains(numero);
		return res;
		
	};
} 
