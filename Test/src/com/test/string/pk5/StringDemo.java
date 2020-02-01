package com.test.string.pk5;

public class StringDemo {
	public static void main(String[] args) {
//		String s1="a"+"b";
//		String s2="ab";
		
//		String s1="a";
//		String s2=s1+"b";
		
		StringBuilder s1=new StringBuilder("a");
		StringBuilder s2=s1.append("b");
		
		System.out.println(s1+"  "+s2);
		System.out.println(s1==s2);
	}
}
