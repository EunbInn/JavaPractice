package Lecture07;

import java.util.ArrayList;

public class P07_8 {

	public static void main(String[] args) {
		int k08_testMax = 1000000; // integer ���� ���� �� �� ����
		ArrayList k08_arr = new ArrayList();//��̸���Ʈ ���� �� ����
		
		for (int k08_i = 0; k08_i < k08_testMax; k08_i++) {//testMax�� �� ��ŭ �ݺ��� ����
			k08_arr.add((int)(Math.random() * 1000000));//0~1000000������ ���� �����Լ��� ��̸���Ʈ�� �߰�
		}
		
		for (int k08_i = 0; k08_i < k08_arr.size(); k08_i++) {//��̸���Ʈ �����ŭ �ݺ��� ����
			System.out.printf(" ArrayList %d = %d\n", k08_i, k08_arr.get(k08_i));//��̸���Ʈ ���� ���
		}
		
		System.out.printf("*******************************************\n");//���м� ���
		k08_arr.sort(null);//��̸���Ʈ ����
		
		for (int k08_i = 0; k08_i < k08_arr.size(); k08_i++) {//��̸���Ʈ �����ŭ �ݺ��� ����
			System.out.printf(" ArrayList %d = %d\n", k08_i, k08_arr.get(k08_i));//��̸���Ʈ ���� ���
		}

	}

}
