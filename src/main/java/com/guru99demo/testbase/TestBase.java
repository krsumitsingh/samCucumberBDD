package com.guru99demo.testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.guru99demo.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	static Properties prop;

	public TestBase() {//create a Test Base Constructor
		try {
			prop = new Properties();
			FileInputStream F1 = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\guru99demo\\config\\config.properties");
			prop.load(F1);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void initialization() {
		//String operatingSystem = prop.getProperty("os.name");
		String browserName = prop.getProperty("browser");
		//if (operatingSystem.equals("Window")) {
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\java\\com\\guru99demo\\driver\\chromedriver.exe");
				ChromeOptions options1 = new ChromeOptions();
				options1.addArguments("--disable-extensions");
				driver = new ChromeDriver(options1);
			} else if (browserName.equals("FF")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\src\\main\\java\\com\\guru99demo\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}


