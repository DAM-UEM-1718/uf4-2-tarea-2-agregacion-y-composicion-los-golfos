package Enunciado_1;
/**
 * 
 * @author Sergio Molina y Alejandro Agudo
 *
 */

public class CPU {

	private String placaBase;
	private int RAM;
	private String grafica;
	
	@Override
	public String toString() {
		return "CPU [placaBase=" + placaBase + ", RAM=" + RAM + ", grafica=" + grafica + "]";
	}
	public CPU(String placaBase, int RAM, String grafica) {
		this.placaBase = placaBase;
		this.RAM = RAM;
		this.grafica = grafica;
	
}
	public String getPlacaBase() {
		return placaBase;
	}
	public void setPlacaBase(String placaBase) {
		this.placaBase = placaBase;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public String getGrafica() {
		return grafica;
	}
	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}
	
}