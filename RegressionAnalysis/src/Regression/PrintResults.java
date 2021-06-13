package Regression;

import java.text.DecimalFormat;
/**
 * Print Format of Regression Analysis.
 * 
 * @author Inna
 * @version 1.0
 */
public class PrintResults {
	DecimalFormat df = new DecimalFormat("0.######");
	
	public static String strFormat(String name, int length) {
		String temp = name + "                                ";
		String nameNew = new String(temp.getBytes(), 0, length);
		
		return nameNew;
	}
	
	public void printRSquare(double[] rsq, int choice) {
		System.out.printf("%s%23s\n",strFormat(Main.xName[choice], 15), "[ Regression Analysis ]");
		System.out.println("========================================================");
		System.out.println("R square: " + df.format(rsq[0]));
		System.out.println("Adjusted R square: " + df.format(rsq[1]));
		System.out.println("========================================================");
	}
	
	public void printIndependentsResult(double[] pValue, double[] coefficient, double[] vif, String[] xName, int choice) {
		System.out.printf("%22s%18s%11s","P-value","Coefficient","VIF");
		System.out.println("\n--------------------------------------------------------");
		int cnt = 0;
		for (int j = 0; j < xName.length; j++) {
			String xname = "";
			if (j != choice) { 
				xname = xName[j];
				System.out.printf("%s%s%s%s\n", 
						strFormat(xname, 15), 
						strFormat(df.format(pValue[cnt]), 15),
						strFormat(df.format(coefficient[cnt]), 15), 
						strFormat(df.format(vif[cnt]), 15));
				cnt++;
			}
		}
		
		System.out.println("========================================================");
	}
	
		
}
