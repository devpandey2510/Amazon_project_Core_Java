package com.amazonprofile.amazonview;

import java.util.ArrayList;

public class AmazonService implements AmazonServiceInterface{

	public int creatprofileService(AmazonUser au)throws Exception {
//		AmazonDaoInterface ad = new AmazonDao();
		AmazonDaoInterface ad = DaoFactory.createObject();
		int i = ad.creatprofileDao(au);
		return i;
	}

	public AmazonUser viewprofileService(AmazonUser au)throws Exception {
		//AmazonDaoInterface ad = new AmazonDao();
		AmazonDaoInterface ad = DaoFactory.createObject();
		AmazonUser au1 = ad.viewprofileDao(au);
		return au1;
	}

	public int editprofileService(AmazonUser au)throws Exception {
		//AmazonDaoInterface ad = new AmazonDao();
		AmazonDaoInterface ad = DaoFactory.createObject();
		int i = ad.editprofileDao(au);
		return i;
	}

	public int deleteprofileService(AmazonUser au)throws Exception {
		//AmazonDaoInterface ad = new AmazonDao();
		AmazonDaoInterface ad = DaoFactory.createObject();
		int i = ad.deleteprofileDao(au);
		return i;
	}

	public ArrayList<AmazonUser> viewallprofileSevice()throws Exception {
		//AmazonDaoInterface ad = new AmazonDao();
		AmazonDaoInterface ad = DaoFactory.createObject();
		ArrayList<AmazonUser> al = ad.viewallprofileDao();
		return al;
	}

	public ArrayList<AmazonUser> searchprofileService(AmazonUser au)throws Exception{
	//	AmazonDaoInterface ad = new AmazonDao();
		AmazonDaoInterface ad = DaoFactory.createObject();
		ArrayList<AmazonUser> al = ad.searchprofileDao(au);
		return al;
	}

	public AmazonUser loginprofileService(AmazonUser au) throws Exception {
	//	AmazonDaoInterface ad = new AmazonDao();
		AmazonDaoInterface ad = DaoFactory.createObject();
		AmazonUser au1 = ad.loginprofileDao(au);
		return au1;
	}

}
