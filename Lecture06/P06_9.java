package Lecture06;

import java.util.Scanner;

public class P06_9 {
//20210427 ������ ������ ����
	public static void main(String[] args) {
		Scanner k08_sc = new Scanner(System.in);//��ĳ�� ��ü ����

		int k08_userInputChannel = k08_sc.nextInt();//�ֿܼ��� �Է¹��� ���ڸ� ��Ƽ�� ������ ����
		TvRemocon k08_remocon = new TvRemocon(k08_userInputChannel, 1);// Ŭ���� ��ü ���� �� ������ ���� �Է�
		
		int k08_userInputVolum = k08_sc.nextInt();//�ֿܼ��� �Է¹��� ���ڸ� ��Ƽ�� ������ ����
		k08_remocon = new TvRemocon(k08_userInputVolum, 2);// Ŭ���� ��ü ���� �� ������ ���� �Է�

		

	}
}
