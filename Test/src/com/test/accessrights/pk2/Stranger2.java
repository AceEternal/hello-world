package com.test.accessrights.pk2;

import com.test.accessrights.pk1.Child;
import com.test.accessrights.pk1.Father;

public class Stranger2 {
	public static void main(String[] args) {
		Father father=new Father();
		System.out.println("father ʵ�����ʣ�"+father.param3);
		
		Child child = new Child();
		System.out.println("child ʵ�����ʣ�"+child.param3);
		
		Child2 child2 = new Child2();
		System.out.println("child2 ʵ�����ʣ�"+child2.param3);
	}
}
