package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxandRadioBtns {
	@Test
	public void handlingChkBoxRadBtns() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement rb_honda=driver.findElement(By.id("hondaradio"));
		rb_honda.click();
		Thread.sleep(2000);
		WebElement rb_benz=driver.findElement(By.id("benzradio"));
		rb_benz.click();
		Thread.sleep(2000);
		WebElement chkbmw=driver.findElement(By.id("benzcheck"));
		chkbmw.click();
		Thread.sleep(2000);
		WebElement chkHonda=driver.findElement(By.id("hondacheck"));
		chkHonda.click();
		System.out.println("Raido button Benz is selected"+rb_benz.isSelected());
		System.out.println("Benz checkbox selected?"+chkbmw.isSelected());
		System.out.println("Honda checkbox selected?"+chkHonda.isSelected());
		driver.quit();
	}
}
