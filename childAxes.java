import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//form[@id='userForm']//child::div[1]//input")).sendKeys("Nishant Bokade");
		driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//child::input")).sendKeys("nishantbokade@gmail.com");
		
		driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']//descendant::textarea")).sendKeys("Nagpur");
		

	}

}
