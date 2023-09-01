package torr;

public class Nonstatic {
	
	
	public  void display() {
		System.out.println("Usage of the non static method");
		 int a=10;
		System.out.println("Number is: "+a);
	}
	
	public static void main(String args[]) {
		Nonstatic ns=new Nonstatic();
		ns.display();
	}

}
