package com.test.generic.pk6;

public class GenericMethodTest {
	// ���ͷ��� printArray                         
	public static < E > void printArray( E[] inputArray ) {
	      // �������Ԫ��            
		for ( E e : inputArray ){        
			System.out.printf( "%s ", e );
		}
		System.out.println();
	} 
	public static void main( String args[] ) {
		// ������ͬ�������飺 Integer, Double �� Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { '<', 'A', 'C', 'E', '>' };
	 
		System.out.println( "��������Ԫ��Ϊ:" );
		printArray( intArray  ); // ����һ����������
	 
		System.out.println( "\n˫����������Ԫ��Ϊ:" );
		printArray( doubleArray ); // ����һ��˫����������
	 
		System.out.println( "\n�ַ�������Ԫ��Ϊ:" );
		printArray( charArray ); // ����һ���ַ�������
	    } 
}
