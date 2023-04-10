package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		
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
		
		// PUNTO 7
		Profesor pA = new Profesor("Martin",45,"titular",5);
		Profesor pB = new Profesor("Martin",45,"titular",5);
				
	    if(pA.equals(pB))
		{
			System.out.println("Es el mismo profesor");
		}
		else
		{
			System.out.println("No es el mismo profesor");
		}
				
		
	}

}
