package com.itheima.upload;
import java.io.*;
import java.net.*;
// ������̹߳����࣬���ڴ���ͻ���ͼƬ�ϴ�
class ServerThread implements Runnable {
	private Socket socket;                 
	public ServerThread(Socket socket) { 
		this.socket = socket;
	}
	public void run() {
		// 1������ͻ������󣬽����ϴ��ļ�����
		String ip = socket.getInetAddress().getHostAddress();
		int count = 1;                                                
		try {
			// ����ͼƬ�ϴ�����Ŀ¼
			File parentFile = new File("D:\\upload\\");   
			if (!parentFile.exists()) {                      
				parentFile.mkdir();
			}
			// �ѿͻ��˵�IP��ַ��Ϊ�ϴ��ļ����ļ���
			File file = new File(parentFile, ip + "(" + count + ").jpg");
			while  (file.exists()) {
				file = new File(parentFile, ip + "(" + (count++) + ").jpg");
			}
			// ͨ���ͻ�����������ȡ�ϴ�ͼƬд�뵽ָ��Ŀ¼
			InputStream in = socket.getInputStream();
			FileOutputStream fos = new FileOutputStream(file); 
			byte[] buf = new byte[1024]; 
			int len = 0; 
			while ((len = in.read(buf)) != -1) { 
				fos.write(buf, 0, len);  
			}
			// 2������������ͻ���������Ӧ��������Ϣ
			OutputStream out = socket.getOutputStream();
			out.write("�ϴ��ɹ�".getBytes());  
			// �ر�����Socket����
			in.close();
			fos.close();  
			socket.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// TCP����ͨ�ŷ����
public class UploadTCPServer {
	public static void main(String[] args) throws Exception {
		// ����ָ���˿ں�Ϊ10001�ķ����ServerSocket����
		ServerSocket serverSocket = new ServerSocket(10001);  
		while (true) {  
              // ����accept()�����������տͻ�������
			Socket client = serverSocket.accept();	
			// ���ÿһ���ͻ������󴴽�һ���߳̽������ӹ���
			new Thread(new ServerThread(client)).start();
		}
	}
}

