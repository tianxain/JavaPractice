package com.itheima.example31;
public class Example31 {
    // 下面的方法实现了两个整数相除，并使用throws关键字声明抛出异常
	public static int divide(int x, int y) throws Exception {
		int result = x / y;            // 定义变量result记录两个数相除的结果
		return result;                 // 将结果返回
	}
	public static void main(String[] args) {
		int result = divide(4, 0);     // 调用divide()方法
		System.out.println(result);
	}
}


