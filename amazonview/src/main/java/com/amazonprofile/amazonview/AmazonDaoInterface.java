package com.amazonprofile.amazonview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public interface AmazonDaoInterface {
public int creatprofileDao(AmazonUser au)throws Exception;
public AmazonUser viewprofileDao(AmazonUser au)throws Exception;

	public int editprofileDao(AmazonUser au)throws Exception ;

	public int deleteprofileDao(AmazonUser au)throws Exception;
	public ArrayList<AmazonUser> viewallprofileDao()throws Exception;

	public ArrayList<AmazonUser> searchprofileDao(AmazonUser au)throws Exception;

	public AmazonUser loginprofileDao(AmazonUser au)throws Exception ;
}