package testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestContactUs extends BaseTest{
	@Test
	public void contactUsTest() 
	{
		var contactuspage=homepage.clickContactUsLink();
		contactuspage.setFirstname("Peter");
		contactuspage.setLastName("adebayo");
		contactuspage.setEmail("piro@yaho.com");
		contactuspage.setMobileNumber("4");
		assertEquals(contactuspage.getEmirateSize(), 4);
		contactuspage.selectYourEmirate("Aj");
		assertEquals(contactuspage.getSelectedEmirate(), "Ajman");
		assertFalse(contactuspage.getCategoryfieldStatus());
		assertEquals(contactuspage.getContactReasonSize(), 2);
		contactuspage.selectContactReason("In");
		assertEquals(contactuspage.getSelectedReason(), "Inquiry");
		assertEquals(contactuspage.getCategorySize(), 5);
		assertEquals(contactuspage.getMobileNumberErrorMessage(), "Accept only numbers");
		
	
		
		
	}
}
