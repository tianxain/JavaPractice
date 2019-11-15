package com.itheima.qqLogin;
import java.awt.*;
import javax.swing.*;
// QQ��¼���沼����崴��������
public class CreatePanel {  
    private static LoginListener ll =null;
    /**
     * ����������QQ��¼���涥���������
     * @param jf  QQ��¼���洰�ڶ���
     * @return    ���ش����ĵ�ǰ����������
     */
    public static JPanel CreateNorthPanel(JFrame jf){  
    	// 1������һ��JPanel�������
        JPanel panel=new JPanel();  
        // ȡ�������Ĭ�ϲ���
        panel.setLayout(null);     
        // ���ö������ߴ� 
        panel.setPreferredSize(new Dimension(0, 140));  
        // 1.1���򶥲������ӱ���ͼƬ
        ImageIcon image=new ImageIcon("images/back.jpg");  
        JLabel background=new JLabel(image);  
        // ���ñ���ͼƬ��λ�ü��ߴ�
        background.setBounds(0,0,426,image.getIconHeight());     
        panel.add(background);  
        // 1.2���ڶ���JPanel������Ͻ����һ���˳���ť
		JButton out = new JButton(new ImageIcon("images/close_normal.jpg"));
		out.setBounds(403,0,26,26);
		// ��������ƶ����˳���ťʱ����ͼƬ
		out.setRolloverIcon(new ImageIcon("images/close_hover.jpg"));
		// ȡ����ť�߿�Ч��
		out.setBorderPainted(false);
		panel.add(out);
		// Ϊ�˳���ťע��������������رմ���
		out.addActionListener(event -> jf.dispose());
        return panel;  
    }  
    /** 
     * ����������QQ��¼������಼�����
     * @return  ���ش����ĵ�ǰ���������
     */
    public static JPanel CreateWestPanel(){
    	// 1������һ��JPanel������
        JPanel panel=new JPanel();  
        panel.setLayout(null);  
        panel.setPreferredSize(new Dimension(130,0));  
        // 1.1������������ӱ���ͼƬ
        ImageIcon image=new ImageIcon("images/qq.jpg");  
        JLabel  background=new JLabel(image);  
        background.setBounds(0, 0, 120, 110);  
        panel.add(background);  
        return panel;  
    }  
    /**
     * ����������QQ��¼�����в��������
     * @param jf  QQ��¼���洰�ڶ���
     * @return    ���ش����ĵ�ǰ�в�������
     */
    public static JPanel CrateCenterPanel(JFrame jf){  
    	// 1������һ��JPanel�в����  
        JPanel panel = new JPanel();  
        panel.setLayout(null);  
        // 1.1 ����һ��JcomboBox���������������ʼ��QQ�˺� 
        String str []= {"123456789","987654321","1314520888"};  
        JComboBox<Object> jcoCenter = new JComboBox<Object>(str);  
        panel.add(jcoCenter);  
        // ����������ɱ༭  
        jcoCenter.setEditable(true);  
        jcoCenter.setBounds(0, 15, 175, 30);
        // ������������������
        jcoCenter.setFont(new Font("Calibri ",0,13));  
        // 1.2������һ��JPasswordField��������  
        JPasswordField jpaCenter = new JPasswordField();  
        // ������������ΪFlowLayout��ʧ����
        jpaCenter.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));  
        jpaCenter.setBounds(0, 44, 175, 30);  
        jpaCenter.setPreferredSize(new Dimension(185,25)); 
        panel.add(jpaCenter); 
        // 1.3������ImageIconС����ͼ������������뵽����������  
        ImageIcon image = new ImageIcon("images/keyboard.jpg");
        JButton jbu = new JButton(image);  
        jbu.setPreferredSize(new Dimension(22,20));  
        jbu.setBorderPainted(false);  
        jpaCenter.add(jbu);  
        // 1.4����������JCheckBox��ѡ����� 
        JCheckBox jch1 = new JCheckBox("��ס����"); 
        // ����ѡ��ʱ����ʾ�߿�
        jch1.setFocusPainted(false); 
        jch1.setFont(new Font("����",0,13));
        jch1.setBounds(0, 85, 80, 20);  
        panel.add(jch1);  
        JCheckBox jch2 = new JCheckBox("�Զ���¼");  
        jch2.setFocusPainted(false);  
        jch2.setFont(new Font("����",0,12));  
        jch2.setBounds(100, 85, 80, 20);  
        panel.add(jch2);  
        // 2�����в�����ʼ����¼����������װ�˺ź�����
        ll = new LoginListener(jcoCenter, jpaCenter, jf);
        return panel;  
    }  
    /**
     * ����������QQ��¼�����Ҳ಼����� 
     * @return ���ش����ĵ�ǰ�Ҳ�������
     */
    public static JPanel CrateEastPanel(){
    	// 1������һ��JPanel�Ҳ���� 
        JPanel panel=new JPanel();  
        panel.setLayout(null);  
        panel.setPreferredSize(new Dimension(100, 0));  
        // 1.1������������������JLabel��ǩ���
        JLabel regeist=new JLabel("ע���˺�");  
        regeist.setForeground(new Color(100,149,238));  
        regeist.setBounds(0, 13, 60, 30);  
        regeist.setFont(new Font("����",0,12));  
        // 2������һ��JPanel�Ҳ���� 
        JLabel regetpwd=new JLabel("�һ�����");  
        regetpwd.setForeground(new Color(100,149,238));  
        regetpwd.setBounds(0, 43, 60, 30);  
        regetpwd.setFont(new Font("����",0,12));  
        panel.add(regetpwd);  
        panel.add(regeist);  
        return panel;  
    }  
    /**
     * ����������QQ��¼����ײ��������
     * @return ���ش����ĵ�ǰ�ײ�������
     */
    public static JPanel CreateSouthPanel(){  
    	// 1������һ��JPanel�ײ����   
        JPanel panel = new JPanel();  
        panel.setPreferredSize(new Dimension(0,51));  
        panel.setLayout(null);  
        // 1.1���������½Ƕ��˵�¼ͼ�����
        JButton jble = new JButton(
        		new ImageIcon("images/single_normal.jpg"));  
        jble.setPreferredSize(new Dimension(40,40));  
        jble.setFocusPainted(false);  
        jble.setRolloverIcon(new ImageIcon("images/single_down.jpg"));  
        jble.setBorderPainted(false);  
        // ���ò���ʾ��ť����
        jble.setContentAreaFilled(false);  
        jble.setBounds(0,10,40,40);  
        jble.setToolTipText("���˺ŵ�¼");  
        // 1.2�������ײ��м��¼ͼ����� 
        ImageIcon image = new ImageIcon("images/login_normal.jpg");  
        JButton jb = new JButton("��     ¼",image);  
        jb.setFont(new Font("����",0,13));
        jb.setBounds(130,0,175,40);
        // �����ַ���ͼƬ�м�  
        jb.setHorizontalTextPosition(SwingConstants.CENTER);
        jb.setFocusPainted(false);  
        jb.setContentAreaFilled(false); 
        jb.setBorderPainted(false);  
        jb.setRolloverIcon(new ImageIcon("images/login_hover.jpg"));  
        // 1.2���������½Ƕ�ά���¼ͼ����� 
        JButton jbri = new JButton(
        			new ImageIcon("images/right_normal.jpg")); 
        jbri.setBounds(380,10,40,40);
        jbri.setFocusPainted(false); 
        jbri.setBorderPainted(false);  
        jbri.setContentAreaFilled(false);  
        jbri.setRolloverIcon(new ImageIcon("images/right_hover.jpg"));  
        jbri.setToolTipText("��ά���¼"); 
        // ���ײ�3�������ӵ��ײ�JPanel�����
        panel.add(jble);  
        panel.add(jb);  
        panel.add(jbri);         
        // 2��Ϊ����¼����ťע�����������̨���QQ�˺š������Ƿ���ȷ 
        jb.addActionListener(ll);
        return panel;  
    }  
}  