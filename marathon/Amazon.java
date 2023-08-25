package marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args)
	{
	ChromeDriver driver =new ChromeDriver();
	
	
	driver.get("https://www.amazon.in/ ");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String title = driver.getTitle();
	System.out.println(title);

	driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']")).click();
	driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']")).sendKeys("bags for boys");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
	System.out.println(text);
	driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[1]")).click();
	//driver.findElement(By.xpath("//span[text()='Skybags']")).click();
	
	//driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[2]")).click();
	//driver.findElement(By.xpath("//span[text()=American Tourister]")).click();
	
	 driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	 driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	 
	 WebElement findElement1 = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	System.out.println(findElement1.getText());
	
	 WebElement findElement2 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])//parent::span"));
	System.out.println(findElement2.getText());
		
		
	

	
	

}
}
