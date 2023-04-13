package Ejercicio3;

public class Polideportivo extends Edificio implements InstalacionDeportiva  {

	///ATRIBUTOS
	private float superficie;
	private String nombre;
	
	//GETS & SETS
	
	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}
