package com.estudo.gof;

public class Obse {
	public static void main(String[] args) {
		converter();
	}

	public static void converter() {
		Numero num = new Numero();
		new HexObserver(num);
		new OctalObserver(num);
		num.setValor(15);
		num.setValor(30);
		num.setValor(12);
	}
}
