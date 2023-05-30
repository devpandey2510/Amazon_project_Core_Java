package com.amazonprofile.amazonview;

public class ServiceFactory {

	private ServiceFactory() {}//private constructor so that other class can not make object of this class
	

	public static  AmazonServiceInterface createobject() {
		return new AmazonService();
	}
}
