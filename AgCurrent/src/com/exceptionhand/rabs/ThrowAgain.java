package com.exceptionhand.rabs;

public class ThrowAgain {
	/*Sometimes we may need to rethrow an exception in Java.
	If a catch block cannot handle the particular exception it has caught, 
	we can rethrow the exception. The rethrow expression causes the originally thrown object to be rethrown.*/

	/*Because the exception has already been caught at the scope in 
	 which the rethrow expression occurs, it is rethrown out to the next enclosing try block. 
	 Therefore, it cannot be handled by catch blocks at the scope in which the rethrow expression occurred. 
	Any catch blocks for the enclosing try block have an opportunity to catch the exception.*/
	
	
	public static void test2() throws Throwable
	{
		try {
			test1();
		}
		catch(Exception e)
		{
			System.out.println("Inside test2() method");// It prints this and again we are rethrowing the exception
			throw e;                                     // again we are rethrowing the same exception ,so it will would got the next enclosing try catch block
		}
	}
	public static void test1() throws Exception
	{
		System.out.println("The Exception in test1() method");
	    throw new Exception("thrown from test1() method");   /* it navigate back from where it was called and searches f
	                                                           or catch block in stack trace*/
	                                                           /*Reverse Stack trace   is test1()->test2 (exception is rethowin here)> hence it flow back to calling method i.e main)*/
	}
	public static void main(String[] args) throws Throwable
	{
		try {
			test2();
			
		}
		catch(Exception e)
		{
			System.out.println("Caught in main");
		}
	}
	
}
