import java.awt.*;
import javax.swing.*;


public class QQLogin {

	//ΪQQ��½���������ʼ��һ��Jframe����
	private static JFrame jf=new JFrame();
	//QQ��¼���ڳ�ʼ������
	public static void initLogin()
	{
		jf.setSize(426,300);
		jf.setLocation(497,242);
		jf.setUndecorated(true);
		jf.setResizable(false);
		
		//����QQ��½����Ч�������в��ַ���
		BorderLayout border_layout=new BorderLayout();
		jf.setLayout(border_layout);
		
		//���������붥�����
		JPanel panel_north=CreatePanel.CreateNorthPanel(jf);
		jf.add(panel_north,BorderLayout.PAGE_START);
		
		//�����������в����
		JPanel panel_center=CreatePanel.CreateCenterPanel(jf);
		jf.add(panel_center,BorderLayout.CENTER);
				
		//����������������
		JPanel panel_west=CreatePanel.CreateWestPanel();
		jf.add(panel_west,BorderLayout.LINE_START);
				
		//����������ײ����
		JPanel panel_south=CreatePanel.CreateSouthPanel();
		jf.add(panel_south,BorderLayout.PAGE_END);
		
		//�����������Ҳ����
		JPanel panel_east=CreatePanel.CreateEastPanel();
		jf.add(panel_east,BorderLayout.LINE_END);
	}
}
