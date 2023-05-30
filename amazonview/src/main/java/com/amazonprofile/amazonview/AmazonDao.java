package com.amazonprofile.amazonview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AmazonDao implements AmazonDaoInterface {

	public int creatprofileDao(AmazonUser au) {
		int i=0;
		//jdbc
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Dev","Dev");
//		PreparedStatement ps=con.prepareStatement("insert into amazonuser values(?,?,?,?)");
//		ps.setString(1, au.getName());
//		ps.setString(2,au.getPassword());
//		ps.setString(3, au.getEmail());
//		ps.setLong(4, au.getNumber());
//		
//		int i = ps.executeUpdate();
		// using Hibernate
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss =sf.openSession();
		EntityTransaction et = ss.getTransaction();
		et.begin();
		
		ss.save(au);
		et.commit();
		i=1;
		
		return i;
	}

	public AmazonUser viewprofileDao(AmazonUser au)throws Exception {
		
		AmazonUser au1 = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Dev","Dev");
		PreparedStatement ps=con.prepareStatement("select * from amazonuser where email = ?");
		ps.setString(1, au.getEmail());
		ResultSet res = ps.executeQuery();
		
		if(res.next()) {
			au1 = new AmazonUser();
			String n = res.getNString(1);
			String p = res.getString(2);
			String e = res.getString(3);
			long pn = res.getLong(4);
			
			au1.setName(n);
			au1.setPassword(p);
			au1.setEmail(e);
			au1.setNumber(pn);
		}
		
		return au1;
	}

	public int editprofileDao(AmazonUser au)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Dev","Dev");
		PreparedStatement ps=con.prepareStatement("update amazonuser set name= ?,password=?,phnnumber=? where email=?");
		ps.setString(1, au.getName());
		ps.setString(2,au.getPassword());
		ps.setString(4, au.getEmail());
		ps.setLong(3, au.getNumber());
		
		int i = ps.executeUpdate();
		
		return i;
	}

	public int deleteprofileDao(AmazonUser au)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Dev","Dev");
		PreparedStatement ps=con.prepareStatement("delete from amazonuser where email = ?");
		ps.setString(1, au.getEmail());
        int i = ps.executeUpdate();
		
		return i;
	}

	public ArrayList<AmazonUser> viewallprofileDao()throws Exception {
		ArrayList<AmazonUser> al = new ArrayList<AmazonUser>();
		AmazonUser au1 = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Dev","Dev");
		PreparedStatement ps=con.prepareStatement("select * from amazonuser");
		
		ResultSet res = ps.executeQuery();
		
		while(res.next()) {
			au1 = new AmazonUser();
			String n = res.getNString(1);
			String p = res.getString(2);
			String e = res.getString(3);
			long pn = res.getLong(4);
			
			au1.setName(n);
			au1.setPassword(p);
			au1.setEmail(e);
			au1.setNumber(pn);
			
			al.add(au1);
		}
		
		return al;
	}

	public ArrayList<AmazonUser> searchprofileDao(AmazonUser au)throws Exception {
		ArrayList<AmazonUser> al = new ArrayList<AmazonUser>();
		AmazonUser au1 = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Dev","Dev");
		PreparedStatement ps=con.prepareStatement("select * from amazonuser where email=?");
		ps.setString(1, au.getEmail());
		ResultSet res = ps.executeQuery();
		
		while(res.next()) {
			au1 = new AmazonUser();
			String n = res.getNString(1);
			String p = res.getString(2);
			String e = res.getString(3);
			long pn = res.getLong(4);
			
			au1.setName(n);
			au1.setPassword(p);
			au1.setEmail(e);
			au1.setNumber(pn);
			
			al.add(au1);
		}
		
		return al;
	}

	public AmazonUser loginprofileDao(AmazonUser au)throws Exception {
		AmazonUser au1=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Dev","Dev");
		PreparedStatement ps=con.prepareStatement("select * from amazonuser where  password=? and email=?" );
		ps.setString(1, au.getPassword());
		ps.setString(2, au.getEmail());
		
		ResultSet res=ps.executeQuery();
		
		if(res.next()) {
			au1 = new AmazonUser();
			String n = res.getNString(1);
			String p = res.getString(2);
			String e = res.getString(3);
			long pn = res.getLong(4);
			
			au1.setName(n);
			au1.setPassword(p);
			au1.setEmail(e);
			au1.setNumber(pn);
		}
		
		return au1;	
		}

}
