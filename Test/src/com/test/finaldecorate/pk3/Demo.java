package com.test.finaldecorate.pk3;

public class Demo {
	public static void main(String[] args){
		final int I = 20;
		//I = 30; //赋值报错，final修饰的变量只能赋值一次
	}
}

class Parent {
	// final修饰的方法，不可以被覆盖，但可以继承使用
    public final void method1(){}  //这个方法不可以重写
    public void method2(){}
}

class Child extends Parent{
	//可以重写method2方法
	public final void method2(){}
}

final class Person extends Parent{} //可以继承Parent类

//class Child extends Person{} //不能继承Person类

