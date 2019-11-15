package com.itheima;
import java.awt.*;
import javax.swing.*;
public class Example10 {
	private static void createAndShowGUI() {
		// 1������һ��JFrame��������
		JFrame f = new JFrame("PanelDemo");
		f.setLayout(new BorderLayout());
		f.setSize(350, 200);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2������JScrollPane����������
		JScrollPane scrollPane = new JScrollPane();
		// ����ˮƽ����������--��������Ҫʱ��ʾ
		scrollPane.setHorizontalScrollBarPolicy
				(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// ���ô�ֱ����������--������һֱ��ʾ
		scrollPane.setVerticalScrollBarPolicy
				(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// ����һ��JPanel������
		JPanel panel = new JPanel();
		// ��JPanel���������ĸ���ť
		panel.add(new JButton("��ť1"));
		panel.add(new JButton("��ť2"));
		panel.add(new JButton("��ť3"));
		panel.add(new JButton("��ť4"));
		// ����JPanel����ڹ������JScrollPane����ʾ
		scrollPane.setViewportView(panel);
		// 4����JFrame�������������JScrollPane����������
		f.add(scrollPane, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()��������ʾGUI����
		SwingUtilities.invokeLater(Example10::createAndShowGUI);
	}
}

