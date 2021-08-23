package com.exceptionhand.rabs;

import java.util.Scanner;

public class ExceptionHandler_Rabs {

	public void Agecheck() throws  CustomException_1
	{ 
	int age;
	System.out.println("Enter the age");
	Scanner sc = new Scanner(System.in);
	age =sc.nextInt();
	try {
	if(age<= 0)
	{
		throw new  CustomException_1("Age should not be less than zero");
	}
	else
	{
		System.out.println("Your age is" +age+ "and you are eligible for giant wheel drive");
	}
	}
	catch(CustomException_1 cs)
	{
		System.out.println(cs.getMessage());
	}
	System.out.println("Continue execution");
	}
	public static void main(String[] args) throws CustomException_1 {

		ExceptionHandler_Rabs rb = new ExceptionHandler_Rabs();
		rb.Agecheck();
	}
}
