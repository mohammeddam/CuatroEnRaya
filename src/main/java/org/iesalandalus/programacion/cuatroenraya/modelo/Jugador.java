package org.iesalandalus.programacion.cuatroenraya.modelo;

public class Jugador {
	private String nombre;
	private Ficha colorFichas;
	
	public Jugador(String nombre, Ficha colorFichas)   {
		setColorFichas(colorFichas);
		setNombre(nombre);
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		if (nombre == null) {
			throw new NullPointerException("ERROR: El nombre no puede ser nulo.");
		}
		if (nombre.trim().length() == 0) {
			throw new IllegalArgumentException("ERROR: El nombre no puede estar vacío.");
		}
		this.nombre = nombre;
	}
	public Ficha getColorFichas() {
		return colorFichas;
	}
	private void setColorFichas(Ficha colorFichas) {
		if (colorFichas == null) {

			throw new NullPointerException("ERROR: El color de las fichas no puede ser nulo.");
		}
		
		this.colorFichas = colorFichas;
	}
	@Override
	public String toString() {
		return nombre + " (" + colorFichas + ")";
	}
	
}
