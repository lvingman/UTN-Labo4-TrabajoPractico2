package Ejercicio2;

import java.time.LocalDate;

public class Producto {

	private LocalDate fechaCaducidad;
	private int numeroLote;
	 
	public Producto()
	{
		this.fechaCaducidad = LocalDate.of(2022, 8, 30);
		this.numeroLote = 1;
	}
	
	public Producto(LocalDate f, int NumeroLote)
	{
		this.fechaCaducidad = f;
		this.numeroLote = NumeroLote;
	}
	 
	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	@Override
	public String toString() {
		return "Producto [fecha de Caducidad: " + fechaCaducidad + ", Numero de Lote: " + numeroLote +"]";
	}
	   
}
