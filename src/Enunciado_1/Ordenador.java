package Enunciado_1;
/**
 * 
 * @author Sergio Molina y Alejandro Agudo
 *
 */

public class Ordenador {
	private CPU cpu;
	private Pantalla pantalla;
	private Raton raton;
	private Teclado teclado;
	
	@Override
	public String toString() {
		return "Ordenador \n" + cpu.toString() + "\n" + pantalla.toString() +"\n" + raton.toString() +"\n" + teclado.toString() + "";
	}
	public Ordenador (CPU cpu, Pantalla pantalla, Raton raton, Teclado teclado) {
		this.cpu = cpu;
		this.pantalla = pantalla;
		this.raton = raton;
		this.teclado = teclado;
	}
	
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Pantalla getPantalla() {
		return pantalla;
	}
	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}
	public Raton getRaton() {
		return raton;
	}
	public void setRaton(Raton raton) {
		this.raton = raton;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	
}
