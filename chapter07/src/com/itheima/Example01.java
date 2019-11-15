package com.itheima;
import java.io.*;
public class Example01 {
	public static void main(String[] args) throws Exception {
		// 创建一个文件字节输入流来读取文件
		FileInputStream in = new FileInputStream("test.txt");
		// 定义一个int类型的变量b
		int b = 0;
		// 通过循环来读取文件，当返回值为-1结束循环
		while((b=in.read()) != -1){
			System.out.println(b); 
		}
		// 关闭流
		in.close();
	}
}

