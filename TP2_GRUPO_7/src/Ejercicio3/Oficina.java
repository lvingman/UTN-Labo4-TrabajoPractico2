package Ejercicio3;

public class Oficina extends Edificio{
	
	// ATRIBUTOS
	
	private int numOficinas;

	// CONSTRUCTORES
	
	public Oficina()
	{
		super();
		this.numOficinas = 0;
	}
	
	public Oficina(int numOficinas, double SuperficieEdificio)
	{
		super(SuperficieEdificio);
		this.numOficinas = numOficinas;
	}
	
	// GETTERS & SETTERS
	
	public int getNumOficinas() {
		return numOficinas;
	}

	public void setNumOficinas(int numOficinas) {
		this.numOficinas = numOficinas;
	}

	// toSTRING
	
	@Override
	public String toString() {
		return "Oficina [Numero de Oficinas=" + numOficinas + " Superficie: " + getSuperficieEdificio() + "]";
	}
	

}
