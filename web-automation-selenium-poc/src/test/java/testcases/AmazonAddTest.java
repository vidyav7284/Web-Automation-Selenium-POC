	package testcases;

	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import base.BaseClass;
import pages.AmazonAddPage;
import utils.ScreenShots;



	public class AmazonAddTest extends BaseClass {
	    AmazonAddPage amazonPage;

	    @BeforeMethod
	    public void setUp() {
	    	initialize();
	        amazonPage = new AmazonAddPage(driver);
	    }

	    @Test
	    public void testAddBookToCart() throws InterruptedException {
	    	
	        amazonPage.selectBookCategory("Kindle Store");
	        amazonPage.clickSearchButton();
	        Thread.sleep(1000);
	        amazonPage.applyDiscountFilter();
	        Thread.sleep(1000);
	        amazonPage.filterByKindleUnlimited();
	        Thread.sleep(1000);
	        amazonPage.sortByCustomerReview();
	        Thread.sleep(1000);
	        amazonPage.selectFirstBook();
	        Thread.sleep(2000);
	        amazonPage.switchToNewTab();
	        amazonPage.addToCart();
	        Thread.sleep(2000);
	        String expectedMessage = "Added to eBook cart";
	        String actualMessage = amazonPage.getCartConfirmationMessage();
	        

	        if (expectedMessage.equals(actualMessage)) {
	            System.out.println("Test Passed: " + actualMessage);
	        } else {
	            System.out.println("Test Failed");
	        }
	    }

	    @AfterMethod
	    public void tearDown(ITestResult it) {
	    	if (ITestResult.FAILURE==it.getStatus())
	    	{
	       		ScreenShots.takeScreenshot(driver, it.getName());
	    	}
	    	
	        driver.quit();
	    }
	

}
