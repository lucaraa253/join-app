package com.training.jwa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertDemo {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
        System.out.println( "Driver Loaded" );
//        Java.sql package
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "root");
        System.out.println("Connected");
        
        
	}
}
