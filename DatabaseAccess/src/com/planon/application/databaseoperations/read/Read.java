package com.planon.application.databaseoperations.read;

import java.sql.SQLException;

import com.planon.databaseoperations.databaseoperations;

public class Read extends databaseoperations {

	/*
	 * This method reads the data from the database. select query selects all the
	 * values and displays it.
	 */
	public void readOperation(String tablename) throws SQLException {

		ps = con.prepareStatement("select * from " + tablename);
		rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("name") + " " + rs.getString("department") + " " + rs.getInt("salary"));
		}
	}

	@Override
	public void close() throws SQLException {
		con.close();
	}
}
