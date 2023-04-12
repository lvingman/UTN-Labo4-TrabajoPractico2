package Ejercicio2;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{
	
	//ATRIBUTOS
	
	private String codigoOrganismo;

	//GETS Y SETS
	
	public String getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public void setCodigoOrganismo(String codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}
	
	//CONSTRUCTOR
	
	public ProductoRefrigerado(LocalDate fechaCaducidad, int numeroLote, String codigoOrganismo) {
		super(fechaCaducidad, numeroLote);
		this.codigoOrganismo = codigoOrganismo;
	}

	
	//TO STRING
	
	@Override
	public String toString() {
		return "ProductoRefrigerado [codigoOrganismo=" + codigoOrganismo + ", fechaCaducidad="
				+ getFechaCaducidad() + ", numeroLote()=" + getNumeroLote() + "]";
	}
	
	
	
}
