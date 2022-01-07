package com.estudo.gof;

public class HexObserver extends Observer {
	public HexObserver(Numero num) {
		this.num = num;
		this.num.add(this);
	}

	public void notificar() {
		System.out.println(num.hashCode() + " em Hexadecimal: " + Integer.toHexString(num.hashCode()));
	}
}
