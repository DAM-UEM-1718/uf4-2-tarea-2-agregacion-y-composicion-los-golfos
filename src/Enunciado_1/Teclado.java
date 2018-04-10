package Enunciado_1;
/**
 * 
 * @author Sergio Molina y Alejandro Agudo
 *
 */

public class Teclado {
	private String tipo;
	private String color;
	
	@Override
	public String toString() {
		return "Teclado [tipo=" + tipo + ", color=" + color + "]";
	}
	
	public Teclado(String tipo, String color) {
		this.tipo = tipo;
		this.color = color;
		
}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}