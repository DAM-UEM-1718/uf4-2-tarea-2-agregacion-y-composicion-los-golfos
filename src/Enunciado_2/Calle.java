package Enunciado_2;
/**
 * 
 * @author Juan Torres Íñiguez
 *
 */
public class Calle {
	private int numero;
	private Atleta atleta;
	private double tiempo;
	
	public Calle(int entrada) {
		this.numero = entrada;
		atleta = getAtleta();
	}

	public int getNumero() {
		return this.numero;
	}

	public Atleta getAtleta() {
		return this.atleta;
	}
	
	public double getTiempo() {
		return this.tiempo;
	}
	
	public void setAtleta(Atleta entrada) {
		this.atleta = entrada;
	}
	
	public void setTiempo(double entrada) {
		this.tiempo = entrada;
	}

}
