package org.iesalandalus.programacion.cuatroenraya.modelo;

public class Tablero {

	public static final int FILAS = 6;
	public static final int COLUMNAS = 7;
	public static final int fichasConsecutivas = 4; 
	private Casilla[][] casillas;
	
	public Tablero() {
		casillas = new Casilla[FILAS][COLUMNAS];
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				casillas[i][j] = new Casilla();
			}
		}
	}
	private boolean columnaVacia(int columna)
	{
		boolean resultado = true;
		for (int i=0; i<FILAS; i++)
		{
			if (casillas[i][columna].estaOcupada())
			{
				resultado = false;
			}
		}
		return resultado;
	}
	public boolean estaVacio()
	{
	boolean resultado = true;
	for (int i=0; i<COLUMNAS; i++)
	{
		if (!columnaVacia(i))
		{
			i = COLUMNAS;
			resultado = false;
		}
	}
	return resultado;
	}


}