package com.planon.application.databaseoperations.update;

import java.sql.SQLException;

import com.planon.databaseoperations.databaseoperations;

public class Update extends databaseoperations {

	/*
	 * update method updates the specific values that we want to change or replace
	 * or update.This method fetches the data from the database and updates its
	 * value.
	 */
	public void updateOperation(String tablename,String aName, String aDepartment, int aSalary) throws SQLException {

		ps = con.prepareStatement("update " + tablename + " set name=?,department=? where salary=? ");
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