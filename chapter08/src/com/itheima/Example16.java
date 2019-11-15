package com.itheima;
import javax.swing.*;
public class Example16 {
	private static void createAndShowGUI() {
		// 1������һ��JFrame��������
		JFrame f = new JFrame("JFrame����");
		f.setSize(350, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2�������˵������JMenuBar
		JMenuBar menuBar = new JMenuBar(); 
		// 2.1������2��JMenu�˵������������JMenuBar��
		JMenu menu1 = new JMenu("�ļ�(F)");
		JMenu menu2 = new JMenu("����(H)");
		menuBar.add(menu1);
		menuBar.add(menu2);
		// 2.2������2��JMenuItem�˵��������������JMenu��
		JMenuItem item1 = new JMenuItem("�½�(N)");
		JMenuItem item2 = new JMenuItem("�˳�(X)");
		menu1.add(item1);
		menu1.addSeparator();   // ���÷ָ���
		menu1.add(item2);
		// 2.3���ֱ𴴽�2��JMenuItem�˵��������
		item1.addActionListener(e -> {
			// ����һ��JDialog����
			JDialog dialog = new JDialog(f,"�ޱ���",true);
			dialog.setSize(200, 100);
			dialog.setLocation(300, 200);
			dialog.setVisible(true);
			dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		});
		item2.addActionListener(e -> System.exit(0));
		// 3����JFrame���������м���JMenuBar�˵����
		f.setJMenuBar(menuBar);
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()��������ʾGUI����
		SwingUtilities.invokeLater(Example16::createAndShowGUI);
	}
}

