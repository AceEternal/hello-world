package com.test.abstractclassandinterface.pk7;

class AbstractDemo extends Human {//�̳г�����
	public AbstractDemo(String name, String ID, int age) {
		super(name, ID, age);
	}
	@Override//��д���󷽷�
	public void habit() {
		System.out.println("��ϲ������rap��ϲ������ë�򡢳��������Ϸ��");
	}
	public static void main(String [] args) {
		AbstractDemo someone = new AbstractDemo("��ĳ��", "666", 21);
		someone.run();
		someone.habit();
	}

}

public abstract class Human {
	private String name;
	private String ID;
	private int age;
	public Human(String name,String ID,int age) {
		this.name = name;
		this.ID = ID;
		this.age = age;
		System.out.printf("�ҽ�%s���ҵ�ID��%s���ҽ���%d�ꡣ\n",name,ID,age);
	}
	public void run() {
		System.out.println("�������ܲ���");
	}
	public abstract void habit();
}
