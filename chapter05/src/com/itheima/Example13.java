package com.itheima;
import java.io.IOException;
public class Example13 {
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime(); // ����Runtimeʵ������
		rt.exec("notepad.exe");            // ����exec()����
	}
}


