package Testng.Testng;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Keywordsintestng {
	
	@Test(priority=1,invocationCount=1)
	
	public void Groundfloor ()
	{
		System.out.println("ground floor ");
	}
	
@Test(priority=2,timeOut=5000)
	
	public void Firstfloor ()
	{
		System.out.println("First floor ");
	
	}
	
@Test(priority=3)

public void secondfloor ()
{
	System.out.println("secondfloor ");
	Assert.fail();
}

	
}
