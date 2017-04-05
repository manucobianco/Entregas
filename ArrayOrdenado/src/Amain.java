public class Amain {

	public static void main(String[] args) {
	
		long startTime;
		long totalTime;
		int cantElementos = 1000;
		
		Arreglo superarray = new Arreglo(cantElementos);
		
		for (int i = 0; i<cantElementos;i++){
			superarray.add((int)Math.floor(Math.random()*(cantElementos-1+1)+1));
		}
		
		startTime = System.currentTimeMillis();
		 //superarray.merge();	//como era de esperar use el mergesort con 10 millones de elementos y el totalTime no supero los 2000 milisegundos.
		 superarray.burbujeo(); //mientras que en el caso del burbujeo ya con 100.000 elementos se demoraba 17000 milisegundos en ordenar.
		totalTime = System.currentTimeMillis() - startTime;
		
		//con valores mas chicos como 1000 o 10000 el merge sigue siendo mas rapido, aunque la diferencia no es mucha al no haber muchos datos.
		//a medida que aumento los datos, el merge no cambia mucho, mientras que el el burbujeo con gran volumen de datos es muy poco eficas. 
		
		
		System.out.println("Tiempo total: "+totalTime);
		
	}

	

}
