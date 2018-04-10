package Enunciado_3;

import java.util.LinkedList;


/**
 * @author Adri Garcia y Hernan Gonzalez.
 *
 */
public class Libro {

	private String titulo;
	private long isbn;
	private String autor;
	private int annoPublicacion;
	private LinkedList <Pagina> contiene;
	
	public Libro(String titul, long isb, String aut, int anno){
		this.titulo=titul;
		this.isbn=isb;
		this.autor=aut;
		this.annoPublicacion=anno;
		this.contiene = new LinkedList <Pagina>();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnnoPublicacion() {
		return annoPublicacion;
	}

	public void setAnnoPublicacion(int annoPublicacion) {
		this.annoPublicacion = annoPublicacion;
	}
	
	public void añadirPag(String contenido, int num) {
		contiene.add(new Pagina(contenido, num));
	}
	
}
