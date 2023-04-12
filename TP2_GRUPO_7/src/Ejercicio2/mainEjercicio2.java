package Ejercicio2;

import java.time.LocalDate;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		
		// PUNTO 3
		// Creamos un objeto de cada tipo
		
		ProductoCongelado pC = new ProductoCongelado(LocalDate.of(2024,11,1),123,35);
		ProductoFresco pF = new ProductoFresco(LocalDate.of(2024, 12, 2),100,LocalDate.now(),"Argentina");
		ProductoRefrigerado pR = new ProductoRefrigerado(LocalDate.of(2024, 9, 10),101,"ANMAT001");

		// mostramos por pantalla los datos de cada uno de los objetos creados
		
		System.out.println(pC.toString());
		System.out.println(pF.toString());
		System.out.println(pR.toString());
		
	}

}
