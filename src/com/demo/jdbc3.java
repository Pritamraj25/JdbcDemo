package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

public class jdbc3 {
	
	public static void main(String[] args) {
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6aug","root","pass@123");
		Statement st=con.createStatement();
		//st.execute("create table userAmazon(id int,name varchar(34),salary double)");
//		userAmazon u1=new userAmazon();
//		u1.setId(1);
//		u1.setName("Rexa");
//		u1.setSalary(10000.00);
//		
//		userAmazon u2=new userAmazon();
//		u2.setId(2);
//		u2.setName("Nubro");
//		u2.setSalary(56900.00);
//		
//		userAmazon u3=new userAmazon();
//		u3.setId(3);
//		u3.setName("Misha");
//		u3.setSalary(14987.999);
//		
//		List<userAmazon>asList=Arrays.asList(u1,u2,u3);
//		for(userAmazon a1:asList)
//		{
//			st.execute("insert into userAmazon values('"+a1.getId()+"','"+a1.getName()+"','"+a1.getSalary()+"')");
//			
//		}
		ResultSet rs=st.executeQuery("select*from userAmazon");
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			double salary=rs.getDouble("salary");
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
			System.out.println("=====================");
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
	}

}
