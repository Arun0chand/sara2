package Assertions;


import org.testng.annotations.Test;

public class CallMethods extends ReturnType 
{
	@Test
	public void PrintMethod()
	{
	
		System.out.println(getcurrentURL());
		System.out.println(getTitle());
		boolean pagesour = driver.getPageSource().contains("anil");
		System.out.println(pagesour);
	}
	
}
