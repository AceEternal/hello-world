package com.test.accessrights.pk2;

import com.test.accessrights.pk1.Father;

public class Child2 extends Father{
	public static void main(String[] args) {
		Father father=new Father();
		System.out.println("father������ʣ�"+father.param3);
		
		Child2 child2=new Child2();
		System.out.println("child2������ʣ�"+child2.param2);
		System.out.println("child2������ʣ�"+child2.param3);
	}
}
