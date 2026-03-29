package lezione3;

public class Segmento {
	
	Punto a;
	Punto b;
	double lunghezza;
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
	public double calcolaLunghezza(){
		
		this.lunghezza = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
		
		return this.lunghezza ;
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
	
	
	
	
}
