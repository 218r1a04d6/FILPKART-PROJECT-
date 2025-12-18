package com.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {
	public static WebDriver driver;
	Properties prop;
	public void launchapplication() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\JAVA_IDE\\Flipkart_N_To_Testing\\src\\test\\resources\\property\\config.properties");
	    prop=new Properties();
	    prop.load(fis);
	    try {
	    	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
	    		driver=new ChromeDriver();
	    	}
	    		else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
	    			driver=new ChromeDriver();
	    		}
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    	driver.get(prop.getProperty("url"));
	    	}
	    catch(Exception e) {
	    	System.out.println("browser did not launch");
	    }
	}
	public void teardown() {
		
	}
	

}
