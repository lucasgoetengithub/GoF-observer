package com.estudo.gof;

public class OctalObserver extends Observer {
	public OctalObserver(Numero num) {
		this.num = num;
		this.num.add(this);
	}

	public void notificar() {
		System.out.println(num.hashCode() + " em Octal: " + Integer.toOctalString(num.hashCode()));
	}
}
