package Ejercicio2;

import java.time.LocalDate;

public class Producto {

	private LocalDate fechaCaducidad;
	private int NumeroLote;
	 
	public Producto()
	{
		this.fechaCaducidad = LocalDate.of(2022, 8, 30);
		this.NumeroLote = 1;
	}
	
	public Producto(LocalDate f, int NumeroLote)
	{
		this.fechaCaducidad = f;
		this.NumeroLote = NumeroLote;
	}
	 
	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroLote() {
		return NumeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		NumeroLote = numeroLote;
	}

	@Override
	public String toString() {
		return "Producto [fecha de Caducidad: " + fechaCaducidad + ", Numero de Lote: " + NumeroLote +"]";
	}
	   
}
