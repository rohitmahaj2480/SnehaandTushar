package org.java_12constructor;

public class ConstThis {
	int a ,b;

	public ConstThis() {//Default Constructor 
		this(20,30);
		System.out.println("Default");
	}
	public ConstThis(int a,int b ) {//para constructor 
	this.a=a;
	this.b=b;
		System.out.println("This Samjala ka baba ");
	}
	public static void main(String[] args) {
		
		ConstThis obj =new ConstThis();
		System.out.println(obj.a);
		System.out.println(obj.b);
		ConstThis obj1 =new ConstThis(70,80);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
	}
}