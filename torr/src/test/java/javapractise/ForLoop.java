package javapractise;

import org.testng.annotations.Test;

public class ForLoop {
	@Test
	public static void forloop() {
	for(int i=1;i<=5;i++){  
		for(int j=1;j>=i;j++){  
		        System.out.print("* ");  
		}  
		System.out.println();//new line  


	}
	}
}
