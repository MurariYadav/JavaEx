package com.app;

public class Employee {

	public static void main(String[] args) {
	

			
			Employee e=new Employee();
		System.out.println("Fully Qualified Class Name : "+e);//get fully qualified class name
		
		System.out.println( "Full Class Name : "+ e.getClass().getName());//get full class name
		System.out.println( "Only Class Name: "+ e.getClass().getSimpleName());//get full class name
		
		System.out.println( "With Class Name : "+ e.getClass());//get full class name
		
		System.out.println("From toString:"+ e.toString());
		//get hashCode
		System.out.println("HashCode : "+ e.hashCode());
		
	
		int h=e.hashCode();
		//convert into HexaDecimal format
		String a=Integer.toHexString(h);
		System.out.println(" From Hex :"+ e);
	

		}

}
