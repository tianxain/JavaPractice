package com.itheima;
import java.awt.*;
import javax.swing.*;
public class Example04 {
	private static void createAndShowGUI() {
		// ����һ����ΪFlowlayout�Ĵ���
		JFrame f = new JFrame("Flowlayout"); 
		// ���ô����еĲ��ֹ�����ΪFlowLayout��
		// �����������룬ˮƽ���Ϊ20����ֱ���Ϊ30
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		f.setSize(400, 200);                 // ���ô����С
		f.setLocation(300, 200);             // ���ô�����ʾ��λ��
		// ������������
		f.add(new JButton("��1����ť"));  
		f.add(new JButton("��2����ť"));
		f.add(new JButton("��3����ť"));  
		f.add(new JButton("��4����ť"));
		f.add(new JButton("��5����ť"));  
		f.setVisible(true);                  // ���ô���ɼ�
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()����ִ�в���ʾGUI����
		SwingUtilities.invokeLater(Example04::createAndShowGUI);
	}
}
