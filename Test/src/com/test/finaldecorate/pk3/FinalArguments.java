package com.test.finaldecorate.pk3;

class Test{
	int i = 0;
	public void spin(){}
}

public class FinalArguments {
	void withFinal(final Test g){
		//g = new Test(); // �޷��޸�final���ε����ã�ʹ��ָ����һ������
		g.i++; // �������޸�final������ָ�������
	}
	void withoutFinal(Test g){
		g = new Test();
		g.spin();
	} 
	/*int count(final int i){
		i++; //�ᱨ����Ϊ����i�ǳ���ֵ
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
