package com.test.finaldecorate.pk3;

class Test{
	int i = 0;
	public void spin(){}
}

public class FinalArguments {
	void withFinal(final Test g){
		//g = new Test(); // 无法修改final修饰的引用，使它指向另一个对象
		g.i++; // 但可以修改final对象所指向的内容
	}
	void withoutFinal(Test g){
		g = new Test();
		g.spin();
	} 
	/*int count(final int i){
		i++; //会报错，因为参数i是常量值
	} */
	int count(final int i){
		return i + 1;
	} 
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.withoutFinal(null);
		bf.withFinal(null);
	}
}
