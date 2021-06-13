package Regression;

import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import org.apache.commons.math3.stat.regression.SimpleRegression;

/**
 
 * @return     N/A
 * @author     Inna
 * @author     AK2
 * @since      1.0
 */
public class SimpleRegressionUtils {

	final static double[] X = new double[]{0.5,2,1,2.5,1.5,1,2,1.25,2,3,1,2,1.25,3}; //회사 통근에 걸리는 시간
	final static double[] Y = new double[]{9,4,6,3,7,8,5,7,4,3,6,7,8,4}; //회사 만족도
	public static void main(String[] args) {
		 SimpleRegression simple = new SimpleRegression(); //단일 회귀분석 객체 생성
		  
		 for (int i = 0; i < X.length; i++) { 
			 simple.addData(X[i], Y[i]); //단일 회귀분석 객체에 데이터 입력
		 } 
		   
		 DecimalFormat df = new DecimalFormat("0.#####"); //출력 숫자 포맷 지정(소수점 아래 5자리까지)
		 
		 System.out.println("<Simple Regression>");
		 System.out.println("Intercept			: " + df.format(simple.getIntercept())); // y절편
		 System.out.println("Satisfaction(coefficient)	: " + df.format(simple.getSlope())); //x계수
		 System.out.println("Standard Error			: " + df.format(simple.getSlopeStdErr())); // 표준 잔차
		 System.out.println("RSquare				: " + df.format(simple.getRSquare())); //결정계수
		 System.out.println("P-value				: " + df.format(simple.getSignificance())); //p값
	 
	}
}
