package Testingpurpose;
import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.netty.handler.timeout.TimeoutException;
public class Practise 
	 {
	public static void main(String[] oii) throws InterruptedException 
	    	{	
	    		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	    		 ChromeOptions co=new ChromeOptions ();
	    		 co.addArguments("--remote-allow-origins=*");
	    		 WebDriver driver=new ChromeDriver(co);
	            driver.get("http://192.168.1.168");
	            driver.navigate(). refresh();
	            System.out.println(driver.getTitle());
	            // Wait for the webpage to load using WebDriverWait
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	            wait.until(ExpectedConditions.titleContains("webpackSPA"));
	           // driver.get("chrome-extension://hehijbfgiekmjfkfjpbkbammjbdenadd/nhc.htm#url=http://192.168.1.168/");
	    		driver.manage().window().maximize();
	        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        //login page
	    	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[2]/div[2]/div[1]/div/div[1]/input")).sendKeys("admin");
	    	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[2]/div[2]/div[2]/div/div[1]/input")).sendKeys("admin@123");
	    	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[2]/div[2]/div[5]/div/button")).click();
	    	  //weak password page
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/button")).click();
	    	driver.findElement(By.xpath("//*[@id=\"modifyPsw\"]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("admin@123");
	    	driver.findElement(By.xpath("//*[@id=\"modifyPsw\"]/div/div/div[2]/div/div[3]/div/div[1]/input")).sendKeys("admin@123");
	    	//admin password
	    	driver.findElement(By.xpath("//*[@id=\"modifyPsw\"]/div/div/div[3]/div/button")).click();
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div[1]/input")).sendKeys("admin");
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/button")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/button")).click();
	    	driver.findElement(By.xpath("//*[@id=\"id_center_content\"]/div[1]/div/div[2]/div/div[1]")).click();
	    	Thread.sleep(3000);//Main stream waiting time period 
	    	driver.findElement(By.xpath("//*[@id=\"id_center_content\"]/div[1]/div/div[1]/div/button[3]")).click();
	    	Thread.sleep(5000);// Mobile stream waiting time period 
	    	driver.findElement(By.xpath("//*[@id=\"id_center_content\"]/div[1]/div/div[1]/div/button[2]")).click();
	    	Thread.sleep(5000);  // sub stream waiting time period  
	    	driver.findElement(By.xpath("//*[@id=\"id_center_content\"]/div[1]/div/div[1]/div/button[1]")).click();
	    	Thread.sleep(10000);//Zoom in/out for 10 sec.
	    	driver.findElement(By.xpath("//*[@id=\"mainContainer\"]/section/header/div[2]/div/div[1]/div/ul/li[1]/div")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"remoteSetting\"]/section/aside/div/div[7]/div[2]/div/ul/li[4]")).click(); //click the Remote setting
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"remoteSetting\"]/section/aside/div/div[7]/div[2]/div/ul/li[4]")).click();
	    	Thread.sleep(3000);
	    	System.out.println("\n The Software Version is :");
	    	Thread.sleep(5000);
	    	System.out.println(driver.findElement(By.xpath("//*[@id=\"subPage\"]/div[1]/div[1]/div/div/div[6]/div[2]")).getText());
	    	Thread.sleep(3000);
	    	System.out.println("\n The MAC Address is  :");
	    	System.out.println(driver.findElement(By.xpath("//*[@id=\"subPage\"]/div[1]/div[1]/div/div/div[8]/div[2]")).getText());
	    	System.out.println("\n The Serial Number is :");
	    	System.out.println(driver.findElement(By.xpath("//*[@id=\"subPage\"]/div[1]/div[1]/div/div/div[10]/div[2]")).getText());
	    	driver.findElement(By.xpath("//*[@id=\"remoteSetting\"]/section/aside/div/div[7]/div[2]/div/ul/li[3]")).click();
	    	Thread.sleep(2000); 
	    	driver.findElement(By.xpath("//*[@id=\"remoteSetting\"]/section/main/div[7]/div/div[3]/ul/li[2]")).click();
	    	driver.findElement(By.xpath("//*[@id=\"subPage\"]/div[1]/div/div/div/label/span[1]/span")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"subPage\"]/div[2]/div/button[1]")).click();
	    	Thread.sleep(3000);
	    	/*driver.findElement(By.xpath("//*[@id=\"passwordPrompt\"]/div/div[2]/div/div/div/div[1]/input")).sendKeys("admin@1230");
	    	driver.findElement(By.xpath("//*[@id=\"passwordPrompt\"]/div/div[3]/div/button[1]")).click();
	        Thread.sleep(60000);	
	    	driver.navigate(). refresh() ;
	    	Thread.sleep(3000);*/
	    			 
	    		 }
	    }
	    
