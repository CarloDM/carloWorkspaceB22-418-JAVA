package Lezione2;

import java.util.Scanner;

public class EsamiUni {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sogliaSbarramento = 18;
		final int MIN = 0;
		final int MAX = 30;
		
		System.out.println("--- inserimento voto esami---");
		System.out.println("--- inserisci voto scritto---");
		int votoScritto = scan.nextInt();

		
		if(votoScritto >= sogliaSbarramento && votoScritto >= MIN && votoScritto <= MAX) {
				
			System.out.println("--- inserisci voto orale---");
			int votoOrale = scan.nextInt();
			
			if( votoOrale >= MIN && votoOrale <= MAX ) {
				
				float mediaVoti = (float) (votoScritto + votoOrale) / 2;
				System.out.println("scritto " + votoScritto + " orale " + votoOrale + " media : " + mediaVoti);
				
			}else {
				System.out.println("voto fuori limite");
				scan.close();
				return; 
			}
				
				
		} else {
			System.out.println("esame non superato allo sbarramento o voto non idoneo");
		}
		
		scan.close();
	
	}
}
