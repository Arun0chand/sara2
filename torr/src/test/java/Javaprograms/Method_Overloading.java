package Javaprograms;

public class Method_Overloading {
	
	public static void main(String[] args) {
		
		System.out.println(Adder.add(10,30));
		System.out.println(Adder.add(10,200.0,30));
	}
	
	static class Adder{
		
		static int add(int a, int b) {
			return a+b;
			 
		}
		static double add(int a, double d,int c) {
			return a+d+c;
		}
	}

}
