package Ejercicio3;

public class Polideportivo extends Edificio implements InstalacionDeportiva  {

	///ATRIBUTOS
	private String nombre;
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Polideportivo(String nombre, double SuperficieEdificio) {
		super(SuperficieEdificio);
		this.nombre = nombre;
		
	}
	
	@Override
	public int getTipoDeInstalacion() {
	
		return 0;
	}

	@Override
	public String toString() {
		return "Polideportivo [nombre=" + nombre + " Superficie= " + getSuperficieEdificio() +"]" ;
	}

	
	
	
	
}
