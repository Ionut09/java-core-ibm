package com.ibm.java;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingCalculatorApp {
	
	private WebDriver driver;
	private ChromeOptions options;
	
	@BeforeMethod
	public void setup() {
		//https://chromedriver.chromium.org/downloads --> versiunea specifica Chroem-ului vostru
		System.setProperty("webdriver.chrome.driver",
			//change ME
			"/Users/ionut/workspace/trainings/java-core-ibm/src/test/resources/chromedriver");
		options = new ChromeOptions().addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		
		driver.manage()
		      .timeouts()
		      .implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@Test
	public void testPayment() throws InterruptedException {
		//Given
		driver.navigate()
		      .to("https://www.calculator.net/mortgage-payoff-calculator.html");
		
		driver.manage()
		      .window()
		      .maximize();
		
		WebElement input1 = driver.findElement(By.name("cloanamount"));
		input1.clear();
		input1.sendKeys("50000");
		Thread.sleep(1000);
		
		WebElement input2 = driver.findElement(By.name("cloanterm"));
		input2.clear();
		input2.sendKeys("20");
		Thread.sleep(1000);
		
		WebElement input3 = driver.findElement(By.name("cinterestrate"));
		input3.clear();
		input3.sendKeys("4");
		Thread.sleep(1000);
		
		WebElement input4 = driver.findElement(By.id("cremainingyear"));
		input4.clear();
		input4.sendKeys("20");
		Thread.sleep(1000);
		
		WebElement input5 = driver.findElement(By.id("cremainingmonth"));
		input5.clear();
		input5.sendKeys("0");
		Thread.sleep(1000);
		
		//click on Normal repayment
		driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/tbody/tr[5]/td/label[4]/span"))
		      .click();
		Thread.sleep(1000);
		
		
		//When
		//Click the button
		driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/tbody/tr[6]/td/input[2]"))  //fragile
		      .click();
		Thread.sleep(1000);
		
		//Then  --> verificam ca output == $302.99
		WebElement outputElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/table/tbody/tr[1]/td[2]"));
		Assert.assertTrue(outputElement.isDisplayed());
		Assert.assertTrue(outputElement.isEnabled());
		Assert.assertEquals(outputElement.getText(), "$302.99");
	}
}
