package Pila;

public class Nodo {
	
	Nodo siguiente;
	int valor;
	
		public Nodo(){
			siguiente = null;
			valor = 0;
		}
		 public void setValor(int a){
			 this.valor = a;
		 }
		 
		 public void setSiguiente(Nodo n){
			 this.siguiente = n;
		 }
		 
		 public Nodo getSiguiente(){
			 return this.siguiente;
		 }
		 public int getValor(){
			 return valor;
		 }
}
			