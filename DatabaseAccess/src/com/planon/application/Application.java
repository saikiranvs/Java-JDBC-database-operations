package com.planon.application;

import java.sql.SQLException;

import com.planon.application.databaseoperations.delete.Delete;
import com.planon.application.databaseoperations.insert.Insert;
import com.planon.application.databaseoperations.read.Read;
import com.planon.application.databaseoperations.update.Update;

/* This application contains SQL operations : insert, delete, update and select 
 * to manipulate the data from the database
 * */
public class Application {

	public static void main(String[] args) throws SQLException {
		Insert insert = new Insert();
		Read read = new Read();
		Update update = new Update();
		Delete delete = new Delete();

		insert.insertOperation("firstTable", "Joey", "sales", 480000);
		insert.insertOperation("secondTable", "Joey", "sales", 480000);
		insert.insertOperation("thirdTable", "Joey", "sales", 480000);
		insert.insertOperation("fourthTable", "Joey", "sales", 480000);

		insert.insertOperation("firstTable", "ross", "operation", 550000);
		insert.insertOperation("secondTable", "ross", "operation", 550000);
		insert.insertOperation("thirdTable", "ross", "operation", 550000);
		insert.insertOperation("fourthTable", "ross", "operation", 550000);
		insert.close();

		update.updateOperation("firstTable", "Joey", "operation", 480000);
		update.updateOperation("secondTable", "Joey", "operation", 480000);
		update.updateOperation("thirdTable", "Joey", "operation", 480000);
		update.updateOperation("fourthTable", "Joey", "operation", 480000);
		update.close();

		delete.deleteOperation("firstTable", "ross");
		delete.deleteOperation("secondTable", "ross");
		delete.deleteOperation("thirdTable", "ross");
		delete.deleteOperation("fourthTable", "ross");
		delete.close();

		read.readOperation("firstTable");
		read.readOperation("secondTable");
		read.readOperation("thirdTable");
		read.readOperation("fourthTable");
		read.close();
	}

}
