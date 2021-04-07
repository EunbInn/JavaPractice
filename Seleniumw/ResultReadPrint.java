package Seleniumw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ResultReadPrint {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new FileReader("C:\\project\\result08.csv"));
		ArrayList<String> rawData = new ArrayList<String>();
		String line;
		String[] dateOfArticle = new String[rawData.size()];
		String[] numOfComment = new String[rawData.size()];
		String[] numOfEmotion = new String[rawData.size()];

		while ((line = reader.readLine()) != null) {
			rawData.add(line);
		}

		for (int i = 0; i < rawData.size(); i++) {
			String[] rawLine = rawData.get(i + 1).split(",");
			dateOfArticle[i] = rawLine[0];
			numOfComment[i] = rawLine[22];
			numOfEmotion[i] = rawLine[12] + "," + rawLine[13] + "," + rawLine[14] + "," + rawLine[15] + ","
					+ rawLine[16] + "," + rawLine[17] + "," + rawLine[18] + "," + rawLine[19] + "," + rawLine[20];
			String all = dateOfArticle[i] + "," + numOfComment[i] + "," + numOfEmotion[i];
			System.out.println(all);
		}

		reader.close();

	}

}
