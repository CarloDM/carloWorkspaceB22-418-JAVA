package classiMetodiFileUno;

public class EstrattoreNumCasuali {
	
	public static void main(String[] args) {
		//test esecuzione funzioni
		generaNumRandomDaA(90, 120);
	}
	
	
	
	public static int generaNumRandomDaA(int max, int min) {
		//genera numero casuale nell intervallo 
		int N = (int) (Math.random() * (min - max + 1)) + max;
//		System.out.println(N);
		return N;
	}

}
