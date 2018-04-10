package Enunciado_2;
/**
 * 
 * @author Juan Torres Íñiguez
 *
 */
public class Atleta {
	private String nombre;
	private long nacimiento;
	
	public Atleta(String nombre, long nacimiento) { //Constructor
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}
	
	public String getNombre() { //Devuelve el nombre del atleta
		return this.nombre;
	}
	
	public long getNacimiento(){ //Devuelve la fecha de nacimiento del atleta
		return this.nacimiento;
	}
	
	public void mostrarAtleta() {
		System.out.println("Nombre del atleta: " + this.nombre);
	}
}
