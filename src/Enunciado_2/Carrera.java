package Enunciado_2;

import java.util.LinkedList;

/**
 * 
 * @author Juan Torres Íñiguez
 *
 */
public class Carrera {
	private int distancia;
	private int ronda;
	private long fecha;
	private LinkedList <Calle> calles;
	
	public Carrera (int distancia, int ronda, long fecha) {
		this.distancia = distancia;
		this.ronda = ronda;
		this.fecha = fecha;
		this.calles = new LinkedList <Calle>();
	}
	
	public int getDistancia() {
		return this.distancia;
	}
	
	public void setDistancia(int entrada) {
		this.distancia = entrada;
	}
	
	public int getRonda() {
		return this.ronda;
	}
	
	public void setRonda(int entrada) {
		this.ronda = entrada;
	}
	
	public long getFecha() {
		return this.fecha;
	}
	
	public void setFecha(long entrada) {
		this.fecha = entrada;
	}
	
	public void anadirCalle(int entrada) {
		this.calles.add(new Calle(entrada));
	}
	
	public void mostrarContenido(){
		System.out.println("Distancia de carrera: " + getDistancia() + "km" + "\nRonda: " + getRonda() + "\nAño: " + getFecha() + "Calle: " +	);
	}
}