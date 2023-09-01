package Javaprograms;

import Javaprograms.Method_Overloading.Adder;

public class Method_overloading2 {
	
	public static void main(String[] args) {
		
		System.out.println(Adder.add(1, 2, 3));
		System.out.println(Adder.add(1, 2, 3));
		
	}
	
	
	static class Adder{
		
		static int add(int a,int b,int c) {
			
			return a+b+c;
		}
		
		static double add(int a,double b,int c) {
			return a+b+c;
		}
	}

}
