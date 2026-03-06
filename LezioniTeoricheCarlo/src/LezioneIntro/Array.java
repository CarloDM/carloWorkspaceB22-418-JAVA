package LezioneIntro;

public class Array {
	public static void main(String[] args) {
		
		// gli array sono contenitori di elementi simili tra loro , stesso tipo , 0 based. con numero di dati fisso
		// sono oggetti e vengono salvati nella memoria heap.
		// array monodimensionale
		
		String[] colori = new String[4] ;
		colori[0] = "rosso";
		colori[1] = "verde";
		colori[2] = "giallo";
		colori[3] = "viola";
		
		//----------------------
		
		String[] frutti = {"mela" , "banana" , "pera", "cocco"};
		
		//for each
		for(String frutto : frutti) {
			
			System.out.println(frutto);
		
		}
	}
}
