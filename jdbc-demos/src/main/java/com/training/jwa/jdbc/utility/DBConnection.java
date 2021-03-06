package com.training.jwa.jdbc.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	
	public static Connection getConnection() {
		Connection con = null;
		try {
			FileReader rdr = new FileReader("mydb.properties");
			Properties properties = new Properties();
			properties.load(rdr);
			String driver = properties.getProperty("d");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			Class.forName(driver);
			System.out.println( "Driver Loaded" );
			con = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connected");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
        return con;
	}
}
