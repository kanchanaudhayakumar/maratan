package marathon;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Movie {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); 
		//ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.pvrcinemas.com/");
		  driver.manage().window().maximize();

		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		  driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		  driver.findElement(By.xpath("//li[@class='sidebar-list-item']//a[contains(text(),'Movie Library')]")).click();

		  Thread.sleep(5000);
		  WebElement cityDropdown = driver.findElement(By.name("city"));
		  Select city = new Select(cityDropdown);
		  city.selectByValue("Chennai");

		  WebElement genreDropdown = driver.findElement(By.name("genre"));
		  Select genre = new Select(genreDropdown);
		  genre.selectByVisibleText("ANIMATION");

		  WebElement languageDropdown = driver.findElement(By.name("lang"));
		  Select language = new Select(languageDropdown);
		  language.selectByVisibleText("ENGLISH");

		  driver.findElement(By.xpath("//div[@class='modal-content']//button[@class='btn btn-submit btn-primary']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']/img")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//div[@class='header-info-fixed']//button[contains(text(),'Proceed To Book')]")).click();
		  Thread.sleep(5000);

		  WebElement cinemaNameDropdown = driver.findElement(By.xpath("//select[@name='cinemaName']"));
		  Select cinemaName = new Select(cinemaNameDropdown);
		  cinemaName.selectByIndex(2);

		  driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		  driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();

		  WebElement timingsDropdown = driver.findElement(By.xpath("//select[@name='timings']"));
		  Select timings = new Select(timingsDropdown);
		  timings.selectByValue("09:00 AM - 12:00 PM");

		  driver.findElement(By.name("noOfTickets")).sendKeys("2");
		  driver.findElement(By.name("name")).sendKeys("kavianay");
		  driver.findElement(By.name("email")).sendKeys("kavianya@gmail.com");
		  driver.findElement(By.name("mobile")).sendKeys("9789481345");

		  WebElement foodDropdown = driver.findElement(By.xpath("//select[@name='food']"));
		  Select food = new Select(foodDropdown);
		  food.selectByValue("Yes");

		  driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No Thanks!!!");
		  driver.findElement(By.xpath("//div[@class='form-group col-sm-6']")).click();

		  driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();

		  driver.findElement(By.xpath("(//button[contains(text(),'CANCEL')])[2]")).click();
		  driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();

		  String title = driver.getTitle();
		  System.out.println("Title of the page : " + title);
		 }

		

}
