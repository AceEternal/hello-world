package com.test.finaldecorate.pk3;

public class Demo {
	public static void main(String[] args){
		final int I = 20;
		//I = 30; //��ֵ����final���εı���ֻ�ܸ�ֵһ��
	}
}

class Parent {
	// final���εķ����������Ա����ǣ������Լ̳�ʹ��
    public final void method1(){}  //���������������д
    public void method2(){}
}

class Child extends Parent{
	//������дmethod2����
	public final void method2(){}
}

final class Person extends Parent{} //���Լ̳�Parent��

//class Child extends Person{} //���ܼ̳�Person��

