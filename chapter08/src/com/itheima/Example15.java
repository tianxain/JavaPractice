package com.itheima;
import java.awt.*;
import javax.swing.*;
public class Example15 {
	private static void createAndShowGUI() {
		// 1������һ��JFrame��������
		JFrame f = new JFrame("JFrame����");
		f.setLayout(new BorderLayout());
		f.setSize(350, 200);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2������һ��ҳͷ��JPanel���,������װJComboBox���������
		JPanel panel = new JPanel();
		// 2.1������JComboBox���������
		JComboBox<String> comboBox = new JComboBox<>();
		// 2.2��Ϊ���������ѡ��
		comboBox.addItem("��ѡ�����");
		comboBox.addItem("����");
		comboBox.addItem("���");
		comboBox.addItem("�Ͼ�");
		comboBox.addItem("�Ϻ�");
		// 2.3������JTextField�����ı������������չʾ�û�ѡ����
		JTextField textField = new JTextField(20);
		// 2.4��ΪJComboBox���������ע�ᶯ��������
		comboBox.addActionListener(e -> {
			String item = (String) comboBox.getSelectedItem();
			if ("��ѡ�����".equals(item)) {
				textField.setText("");
			} else {
				textField.setText("��ѡ��ĳ����ǣ�" + item);
			}
		});
		// 2.5����JComboBox�����JTextField�������JPanel��������
		panel.add(comboBox); 
		panel.add(textField); 
		// 4����JFrame���������м���ҳͷ��JPanel������
		f.add(panel, BorderLayout.PAGE_START);
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()��������ʾGUI����
		SwingUtilities.invokeLater(Example15::createAndShowGUI);
	}
}

