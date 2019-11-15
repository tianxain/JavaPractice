package com.itheima;
import java.awt.*;
import javax.swing.*;
public class Example12 {
	private static void createAndShowGUI() {
		// 1������һ��JFrame��������
		JFrame f = new JFrame("JFrame����");
		f.setLayout(new BorderLayout());
		f.setSize(300, 200);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2������һ��JLabel��ǩ���������չʾͼƬ
		JLabel label1 = new JLabel();
		// 2.1������һ��ImageIconͼ�������������JLabel��
		ImageIcon icon = new  ImageIcon("FruitStore.jpg");
		Image img = icon.getImage();
		// 2.2����������ͼƬ��С�ߴ�
		img = img.getScaledInstance(300, 150, Image.SCALE_DEFAULT);  
		icon.setImage(img);  
		label1.setIcon(icon);
		// 3������һ��ҳβJPanel��壬������JLabel��ǩ���
		JPanel panel = new JPanel();
		JLabel label2 = new JLabel("��ӭ����ˮ������",JLabel.CENTER);
		panel.add(label2);
		// 4����JFrame���촰�������Ķ�����β���ֱ����JLabel��JPanel���
		f.add(label1, BorderLayout.PAGE_START);
		f.add(panel, BorderLayout.PAGE_END);
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()��������ʾGUI����
		SwingUtilities.invokeLater(Example12::createAndShowGUI);
	}
}

