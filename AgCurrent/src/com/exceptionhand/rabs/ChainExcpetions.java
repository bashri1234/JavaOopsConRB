package com.exceptionhand.rabs;

public class ChainExcpetions {

	//Chaining an exception is a concept of knowing the root cause of original exception
	public static void main(String[] args) throws Exception
	{
		try {
			testM1();
		}
		catch(Throwable e)
		{
			System.out.println("Cause:"+e.getCause());
		}
	}
	public static void testM1() throws Exception
	{
		ArrayIndexOutOfBoundsException ar = new ArrayIndexOutOfBoundsException(); //This is the root cause for below exception
		Exception e1 = new Exception();
		e1.initCause(ar);
		throw e1;
		
	}
}
