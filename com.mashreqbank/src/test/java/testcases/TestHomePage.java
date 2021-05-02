package testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestHomePage extends BaseTest{
	
	@Test
	public void navigationBarTest()
	{
		assertTrue(homepage.getNavigationBarVisibility());
		assertEquals(homepage.getNavigationBarSize(), 8);
				
	}
	@Test
	public void testMashreqNewsBoxVisibility()
	{
		assertTrue(homepage.mashreqNewBox());
	}
	@Test
	public void testContactUsVisibility()
	{
		assertTrue(homepage.contactUsLink());
	}
}
