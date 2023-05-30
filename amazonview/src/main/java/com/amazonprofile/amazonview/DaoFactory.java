package com.amazonprofile.amazonview;

public class DaoFactory {

	private DaoFactory() {}
	
	public static AmazonDaoInterface createObject() {
		return new AmazonDao();
	}
	
}
