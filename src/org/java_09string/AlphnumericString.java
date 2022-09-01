package org.java_09string;

public class AlphnumericString {

	public static void main(String[] args) {
		String str ="Th56er4e i2s a ga55rd8en an7d i4t i3s b46ea8uti5ful";
		int sum=0;
		for(int i =0;i<str.length();i++) {
			//System.out.println(str.charAt(i));
			if(Character.isDigit(str.charAt(i))) {
				
				//String str1 =String.valueOf(str.charAt(i));
				//int a=Integer.parseInt(str1);
				//int a =Integer.parseInt(str.valueOf(str.charAt(i)));
				int ab =str.charAt(i)-'0';
				sum=sum+ab;
				//System.out.println(sum);
			}
		}System.out.println(sum);

	}

}
