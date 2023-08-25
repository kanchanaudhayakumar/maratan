package marathon;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.abhibus.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		  
		 driver.findElement(By.id("destination")).sendKeys("Bangalore");
		 driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		  
		//driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");		
		driver.findElement(By.xpath("//input[@id ='datepicker1']")).click();
		driver.findElement(By.xpath("//a[text()='26']/parent::td")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		System.out.println(" First avilablebus"+ driver.findElement(By.xpath("//div[@class='search-column1']/h2")).getText());
		driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();
		  
		  
		  System.out.println("Available Seats: "
		    + driver.findElement(By.xpath("//p[@class='noseats AvailSts ng-binding']")).getText());
		  
		  
		  driver.findElement(By.xpath("//a[@class='btn-seatselect book1']")).click();
		  
		  
		  driver.findElement(By.xpath("//li[contains(@class,'sleeper available')]/a")).click();

		 
		  System.out.println("Selected Seat Details: "
		    + driver.findElement(By.xpath("//p[contains(text(),'Seats Selected ')]/following::span")).getText());
		  
		  // Print Total Fare
		  System.out.println("Total Fare:"
		    + driver.findElement(By.xpath("//p[contains(text(),'Total Fare')]/following::span")).getText());
		  
		  // select boaring point
		  WebElement boardingid = driver.findElement(By.id("boardingpoint_id"));
		  Select board = new Select(boardingid);
		  board.selectByIndex(2);
		  
		  // select drop point
		  WebElement droppingid = driver.findElement(By.id("droppingpoint_id"));
		  Select drop = new Select(droppingid);
		  drop.selectByIndex(2);
		  driver.findElement(By.id("btnEnable1")).click();

		  // Get the Title of the page(use .getTitle())
		  System.out.println("Page Title:" + driver.getTitle());

		
	}

}
