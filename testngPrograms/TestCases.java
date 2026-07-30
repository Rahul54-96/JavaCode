package testngPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases 
{
	@Test
	public void login()
	{
		Assert.assertEquals(false, true);
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	}
	
	
}
