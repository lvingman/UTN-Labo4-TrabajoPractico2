package Ejercicio2;

import java.time.LocalDate;

public class ProductoFresco extends Producto {
	
	//ATRIBUTOS
	
	private LocalDate fechaEnvasado;
	private String paisOrigen;
	
	//GETS Y SETS
	
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	//CONSTRUCTOR
	
	public ProductoFresco(LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	
	//TO STRING
	
	@Override
	public String toString() {
		return "ProductoFresco [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen
				+ ", fechaCaducidad=" + getFechaCaducidad() + ", numeroLote()=" + getNumeroLote() + "]";
	}

	

}
