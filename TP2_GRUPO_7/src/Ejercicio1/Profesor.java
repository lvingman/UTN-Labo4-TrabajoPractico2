package Ejercicio1;

import java.util.Objects;

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
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profesor) || obj == null) {
            return false;
        }
        Profesor profesor = (Profesor) obj;
        return super.equals(obj) && Objects.equals(cargo, profesor.cargo) && Objects.equals(antiguedadDocente, profesor.antiguedadDocente);
    }
}
