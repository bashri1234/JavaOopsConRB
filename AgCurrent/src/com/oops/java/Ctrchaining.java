package com.oops.java;

public class Ctrchaining {
	public static void main(String[] args) {
		Subcons sub = new Subcons("hello Rabiya"); // In this subconstructor,Im sending different string
		sub.display();
		sub.i = 10;
		System.out.println(sub.i);
	}

}
