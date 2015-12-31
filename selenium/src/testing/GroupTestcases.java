package testing;



import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestcases {
	
	
	@Test(priority=1)
	public void login()
	{
		Assert.assertEquals("a", "a");
		System.out.println("log in");
	}
	
	
	@Test(priority=2,dependsOnMethods="login")
	public void changePassword()
	{
		System.out.println("change password");
	}
	
	@Test(priority=3,dependsOnMethods="login")
	public void logOut()
	{
		System.out.println("log out");
	}

}
