package classiMetodiFileUno;

public class Triangoli {
	//Crea un programma per stampare i seguenti star pattern
//	Es1:
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
//
//		Es2:
//		*
//		* *
//		* * *
//		* * * *
//		* * *
//		* *
//		*
//
//		Es3:
//		     *
//		    * *
//		   * * *
//		  * * * *
//		 * * * * *
//
//		Es4
//		     *
//		    * *
//		   *   *
//		  *     *
//		 * * * * *
	
// possibili soluzioni
	
	/* spacchetta azion
		spazio
		asterisco
		enter
			{asterisco, spazio}
			{asterisco, enter}
			{asterisco, spazio, enter}
			{spazio, spazio}
			{spazio, asterisco}
			{spazio, enter}
			{spazio, asterisco, enter}
		*
	 	e' possibile vedere i triangoli dentro una griglia riempibile con questi 6 metodi 
		* 
		gli spazi sono unita minima ma la griglia puo essere composta da:
				4 slot da due spazi 	:{asterisco, spazio} , {asterisco, enter} , {spazio, asterisco} , {spazio, enter} ecc ;
				1 slot da uno spazio  	:asterisco, spazio, enter,
		o altre combinazioni
				1 slot da uno spazio
				3 slot da due
		* 
				2 slot da 2
				1 da 1
		* 
	*/



	//------------------------------------------------------------------
	// dispari 1
	public static void spazio()            {System.out.print(" ");};
	public static void asterisco()         {System.out.print("*");};
	public static void enter()             {System.out.println("");};
	public static void spazEnt() {spazio();	enter();};
	public static void asteEnt() {asterisco();	enter();};
	
	//pari
	public static void spazSpaz(){System.out.print("  ");};
	public static void spazAst() {spazio();	asterisco();};
	public static void asteAste(){asterisco();	asterisco();};
	public static void asteSpaz() {asterisco();	spazio();};
	
	// dispari - 3
	public static void spazAstEnt() {spazio(); asterisco();	enter();};
	public static void astSpazEnt() { asterisco();	spazio(); enter();};
	//--------------------------------------------------------------------
	

	//------------------MAIN----------------------------------------
	public static void main(String[] args) {
		
		enter();
		IsTTreOrTQuattro(false);
		enter();
		IsTTreOrTQuattro(true);
		enter();
		triangoloDue();	
		enter();
		triangoloUnoDue();
		enter();
		myQuad();
		
	}
	//--------------------------------------------------------------------
	
	
	/* dopodiche dentro il cilo delle colonne descrivo le righe leggendo il triangolo?? 
	*/
	
	public static void IsTTreOrTQuattro(boolean isTri) {
		
		// triangolo 3 o 4
		for (int i = 0; i < 5; i++) {// colonne
			System.out.print("_ ");
			//righe
			for (int riga = 0; riga < 5; riga++) {
				
					if (i == 0) {
						if(riga < 2) {spazSpaz();} else if (riga == 2) {asterisco();};
					}
					if (i == 1) {
						if(riga == 0) {spazSpaz();} else if (riga >= 1 && riga <= 2 ) {spazAst();};
					}
				
				if(isTri) { // toggle case 3 oppure 4 cambiano solo  righe 2 e 3
					
					if (i == 2) {
						if(riga == 0) {spazio();} else if (riga >= 1 && riga <= 3 ) {spazAst();};
					}
					if (i == 3) {
						if(riga == 0) {} else if (riga >= 1 && riga <= 4 ) {spazAst();};
					}	
				}else {
					
					if (i == 2) {//
						if(riga == 0) {spazio();} else if (riga == 1 || riga == 3 ) {spazAst();} else if(riga == 2) {spazSpaz();};
					}
					if (i == 3) {//
						if(riga == 0) {} else if (riga == 1 || riga == 4 ) {spazAst();}else if(riga >= 2 && riga <= 3) {spazSpaz();};
					}
				}
				
					if (i == 4) {
						if(riga == 0) {asterisco();} else if (riga >= 1 && riga <= 4 ) {spazAst();};
					}
			};
			
			enter();
		}
	};

