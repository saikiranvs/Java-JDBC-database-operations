package com.planon.application.databaseoperations.delete;

import java.sql.SQLException;

import com.planon.databaseoperations.databaseoperations;

public class Delete extends databaseoperations {

	/*
	 * This method accepts the value which is of type primary key from the table so
	 * that using such value this method can delete the complete row.
	 */
	public void deleteOperation(String tablename,String aName) throws SQLException {

		ps = con.prepareStatement("delete from " + tablename + " where name=?");
		ps.setString(1, aName);// 1 specifies the first parameter in the query
		ps.executeUpdate();
		ps.close();

	}

	@Override
	public void close() throws SQLException {
		con.close();
	}
}