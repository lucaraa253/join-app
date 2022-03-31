package com.training.jwa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.training.jwa.jdbc.utility.DBConnection;

/**
 * Hello world!
 *
 */
public class PApp 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	Connection con = DBConnection.getConnection();
        
        Statement stat = con.createStatement();
        ResultSet res = stat.executeQuery("select * from employees");
        
//        Using meta data to display all information regarding the table
        ResultSetMetaData rsmd = res.getMetaData();
        int columnCount = rsmd.getColumnCount();
        
        
        for(int i=1; i<=columnCount; i++) {
        System.out.print(rsmd.getColumnName(i) + "    ");
        }System.out.println();
        
        while(res.next()){
        	for(int i=1; i<=columnCount; i++) {
                System.out.print(res.getString(i) + "    ");
                
                }
        	System.out.println();
        	
        }
//        while(res.next()) {
//        	res.next();
//            System.out.print(res.getInt(1) + "     ");
//            System.out.print(res.getString(2) + "     ");
//            System.out.print(res.getInt(3) + "     ");
//            System.out.println(res.getInt(4) + "     ");
//        }
       
        
//        Closing the result search, statement and connection
        
        res.close();
        stat.close();
        stat.close();
    }
}
