package Enunciado_1;
/**
 * 
 * @author Sergio Molina y Alejandro Agudo
 *
 */

public class Raton {
	@Override
	public String toString() {
		return "Raton [hercios=" + hercios + ", modelo=" + modelo + "]";
	}

	private int hercios;
	private String modelo;
	
	public Raton(int hercios, String modelo) {
		this.hercios = hercios;
		this.modelo = modelo;
}

	public int getHercios() {
		return hercios;
	}

	public void setHercios(int hercios) {
		this.hercios = hercios;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}