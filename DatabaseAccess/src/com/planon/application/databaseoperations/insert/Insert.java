package com.planon.application.databaseoperations.insert;

import java.sql.SQLException;

import com.planon.databaseoperations.databaseoperations;

public class Insert extends databaseoperations {

	/*
	 * This method accepts name, department and salary parameters. and inserts
	 * values into the database.
	 */
	public void insertOperation(String tablename, String aName, String aDepartment, int aSalary) throws SQLException {


		ps = con.prepareStatement("insert into " + tablename + " values(?,?,?)");
		ps.setString(1, aName);// 1 specifies the first parameter in the query
		ps.setString(2, aDepartment);
		ps.setInt(3, aSalary);
		ps.executeUpdate();
		ps.close();

	}

	@Override
	public void close() throws SQLException {
		con.close();
	}
}
