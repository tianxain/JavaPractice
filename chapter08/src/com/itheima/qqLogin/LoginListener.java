package com.itheima.qqLogin;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// QQ��¼������
public class LoginListener implements ActionListener {
	private JComboBox<Object> jco; // ������ȡQQ�˺ŵĶ���
	private JPasswordField jpa; // ������ȡQQ����Ķ���
	private JFrame jf;
	public LoginListener(JComboBox<Object> jco, JPasswordField jpa, JFrame jf) {
		super();
		this.jco = jco;
		this.jpa = jpa;
		this.jf = jf;
	}
	/**
	 * Ϊ��¼���������¼�ִ�д���
	 */
	public void actionPerformed(ActionEvent e) {
		// 1����ȡ��¼���˺ź�����
		String name = (String) jco.getSelectedItem();
		String pwd = new String(jpa.getPassword());
		// 2���ж�������˺ź������Ƿ���ȷ
		if (name.equals("123456789") && pwd.equals("123")) {
			// �˺���ȷ���ȹرյ�ǰJFrame��¼����
			jf.dispose();
			// ģ����ʾ��¼�ɹ����QQ����
			JFrame jfn = new JFrame();
			jfn.setSize(289, 687);
			jfn.setLocation(800, 100);
			jfn.setUndecorated(true);
			jfn.setResizable(true);
			jfn.setVisible(true);
			// ΪQQ��ʾ������ӱ���ͼƬ���˳���ť���
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setPreferredSize(new Dimension(0, 140));
			ImageIcon image = new ImageIcon("images/qqSuccess.jpg");
			JLabel background = new JLabel(image);
			background.setBounds(0, 0, 289, 687);
			panel.add(background);
			// ����˳���ť
			JButton out = new JButton(
					new ImageIcon("images/close2_normal.jpg"));
			out.setBounds(265, 0, 26, 26);
			out.setRolloverIcon(new ImageIcon("images/close2_hover.jpg"));
			out.setBorderPainted(false);
			panel.add(out);
			jfn.add(panel);
			// Ϊ�˳���ťע����������رյ�ǰ����
			out.addActionListener(event -> jfn.dispose());
		} else {
			// QQ�˺Ż�����������󣬵�����ʾ��Ϣ
			JOptionPane.showMessageDialog(null,
					"��������˻��������벻��ȷ�����������룡");
		}
	}
}