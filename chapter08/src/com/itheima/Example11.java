package com.itheima;
import java.awt.*;
import javax.swing.*;
public class Example11 {
	private static void createAndShowGUI() {
		// 1������һ��JFrame���촰��
		JFrame f = new JFrame("���촰��");
		f.setLayout(new BorderLayout());
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2������һ��JTextArea�ı���������ʾ����������Ϣ
		JTextArea showArea = new JTextArea(12, 34);
		// ����һ��JScrollPane��������������JTextArea�ı�����Ϊ����ʾ���
		JScrollPane scrollPane = new JScrollPane(showArea);
		showArea.setEditable(false); // �����ı��򲻿ɱ༭
		// 3������һ��JTextField�ı����������뵥��������Ϣ
		JTextField inputField = new JTextField(20);
		JButton btn = new JButton("����"); 
		// Ϊ��ť��Ӽ����¼�
		btn.addActionListener(e -> {
			String content = inputField.getText();
			// �ж��������Ϣ�Ƿ�Ϊ��
			if (content != null && !content.trim().equals("")) {
				// �����Ϊ�գ���������ı�׷�ӵ������촰��
				showArea.append("����������Ϣ:" + content + "\n");
			} else {
				// ���Ϊ�գ���ʾ������Ϣ����Ϊ��
				showArea.append("������Ϣ����Ϊ�գ�����" + "\n");
			}
			inputField.setText(""); // ��������ı���������Ϊ��
		});
		// 3������һ��JPanel������
		JPanel panel = new JPanel();
		JLabel label = new JLabel("������Ϣ");// ����һ����ǩ
		panel.add(label);                  // ����ǩ�����ӵ�JPanel���
		panel.add(inputField);             // ���ı�����ӵ�JPanel���
		panel.add(btn);                    // ����ť��ӵ�JPanel���
		// 4����JFrame���촰�ڵĶ�����β���ֱ����������JScrollPane��JPanel
		f.add(scrollPane, BorderLayout.PAGE_START);
		f.add(panel, BorderLayout.PAGE_END);
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()��������ʾGUI����
		SwingUtilities.invokeLater(Example11::createAndShowGUI);
	}
}

