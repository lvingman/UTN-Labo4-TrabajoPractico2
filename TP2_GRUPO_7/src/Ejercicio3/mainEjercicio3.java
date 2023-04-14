package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		//Creamos un ArrayList de edificios
		
		ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>(5);
		
		//Creamos los objetos polideportivos 
		
		Polideportivo poli1 = new Polideportivo("Fenix", 100);
		Polideportivo poli2 = new Polideportivo("Peñarol", 200);
		Polideportivo poli3 = new Polideportivo("Atletico", 400);
		
		//Creamos los objetos Oficinas
		
		Oficina ofi1 = new Oficina(100 , 10000 );
		Oficina ofi2 = new Oficina(200 , 15000);
		
		//Los agregamos al ArrayList
		
		listaEdificios.add(poli1);
		listaEdificios.add(poli2);
		listaEdificios.add(poli3);
		listaEdificios.add(ofi1);
		listaEdificios.add(ofi2);
		
		//Se crea objeto iterador
		
		Iterator<Edificio> iterador = listaEdificios.iterator();
		
		while(iterador.hasNext()) {
			
			Edificio edificio = iterador.next();
			System.out.println(edificio.toString());
			
		}
		
		
		
	}

}
