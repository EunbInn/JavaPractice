package Regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadCSV {
	final String filePath = "C:\\project\\rawdata2.csv";
	
	public ArrayList<double[]> readCSV() throws IOException, FileNotFoundException, CsvValidationException {
		CSVReader cr = new CSVReader(new InputStreamReader(new FileInputStream(filePath),"MS949"));
		String[] line;
		
		ArrayList<double[]> raw = new ArrayList<double[]>();
		double[] raw_data;
		
		line = cr.readNext();
		String[] filedName = line;
		
		while ((line = cr.readNext()) != null) {
			raw_data = new double[4];
			raw_data[0] = Double.parseDouble(line[1]);
			raw_data[1] = Double.parseDouble(line[2]);
			raw_data[2] = Double.parseDouble(line[3]);
			raw_data[3] = Double.parseDouble(line[4]);
			raw.add(raw_data);
		}

		cr.close();
		return raw;
	}
	
	public double[][] readRawX(ArrayList<double[]> raw, int choice) {
		double[][] rawX = new double[raw.size()][];
		
		int length = raw.get(0).length;
		
//		int notC = 2;
//		if (choice == 2) {
//			notC = 1;
//		}
//		
		int cnt = 0;
		while (true) {
			int icnt = 0;
			double [] ex = new double [length - 1];
			for(int i = 0; i < length; i++) {
				if (i != choice) {
					ex[icnt] = raw.get(cnt)[i];
					icnt++;
				}
			}
			rawX[cnt] = ex;
			cnt++;
			if (cnt == raw.size()) break;
		}

		
		return rawX;
	}
	
	public double[] readRawY(ArrayList<double[]> raw, int choice) {
		double[] rawY = new double[raw.size()];
		
		for (int i = 0; i < raw.size(); i++) {
			rawY[i] = raw.get(i)[choice];
		}
		
		return rawY;
	}
	
}