	public static void triangoloQuat() {
		
		// triangolo 4-0
		for (int i = 0; i < 5; i++) {// colonne
			System.out.print("_ ");
			//righe
			for (int riga = 0; riga < 5; riga++) {
				
				if (i == 0) {
					if(riga < 2) {spazSpaz();} else if (riga == 2) {asterisco();};
				}
				if (i == 1) {
					if(riga == 0) {spazSpaz();} else if (riga >= 1 && riga <= 2 ) {spazAst();};
				}
				if (i == 2) {//
					if(riga == 0) {spazio();} else if (riga == 1 || riga == 3 ) {spazAst();} else if(riga == 2) {spazSpaz();};
				}
				if (i == 3) {//
					if(riga == 0) {} else if (riga == 1 || riga == 4 ) {spazAst();}else if(riga >= 2 && riga <= 3) {spazSpaz();};
				}
				if (i == 4) {
					if(riga == 0) {asterisco();} else if (riga >= 1 && riga <= 4 ) {spazAst();};
				}
			};
			
			enter();
		}
	};
	
	public static void triangoloTre() {
		
		// triangolo 3
		for (int i = 0; i < 5; i++) {// colonne
			System.out.print("_ ");
			//righe
			for (int riga = 0; riga < 5; riga++) {
				
				if (i == 0) {
					if(riga < 2) {spazSpaz();} else if (riga == 2) {asterisco();};
				}
				if (i == 1) {
					if(riga == 0) {spazSpaz();} else if (riga >= 1 && riga <= 2 ) {spazAst();};
				}
				if (i == 2) {
					if(riga == 0) {spazio();} else if (riga >= 1 && riga <= 3 ) {spazAst();};
				}
				if (i == 3) {
					if(riga == 0) {} else if (riga >= 1 && riga <= 4 ) {spazAst();};
				}
				if (i == 4) {
					if(riga == 0) {asterisco();} else if (riga >= 1 && riga <= 4 ) {spazAst();};
				}
			};
			
			enter();
		}
	};
	
	public static void triangoloDue() {
		// triangolo 2 
		for (int i = 0; i < 7; i++) {// colonne
			System.out.print("_ ");
			//righe
			for (int riga = 0; riga < 5; riga++) {
				
				if (i == 0 || i == 6) {
					if(riga == 0) {asterisco();}
				}
				if (i == 1 || i == 5) {
					if(riga == 0) {asteSpaz();} else if(riga == 1) {asterisco();}
				}
				if (i == 2 || i == 4 ) {
					if(riga <= 1) {asteSpaz();} else if(riga == 2) {asterisco();}	
				}
				if (i == 3) {
					if(riga <= 2) {asteSpaz();} else if(riga == 3) {asterisco();}
				}
			};
			
			enter();
		}
	};
	
	public static void triangoloUnoDue() {
		// triangolo 1-2 
		for (int i = 0; i < 5; i++) {// indice righe -- funziona come colonne
			System.out.print("_ ");
			//righe
			for (int riga = 0; riga < 5; riga++) {
				
				if (i == 0) {
					
					if(riga <= 3 ) {
						asteSpaz();
					} else {
						asterisco();
					}	
					
				}
				if (i == 1) {
					
					if(riga <= 2) {
						asteSpaz();
					} else if(riga == 4) {
						asterisco();
					}
					
				}
				if (i == 2) {
					
					if(riga <= 1 ) {
						asteSpaz();
					} else if(riga == 4 ) {
						asterisco();
					}
					
				}
				if (i == 3) {
					
					if(riga == 0 ) {
						asteSpaz();
						asterisco();
					}	
					
				}
				if (i == 4) {
					
					if(riga == 0) {
						asterisco();
					} 
						
				}
			};
			
			enter();
		}
	};	
	
	public static void triangoloUno() {
		
		// triangolo 1 
		for (int i = 0; i < 5; i++) {// colonne
			
			System.out.print("_ ");
			
			//righe
			for (int riga = 0; riga < 5; riga++) {
				
				if(riga <= 3 && i == 0 ) {
					asteSpaz();
				} else if(i == 0) {
					asterisco();
				}
				
				if(riga <= 2 && i == 1 ) {
					asteSpaz();
				} else if(riga == 4 && i == 1) {
					asterisco();
				}
				
				if(riga <= 1 && i == 2 ) {
					asteSpaz();
				} else if(riga == 4 && i == 2) {
					asterisco();
				}
				
				if(riga == 0 && i == 3 ) {
					asteSpaz();
					asterisco();
				}	
				
				if(riga == 0 && i == 4 ) {
					asterisco();
				} 	
			}
			
			enter();
		}
	};
	
	public static void myQuad(){
		
		// quadrato di asterischi 1
		for (int i = 0; i < 5; i++) {// colonne
			System.out.print("_ ");
			//righe
			for (int riga = 0; riga < 5; riga++) {
				
				if(riga <= 3 ) {
					asteSpaz();
				} else {
					asteEnt();
				}
				
			}
			
			enter();
		}
		
	};
	
}
