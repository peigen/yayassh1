package org.peigen.ssh.commons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * 
 * Copyrights 1997-2008 西安协同时光软件有限公司
 * 
 * Filename:test.java
 * 
 * Description:
 * 
 * Version:V0.1
 * 
 * Author: peigen
 * 
 * History: [ Author Date Version Content ] 
 * 			   peigen 2008-07-29 V0.1 create
 * 
 */
public class test extends HibernateTemplate{
	public static void main(String[] args) {
		test t = new test();
		try {
			t.ss();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ss() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
//		Connection conn = getSQLServerConn();
		Connection conn = getMySQLConn();
		conn.setAutoCommit(false);
		Statement stat = conn.createStatement();
		ChangeRMB cr = new ChangeRMB();
		int y = 0;
		for (int i = 1; i < 100000; i++) {
			
			String sex = "";
			if(i/2==1){
				sex = "男";
			}else{
				sex = "女";
			}
		String sql = "insert into t_user(user_name,user_pwd,user_sex,user_age) " + " values('"
		+cr.convertToChineseNumber(i)+"','" +
				"peigen','" +
				""+sex+"'," +
				y+")";
		System.out.println(sql);
		y++;
		if(y>1000){
			System.out.println("y is :"+ i);
			conn.commit();
			y = 0;
		}
		stat.executeUpdate(sql);
		}
		
	}
	
	public Connection getMySQLConn() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		Class.forName("org.gjt.mm.mysql.Driver").newInstance();
		String url ="jdbc:mysql://localhost/test?user=root&password=peigen&useUnicode=true&characterEncoding=UTF-8";
		//testDB为你的数据库名
		Connection conn= DriverManager.getConnection(url);
		return conn;
	}
	
	public Connection getSQLServerConn() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
		String url ="jdbc:jtds:sqlserver://192.168.1.135:1433/scl_info";
		//testDB为你的数据库名
		Connection conn= DriverManager.getConnection(url,"sa","sa");
		return conn;
	}
}

