package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {

		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>(5);
		
		Profesor p1 = new Profesor("Carlos",30,"ayudante",10);
		Profesor p2 = new Profesor("Maria",34,"Jefa de catedra",5);
		Profesor p3 = new Profesor("Susan",50,"ayudante",10);
		Profesor p4 = new Profesor("German",38,"ayudante",2);
		Profesor p5 = new Profesor("Diego",44,"ayudante",15);

		
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
		
		Iterator<Profesor> it = listaProfesores.iterator();
		while(it.hasNext())
		{
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}
	}

}
