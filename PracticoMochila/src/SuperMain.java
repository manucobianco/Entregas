import java.util.ArrayList;

public class SuperMain {

	public static void main(String[] args) {
		
		ArrayList<Elemento> objs = new ArrayList<Elemento>();
		
		Elemento Pepita = new Elemento("Pepita",0.10,200,10);
		Elemento Piedra = new Elemento("Piedra",2,1,200);
		Elemento Celular = new Elemento("Celular",4,2000,4);
		Elemento Bazooka = new Elemento("Bazooka",12,8000,5);
		Elemento Comida = new Elemento("Comida",1,20,1);
		
		Mochila SuperMochila = new Mochila(20);
		
		objs.add(Pepita);
		objs.add(Piedra);
		objs.add(Celular);
		objs.add(Bazooka);
		objs.add(Comida);
		
		SuperMochila.cargar(objs);
		
		System.out.println(SuperMochila);
		
	}

}
