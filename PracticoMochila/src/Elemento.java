
public class Elemento {
	String nombre;
	double peso;
	double valor;
	int cantidad;
	
	public Elemento(String nombre,double p, double v, int cantidad){
		this.nombre = nombre;
		this.peso = p;
		this.valor = v;
		this.cantidad = cantidad;
	}
	
	
	public int getCantidad(){
		return cantidad;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public void restarCantidad(){
		cantidad--;
	}
	
	public double getRelacionValorPeso(){
		return (valor/peso);
	}

	public String toString() {
		return "Elemento [nombre= "+ nombre + " peso=" + peso + ", valor=" + valor + "]";
	}
	
	
}
