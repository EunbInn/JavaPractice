package Seleniumw;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.imageio.IIOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadUrlAndParsing {
	final static String WEB_DRIVER_ID = "webdriver.chrome.driver";
	final static String WEB_DRIVER_PATH = "C:\\Program Files\\Google\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	public static void urlDriver(String[] pressName, String[] pressUrl) throws  InterruptedException, Exception{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\project\\result.csv"), "MS949"));
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		ReadUrlAndParsing rp = new ReadUrlAndParsing();
		
		
		int i = 3;
		while (true) {
			if (pressName[i].equals("YTN") ) {
				bw.write(rp.pressType_1(pressUrl[i]));
				
			} else if (pressName[i].equals("중앙일보")) { 
				bw.write(rp.pressType_2(pressUrl[i]));
			
			} else if (pressName[i].equals("MBC")) { 
				rp.pressType_3(pressUrl[i]); 
				
			} else if (pressName[i].equals("세계일보")) {//날짜 포맷 다시 봐야함
				bw.write(rp.pressType_4(pressUrl[i])); 
				
			} else if (pressName[i].equals("뉴스1")) {
				bw.write(rp.pressType_5(pressUrl[i]));
				
			} else if (pressName[i].equals("KBS")) {
				bw.write(rp.pressType_6(pressUrl[i])); 
				
			} else if (pressName[i].equals("문화일보")) {
				bw.write(rp.pressType_7(pressUrl[i])); 
				
			} else if (pressName[i].equals("데일리NK")) {
				bw.write(rp.pressType_8(pressUrl[i]));
				
			} else if (pressName[i].equals("서울신문")) {
				bw.write(rp.pressType_9(pressUrl[i])); 
				
			} else if (pressName[i].equals("동아일보")) {
				bw.write(rp.pressType_10(pressUrl[i])); 
				
			} else if (pressName[i].equals("한겨레")) {
				bw.write(rp.pressType_11(pressUrl[i])); 
				
			} 
			i++;
			if (i > 10) break;
		}
		
		bw.close();
		
	}
	
	//ytn
	public String pressType_1(String pressUrl) throws InterruptedException, IOException {	
		driver.get(pressUrl);
		Thread.sleep(2000);
		String title = driver.getTitle().replace(",", "");
		Thread.sleep(2000);
		String script = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[1]/div[2]/div/div/div[3]/span")).getText();
		Thread.sleep(2000);
		String date = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")).getText();
		Thread.sleep(2000);
	
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
		
		return toWriteCsv;
		//댓글 긁어야함
	
	}
	
	//jungangilbo
	public String pressType_2 (String pressUrl) throws InterruptedException, IOException {
		
		driver.get(pressUrl);
		Thread.sleep(2000);
		String title = driver.getTitle().replace(",", "");
		Thread.sleep(2000);
		String script = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[8]/div[2]/div[3]")).getText().replace("\n", "").replace(",","");
		String date = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[8]/div[1]/div[2]/div[1]/em[2]")).getText();
		Thread.sleep(2000);
		Document doc = Jsoup.connect(pressUrl).get();
		Elements prefer = doc.select(".recommendation");
		Elements like = prefer.select("span.count");
		String articlePREFER = like.text();	
		
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
		
		return toWriteCsv;
		//민재스 댓글 추가해야함
	}
	
	//MBC , 댓글 추가요망
	public String pressType_3 (String pressUrl) throws InterruptedException, IOException {
		driver.get(pressUrl);
		Thread.sleep(2000);
		String title = driver.getTitle().replace(",", "");
		Thread.sleep(2000);
		String script = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/section[1]/article/div[2]/div[5]")).getText().replace("\n", "").replace(",","");
		Thread.sleep(2000);
		String date = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/section[1]/article/div[1]/div[3]/div[1]/span[1]")).getText();
		Thread.sleep(2000);
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
		
		return toWriteCsv;
	
	}
	
	//세계일보
	public String pressType_4 (String pressUrl) throws InterruptedException, IOException {
		driver.get(pressUrl);
		Thread.sleep(2000);
		String address = driver.getCurrentUrl(); 
		Document doc = Jsoup.connect(address).get();
		Thread.sleep(2000);
		String title = driver.getTitle().replace(",", "");
		Thread.sleep(2000);//내용
		Elements scriptraw = doc.select("article.viewBox");
		String script = scriptraw.select("p").text().replace(",", "");
		Thread.sleep(2000);//입력일
		String date = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[2]/section/p[2]")).getText();
		
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
		Thread.sleep(2000);
		
		return toWriteCsv;
	}
	//뉴스1
	public String pressType_5 (String pressUrl) throws InterruptedException, IOException {
		driver.get(pressUrl);
		Thread.sleep(2000);
		String address = driver.getCurrentUrl(); 
		Document doc = Jsoup.connect(address).get();
		Thread.sleep(2000);
		String title = driver.getTitle().replace(",", "");
		Thread.sleep(2000);//내용
		String script = doc.select("div.detail.sa_area").text().replace(",", "");
		Thread.sleep(2000);//입력일
		String dateraw = (doc.select("div.title")).select("div.info").text();
		String date = dateraw.split("기자")[1].substring(3);
		Thread.sleep(2000);

		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
		
		return toWriteCsv;
	}
	
	//KBS
	public String pressType_6 (String pressUrl) throws InterruptedException, IOException {
		driver.get(pressUrl);
		Thread.sleep(2000);
		String address = driver.getCurrentUrl(); 
		Document doc = Jsoup.connect(address).get();
		Thread.sleep(2000);//제목
		String title = driver.getTitle().replace(",", "");
		Thread.sleep(2000);//내용
		String script = doc.select("div.detail-body.font-size").text().replace(",", "");
		Thread.sleep(2000);//입력일
		String date = driver.findElement(By.xpath("/html/body/div/div/div[6]/div/div[1]/div[1]/div[1]/span/em[1]")).getText();
		Thread.sleep(2000);//댓글?
		
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
		
		return toWriteCsv;
	}
	
	//문화일보
	public String pressType_7 (String pressUrl) throws InterruptedException, IOException {
		driver.get(pressUrl);
		Thread.sleep(2000);
		String address = driver.getCurrentUrl(); 
		Document doc = Jsoup.connect(address).get();
		Thread.sleep(2000);//제목
		String title = driver.getTitle().replace(",", "");
		Thread.sleep(2000);//내용
		String script = doc.select("div#NewsAdContent").text().replace(",", "");
		Thread.sleep(2000);//입력일
		String date = driver.findElement(By.xpath("/html/body/div[1]/table[5]/tbody/tr/td[1]/table[6]/tbody/tr/td/table[1]/tbody/tr/td[2]")).getText();
		Thread.sleep(2000);//댓글?
		
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
		
		return toWriteCsv;
	}
	
	//데일리NK
	public String pressType_8 (String pressUrl) throws InterruptedException, IOException {
		driver.get(pressUrl);
		Thread.sleep(2000);
		String address = driver.getCurrentUrl(); 
		Document doc = Jsoup.connect(address).get();
		Thread.sleep(2000);//제목
		String title = driver.getTitle().replace(",", "");
		Thread.sleep(2000);//내용
		String script = doc.select("div.td-post-content").text().replace(",", "");
		Thread.sleep(2000);//입력일
		String date = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div[1]/div/article/div[1]/header/div/span/time")).getText();
		Thread.sleep(2000);//댓글?
		
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";

		return toWriteCsv;
	}
	
	//서울신문
	public String pressType_9 (String pressUrl) throws InterruptedException, IOException {
		driver.get(pressUrl);
		Thread.sleep(2000);
		String address = driver.getCurrentUrl(); 
		Document doc = Jsoup.connect(address).get();
		Thread.sleep(2000);//제목
		String title = driver.getTitle().replace(",", "");
		Thread.sleep(2000);//내용
		String script = doc.select("div.S20_v_article").text().replace(",", "");
		Thread.sleep(2000);//입력일
		String date = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[2]/div/div/div[2]/span[1]/span")).getText();
		Thread.sleep(2000);//댓글?
		
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
		
		return toWriteCsv;
	}
	
	//동아일보
	public String pressType_10 (String pressUrl) throws InterruptedException, IOException {
		driver.get(pressUrl);
		Thread.sleep(2000);
		String address = driver.getCurrentUrl(); 
		Document doc = Jsoup.connect(address).get();
		Thread.sleep(2000);//제목
		String title = driver.getTitle().replace(",", "");//내용
		String script = doc.select("div.article_txt").text().replace(",", "");//date
		String date = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/span[2]")).getText();
		Thread.sleep(2000);//댓글?
		
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
		
		System.out.println(toWriteCsv);
		
		return toWriteCsv;
	}
	
	//한겨례
	public String pressType_11 (String pressUrl) throws InterruptedException, IOException {
		driver.get(pressUrl);
		Thread.sleep(4000);
		Document doc = Jsoup.connect(pressUrl).get();
		Elements titleAREA = doc.select("div.article-head");
		String titleAREA1 = titleAREA.toString();
		String title = titleAREA1.substring(titleAREA1.indexOf("title\">") + 7);
		title = title.substring(0, title.indexOf("</span"));
				  
		Elements bodyAREA = doc.select(".text");
		String script = bodyAREA.text();
		
		String date = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/p[2]/span[1]")).getText();
				
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
				
		System.out.println(toWriteCsv);
				
		return toWriteCsv;
	}
	
	//파이낸셜뉴스
	public String pressType_12 (String pressUrl) throws InterruptedException, IOException {
		driver.get(pressUrl);
		Thread.sleep(2000);
		
		Document doc = Jsoup.connect(pressUrl).get();
		Thread.sleep(2000);//제목
		String title = driver.getTitle().replace(",", "");//내용
		String script = doc.select("div.article_txt").text().replace(",", "");//date
		String date = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/span[2]")).getText();
		Thread.sleep(2000);//댓글?
		
		String toWriteCsv = "\"" + title + "\"" + ",\"" + date + "\"" + ",\"" + script + "\"\n";
		
		System.out.println(toWriteCsv);
		
		return toWriteCsv;
	}
}
