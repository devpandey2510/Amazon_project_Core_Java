package com.amazonprofile.amazonview;

public class ControllerFactory {
      private ControllerFactory() {}// this is a private constructor so that other classes can not make object of this class
      
      public static amazoncontrollerinterface createObject() {
    	  return new amazoncontroller();
      }
}
