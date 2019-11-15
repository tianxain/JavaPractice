package com.itheima;
import javax.swing.*;
public class Example02 {
    private static void createAndShowGUI() {
        // ����������JFrame��������
        JFrame frame = new JFrame("JFrameTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 150);
        frame.setVisible(true);
        // ��JFrame�������ڻ����ϴ���������JDialog��������
        JDialog dialog = new JDialog(frame, "JDialog�Ի���",true);
        dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }
    public static void main(String[] args) {
    	// ʹ��SwingUtilities���������createAndShowGUI()����ִ�в���ʾGUI����
        SwingUtilities.invokeLater(Example02::createAndShowGUI);
    }
}

