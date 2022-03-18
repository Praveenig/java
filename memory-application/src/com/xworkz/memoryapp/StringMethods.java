package com.xworkz.memoryapp;

public class StringMethods {

	public static void main(String a[]) {
		
		String name="Praveen";
		String name1="Ganiger";
		System.out.println("Charecter at1 given position=" +name.charAt(10));
		System.out.println("Uniqu code of given string to another="+name.hashCode());
		System.out.println("Comparing the valueof one string to another=" +name.equals(name1));
		System.out.println("Printing the spacifiied index of an array="+name.indexOf("P"));
		System.out.println("Check the string is empty or not=" +name.isEmpty());
		System.out.println("Length of given String ="+name.length());
		System.out.println(name.replace("Praveen", "Pavan"));
		System.out.println("Converting upercase to lowercase="+name.toLowerCase());
		System.out.println("Converting lowercase to uppercase=" +name.toUpperCase());
		
		
		char ch[]=name.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println(name.toString());
		System.out.println(name.valueOf(ch[6]));
	}
}
