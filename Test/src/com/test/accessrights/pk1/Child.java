package com.test.accessrights.pk1;

public class Child extends Father{
	public static void main(String[] args) {
		Father father = new Father();
		System.out.println("father������ʣ�"+father.param2);
		System.out.println("father������ʣ�"+father.param3);
		System.out.println("father������ʣ�"+father.param4);
		
		Child child = new Child();
		System.out.println("child������ʣ�"+child.param2);
		System.out.println("child������ʣ�"+child.param3);
		System.out.println("child������ʣ�"+child.param4);
	}
}
