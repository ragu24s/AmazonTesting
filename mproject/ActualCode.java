package com.mproject;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ActualCode {
	public static WebDriver driver;//int a;
	
	public static  WebDriver browser_Launch() {  //int sum()
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\S RAGUPATHI\\\\OneDrive\\\\Desktop\\\\chrome-driver\\\\chromedriver.exe");
		 driver =new ChromeDriver();// a=10;
		 return driver;             //return a
	}
	public static void url(String url) {
		driver.get(url);	
		driver.manage().window().maximize();
	} 
	public String getTitle() {
     String a = driver.getTitle();
     System.out.println(a);
	return a;
	}
	public static String sysout(String a) {
		System.out.println(a);
        return a;
	}
	public static String getCurrenturl() {
		 String a = driver.getCurrentUrl();
	     System.out.println(a);
	     return a;
	} 
	public static void navigate_To(String url1) {
		driver.navigate().to(url1);
	}
	public static void navigate_Back() {
		driver.navigate().back();
	}
	public static void navigate_Forward() {
		driver.navigate().forward();
	}
	public static void navigate_Refresh() {
		driver.navigate().refresh();
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	} 
	public static void sendKeys(WebElement element , String send) {
		element.sendKeys(send);
		}
	
	public static void click(WebElement element) {
		element.click();
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void getAttribute(WebElement element , String send ) {
		String a = element.getAttribute(send);
		System.out.println(a);
	}
	public static void getText(WebElement element ) {
		String a = element.getText();
		System.out.println(a);
	}
	public static void actionsClick(WebElement element ) {
		Actions a=new Actions(driver); 
		a.click(element);
	}
    public static void actionsContextClick(WebElement element) {
    	Actions a=new Actions(driver);
        a.contextClick(element);
	}
    public static void actionsDoubleClick(WebElement element) {
    	Actions a=new Actions(driver);
        a.doubleClick(element);
	}
    public static void actionsMoveToElement(WebElement element) {
    	Actions a=new Actions(driver);
        a.moveToElement(element);
	}
    public static void actionsDragAndDrop(WebElement element , WebElement element1 ) {
    	Actions a=new Actions(driver);
        a.dragAndDrop(element, element1);
	}
    public static void isMultiple(WebElement element) {
    	Select s=new Select(element);
    	boolean a = s.isMultiple();
        System.out.println(a);
	}
    public static void select(WebElement element,String select) {
    	Select s=new Select(element);
            s.selectByVisibleText(select);   	
    }
    public static void selectv(WebElement element, String select) {
    	Select s=new Select(element);
        s.selectByValue(select);
}
    public static void getOptions(WebElement element) {
    	Select s=new Select(element);
    	List<WebElement> a = s.getOptions();
        for (WebElement ele: a) {
			System.out.println(ele.getText());
		}
	}
    public static void getAllSelectedOption(WebElement element) {
    	Select s=new Select(element);
              List<WebElement> a = s.getAllSelectedOptions();
              System.out.println(a);
	}
    public static void getFirstSelectedOption(WebElement element) {
    	Select s=new Select(element);
              WebElement a = s.getFirstSelectedOption();
              System.out.println(a);
	}
    public static void deselectAll(WebElement element) {
    	Select s=new Select(element);
    	s.deselectAll();
	}
    public static void isDisplayed(WebElement element) {
		boolean a = element.isDisplayed();
		System.out.println("DISPLAYED: "+a);
	}
    public static void isEnabled(WebElement element) {
		boolean a = element.isEnabled();
		System.out.println("Enabled: "+a);
	}
    public static void isSelect(WebElement element) {
    	for (int i = 0; i < 4; i++) {
			element.click();
			System.out.println(element.isSelected());
		}
	}
    public static void isSelected(WebElement element) {
		boolean a = element.isSelected();
		System.out.println("Selected: "+a);
	}
    public static void radioButton(WebElement radio1) {
    	radio1.click();			
        System.out.println("Radio Button Option 1 Selected");	
	}
    public static void checkBox(WebElement option1)  {
    	option1.click();
    	if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }	
	}
    public static void robotKeyPress( int key) throws AWTException {
    	Robot r=new Robot();
        r.keyPress(key);
	}
    public static void robotKeyRelease( int key ) throws AWTException {
    	Robot r=new Robot();
        r.keyRelease(key);
	}
    public static void alertAccept() {
		driver.switchTo().alert().accept();
	}
    public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}
    public static void alertSendkeys(String a) {
		driver.switchTo().alert().sendKeys(a);
	}
    public static void takeScreenshot(String path,WebDriver driver ) throws IOException {
    
    	TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination =new File(path);
	    FileHandler.copy(source, destination);
	}
    public static void executeScript(String arg1, Object object) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript(arg1,object);
    	Object a = js.executeScript(arg1,object);
		String a1=(String)a;
 		System.out.println(a1);
	} 
    public static void singleFrame(WebElement element, WebElement name) {
	    driver.switchTo().frame(element);
	}
    public static void outerFrame(WebElement element,String element1) {
    	 driver.switchTo().frame(element);
    	 driver.switchTo().frame(element1);	
	}
    public static void dropDown(WebElement element1,String method, String value) {
   	 Select s=new Select(element1);
   	 if (method.equals("value")) {
   		s.selectByValue(value);
	} else if (method.equals("index")) {
		int i=Integer.parseInt(value);
   		s.selectByIndex(i);
	}else if (method.equals("text")) {
   		s.selectByVisibleText(value);
	}}
	
    public static void singleDropDown(WebElement element,String text) {
    	 Select s=new Select(element);
         s.selectByVisibleText(text);
	}
    public static void multiDropDown(WebElement element,String text,String text1) {
   	 Select s=new Select(element);
        s.deselectByVisibleText(text);
        s.selectByVisibleText(text1);
	}
    public static void windowHandle(WebDriver driver1) {
    	String parent= driver.getWindowHandle();
	}
    public static void windowHandles(WebDriver driver1) {
    	String parent= driver.getWindowHandle();
    	Set<String> w = driver.getWindowHandles();	
    for (String child : w) {
    
	     String title = driver.getTitle();
    	driver.switchTo().window(child);
    	}
    	
    
    }
    public static void implicitWait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
    public static void explicitWait(int a) {
    	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(a));
	}
    
    public static String dataRead(String file,int sheet,int row,int cell) throws IOException {
    
    File f= new File(file);
	
	FileInputStream fis=new FileInputStream(f);
	
	Workbook wb=new XSSFWorkbook(fis);
	
	Sheet s = wb.getSheetAt(sheet);
	
	Row r = s.getRow(row);
	
	Cell c = r.getCell(cell);
	 
	 
    CellType celltype = c.getCellType();
  
    if (celltype.equals("NUMMERIC")) {
		double d = c.getNumericCellValue();
		int num=(int) d; 
		String num1=String.valueOf(num);
		return num1;
	}
  else {
	  String strcelltype = c.getStringCellValue();
		return strcelltype;
} 
    }
}
	

