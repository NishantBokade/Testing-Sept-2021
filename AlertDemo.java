import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		WebElement AlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		AlertButton.click();
		driver.switchTo().alert().accept();
		
		
	
		WebElement TimeAlert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		TimeAlert.click();
		
		WebDriverWait Wait =new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.alertIsPresent()).accept();
		
	

		WebElement ConfirmButton =driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ConfirmButton.click();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		driver.switchTo().alert().dismiss();
		
		
		 
		WebElement Promptalert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		Promptalert.click();
		driver.switchTo().alert().sendKeys("Nishant B");
		driver.switchTo().alert().accept();
		//driver.close();
		

	}

}
