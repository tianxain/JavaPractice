import java.awt.*;
import javax.swing.*;

public class CreatePanel {

	private static LoginListener ll=null;
	//顶部面板区域
	public static JPanel CreateNorthPanel(JFrame jf)
	{
		//创建一个JFrame顶部面板
		JPanel panel=new JPanel();
		//取消面板内默认布局
		panel.setLayout(null);
		//设置顶部面板尺寸
		panel.setPreferredSize(new Dimension(0,140));
		//向顶部面板添加图片
		ImageIcon image=new ImageIcon("images/back.jpg");
		JLabel background=new JLabel(image);
		//设置背景图片的位置和尺寸
		background.setBounds(0,0,426,image.getIconHeight());
		panel.add(background);
		//在顶部面板右上角添加一个退出按钮
		JButton out=new JButton(new ImageIcon("images/close_normal.jpg"));
		out.setBounds(403,0,26,26);
		//设置鼠标移动到退出按钮时更改图片
		out.setRolloverIcon(new ImageIcon("images/close_hover.jpg"));
		//取消按钮边框效果
		out.setBorderPainted(false);
		out.addActionListener(event->jf.dispose());
		panel.add(out);
		return panel;
	}
	
	//左侧面板区域
	public static JPanel CreateWestPanel()
	{
		//创建一个JFrame左侧面板
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(130,0));
		//向左侧面板添加背景图片
		ImageIcon image=new ImageIcon("images/qq.jpg");
		JLabel background=new JLabel(image);
		//设置背景图片的位置和尺寸
		background.setBounds(0,0,120,110);
		panel.add(background);
		return panel;
	}
	
	//中部面板区域
	public static JPanel CreateCenterPanel(JFrame jf)
	{
		//创建一个JFramez中部面板
		JPanel panel=new JPanel();
		panel.setLayout(null);
		//创建一个JcomboBox下拉框组件，并初始化QQ账号
		String str[]= {"123456789","987654321","1314520888"};
		JComboBox<Object>jcoCenter=new JComboBox<Object>(str);
		panel.add(jcoCenter);
		//设置下拉框可编辑
		jcoCenter.setEditable(true);
		jcoCenter.setBounds(0, 15, 175, 30);
		//设置下拉框内容字体
		jcoCenter.setFont(new Font("Calibri",0,13));
		//创建一个JPasswordField密码框组件
		JPasswordField jpaCenter=new JPasswordField();
		//设置密码框面板为FlowLayout布局
		jpaCenter.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
		jpaCenter.setBounds(0, 44, 175, 30);
		jpaCenter.setPreferredSize(new Dimension(185,25));
		panel.add(jpaCenter);
		//创建ImageIcon小键盘图标组件，并加入到密码框组件中
		ImageIcon image=new ImageIcon("images/keyboard.jpg");
		JButton jbu=new JButton(image);
		jbu.setPreferredSize(new Dimension(22,20));
		jbu.setBorderPainted(false);
		jpaCenter.add(jbu);
		//创建两个JCheckBox多选框组件
		JCheckBox jch1=new JCheckBox("记住密码");
		//设置选中时不显示边框
		jch1.setFocusPainted(false);
		jch1.setFont(new Font("宋体",0,13));
		jch1.setBounds(0,85,80,20);
		panel.add(jch1);
		JCheckBox jch2=new JCheckBox("自动登录");
		//设置选中时不显示边框
		jch2.setFocusPainted(false);
		jch2.setFont(new Font("宋体",0,123));
		jch2.setBounds(100,85,80,20);
		panel.add(jch2);
		ll=new LoginListener(jcoCenter,jpaCenter,jf);
		return panel;
	}
	
	//右侧面板区域
	public static JPanel CreateEastPanel()
	{
		//创建一个JFrame右侧面板
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(0,51));
		//创建两个JLabel标签组件
		JLabel regeist=new JLabel("注册账号");
		regeist.setForeground(new Color(100,149,238));
		regeist.setBounds(0,13,60,30);
		regeist.setFont(new Font("宋体",0,12));
		
		JLabel regetpwd=new JLabel("找回密码");
		regetpwd.setForeground(new Color(100,149,238));
		regetpwd.setBounds(0,43,60,30);
		regetpwd.setFont(new Font("宋体",0,12));
		panel.add(regetpwd);
		panel.add(regeist);
		return panel;
	}
	
	//底部面板区域
	public static JPanel CreateSouthPanel()
	{
		//创建一个JFrame底部面板

		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(0,51));
		//创建左下角多人登录图标组件
		JButton jble=new JButton(new ImageIcon("images/single_normal.jpg"));
		jble.setPreferredSize(new Dimension(40,40));
		jble.setFocusPainted(false);
		jble.setRolloverIcon(new ImageIcon("images/single_down.jpg"));
		jble.setBorderPainted(false);
		//设置不显示按钮区域
		jble.setContentAreaFilled(false);
		jble.setBounds(0,10,40,40);
		jble.setToolTipText("多账号登录");
		//创建底部中间登录图标组件
		ImageIcon image=new ImageIcon("images/login_normal.jpg");
		JButton jb=new JButton("登         录",image);
		jb.setFont(new Font("宋体",0,13));
		jb.setBounds(13,0,175,40);
		//将文字放在图片中间
		jb.setHorizontalTextPosition(SwingConstants.CENTER);
		jb.setFocusPainted(false);
		jb.setContentAreaFilled(false);
		jb.setBorderPainted(false);
		jb.setRolloverIcon(new ImageIcon("images/login_hover.jpg"));
		jb.addActionListener(ll);
		//创建右下角二维码登录图标组件
		JButton jbri=new JButton(new ImageIcon("images/right_normal.jpg"));
		jbri.setBounds(380,10,40,40);
		jbri.setFocusPainted(false);
		jbri.setContentAreaFilled(false);
		jbri.setBorderPainted(false);
		jbri.setRolloverIcon(new ImageIcon("images/right_hover.jpg"));
		jbri.setToolTipText("二维码登录");
		panel.add(jble);
		panel.add(jb);
		panel.add(jbri);
		return panel;
	}
}
