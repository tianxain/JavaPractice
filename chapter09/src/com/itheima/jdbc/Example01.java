package com.itheima.jdbc;
import java.sql.*;
public class Example01 {
	public static void main(String[] args) throws SQLException  {
		Connection conn =null;
		Statement stmt =null;
		ResultSet rs =null;
		try {
			// 1. �������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			// 2.ͨ��DriverManager��ȡ���ݿ�����
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root";
			conn = DriverManager.getConnection(url,username, password);
			// 3.ͨ��Connection�����ȡStatement����
			stmt = conn.createStatement();
			// 4.ʹ��Statementִ��SQL���
			String sql = "select * from tb_user";
			rs = stmt.executeQuery(sql);
			// 5. ����ResultSet�����
			System.out.println("id	|	name  	|	sex  "
							    + "   |	email		|	birthday ");
			while (rs.next()) {
				int id = rs.getInt("id");    // ͨ��������ȡָ���ֶε�ֵ
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String email = rs.getString("email");
				Date birthday = rs.getDate("birthday");
				System.out.println(id + "	|	" + name + "	|	"
					   	+ sex + "	|	" + email + "	|	" + birthday);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.�ر����ӣ��ͷ���Դ
			if(rs !=null){ rs.close(); }
			if(stmt !=null){ stmt.close(); }
			if(conn !=null){ conn.close(); }
		}
	}
}

