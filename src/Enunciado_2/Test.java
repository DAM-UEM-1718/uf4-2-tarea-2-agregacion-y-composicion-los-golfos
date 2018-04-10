package Enunciado_2;

/**
 * 
 * @author Juan Torres Íñiguez
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Carrera primera = new Carrera(100, 1, 2011);
		Carrera segunda = new Carrera(50, 2, 2008);
		Carrera tercera = new Carrera(42, 4, 2002);
		Carrera cuarta = new Carrera(10, 3, 2017);
		
		primera.anadirCalle(1);
		
		
		primera.mostrarContenido();
	}
}
