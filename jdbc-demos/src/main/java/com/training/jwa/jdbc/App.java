package com.training.jwa.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.training.jwa.jdbc.utility.DBConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException, IOException
    {
    	Connection con = DBConnection.getConnection();
        
        Statement stat = con.createStatement();
        ResultSet res = stat.executeQuery("select * from employees");
        
        Statement stat2 = con.createStatement();
        ResultSet res2 = stat2.executeQuery("select job_id, salary from employees where employee_id in (103,205)");
        
        Statement stat3 = con.createStatement();
        ResultSet res3 = stat3.executeQuery("select * from employees");
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please specify a salary");
//        int emp = sc.nextInt();
        
//        Statement stat3 = con.createStatement();
//        
//        ResultSet res3 = stat3.executeQuery("update employees set salary = " + emp + " where employee_id = 101");
        
//        Takjes the cursor to the next row
        res.next();
        System.out.print(res.getString(1) + "     ");
        System.out.print(res.getString(2) + "     ");
        System.out.print(res.getInt("salary") + "     ");
        
        while(res.next()) {
        res.next();
        System.out.print(res.getString(1) + "     ");
        System.out.print(res.getString(2) + "     ");
        System.out.print(res.getInt("salary") + "     ");
        System.out.println(res.getString("email"));
        }
        System.out.println("NEXT");
        res2.next();
        System.out.print(res2.getString(1)+ "    ");
        System.out.println(res2.getInt(2));
        
//        res3.next();
        
//        Closing the result search, statement and connection
        
        res.close();
        stat.close();
        stat.close();
    }
}
