package LezioneIntro;

public class TipiDiDato {
	public static void main(String[] args) {
		
		
		int speseViaggi = 1400 , speseGenerali = 450 , speseAuto = 800;
		int mesiTrimestre = 3;
		int totaleSpesaOggi = speseViaggi + speseGenerali + speseAuto;
		int mediaTrimestrale = totaleSpesaOggi / mesiTrimestre;
		int totaleAnnoPrecedente = 1250;
		boolean isMaggioreDiPrecedente = totaleSpesaOggi > totaleAnnoPrecedente;
		
		
		System.err.println("totale dele spese e' " + totaleSpesaOggi);
		System.out.println("su 3 mesi  mediamente spesi "+ mediaTrimestrale + " al mese" );
		System.out.println(totaleSpesaOggi + " questanno ho speso di piu  " + totaleAnnoPrecedente + "di piu' dello scorso? " + isMaggioreDiPrecedente); 
		
		// i dati si possono upcastare e downcastare
		// anche gli oggetti si possono castare es: in numero = (int) nemeroFloat
		
		

		
	}
}
