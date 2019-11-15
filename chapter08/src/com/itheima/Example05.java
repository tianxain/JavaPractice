package com.itheima;
import java.awt.*;
import javax.swing.*;
public class Example05 {
	private static void createAndShowGUI() {
        // ����һ����ΪGridLayout�Ĵ���
		JFrame f = new JFrame("GridLayout");
		f.setLayout(new GridLayout(3, 3));  // ���øô���Ϊ3*3������
		f.setSize(300, 300);                // ���ô����С
		f.setLocation(400, 300);
		// ����Ĵ�����ѭ�����8����ť�����GridLayout������
		for (int i = 1; i < 9; i++) {
			Button btn = new Button("btn" + i);
			f.add(btn);                     
		}
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()��������ʾGUI����
		SwingUtilities.invokeLater(Example05::createAndShowGUI);
	}
}


