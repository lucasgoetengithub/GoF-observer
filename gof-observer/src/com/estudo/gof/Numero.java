package com.estudo.gof;

import java.util.ArrayList;
import java.util.List;

public class Numero {
	private List<Observer> observadores = new ArrayList<Observer>();
	private int valor;

	public int hashCode() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
		for (Observer obs : observadores) {
			obs.notificar();
		}
	}

	public void add(Observer obs) {
		observadores.add(obs);
	}
}	