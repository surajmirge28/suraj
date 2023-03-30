package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class test1 
{
	@Test
	public void acti()
	{
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(option);
    driver.get("https://demo.actitime.com/login.do");
  
}
	@Test
	public void facebook()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
	    driver.get("https://www.facebook.com/");
	}
}
