package com.test.abstractclassandinterface.pk7;

interface A {
	public abstract void a();
	public abstract void b();
	public abstract void c();
}

abstract class B implements A {
	public abstract void a();
	public void b() {
		System.out.println("B的b");
	}
}

public class Demo extends B{
	public void a() {
		System.out.println("重写B的a");
	}
	public void c() {
		System.out.println("重写A的c");
	}
	public static void main(String[] args) {
		Demo demo =new Demo();
		demo.a();
		demo.b();
		demo.c();
	}

}
