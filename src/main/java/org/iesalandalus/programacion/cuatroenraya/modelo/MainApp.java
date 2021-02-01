package org.iesalandalus.programacion.cuatroenraya.modelo;

import org.iesalandalus.programacion.cuatroenraya.vista.Consola;



	public class MainApp {

		public static void main(String[] args) {

			Jugador jugador1 = Consola.leerJugador();
			Jugador jugador2 ;

			if (jugador1.getColorFichas().equals(Ficha.AZUL)) {
				jugador2 = Consola.leerJugador(Ficha.VERDE);
			} else {
				jugador2 = Consola.leerJugador(Ficha.AZUL);
			}
			CuatroEnRaya cuatroEnRaya = new CuatroEnRaya(jugador1, jugador2);
			cuatroEnRaya.jugar();
		}
	}