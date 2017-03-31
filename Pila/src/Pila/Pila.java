package Pila;

public class Pila {
	
	private Lista listaDeTareas; 
	
	public Pila(){	
		listaDeTareas = new Lista();
	}
	
	public int verTope(){
		return listaDeTareas.getPrimero();
	}
	
	public boolean esVacia(){
		return listaDeTareas.esVacia();
	}
	
	public void apilar(int i){
		listaDeTareas.agregarElemento(i);
	}
	
	public int desapilar(){
		int eliminar = verTope();
		listaDeTareas.eliminarElemento(eliminar);
		return eliminar;
	}
}
