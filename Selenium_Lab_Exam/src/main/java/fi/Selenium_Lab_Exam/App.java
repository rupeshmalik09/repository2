package fi.Selenium_Lab_Exam;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Open a browser of your choice like Mozilla Firefox.
● Navigate to Flipkart site (http://www.flipkart.com)
● Enter Email Id or Phone Number.
● Enter password.
● Click the login button.
● Verify that the user is logged in successfully.
● Please follow screenshots for better understanding
 *
 */
public class App 
{
	 WebDriver driver;
	 public void launchBrowser() {
	 	System.setProperty("chromedriver.exewebdriver.chrome.driver",
	 			"C:\\Users\\RUPESH MALIK\\Desktop\\chromedriver.exe");
	 	//object
	 	driver = new ChromeDriver();
	 }
 public void navigate() throws InterruptedException {
	 	driver.navigate().to("http://www.flipkart.com");
	 	Thread.sleep(5000);
	 	System.out.println("This is the title of the website" + driver.getTitle());
	 	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("rupeshmalik09@gmail.com");
	 	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("************");
	 	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
	 	
	 	driver.close();
	 }
	 	public static void main(String[] args) throws InterruptedException {
	 	App ob = new App();
	 	ob.launchBrowser();
	 	ob.navigate();
	 }
	
    
}
