package com.Amazon;

import org.openqa.selenium.WebDriver;

public class Pomofpom {
 
	 public WebDriver driver;
	 
	 private OrderProducts O;
	 
		
		public Pomofpom( WebDriver driver1) {
			this.driver=driver1;
		}
		
	 public OrderProducts getO() {
		O=new OrderProducts(driver);
		 return O;
	}

	
}
