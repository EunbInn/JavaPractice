package Seleniumw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaverNews {
	final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	final String WEB_DRIVER_PATH = "C:\\Program Files\\Google\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	Document doc;
	
	public String newsParsingUtil(String pressName, String pressUrl) throws IOException, InterruptedException {
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		String[] emotionN = {"좋아요","훈훈해요","슬퍼요","화나요","후속기사 원해요",
				"팬이에요","응원해요","축하해요","기대해요","놀랐어요"};
		String[] emotion = new String[emotionN.length];
		//0: like, 1: warm, 2: sad, 3: angry, 4: want, 
		//5: fan, 6: cheer, 7: congratulation, 8: expect, 9: surprise
		String date, body;
		ArrayList<String> emN = new ArrayList<String>();
		ArrayList<String> comment = new ArrayList<String>();		
		String commentAll = "";
		String emotionAll = "";
		String title, numComment;
			
		String comPerGender = "";
		String comPerAge = "";
		String writeCsvFile = "";
		
		
		//connect with url 
		driver.get(pressUrl);
		Thread.sleep(4000);
		
		doc = Jsoup.connect(driver.getCurrentUrl()).get();
		
		title = "\"" + driver.getTitle().replace(",", "") + "\"";
		
		//get the number of reactions against article
		try {
			int num = 0;
			while (true) {
				String emN_xpath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div[3]/div[1]/ul/li[" + (num + 1) + "]/a/span[1]";
				emN.add(driver.findElement(By.xpath(emN_xpath)).getText());
				num++;
			}
		} catch (Exception ex) {
			
		}
		
		for (int n = 0; n < emN.size(); n++) {
			if (emN.contains(emotionN[n])) {
				String em_xpath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div[3]/div[1]/ul/li[" + (n + 1) + "]/a/span[2]"; //in html starts from 1
				emotion[n] = driver.findElement(By.xpath(em_xpath)).getText();
			}
		}
		
		for (int n = 0; n < emotionN.length; n++) {
			if (emotion[n] == null) {
				emotion[n] = "0";
			}
			emotionAll += "\"" +emotion[n] + "\",";
		}
	
		Thread.sleep(3000);
		//read full script of article
		Elements bodyRaw = doc.select("div#articleBodyContents._article_body_contents");
		body = bodyRaw.text().replace(",", "");
		
		//read date
		try {
			Elements dateRaw = doc.select("span.t11");
			date = dateRaw.text();
			date = date.substring(0, date.indexOf(". 오"));
			date = "\"" +date.replace(".", "") + "\"";
			Thread.sleep(4000);
		} catch (StringIndexOutOfBoundsException in) {
			Elements dateRaw = doc.select("span.author").select("em");
			date = dateRaw.text();
			date = date.substring(0, date.indexOf(". 오"));
			date = "\"" +date.replace(".", "") + "\"";
			
		}
		// number of comment
		
		try {
			if (pressName.contains("한겨레")) {
				numComment = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/div[1]/div[3]/div/div[3]/div[1]/a/span")).getText();
				numComment = "\"" + numComment + "\"";  
				
			} else if (pressName.contains("한국일보")){
				numComment = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/div[1]/div[3]/div/div/div[1]/a/span[2]")).getText();
				numComment = "\"" + numComment + "\"";  
			
			} else {
				numComment = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/div[1]/div[3]/div/div[3]/div[1]/a/span[2]")).getText();
				numComment = "\"" + numComment + "\"";
			}
		} catch (Exception no) {
			numComment = "\"0\"";
		}
		
		
		//move into comment page
		
		try {
			if (pressName.contains("한겨레")) {
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/div[5]/div/div/a[1]")).click();
				Thread.sleep(3000);
			
			} else {
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/div[5]/div/div[9]/a/span[2]")).click();
				Thread.sleep(3000);
			}
		} catch (Exception ex) {
			return writeCsvFile = date + "," + title + "," + pressName + "," + body + "," + "\"\",\"\"" + "," + "\"\",\"\",\"\",\"\",\"\",\"\"," 
					+ emotionAll + "\"\"" + "," + "" + "\n";
		}
		try {
			//Percentage of comment depending on gender
			String malePer = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div[2]/div[3]/ul/li/div/div[2]/div/div[1]/div[1]/span[1]")).getText();
			malePer = malePer.replace("%", "");
			String femalePer = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div[2]/div[3]/ul/li/div/div[2]/div/div[1]/div[2]/span[1]")).getText();
			femalePer = femalePer.replace("%", "");
			comPerGender = "\"" + malePer + "," + femalePer + "\"";
			
			//Percentage of comment depending on age
			for (int n = 1; n <= 6; n++) {
				String age_xpath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[5]/div[2]/div[3]/ul/li/div/div[2]/div/div[2]/div[" + n + "]/span[1]/span";
				String agePer = driver.findElement(By.xpath(age_xpath)).getText();
				comPerAge += "\"" + agePer + "\",";
			}
		}
		catch (Exception e) {
			comPerGender = "\"0\",\"0\"";
			comPerAge = "\"0\",\"0\",\"0\",\"0\",\"0\",\"0\",";
		}
		//click "more button" to get all the list of comment
		try {
			while (true) {
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div[2]/div[9]/a")).click();
				Thread.sleep(2500);	
			}
		} catch (Exception e) {
			//null => break
		}
		
		
		//get all comments into array
		try {
			int i = 1;
			while (true) {
				String com_xPath, like_xPath, hate_xPath;
					 
				if (pressName.contains("스포츠경향")) {
					//comment_xpath 
					com_xPath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div/div[8]/ul/li[" + i + "]/div[1]/div/div[2]/span[1]";
					//like hate xpath
					like_xPath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div/div[8]/ul/li[" + i + "]/div[1]/div/div[4]/div/a[1]/em";
					hate_xPath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div/div[8]/ul/li[" + i + "]/div[1]/div/div[4]/div/a[2]/em";
				} else {
					//comment_xpath 
					com_xPath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div[2]/div[8]/ul/li[" + i + "]/div[1]/div/div[2]/span[1]";
					//like hate xpath
					like_xPath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div[2]/div[8]/ul/li[" + i + "]/div[1]/div/div[4]/div/a[1]/em";
					hate_xPath = "/html/body/div[2]/table/tbody/tr/td[1]/div/div[2]/div[2]/div[8]/ul/li[" + i + "]/div[1]/div/div[4]/div/a[2]/em";
				}
				String com_raw = driver.findElement(By.xpath(com_xPath)).getText().replace(",", "");//remove comma
				String like_raw = driver.findElement(By.xpath(like_xPath)).getText();
				String hate_raw = driver.findElement(By.xpath(hate_xPath)).getText();
				
						
				comment.add("[@@@]" + com_raw + "[" + like_raw + "][" + hate_raw + "][/@@@]");
				i++;
			}
		} catch (Exception e) {
			//null => break 
		}
		
		for (int com = 0; com < comment.size(); com++) {
			commentAll += comment.get(com) + "";
		}
		
		//date, title, press name, gender comment, age comment, 
		//reaction 1-10, number of comments, comments detail
		writeCsvFile = date + "," + title + "," + pressName + "," + body + "," + comPerGender + "," + comPerAge 
						+ emotionAll + numComment + "," + commentAll + "\n";
		
		System.out.println(writeCsvFile);

		return writeCsvFile;
		
			
	}
	
}
