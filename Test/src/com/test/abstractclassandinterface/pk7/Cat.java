package com.test.abstractclassandinterface.pk7;

interface Animal {
	public abstract void eat();
	public abstract void travel();
}

public class Cat implements Animal {
	public void eat() {
		System.out.println("è���㡣");
	}
	public void travel() {
		System.out.println("èϲ��������");
	}
	public static void main(String[] arg) {
		Cat cat = new Cat();
		cat.eat();
		cat.travel();
	}
}