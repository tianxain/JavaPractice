package com.itheima;
import java.awt.*;
import javax.swing.*;
public class Example03 {
	private static void createAndShowGUI() {
		// ����һ����ΪBorderLayout�Ķ�����������
		JFrame f = new JFrame("BorderLayout");
		// ���ô����еĲ��ֹ�����ΪBorderLayout
		f.setLayout(new BorderLayout());
		f.setSize(300, 300);     // ���ô����С
		f.setLocation(300, 200); // ���ô�����ʾ��λ��
		// ����Ĵ����Ǵ���5����ť���
		JButton but1 = new JButton("PAGE_START");
		JButton but2 = new JButton("PAGE_END");
		JButton but3 = new JButton("LINE_START");
		JButton but4 = new JButton("LINE_END");
		JButton but5 = new JButton("CENTER");
		// ����Ĵ����ǽ������õİ�ť�����ӵ������У������ð�ť���ڵ�����
		f.add(but1, BorderLayout.PAGE_START);
		f.add(but2, BorderLayout.PAGE_END);
		f.add(but3, BorderLayout.LINE_START);
		f.add(but4, BorderLayout.LINE_END);
		f.add(but5, BorderLayout.CENTER);
		f.setVisible(true);  // ���ô���ɼ�
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()����ִ�в���ʾGUI����
		SwingUtilities.invokeLater(Example03::createAndShowGUI);
	}
}
