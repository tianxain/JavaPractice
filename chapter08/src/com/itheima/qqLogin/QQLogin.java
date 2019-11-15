package com.itheima.qqLogin;
import java.awt.*;
import javax.swing.*;
// QQ��¼�������ʼ����
public class QQLogin {
	// 1��ΪQQ��¼���������ʼ��һ��JFrame����
	private static JFrame jf = new JFrame();
	// QQ��¼���ڳ�ʼ������
	public static void initLogin() {
		jf.setSize(426, 300);     // ���ô��ڳߴ�
		jf.setLocation(497, 242); // ���ô�������Ļ��ʾλ��
		jf.setUndecorated(true);  // ����JFrame���ڱ߿���ʾ
		jf.setResizable(false);   // ��ֹ�ı䴰�ڴ�С
		// 2������QQ��¼����Ч�������в��ַ���
		BorderLayout border_layout = new BorderLayout();
		jf.setLayout(border_layout);
		// 2.1�����������붥�����
		JPanel panel_north = CreatePanel.CreateNorthPanel(jf);
		jf.add(panel_north, BorderLayout.PAGE_START);
		// 2.2�������������в����
		JPanel panel_center = CreatePanel.CrateCenterPanel(jf);
		jf.add(panel_center, BorderLayout.CENTER);
		// 2.3������������������
		JPanel panel_west = CreatePanel.CreateWestPanel();
		jf.add(panel_west, BorderLayout.LINE_START);
		// 2.4������������ײ����
		JPanel panel_south = CreatePanel.CreateSouthPanel();
		jf.add(panel_south, BorderLayout.PAGE_END);
		// 2.5�������������Ҳ����
		JPanel pannel_east = CreatePanel.CrateEastPanel();
		jf.add(pannel_east, BorderLayout.LINE_END);
		jf.setVisible(true);    // ���ô��ڿɼ�
	}
	// QQ��¼�������
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()��������ʾGUI����
		SwingUtilities.invokeLater(QQLogin::initLogin);
	}

}