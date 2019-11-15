package com.itheima;
import java.awt.event.*;
import javax.swing.*;
public class Example17 {
	private static void createAndShowGUI() {
		// 1������һ��JFrame��������
		JFrame f = new JFrame("JFrame����");
		f.setSize(300, 200);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2������JPopupMenu����ʽ�˵�
		JPopupMenu popupMenu = new JPopupMenu();
		// 2.1����������JMenuItem�˵�������뵽JPopupMenu�����
		JMenuItem item1 = new JMenuItem("�鿴");
		JMenuItem item2 = new JMenuItem("ˢ��");
		popupMenu.add(item1);
		popupMenu.addSeparator();
		popupMenu.add(item2);
		// 3��ΪJFrame�����������¼�������
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// ���������������Ҽ�����ʾJPopupMenu�˵�
				if (e.getButton() == MouseEvent.BUTTON3) {
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()��������ʾGUI����
		SwingUtilities.invokeLater(Example17::createAndShowGUI);
	}
}

