package Enunciado_3;

/**
 * @author Adri Garcia y Hernan Gonzalez.
 *
 */

public class Pagina {

	private String contenido;
	private int numero;
	
	public Pagina(String content, int numero) {
		contenido=content;
		this.numero=numero;		
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
