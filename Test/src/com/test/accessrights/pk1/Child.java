package com.test.accessrights.pk1;

public class Child extends Father{
	public static void main(String[] args) {
		Father father = new Father();
		System.out.println("father对象访问："+father.param2);
		System.out.println("father对象访问："+father.param3);
		System.out.println("father对象访问："+father.param4);
		
		Child child = new Child();
		System.out.println("child对象访问："+child.param2);
		System.out.println("child对象访问："+child.param3);
		System.out.println("child对象访问："+child.param4);
	}
}
