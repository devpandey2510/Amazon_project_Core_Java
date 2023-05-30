package com.amazonprofile.amazonview;

import java.util.Scanner;

public class AmazonView
{
	static Scanner sc = new Scanner(System.in);
    public static void main( String[] args ) throws Exception
    {
    	String s ="y";
    	
    	while(s.equals("y")) {
        System.out.println( "*******Menu*******");
        System.out.println("1.Create your profile");
        System.out.println("2.View your profile");
        System.out.println("3.Edit your proflie");
        System.out.println("4.Delete your profile");
        System.out.println("5.Search your proflie");
        System.out.println("6.View all profile");
        System.out.println("7.login to your profile");
        System.out.println("Enter your choice");
        int c = sc.nextInt();
        
//        amazoncontrollerinterface ac = new amazoncontroller();//this is low coupling
        amazoncontrollerinterface ac = ControllerFactory.createObject();
        
        switch(c) {
        case 1: 
        	ac.createprofile();
            break;
        case 2:
        	ac.viewprofile();
        	break;
        case 3:
        	ac.editprofile();
        	break;
        case 4:
        	ac.deleteprofile();
        	break;
        case 5:
        	ac.searchprofile();
        	break;
        case 6:
        	ac.viewallprofile();
        	break;
        case 7:
        	ac.loginprofile();
        	break;
        	default:
        		System.out.println("Wrong choice");
        }
        System.out.println("Do you want to continue:(y/n)");
    	s=sc.next();
    }
    	
    }
}
