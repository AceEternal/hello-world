package com.test.accessrights.pk1;

public class Father {
	private String param1 ="����private";
	protected String param2 ="����protected";
	public String param3 = "����public";
	String param4 ="����default";
	
	public static void main(String[] args) {
		Father father = new Father();
		System.out.println("father ʵ�����ʣ�"+father.param1);
		System.out.println("father ʵ�����ʣ�"+father.param2);
		System.out.println("father ʵ�����ʣ�"+father.param3);
		System.out.println("father ʵ�����ʣ�"+father.param4);
	}
}
