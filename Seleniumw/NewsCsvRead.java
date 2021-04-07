package Seleniumw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.exceptions.CsvException;

public class NewsCsvRead {

	public static String[][] reader(String filePath) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		ArrayList<String> rawData = new ArrayList<String>();
		String line;

		while ((line = reader.readLine()) != null) {
			rawData.add(line);

		}

		String[][] nameAndUrl = new String[rawData.size()][2];

		for (int i = 0; i < rawData.size(); i++) {
			if (rawData.get(i).length() > 5) {
				String[] rawLine = rawData.get(i).split(",");
				nameAndUrl[i][0] = rawLine[0]; // name of press
				nameAndUrl[i][1] = rawLine[2]; // url
			}
		}

		reader.close();
		return nameAndUrl;

	}

	
}
