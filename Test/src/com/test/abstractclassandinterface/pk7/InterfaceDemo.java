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
		System.out.println("���Ǿ��Ρ�");
	}
	public void rho() {
		System.out.println("�������Ρ�");
	}
	public void squ() {
		System.out.println("�Ҽ��Ǿ��Σ�Ҳ�����Ρ�");
	}
	public static void main(String[] args) {
		InterfaceDemo square = new InterfaceDemo();
		square.rec();
		square.rho();
		square.squ();
	}
}
