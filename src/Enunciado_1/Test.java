package Enunciado_1;
/**
 * 
 * @author Sergio Molina y Alejandro Agudo
 *
 */

public class Test {

	public static void main(String[] args) {
		CPU cpu = new CPU("Roja", 4, "NVIDIA");
		Pantalla pantalla = new Pantalla( "HP", "EliteDisplay");
		Raton raton = new Raton(800, "Optico") ;
		Teclado teclado = new Teclado("mecanico", "negro");
		Ordenador ordenador = new Ordenador(cpu, pantalla, raton, teclado);
		System.out.println(ordenador.toString());
	}
}
