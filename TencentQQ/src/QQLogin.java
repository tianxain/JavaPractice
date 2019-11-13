import java.awt.*;
import javax.swing.*;


public class QQLogin {

	//为QQ登陆界面整体初始化一个Jframe窗口
	private static JFrame jf=new JFrame();
	//QQ登录窗口初始化方法
	public static void initLogin()
	{
		jf.setSize(426,300);
		jf.setLocation(497,242);
		jf.setUndecorated(true);
		jf.setResizable(false);
		
		//根据QQ登陆界面效果，进行布局分配
		BorderLayout border_layout=new BorderLayout();
		jf.setLayout(border_layout);
		
		//创建并加入顶部面板
		JPanel panel_north=CreatePanel.CreateNorthPanel(jf);
		jf.add(panel_north,BorderLayout.PAGE_START);
		
		//创建并加入中部面板
		JPanel panel_center=CreatePanel.CreateCenterPanel(jf);
		jf.add(panel_center,BorderLayout.CENTER);
				
		//创建并加入左侧面板
		JPanel panel_west=CreatePanel.CreateWestPanel();
		jf.add(panel_west,BorderLayout.LINE_START);
				
		//创建并加入底部面板
		JPanel panel_south=CreatePanel.CreateSouthPanel();
		jf.add(panel_south,BorderLayout.PAGE_END);
		
		//创建并加入右侧面板
		JPanel panel_east=CreatePanel.CreateEastPanel();
		jf.add(panel_east,BorderLayout.LINE_END);
	}
}
