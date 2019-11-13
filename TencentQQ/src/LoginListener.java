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
		//获取账号密码
		String name=(String)jco.getSelectedItem();
		String pwd=new String(jpa.getPassword());
		//判断账号密码是否正确
		if(name.equals("123456789")&&pwd.equals("123"))
		{
			//帐号正确，先关闭登录窗口
			jf.dispose();
			//模拟显示登陆成功后的窗口
			JFrame jfn=new JFrame();
			jfn.setSize(289,687);
			jfn.setLocation(800,100);
			jfn.setUndecorated(true);
			jfn.setResizable(true);
			jfn.setVisible(true);
			//为QQ显示窗口添加背景图片和退出按钮组件
			JPanel panel=new JPanel();
			panel.setLayout(null);
			panel.setPreferredSize(new Dimension(0,140));
			ImageIcon image=new ImageIcon("images/qqSuccess.jpg");
			JLabel background=new JLabel(image);
			background.setBounds(0,0,289,687);
			panel.add(background);
			//添加退出按钮
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
			JOptionPane.showMessageDialog(null, "账号或密码错误，请重新s输入！");
		}
	}
}
