package Seleniumw;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String WEB_DRIVER_ID = "webdriver.chrome.driver";
		String WEB_DRIVER_PATH = "C:\\Program Files\\Google\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		WebDriver driver;
		driver = new ChromeDriver();
	    
		String getUrl = "https://www.naver.com/";
		Document doc = null;
			
			try {
				driver.get(getUrl);
				Thread.sleep(1500);
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/ul[2]/li[3]/a")).click();
				Thread.sleep(1500);
				
				System.out.println("==================================================");
				String element = driver.getPageSource();
			//	Elements element2 = element.select("_topItmes1");
			//	String raw = element2.toString();
				//parser(raw);
				
				System.out.println(element);
			}catch(Exception e) {
				e.getStackTrace();
			}
		        
		       
		    }
		 

	
		public static void parser(String raw) {
			String data =raw;
			String [] getName = data.split(data);
	}
}

