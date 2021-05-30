package info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InfoK {

	public static void main(String[] args) {
		String databaseURL="jdbc:ucanaccess://Detail.accdb";
			
			try {
				
				Connection connection=DriverManager.getConnection(databaseURL);
				Statement statement=connection.createStatement();
				System.out.println("Connection created");
				statement.execute("create table Details1(Name varchar,Email varchar,Phone varchar)");
				System.out.println("Table created");
				statement.executeUpdate("insert into Details values 'sinchana','sinchanaknagaraj@gmail.com','9731008301'");
				System.out.println("Inserted");
				ResultSet resultset=statement.executeQuery("select * from Details");
				System.out.println("The details are:");
				while(resultset.next())
				{
					String name=resultset.getString("Name");
					String email=resultset.getString("Email");
					String phone=resultset.getString("Phone");
					System.out.println(name+","+email+","+phone);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	

}
