package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

public class jdbcprog {
	public static void main(String[] args) {
		
//		int id=2;
//		String name="Pritamraj";
//		float marks=100;
		
//		student s1=new student();
//		s1.setId(3);
//		s1.setName("Ram");
//		s1.setMarks(56.89);
//		
//		student s2=new student();
//		s2.setId(4);
//		s2.setName("Prajapati");
//		s2.setMarks(42.89);
		
//		student s3=new student();
//		s3.setId(3);
//		s3.setName("sonia");
//		s3.setMarks(83.39);
//		
//		student s4=new student();
//		s4.setId(4);
//		s4.setName("Mehak");
//		s4.setMarks(65.899);
//		
//		student s5=new student();
//		s5.setId(5);
//		s5.setName("Ranjit");
//		s5.setMarks(92.34);
//		
//		student s6=new student();
//		s6.setId(6);
//		s6.setName("Omkar");
//		s6.setMarks(98.78);
//		
//		student s7=new student();
//		s7.setId(7);
//		s7.setName("Reshma");
//		s7.setMarks(88.88);
		
		//List<student>asList=Arrays.asList(s1,s2);
		//List<student>asList=Arrays.asList(s3,s4,s5,s6,s7);
		
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6aug", "root","pass@123");
		Statement st=con.createStatement();
		//System.out.println("Db created");
		//st.execute("create database 6aug");
		//st.execute("use 6aug");
		//st.execute("create table student(id int,name varchar(34),marks float)");
		//st.execute("insert into student values(1,'Ram',45.89)");
		//st.execute("insert into student values('"+id"','"+name+"','"+marks+"')");
		
//		for(student ss:asList)
//		{
//			st.execute("insert into student values('"+ss.getId()+"','"+ss.getName()+"','"+ss.getMarks()+"')");
//			
//		}
//		st.execute("update student set name='Sanika',marks=97 where id=7");
//		
//		st.execute("delete from student where id=7");
		
		ResultSet rs=st.executeQuery("select *from student");
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			Double marks=rs.getDouble("marks");
			System.out.println(id);
			System.out.println(name);
			System.out.println(marks);
			System.out.println("========================");
			
		}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}
