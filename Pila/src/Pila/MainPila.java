package Pila;

public class MainPila {

	public static void main(String[] args) {
		Pila nuevaPila = new Pila();
		
		nuevaPila.apilar(1);
		nuevaPila.apilar(2);
		nuevaPila.apilar(3);
		
		System.out.println(nuevaPila.verTope());
		
		System.out.println(nuevaPila.esVacia());
		
		System.out.println(nuevaPila.desapilar());
		
		System.out.println(nuevaPila.verTope());

	}

}
