package lezione3;

import java.util.ArrayList;
import java.util.List;

public class MetodiAusiliari {
	
	
	public static void main(String[] args) {
		iniziaCorso();
		elencaStudenti();
	}
	
	
	public static void iniziaCorso(){
		
		String nomeCorso = "TSPPI";
		System.out.println(nomeCorso);
		
	}
	
	// con private il metodo è solo visibile e utilizzabile della classe
	private static void elencaStudenti() {
		
		List<String> studenti = new ArrayList<>();
		
		studenti.add("Carlo")   ;
		studenti.add("Alice")   ;
		studenti.add("Marco")   ;
		studenti.add("Giulia")  ;
		studenti.add("Fabrizio");
		
		for (int i = 0; i < studenti.size(); i++) {
			System.out.println(studenti.get(i));
		}
		
	}
	
	// stato , comportamento. attributi, metodi.
	// design  pattern - anti pattern.
	//
}
