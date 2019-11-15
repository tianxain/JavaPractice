package com.itheima;
import java.awt.event.*;
import javax.swing.*;
public class Example07 {
	private static void createAndShowGUI() {
		JFrame f = new JFrame("WindowEvent");
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ʹ���ڲ��ഴ��WindowListenerʵ�����󣬼��������¼�
		f.addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {
				System.out.println("windowOpened---������¼�");
			}
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified---����ͼ�껯�¼�");
			}
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified---����ȡ��ͼ�껯�¼�");
			}
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated---����ͣ���¼�");
			}
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing---�������ڹر��¼�");
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed---����ر��¼�");
			}
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated---���弤���¼�");
			}
		});
	}
	public static void main(String[] args) {
		// ʹ��SwingUtilities���������createAndShowGUI()����ִ�в���ʾGUI����
		SwingUtilities.invokeLater(Example07::createAndShowGUI);
	}
}
