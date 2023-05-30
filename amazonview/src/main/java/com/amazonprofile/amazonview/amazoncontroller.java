package com.amazonprofile.amazonview;

import java.util.ArrayList;
import java.util.Scanner;

public class amazoncontroller implements amazoncontrollerinterface{
	
    
	public void createprofile()throws Exception {
		
		 Scanner sc = new Scanner(System.in);
			System.out.println("1.Enter your name");
		    String name = sc.next();
		    System.out.println("2.Enter your password:");
		    String password = sc.next();
		    System.out.println("3.Enter your email:");
		    String email = sc.next();
		    System.out.println("4.Enter your phone number:");
		    long phnnumber = sc.nextLong();
		    
		    AmazonUser au = new AmazonUser();
		    au.setName(name);
		    au.setPassword(password);
		    au.setEmail(email);
		    au.setNumber(phnnumber);
		    
//		    AmazonServiceInterface as = new AmazonService();//low coupling
		    AmazonServiceInterface as = ServiceFactory.createobject();		    
		    int i =as.creatprofileService(au);
		    
		    if(i>0) {
		    	System.out.println("profile created");
		    }
		    else {
		    	System.out.println("profile could not be created");
		    }
		
	}

	public void viewprofile()throws Exception {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your email to view profile");
		String email = sc.next();
		
		AmazonUser au = new AmazonUser();
		au.setEmail(email);
		
		//AmazonServiceInterface as = new AmazonService();
		AmazonServiceInterface as = ServiceFactory.createobject();
		AmazonUser au1 = as.viewprofileService(au);
		
		if(au1!=null) {
			System.out.println("Your Profile :");
			System.out.println("Name:" + au1.getName());
			System.out.println("Password:" + au1.getPassword());
			System.out.println("Email:" + au1.getEmail());
			System.out.println("Phone number:" + au1.getNumber());
		}
		else {
			System.out.println("Profile not found");
			//throw new UserNotFoundException();
		}
		
	}
	
	public void editprofile()throws Exception {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your email to edit profile");
		String email = sc.next();
		
		AmazonUser au = new AmazonUser();
		au.setEmail(email);
		
		//AmazonServiceInterface as = new AmazonService();
		AmazonServiceInterface as = ServiceFactory.createobject();
		AmazonUser au1 = as.viewprofileService(au);
		
		if(au1!=null) {
			System.out.println("As per our old record your profile is:");
			System.out.println("Name:" + au1.getName());
			System.out.println("Password:" + au1.getPassword());
			System.out.println("Email:" + au1.getEmail());
			System.out.println("Phone number:" + au1.getNumber());
			
			System.out.println("1. press 1 to change name:");
			System.out.println("2.press 2 to change password");
			System.out.println("3.press 3 to change phn number");
			
			System.out.println("Enter your choice to edit the field:");
			int c = sc.nextInt();
			
			switch(c) {
			case 1:
				System.out.println("enter new name");
				String newname = sc.next();
				au1.setName(newname);
				break;
			case 2:
				System.out.println("enter new password");
				String newpass = sc.next();
				au1.setPassword(newpass);
				break;
			case 3:
				System.out.println("enter new phone number");
				long newnumber = sc.nextLong();
				au1.setNumber(newnumber);
				break;
				default:
					System.out.println("wrong choice");
			}
			
			//AmazonServiceInterface as1 = new AmazonService();
			AmazonServiceInterface as1 = ServiceFactory.createobject();
			int i = as1.editprofileService(au1);
			
			if(i>0) {
				System.out.println("profile edited");
			}
			else {
				System.out.println("profile could'nt be edited");
			}
		}
		else {
			System.out.println("Profile not found");
		}
		
		
		
	}

	public void deleteprofile()throws Exception {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your email to delete profile");
		String email = sc.next();
		
		AmazonUser au = new AmazonUser();
		au.setEmail(email);
		
//		AmazonServiceInterface as = new AmazonService();
		AmazonServiceInterface as = ServiceFactory.createobject();
		 int i =as.deleteprofileService(au);
		    
		    if(i>0) {
		    	System.out.println("profile deleted");
		    }
		    else {
		    	System.out.println("profile could not be deleted");
		    }
	}

	public void searchprofile()throws Exception {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your email to search profile");
		String email = sc.next();
		
		AmazonUser au = new AmazonUser();
		au.setEmail(email);
		
//		AmazonServiceInterface as = new AmazonService();
		AmazonServiceInterface as = ServiceFactory.createobject();
		ArrayList<AmazonUser> al = as.searchprofileService(au);
		
        System.out.println("Number of records present in databasse with this email are/is:" + al.size());
		
		for(AmazonUser au1 : al) {
			System.out.println("Profiles are.....");
			System.out.println("Name is: " + au1.getName());
			System.out.println("Password is: "+ au1.getPassword());
			System.out.println("email is:" + au1.getEmail());
			System.out.println("phn number is:" + au1.getNumber());
			System.out.print("\n \n");
		}
	}

	public void viewallprofile()throws Exception {
		//AmazonServiceInterface as = new AmazonService();
		AmazonServiceInterface as = ServiceFactory.createobject();
		ArrayList<AmazonUser> al = as.viewallprofileSevice();
		
		System.out.println("Number of records present in databasse are:" + al.size());
		
		for(AmazonUser au : al) {
			System.out.println("Profiles are.....");
			System.out.println("Name is: " + au.getName());
			System.out.println("Password is: "+ au.getPassword());
			System.out.println("email is:" + au.getEmail());
			System.out.println("phn number is:" + au.getNumber());
			System.out.print("\n \n");
		}
		
	}

	public void loginprofile()throws Exception {
		Scanner sc = new Scanner(System.in);
		 System.out.println("1.Enter your password:");
		 String password = sc.next();
		System.out.println("2.Enter your email");
	    String email= sc.next();
	   
	    
	    AmazonUser au = new AmazonUser();
		au.setPassword(password);
		au.setEmail(email);
		
//		AmazonServiceInterface as = new AmazonService();
		AmazonServiceInterface as = ServiceFactory.createobject();
		AmazonUser au1 = as.loginprofileService(au);
	    
		if(au1!=null) {
			System.out.println("Hello Mr/Mrs.  "+au1.getName());
		}
		else {
			System.out.println("wrong credentials try again:");
		}
	}

    
}
