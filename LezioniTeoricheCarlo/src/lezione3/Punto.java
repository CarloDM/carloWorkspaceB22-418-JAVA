package lezione3;

public class Punto {
	
	// stato dela classe.
	double x;
	double y;
	
	//dichiaro metodo costruttore default firma vuota.
	//se necessito di usare il construttore di default lo devo effettivamente scrivere 
	//almeno che non abbia alcun costruttore a firma piena.
	public Punto() {}
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	
	// alt shift s fare un to string automaticamente
	// decorator
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// i metodi costruttori sono in overload
	
	

}
