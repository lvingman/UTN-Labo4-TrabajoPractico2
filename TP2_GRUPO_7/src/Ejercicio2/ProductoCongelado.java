package Ejercicio2;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {

	//ATRIBUTOS
	
	private int tempRecomendada;

	// GETS Y SETS
	
	public int getTempRecomendada() {
		return tempRecomendada;
	}

	public void setTempRecomendada(int tempRecomendada) {
		this.tempRecomendada = tempRecomendada;
	}
	
	// CONSTRUCTOR
	
	public ProductoCongelado(LocalDate fechaCaducidad, int numeroLote, int tempRecomendada) {
		super(fechaCaducidad, numeroLote);
		this.tempRecomendada = tempRecomendada;
	}

	
	// TO STRING
	
	@Override
	public String toString() {
		return "ProductoCongelado [tempRecomendada=" + tempRecomendada + ", fechaCaducidad()=" + getFechaCaducidad()
		+ ", numeroLote()=" + getNumeroLote() + "]";
	}
	
	
	
}
