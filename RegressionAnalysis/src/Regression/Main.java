package Regression;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression;

import com.opencsv.exceptions.CsvValidationException;

public class Main {
	
	static final String[] xName = {"기준금리","최저임금","최저임금인상률", "물가총지수"};
	final static int choice = 3;
	public static void main(String[] args) throws CsvValidationException, FileNotFoundException, IOException {
		
		ReadCSV getArr = new ReadCSV();
		MultiRegressionUtils main = new MultiRegressionUtils();
		PrintResults pr = new PrintResults();
		
		OLSMultipleLinearRegression regression = new OLSMultipleLinearRegression();
		
		
//		 double[][] X = new double[][]{{5000,0.5,8},{4000,2,6},{3500,1,5},{3500,2.5,4},{5100,1.5,7},
//			 {4000,1,6},{3200,2,5},{3700,1.25,6},{3000,2,5,},{2900,3,4},{2900,1,5},
//			 {3200,2,8},{4300,1.25,7},{2900,3,4}}; 
//		 double[] Y = new double[]{9,4,6,3,7,8,5,7,4,3,6,7,8,4};
		ArrayList<double[]> raw = getArr.readCSV();
		
		double[][] X = getArr.readRawX(raw, choice);
		double[] Y = getArr.readRawY(raw, choice);
		 
		 
		regression.newSampleData(Y, X);

		double[] rsq =main.RSquare(regression);
		double[] pValue = main.getPValue(regression);
		double[] coefficient = main.coefficient(regression);
		double[] vif = main.getVIF(regression, X);
		
		pr.printRSquare(rsq, choice);
		pr.printIndependentsResult(pValue, coefficient, vif, xName, choice);

	}

}
