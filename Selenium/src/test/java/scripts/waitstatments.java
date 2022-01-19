package scripts;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waitstatments {
	@Test
	public void testingimplicity() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shyam.sunda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1= new ChromeDriver();
		d1.get("http://www.leafground.com/");
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d1.findElement(By.linkText("Edit")).click();
		d1.findElement(By.id("email")).sendKeys("Shyam");
		d1.findElement(By.cssSelector("input[value='Append ']")).sendKeys("Kumar");
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).sendKeys("bye");
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).sendKeys("1");
		}
	
	public void testingexpplicitylY() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shyam.sunda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1= new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Alerts.html");
		d1.findElement(By.className("analystic")).click();
		d1.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		String msg1= d1.switchTo().alert().getText();
		System.out.println(msg1);
		WebDriverWait var= new WebDriverWait(d1, 20);
		var.until(ExpectedConditions.alertIsPresent());
		d1.switchTo().alert().accept();
		d1.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		d1.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		d1.switchTo().alert().dismiss();
		d1.findElement(By.xpath("//a[@href='#Textbox']")).click();
		d1.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		d1.switchTo().alert().sendKeys("Shyam");
		d1.switchTo().alert().accept();
		
	}
	public void tesingfluentwait() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shyam.sunda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1= new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Alerts.html");
		d1.findElement(By.className("analystic")).click();
		d1.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		String msg1= d1.switchTo().alert().getText();
		System.out.println(msg1);
		 d1.switchTo().alert().accept();
		d1.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		d1.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		d1.switchTo().alert().dismiss();
		
		FluentWait var=new FluentWait(d1);
		var.withTimeout(20, TimeUnit.SECONDS);
		var.pollingEvery(20, TimeUnit.SECONDS);
		var.ignoring( NoSuchElementException.class);

		var.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Male']")));
		Thread.sleep(10000);
		
		
		
		
		
		/*FluentWait var = new FluentWait(d1);
	      var.withTimeout(20, TimeUnit.SECONDS)
			//variable.withTimeout(20,TimeUnit.SECONDS)
	    .pollingEvery(5,TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
			 var.until(ExpectedConditions.alertIsPresent());
			d1.findElement(By.xpath("//a[@href='#Textbox']")).click();
			d1.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			d1.switchTo().alert().sendKeys("Shyam");
			d1.switchTo().alert().accept();
			}*/
		
		
		

		
		
	}

}