package com.amazonprofile.amazonview;

import java.util.ArrayList;

public interface AmazonServiceInterface {
	public int creatprofileService(AmazonUser au)throws Exception ;

	public AmazonUser viewprofileService(AmazonUser au)throws Exception ;

	public int editprofileService(AmazonUser au)throws Exception ;

	public int deleteprofileService(AmazonUser au)throws Exception;

	public ArrayList<AmazonUser> viewallprofileSevice()throws Exception ;

	public ArrayList<AmazonUser> searchprofileService(AmazonUser au)throws Exception;
	public AmazonUser loginprofileService(AmazonUser au) throws Exception ;
	}
