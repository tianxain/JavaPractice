package com.itheima.qqLogin;
import java.sql.*;
public class LoginDao {
	PreparedStatement prestmt = null;
	Connection conn = null;
	ResultSet rs = null;
	// ��ѯ�û�
	public Boolean findUser(String qqnumber, String pwd) 
											throws SQLException {
		try {
			// 1.�������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root";
			// 2.��ȡ���ݿ�����
			conn = DriverManager.getConnection(url, username, password);
			// 3.������Ҫִ�е�SQL
			String sql = "select * from tb_qquser " 
						+ "where qqnumber = ? " 
						+ "and password = ?";
			// 4.����PreparedStatement����
			prestmt = conn.prepareStatement(sql);
			prestmt.setString(1, qqnumber);
			prestmt.setString(2, pwd);
			// 5.ִ��SQL������ȡ��������Ϣ�����ResultSet��
			rs = prestmt.executeQuery();
			// �����ѯ�Ľ�������г���һ���ļ�¼�����¼�ɹ�
			if (rs.next()) { return true; }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.�ͷ���Դ
			if (rs != null) { rs.close(); }
			if (prestmt != null) { prestmt.close();	}
			if (conn != null) {	conn.close(); }
		}
		return false;
	}
}
