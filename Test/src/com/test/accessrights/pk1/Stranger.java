package com.test.accessrights.pk1;

import com.test.accessrights.pk2.Child2;

public class Stranger {
	public static void main(String[] args) {
		Father father=new Father();
		System.out.println("father������ʣ�"+father.param2);
		System.out.println("father������ʣ�"+father.param3);
		System.out.println("father������ʣ�"+father.param4);
		
		Child child = new Child();
		System.out.println("child������ʣ�"+child.param2);
		System.out.println("child������ʣ�"+child.param3);
		System.out.println("child������ʣ�"+child.param4);
		
		
		Child2 child2 =new Child2();
		System.out.println("child2������ʣ�"+child2.param2);
		System.out.println("child2������ʣ�"+child2.param3);
	}
}
