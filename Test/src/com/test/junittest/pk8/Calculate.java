package com.test.junittest.pk8;

public class Calculate {
	public int CalculateAdd(int a,int b) {
		int c;
		c = a + b;
		return c;
	}
	public static void main(String[] args) {
		Calculate res = new Calculate();
		System.out.println(res.CalculateAdd(6, 3));
	}
}
