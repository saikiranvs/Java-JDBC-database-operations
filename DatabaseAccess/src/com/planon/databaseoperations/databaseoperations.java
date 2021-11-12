package com.planon.databaseoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class databaseoperations {
	protected Connection con;
	protected PreparedStatement ps;
	protected ResultSet rs;

	public databaseoperations() {
		try {
			String userName = "l";
			String password = "l";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://PC09362;instanceName=SQLEXPRESS";
			con = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public abstract void close() throws SQLException;

}
