package Enunciado_3;

/**
 * @author Adri Garcia y Hernan Gonzalez.
 *
 */
public class Libro {
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

	private String titulo;
	private long isbn;
	private String autor;
	private int annoPublicacion;
	
	public Libro(String titul, long isb, String aut, int anno){
		this.titulo=titul;
		this.isbn=isb;
		this.autor=aut;
		this.annoPublicacion=anno;
	}
	
}
