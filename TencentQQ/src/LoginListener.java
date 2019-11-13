import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginListener implements ActionListener{
	
	private JComboBox<Object>jco;
	private JPasswordField jpa;
	private JFrame jf;
	
	public LoginListener(JComboBox<Object>jco,JPasswordField jpa,JFrame jf)
	{
		super();
		this.jco=jco;
		this.jpa=jpa;
		this.jf=jf;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//��ȡ�˺�����
		String name=(String)jco.getSelectedItem();
		String pwd=new String(jpa.getPassword());
		//�ж��˺������Ƿ���ȷ
		if(name.equals("123456789")&&pwd.equals("123"))
		{
			//�ʺ���ȷ���ȹرյ�¼����
			jf.dispose();
			//ģ����ʾ��½�ɹ���Ĵ���
			JFrame jfn=new JFrame();
			jfn.setSize(289,687);
			jfn.setLocation(800,100);
			jfn.setUndecorated(true);
			jfn.setResizable(true);
			jfn.setVisible(true);
			//ΪQQ��ʾ������ӱ���ͼƬ���˳���ť���
			JPanel panel=new JPanel();
			panel.setLayout(null);
			panel.setPreferredSize(new Dimension(0,140));
			ImageIcon image=new ImageIcon("images/qqSuccess.jpg");
			JLabel background=new JLabel(image);
			background.setBounds(0,0,289,687);
			panel.add(background);
			//����˳���ť
			JButton out=new JButton(new ImageIcon("images/close2_normal.jpg"));
			out.setBounds(265,0,26,26);
			out.setRolloverIcon(new ImageIcon("images/close2_haver.jpg"));
			out.setBorderPainted(false);
			panel.add(out);
			jfn.add(panel);
			out.addActionListener(event->jfn.dispose());
		}
		else
		{
			JOptionPane.showMessageDialog(null, "�˺Ż��������������s���룡");
		}
	}
}
