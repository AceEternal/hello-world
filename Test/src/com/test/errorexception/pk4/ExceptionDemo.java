package com.test.errorexception.pk4;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int a = 5/0;//异常发生点
			//try块中放可能发生异常的代码。
			//如果执行完try且不发生异常，则接着去执行finally块和finally后面的代码（如果有的话）。
			//如果发生异常，则尝试去匹配catch块。
			
		} catch (Exception e) {
			System.out.println("处理异常");
			//每一个catch块用于捕获并处理一个特定的异常，或者这异常类型的子类。Java7中可以将多个异常声明在一个catch中。
			//catch后面的括号定义了异常类型和异常参数。如果异常与之匹配且是最先匹配到的，则虚拟机将使用这个catch块来处理异常。
			//在catch块中可以使用这个块的异常参数来获取异常的相关信息。异常参数是这个catch块中的局部变量，其它块不能访问。
			//如果当前try块中发生的异常在后续的所有catch中都没捕获到，则先去执行finally，然后到这个函数的外部caller中去匹配异常处理器。
			//如果try中没有发生异常，则所有的catch块将被忽略。
		} finally {
			System.out.println("资源回收");
			//finally块通常是可选的。
			//无论异常是否发生，异常是否匹配被处理，finally都会执行。
			//一个try至少要有一个catch块，否则， 至少要有1个finally块。但是finally不是用来处理异常的，finally不会捕获异常。
			//finally主要做一些清理工作，如流的关闭，数据库连接的关闭等。 
		}
	}
}
