package com.test.abstractclassandinterface.pk7;

class AbstractDemo extends Human {//继承抽象类
	public AbstractDemo(String name, String ID, int age) {
		super(name, ID, age);
	}
	@Override//重写抽象方法
	public void habit() {
		System.out.println("不喜欢唱跳rap，喜欢打羽毛球、唱歌和玩游戏。");
	}
	public static void main(String [] args) {
		AbstractDemo someone = new AbstractDemo("张某人", "666", 21);
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
		System.out.printf("我叫%s，我的ID是%s，我今年%d岁。\n",name,ID,age);
	}
	public void run() {
		System.out.println("我正在跑步！");
	}
	public abstract void habit();
}
