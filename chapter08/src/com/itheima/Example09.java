package com.itheima;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example09 {
	private static void createAndShowGUI() {
		JFrame f = new JFrame("KeyEvent");
		f.setLayout(new FlowLayout());
		f.setSize(400, 300);
		f.setLocation(300, 200);
		JTextField tf = new JTextField(30); // �����ı������
		f.add(tf);                          // �ڴ���������ı������
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // Ϊ�ı�����Ӽ����¼�������
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// ��ȡ��Ӧ�ļ����ַ�
				char keyChar = e.getKeyChar();
				// ��ȡ��Ӧ�ļ����ַ�����
				int keyCode = e.getKeyCode();
				System.out.print("���̰��µ��ַ�����Ϊ��" + keyChar+" ");
				System.out.println("���̰��µ��ַ�����Ϊ��" + keyCode);
			}
		});
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()��������ʾGUI����
		SwingUtilities.invokeLater(Example09::createAndShowGUI);
	}
}


