package Ejercicio1;

public class Profesor extends Empleado {
	private String cargo;
	private int antiguedadDocente;
	
	public Profesor()
	{
		super();
		this.cargo = "sin cargo";
		this.antiguedadDocente = 0;
	}
	
	public Profesor(String Nombre, int edad, String cargo, int antiguedadDocente) 
	{
		super(Nombre,edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	@Override
	public String toString() {
		return "ID: " + getId() +", Nombre: " + getNombre() +", Edad: " + getEdad() +
				", Cargo: " + cargo + ", Antiguedad docente: " + antiguedadDocente;
	}
}
