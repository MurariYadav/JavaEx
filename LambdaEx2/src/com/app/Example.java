package com.app;

public class Example {

	   public static void main(String args[]) {
	        // lambda expression with single parameter num
	    	MyFunctionalInterface f = (num) -> num+5;
	        System.out.println(f.incrementByFive(22));
	    }
	}