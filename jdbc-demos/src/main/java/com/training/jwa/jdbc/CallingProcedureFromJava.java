package com.training.jwa.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.training.jwa.jdbc.utility.DBConnection;

public class CallingProcedureFromJava {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account number to debit the amount");
		int sender = sc.nextInt();
		
		System.out.println("Enter the account number to credit the amount");
		int receiver = sc.nextInt();
		
		System.out.println("Enter the amount to be transfered");
		int amount = sc.nextInt();
		
		Connection con = DBConnection.getConnection();
		CallableStatement stat = con.prepareCall("call transfer(?,?,?)");
		stat.setInt(1, sender);
		stat.setInt(2, receiver);
		stat.setInt(3, amount);
		
		stat.execute();
		
		System.out.println("Transfer completed");
	}

}
