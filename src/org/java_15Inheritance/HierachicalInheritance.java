package org.java_15Inheritance;

class Pract{
	public void test1() {
		System.out.println("Parent");
	}
}
public class HierachicalInheritance extends Pract {
	public void test2() {
		System.out.println("Parent");
	}
}
class Pract2 extends Pract{
	public void test() {
		System.out.println("Parent");
		Pract2 obj =new Pract2();
		obj.test1();
		//obj.test2();//can not call the data of brother class
	}
	public static void main(String[]args) {
		Pract2 pr2 = new Pract2();
		pr2.test();	
//		//HierachicalInheritance hi=new HierachicalInheritance();
//		hi.test2();
//		pr2.test1();
//		hi.test1();
		
	}


}
