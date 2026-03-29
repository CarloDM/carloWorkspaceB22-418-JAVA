package lezione3;

public class PuntoMain {

	public static void main(String[] args) {
		
		Punto nuovoPunto = new Punto(3, 5);
		
		System.out.println(nuovoPunto.getX());
		
		// usiamo il construttore di default
		
		Punto nuovoPunto2 = new Punto();
		
		System.out.println(nuovoPunto2.getY());
		
		// valorizzare parametri esterno perche modificatore accesso di default public
		nuovoPunto2.setX(15);
		nuovoPunto2.y = 7;
		
		String toStringato = nuovoPunto2.toString();
		
		System.out.println(toStringato);
		
		Punto puntoSet = new Punto(3,7);
		puntoSet.setX(3.3);
		
		Segmento newSegment = new Segmento(puntoSet,nuovoPunto2);
		newSegment.calcolaLunghezza();
		System.out.println(newSegment.toString());
;		
	}
}
