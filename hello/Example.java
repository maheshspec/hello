package com.sample;

public class Example{
	
	public static void main(String[] args) throws InterruptedException {
		                                                                                                                              
		String str= String.valueOf(i);
		System.out.println(getStribg(str));
		
	}
	
	// a method to convert into string
	private static String getString(String str) {
		String s = "";
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			int integer = c;
			s+=c;
			System.out.println(integer);
		}
		
		return s;
	}


	static int i = 14520;
}

