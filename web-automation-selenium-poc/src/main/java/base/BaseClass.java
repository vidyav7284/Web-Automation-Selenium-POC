package base;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	// Constructor to load properties
	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("E:\\EclipseWS\\MyCodewithFramwork\\src\\main\\resources\\Config\\config.properties");
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Initialize WebDriver
	public static void initialize() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.navigate().to(prop.getProperty("baseURL"));
		driver.navigate().refresh();
	
	}

	// Quit the driver
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}



