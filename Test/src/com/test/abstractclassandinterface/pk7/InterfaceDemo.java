package com.test.abstractclassandinterface.pk7;

interface Rectangle {
	public abstract void rec();
}

interface Rhombus {
	public abstract void rho();
}

interface Square extends Rectangle,Rhombus {
	public abstract void squ();
}

public class InterfaceDemo implements Square  {
	public void rec() {
		System.out.println("我是矩形。");
	}
	public void rho() {
		System.out.println("我是菱形。");
	}
	public void squ() {
		System.out.println("我既是矩形，也是菱形。");
	}
	public static void main(String[] args) {
		InterfaceDemo square = new InterfaceDemo();
		square.rec();
		square.rho();
		square.squ();
	}
}
