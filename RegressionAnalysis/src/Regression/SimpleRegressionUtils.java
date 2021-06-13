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

	final static double[] X = new double[]{0.5,2,1,2.5,1.5,1,2,1.25,2,3,1,2,1.25,3}; //ȸ�� ��ٿ� �ɸ��� �ð�
	final static double[] Y = new double[]{9,4,6,3,7,8,5,7,4,3,6,7,8,4}; //ȸ�� ������
	public static void main(String[] args) {
		 SimpleRegression simple = new SimpleRegression(); //���� ȸ�ͺм� ��ü ����
		  
		 for (int i = 0; i < X.length; i++) { 
			 simple.addData(X[i], Y[i]); //���� ȸ�ͺм� ��ü�� ������ �Է�
		 } 
		   
		 DecimalFormat df = new DecimalFormat("0.#####"); //��� ���� ���� ����(�Ҽ��� �Ʒ� 5�ڸ�����)
		 
		 System.out.println("<Simple Regression>");
		 System.out.println("Intercept			: " + df.format(simple.getIntercept())); // y����
		 System.out.println("Satisfaction(coefficient)	: " + df.format(simple.getSlope())); //x���
		 System.out.println("Standard Error			: " + df.format(simple.getSlopeStdErr())); // ǥ�� ����
		 System.out.println("RSquare				: " + df.format(simple.getRSquare())); //�������
		 System.out.println("P-value				: " + df.format(simple.getSignificance())); //p��
	 
	}
}
