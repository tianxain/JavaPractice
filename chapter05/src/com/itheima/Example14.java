package com.itheima;
public class Example14 {
	public static void main(String[] args) throws Exception {
        // ����һ��Runtimeʵ������
		Runtime rt = Runtime.getRuntime();
		// �õ���ʾ���̵�Process����
		Process process = rt.exec("notepad.exe");
		// ��������3��
		Thread.sleep(3000); 
		// �رս���
		process.destroy();
	}
}

