package com.amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Amazon.Pomofpom;
import com.mproject.ActualCode;

public class AmazonOrder extends ActualCode{

	 public static WebDriver driver=browser_Launch();
	 
	 public static Pomofpom p=new Pomofpom(driver);
	 
	
	 @BeforeSuite
		private void launch() {
			implicitWait(10);
			url("https://www.amazon.in/");
			sysout(driver.getTitle());
			Reporter.log("The browser is opened");
		}
	 
	 @Test(priority = -1,invocationCount = 2,invocationTimeOut = 1000)
		private void titleCheck() {
			String s="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			String title = getTitle();
			Assert.assertEquals(title,s,"title not eqauls assert failed");
			System.out.println("Assert passed");
		}
	 @Test(priority = 0,invocationCount = 2,invocationTimeOut = 1000)
		private void urlCheck() {
		String s1="https://www.amazon.in/";
		String url = getCurrenturl();
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(url, s1, "Not eqauls");
		System.out.println("Title checkeds");
		sf.assertAll();
		}
	 @Test(priority = 1,invocationCount = 2,invocationTimeOut = 1000)
	     
	   private void click() {
		click(p.getO().getSearch());
		} 
	 @Test(priority = 2,invocationCount = 2,invocationTimeOut = 1000)
	 private void serach() {
			sendKeys(p.getO().getSearch(),"Iphone 14 pro ");
		}
	 @Test(priority = 3)
	     private void Clicksearch() {
			click(p.getO().getClicksearch());
		}
	 @Test(priority = 4)
     private void Switchwindow() {
		
			windowHandle(driver);
		}
	 
	 @Test(priority =5 )
     private void Clickphone() {
			click(p.getO().getClickPhone());
		}
	 @Test(priority = 6)
	 private void Switchwindow1() {
			windowHandles(driver);
			
		}

	 @Test(priority = 7)
	     private void Clickcolour() {
		// executeScript("window,scroll(0,300)",p);
	    	 click(p.getO().getClickColour());
			}
	 
	 @Test(priority = 8)
     private void Clickram() {
	// executeScript("window,scroll(0,300)",p);
    	 click(p.getO().getClickram());
		}
	 @Test(priority = 9)
	     private void Clickaddtocartphone() {
		
		 actionsContextClick(p.getO().getClickaddtocart1());	
	 }
		 
	 @Test(priority = 10)
     private void Clickcart() {
	
	 actionsClick(p.getO().getClickcart());	
 }
	 @Test(priority = 11)
     private void Clickcomputer() {
	
	 select(p.getO().getSelectcomputer(),"Computers & Accessories");	
 }
	 
	 @Test(priority = 12)
	 private void Clear() {
		 clear(p.getO().getSearch());
			
		}
	 @Test(priority = 13)
	 private void click1() {
		 click(p.getO().getClick1());
				}
	 @Test(priority = 14)
     private void Clicksearch1() {
		click(p.getO().getClicksearch());
	}
	 
	 @Test(priority = 15)
     private void Clicklatop() {
		click(p.getO().getClicklatops());
	}
	 @Test(priority = 16)
     private void ClicklatopApple() {
		click(p.getO().getClickApllelap());
	}
	 @Test(priority = 17)
     private void Clicklatopmodle() {
		click(p.getO().getClickApllemodel());
	}
	 @Test(priority = 18)
	 private void Switchwindow2() {
			windowHandles(driver);
			}
	 @Test(priority = 19)
     private void Clicklatopaddtocart() {
		click(p.getO().getClickAddtocart());
	}

	 
	 
	 @Test(priority = 21,invocationCount = 2,invocationTimeOut = 1000)
     private void clickxmark() {
	 
	click(p.getO().getClickXmark());
	 } 
	 @Test(priority = 22,invocationCount = 2,invocationTimeOut = 1000)
     private void clicksearch3() {
	 
	click(p.getO().getClicksearch());
	 }
	 
	@Test(priority = 23)
	 private void serach3() {
			sendKeys(p.getO().getSearch(),"Smart tv ");
			click(p.getO().getClicksearch());
		}
	 
	@Test(priority = 24)
     private void clicktv() {
	 
	click(p.getO().getClickTvandAcess());
	windowHandles(driver);
	 }
	 @Test(priority = 25,invocationCount = 2,invocationTimeOut = 1000)
     private void clicktvmodel() {
	 
	click(p.getO().getClickTvmodel());
	 }
	 	 @Test(priority = 26)
     private void Clicktocart() {
		click(p.getO().getClickaddtocart1());
	}    
	 	@AfterMethod 
	 	@Test(priority = 27)
    private void Takescreenshot() throws IOException {
	 takeScreenshot("C:\\Users\\S RAGUPATHI\\eclipseNew-workspace\\Mavenproject\\snaps\\amazon.png", driver);
}
	 	 @AfterTest
	 @Test(priority = 28)
     private void clickbuy() {
	 
	click(p.getO().getClickBuy());
	 }  		

	 @AfterSuite
		private void close1() {
			driver.close();
	    System.out.println("quit the browser");
		}
	 
	 
	 
	 
}
