package Ejercicio3;

public abstract class Edificio {

	private double SuperficieEdificio;
	
	
	public Edificio()
	{
		this.SuperficieEdificio = 0;
	}
	
	public Edificio(double SuperficieEdificio)
	{
		this.SuperficieEdificio = SuperficieEdificio;
	}
	
	public double getSuperficieEdificio() {
		return SuperficieEdificio;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		SuperficieEdificio = superficieEdificio;
	}
	
	@Override
	public String toString() {
		return "Edificio [SuperficieEdificio: " + SuperficieEdificio + "]";
	}
	
}
