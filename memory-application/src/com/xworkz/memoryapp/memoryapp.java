package com.xworkz.memoryapp;

public class memoryapp {

public static void main(String a[]) {
	memoryapp baba =new memoryapp();
	System.out.println(baba);
	baba=null;
	System.out.println(baba);
	System.gc();
	//Runtime.getRuntime().gc();
	
}
//@Override
//public void finalize() {
	//System.out.println("garbage collected");
	
//}
}
