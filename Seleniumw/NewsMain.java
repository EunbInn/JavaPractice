package Seleniumw;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String WEB_DRIVER_ID = "webdriver.chrome.driver";
		String WEB_DRIVER_PATH = "C:\\Program Files\\Google\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\project\\result2.csv",true), "MS949"));
		String filePath = "C:\\project\\output (3).csv";
		NaverNews tool = new NaverNews();
		
		String[][] nameAndUrl = NewsCsvRead.reader(filePath);
		
		String[] pressName = new String[nameAndUrl.length];
		String[] pressUrl = new String[nameAndUrl.length];
		for (int i = 0; i < nameAndUrl.length; i++) {
			pressName[i] = nameAndUrl[i][0];
			pressUrl[i] = nameAndUrl[i][1];
		}
		
		//date, title, press name, gender comment, age comment, 
		//reaction 1-10, number of comments, comments detail
		String catName = "\"날짜\",\"제목\",\"언론사\",\"본문\",\"남자댓글(%)\",\"여자댓글(%)\","
						+ "\"10대(%)\",\"20대(%)\",\"30대(%)\",\"40대(%)\",\"50대(%)\",\"60대+(%)\","
						+ "\"좋아요\",\"훈훈해요\",\"슬퍼요\",\"화나요\",\"후속기사 원해요\","
						+ "\"팬이에요\",\"응원해요\",\"축하해요\",\"기대해요\",\"놀랐어요\",\"댓글수\",\"댓글내용\"\n";
		bw.write(catName);
		
		int cnt = 159;
		while (cnt < pressUrl.length) {
			if (pressUrl[cnt] != null) {
			String result = tool.newsParsingUtil(pressName[cnt], pressUrl[cnt]);
			Thread.sleep(2000);
			bw.write(result);
			}
		System.out.println(cnt);
		cnt++;
		
		}
		
		bw.close();
	}

}
