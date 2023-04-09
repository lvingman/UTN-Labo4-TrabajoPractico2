package Ejercicio1;

public class Empleado implements Comparable<Empleado> {

	private final int id;
	private String nombre;
	private int edad;
	private static int cont = 1000;
	
	
	public Empleado() 
	{
		this.id = cont;
		this.nombre = "sin nombre";
		this.edad = 99;
		cont++;
	}
	public Empleado(String nombre, int edad)
	{
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
		cont++;
	}
	
	
	public static String devuelveProximoID()
	{
		return "EL pr�ximo ID ser�: " + cont;
		
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Empleado " + nombre + ", edad:" + edad + ", Legajo:" + id;
	}
	@Override
	public int compareTo(Empleado arg0) {
		if (this.id == arg0.id) {return 0;}
		else {return 1;}
		
	}
	
}
