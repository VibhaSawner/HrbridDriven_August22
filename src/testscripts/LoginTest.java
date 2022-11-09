package testscripts;


import org.testng.Assert;
import org.testng.annotations.Test;
import base.PredefinedActions;
import pages.LoginPages;

public class LoginTest {

	@Test
	public void TestCase1(){
		System.out.println("Step:- Launch Chrome Browser and hit URl");
		PredefinedActions.start("http://vsawner-trials77.orangehrmlive.com/ ");
		
		System.out.println("Step:- Enter valid login credential");
		LoginPages loginpages=new LoginPages();
		loginpages.login("Admin","pI@JNbgS06 ");
		
		System.out.println("Step:- home page is displayed");
		String expectedTitle="Employee Management";
		String actualTitle=loginpages.getPageTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle,"Expected Title was "+expectedTitle+" Actual Title Was "+actualTitle );
	}
}
