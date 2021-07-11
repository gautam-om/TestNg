package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNg
{
	@Test
  public void Demo()
  {
	  System.out.println("Hello");
  }
	
	@Test//(priority=1)
	public void Tester()
	{
		//Reporter.log("Tester");
		System.out.println("Tester");
	}
	@Test//(dependsOnMethods= {"Login"},priority=2)
	public void Createsurec()
	{
		//Reporter.log("Created");
		System.out.println("Createsurec");
	}
	@Test//(priority=3)
	public void Logout()
	{
		//Reporter.log("Logout");
		System.out.println("Logout");
	}
}
