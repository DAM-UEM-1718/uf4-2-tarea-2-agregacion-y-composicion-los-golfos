package Enunciado_1;
/**
 * 
 * @author Sergio Molina y Alejandro Agudo
 *
 */

public class Pantalla {
	private int pulgadas;
	@Override
	public String toString() {
		return "Pantalla [pulgadas=" + pulgadas + ", tipo=" + tipo + ", modelo=" + modelo + "]";
	}

	private String tipo;
	private String modelo;
	
	public Pantalla(String tipo, String modelo) {
		this.tipo = tipo;
		this.modelo = modelo;

}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}