package com.test.errorexception.pk4;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int a = 5/0;//�쳣������
			//try���зſ��ܷ����쳣�Ĵ��롣
			//���ִ����try�Ҳ������쳣�������ȥִ��finally���finally����Ĵ��루����еĻ�����
			//��������쳣������ȥƥ��catch�顣
			
		} catch (Exception e) {
			System.out.println("�����쳣");
			//ÿһ��catch�����ڲ��񲢴���һ���ض����쳣���������쳣���͵����ࡣJava7�п��Խ�����쳣������һ��catch�С�
			//catch��������Ŷ������쳣���ͺ��쳣����������쳣��֮ƥ����������ƥ�䵽�ģ����������ʹ�����catch���������쳣��
			//��catch���п���ʹ���������쳣��������ȡ�쳣�������Ϣ���쳣���������catch���еľֲ������������鲻�ܷ��ʡ�
			//�����ǰtry���з������쳣�ں���������catch�ж�û���񵽣�����ȥִ��finally��Ȼ������������ⲿcaller��ȥƥ���쳣��������
			//���try��û�з����쳣�������е�catch�齫�����ԡ�
		} finally {
			System.out.println("��Դ����");
			//finally��ͨ���ǿ�ѡ�ġ�
			//�����쳣�Ƿ������쳣�Ƿ�ƥ�䱻����finally����ִ�С�
			//һ��try����Ҫ��һ��catch�飬���� ����Ҫ��1��finally�顣����finally�������������쳣�ģ�finally���Ჶ���쳣��
			//finally��Ҫ��һЩ�������������Ĺرգ����ݿ����ӵĹرյȡ� 
		}
	}
}
