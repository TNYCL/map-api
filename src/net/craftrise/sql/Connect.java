package net.craftrise.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import net.craftrise.data.SQLData;

public class Connect implements SQLData {

	public static Connection connect;
	public static Statement stat;
	
	public static void connectDatabase() {
		try {
			connect = DriverManager.getConnection("jdbc:mysql://"+IP+":"+PORT+"/"+DATABASE,USER,PASS);
			stat = connect.createStatement();
			System.out.println(CONNECTION_SUCCESS);
		} catch(SQLException e) {
			System.out.println(CONNECTION_ERROR);
		}
	}

}
