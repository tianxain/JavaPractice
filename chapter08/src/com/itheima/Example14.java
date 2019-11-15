package com.itheima;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example14 {
	private static void createAndShowGUI() {
		// 1������һ��JFrame��������
		JFrame f = new JFrame("JFrame����");
		f.setLayout(new BorderLayout());
		f.setSize(300, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2������һ��JLabel��ǩ�������ǩ�ı����ж���
		JLabel label = new JLabel("Hello World!",JLabel.CENTER);
		label.setFont(new Font("����", Font.PLAIN, 20));
		// 3������һ��ҳβ��JPanel������������װButtonGroup���
		JPanel panel = new JPanel();
		// 3.1������һ��ButtonGroup��ť�����
		ButtonGroup group = new ButtonGroup();
		// 3.2����������JRadioButton��ѡ��ť���
		JRadioButton italic = new JRadioButton("ITALIC");
		JRadioButton bold = new JRadioButton("BOLD");
		// 3.3��������JRadioButton��ѡ��ť������뵽ͬһ��ButtonGroup����
		group.add(italic);
		group.add(bold);
		// 3.4��Ϊ����JRadioButton��ѡ��ť���ע�ᶯ��������
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int mode = 0;
				if (bold.isSelected())
					mode += Font.BOLD;
				if (italic.isSelected())
					mode += Font.ITALIC;
				label.setFont(new Font("����", mode, 20));
			}
		};
		// 3.5��Ϊ������ѡ����Ӽ�����
		italic.addActionListener(listener);
		bold.addActionListener(listener);
		// 3.6��������JRadioButton��ѡ��ť������뵽ҳβ��JPanel�����
		panel.add(italic);
		panel.add(bold);
		// 4����JFrame�����зֱ������е�JLabel��ǩ�����ҳβ��JPanel������
		f.add(label);
		f.add(panel, BorderLayout.PAGE_END);
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()������ʾGUI����
		SwingUtilities.invokeLater(Example14::createAndShowGUI);
	}
}

