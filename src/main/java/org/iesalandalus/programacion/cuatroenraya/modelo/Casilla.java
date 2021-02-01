package org.iesalandalus.programacion.cuatroenraya.modelo;

import javax.naming.OperationNotSupportedException;

public class Casilla {
	Ficha ficha;
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) throws OperationNotSupportedException {
		 if(estaOcupada() == true) {
				throw new OperationNotSupportedException("ERROR: Ya contengo una ficha.");
			}
		 else
			if(ficha == null) {
				throw new NullPointerException("ERROR: No se puede poner una ficha nula.");
			} else if(ficha == Ficha.AZUL) {
				this.ficha = Ficha.AZUL;
			} else if(ficha == Ficha.VERDE) {
				this.ficha = Ficha.VERDE;
			}
	}
	public boolean estaOcupada() {
		return this.ficha != null;
	}
	@Override
	public  String toString() {
		if (ficha != null) {
			if (ficha.name().equals("AZUL"))
				{
				return "A";
				}
			else if (ficha.name().equals("VERDE"))
				{
				return "V";
				}}

		return " "; 
	}}