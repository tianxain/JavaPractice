package com.itheima;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example08 {
	private static void createAndShowGUI() {
		JFrame f = new JFrame("MouseEvent");
		f.setLayout(new FlowLayout());       // Ϊ�������ò���
		f.setSize(300, 200);
		f.setLocation(300, 200);
		f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton but = new JButton("Button");// ������ť����
		f.add(but);                         // �ڴ�����Ӱ�ť���
		// Ϊ��ť�������¼�������
		but.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleased-���ſ��¼�");
			}
			public void mousePressed(MouseEvent e) {
				System.out.println("mousePressed-��갴���¼�");
			}
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExited������Ƴ���ť�����¼�");
			}
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered�������밴ť�����¼�");
			}
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked-�����ɵ����¼�");
			}
		});
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()��������ʾGUI����
		SwingUtilities.invokeLater(Example08::createAndShowGUI);
	}
}


