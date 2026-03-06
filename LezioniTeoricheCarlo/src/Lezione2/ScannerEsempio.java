package Lezione2;

import java.util.Scanner;

public class ScannerEsempio {
	public static void main(String[] args) {
		//scanner aquisisce input utente
		
		Scanner mioScan = new Scanner(System.in);
		
		String nomeUser = mioScan.next();
		System.out.println(nomeUser);
//		mioScan.close();
		
		// verificare try catch per gestire i possibili errori, guarda trim per trimmare stringa ecc...
		
		Scanner altroScanner = new Scanner(System.in);
		
		try {
			System.out.println("Inserisci un numero");
			double mioNum = altroScanner.nextDouble();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Non hai inserito un numero");
		}
		
	}
}
