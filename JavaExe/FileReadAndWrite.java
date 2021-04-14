package JavaExe;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileReadAndWrite {

	public static void writeOnFile(String result, int cnt) throws IOException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
		String firstLine = "";
		String output = "";
		String filePath = "C:\\project\\" + date.format(cal.getTime()) + "exchange.csv";
		File file = new File(filePath);
		
		
		String[] first = {"날짜","시간","요청금액(원)","외화종류","환전외화","거래 후 외화 잔액",
				"100달러","50달러","20달러","10달러","5달러","1달러",
				"100유로","50유로","20유로","10유로","5유로","10000엔","5000엔","2000엔","1000엔"
				,"거스름돈(원)","10000원","5000원","1000원","500원","100원","50원", "10원","비고"};
		for (int i = 0; i < first.length; i++) {
			firstLine += "\"" + first[i] + "\",";
		}
		
		firstLine += "\n";
		
		output = "\"" + date.format(cal.getTime()) + "\",\"" + time.format(cal.getTime()) + "\"," + result + "\n";
		BufferedWriter bw; 
		if (cnt == 1 && file.exists() == false) {
			bw = new BufferedWriter(new OutputStreamWriter
					(new FileOutputStream(filePath, true), "MS949"));
			bw.write(firstLine);
			bw.write(output);
		} else {
			bw = new BufferedWriter(new OutputStreamWriter
					(new FileOutputStream(filePath, true), "MS949"));
			bw.write(output);
		}	
		
		bw.close();
		
	}
	
	public static String allWriteFormat(int money, int typeInArray, int returnWon, 
			int returnMoney, String exFormat, String wonFormat, boolean rest) {
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		String result = "";
		if (rest == true) {
			result = "\"" + df.format(money) + "\",\"" + CostValue.nameMoney[typeInArray] + "\",\"" + df.format(returnMoney)
			 + "\",\"" + CostValue.BALANCE[typeInArray] + "\"," +  exFormat + "\"" + df.format(returnWon) + "\"," + wonFormat;
		} else {
			result = "\"" + df.format(money) + "\",\"" + CostValue.nameMoney[typeInArray] + "\",\"0\",\""
					+ CostValue.BALANCE[typeInArray] + "\"," + exFormat + "\"" + df.format(money) + "\"," + wonFormat + "\"외화부족\"";
		}
		return result;
	}
	
	//get format of each money to combine with final format to write on file
	public static String ExFormat(int[] sort, int type, boolean rest) {
		int lengDol = CostValue.dollar.length;
		int lengEur = CostValue.euro.length;
		int lengYen = CostValue.yen.length;
		String format = "";
		
		int[][] all = new int[3][];
		
		if (type == CostValue.typeUSD && rest == true) {
			all[0] = sort;
			all[1] = new int[lengEur];
			all[2] = new int[lengYen];
		} else if (type == CostValue.typeEUR && rest == true) {
			all[0] = new int[lengDol];
			all[1] = sort;
			all[2] = new int[lengYen];
		} else if (type == CostValue.typeJPY && rest == true) {
			all[0] = new int[lengDol];
			all[1] = new int[lengEur];
			all[2] = sort;
		} else if (rest == false) {
			all[0] = new int[lengDol];
			all[1] = new int[lengEur];
			all[2] = new int[lengYen];
		}
		
		for (int i = 0; i < all.length; i++) {
			for (int j = 0; j < all[i].length; j++) {
				format += "\"" + all[i][j] + "\",";
			}
		}
		
		return format;
	}
	
	public static String WonFormat(int[] sort, boolean rest) {
		int lengWon = CostValue.won_arr.length;
		String format = "";
		
		if (rest == false) {
			sort = new int[lengWon];
		}
		
		for (int i = 0; i < lengWon; i++) {
			format += "\"" + sort[i] + "\",";
		}
		
		return format;
	}
}
