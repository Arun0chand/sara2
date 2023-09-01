package Assertions;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Testng_Priority {


@Test(priority=1 , description = "first execution", invocationCount = 5)

public void cloginTest() {

System.out.println("Login successful");

}

@Test(priority = -1,description = "second execution")

public void bregisterTest() {

System.out.println("Register successful");

}

@Test(priority = -1,description = "third execution",enabled = false)

public void alogoutTest() {

System.out.println("Logout successful");

}

}
