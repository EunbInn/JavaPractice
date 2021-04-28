package Lecture07;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class P07_10 {
	static ArrayList<OneRec1> k08_ArrayOneRec = new ArrayList<OneRec1>(); //Ŭ������ ��̸���Ʈ ���� �� ����
	
	static int k08_sumkor = 0;//�������� �հ� ����ƽ ��Ƽ�� Ÿ������ ���� �� �ʱ�ȭ
	static int k08_sumeng = 0;//�������� �հ� ����ƽ ��Ƽ�� Ÿ������ ���� �� �ʱ�ȭ
	static int k08_summat = 0;//�������� �հ� ����ƽ ��Ƽ�� Ÿ������ ���� �� �ʱ�ȭ
	static int k08_sumsum = 0;//���հ����� ����ƽ ��Ƽ�� Ÿ������ ���� �� �ʱ�ȭ
	static double k08_sumave = 0;//����� ���� ����ƽ ��Ƽ�� Ÿ������ ���� �� �ʱ�ȭ
	static int k08_nukor = 0; //����ƽ ��Ƽ���� �������� �� ���� ������ �ʱ�ȭ
	static int k08_nueng = 0; //����ƽ ��Ƽ���� �������� �� ���� ������ �ʱ�ȭ
	static int k08_numat = 0;//����ƽ ��Ƽ���� �������� �� ���� ������ �ʱ�ȭ
	static int k08_nusum = 0;//����ƽ ��Ƽ���� �������� �� �Ѱ� ������ �ʱ�ȭ
	static double k08_nuave = 0;//����ƽ ����� �������� �� ��� ������ �ʱ�ȭ
	static final int k08_iRealPerson = 200; // �� �ο� �� ����
	static int k08_iPerson = 30; // �������� �ο��� ���� ���ȭ
	static int k08_pageCnt = 0; //������ �� ��Ƽ���� ���� �� �ʱ�ȭ
	static int k08_cnt = 0; // �������� �ο��� ī��Ʈ ��Ƽ���� ���� �� �ʱ�ȭ
	static int k08_nu = 0; // �� �����ο��� ��Ƽ���� ���� �� �ʱ�ȭ
	
	public static void main(String[] args) { //���ο��� ����
		dataSet();//������ �� �޼��� ȣ��
	//	dataSort(); //data ���� �޼��� ȣ��
		TitlePrint();//Ÿ��Ʋ ���
		HeaderPrint();//��� ���
		for (int k08_i = 0; k08_i < k08_ArrayOneRec.size(); k08_i++) {//Ŭ���� ����� �����ŭ �ݺ��� ����
			ItemPrint(k08_i);//i������ ���ڷ� �޾� �δ� ���� ���
			k08_cnt++; // ī��Ʈ + 1
			k08_nu++; // �����ο� + 1
			//i + 1�� �������� �ο����� ���� �������� 0�̰� i + 1���� ��� ������� ���� ������
			if ((k08_i + 1) % k08_iPerson == 0 && (k08_i + 1) != k08_ArrayOneRec.size()) { 
				PageTotalPrint();//���� ������ �հ� ��� ���
				TailPrint();//���� ������ (���, �հ�) ���
				TitlePrint();//���� ���
				HeaderPrint();//��� ���
				Reset();//�� ���� (�������� �հ�, ī��Ʈ ��)
			} else if ((k08_i + 1) == k08_ArrayOneRec.size()) {//i + 1 ���� ��� ������� ���� ��
				PageTotalPrint();//���� ������ �հ� ��� ���
				TailPrint();//���������� ���, �հ� ���
			}
		}
	}
	
	public static void dataSet() {//�����͸� �ִ� �޼��� ����
		for (int k08_i = 1; k08_i <= k08_iRealPerson; k08_i++) {//���� iRealPerson����ŭ �ݺ��� ����
			String k08_name = String.format("����%03d", k08_i);//��Ʈ�� ���� �ѱ�2�� + ����2�ڸ����Ͽ� ����
			int k08_kor = (int)(Math.random() * 100);//�����Լ� ��Ƽ���� ��ȯ�Ͽ� ���� ����
			int k08_eng = (int)(Math.random() * 100);//�����Լ� ��Ƽ���� ��ȯ�Ͽ� ���� ����
			int k08_mat = (int)(Math.random() * 100);//�����Լ� ��Ƽ���� ��ȯ�Ͽ� ���� ����
			k08_ArrayOneRec.add(new OneRec1(k08_i, k08_name, k08_kor, k08_eng, k08_mat));//inputData Ŭ������ SetData �޼��� ȣ�� �� ���� �Է�
		}
	}
	
	public static void TitlePrint() {//Ÿ��Ʋ ��� �޼��� ����
		Date k08_date;//����Ʈ ��ü ����
		SimpleDateFormat k08_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//��¥ ���� ����
		k08_date = new Date();//����Ʈ ��ü ����
		k08_pageCnt++;//������ī��Ʈ + 1
		System.out.printf("                    ��������ǥ\n\n");//���� ����ǥ ���� ���
		System.out.printf("PAGE: %d               ������� : %s\n", k08_pageCnt, k08_sdf.format(k08_date));//���������� ���� ���
	}
	
	public static void HeaderPrint() {//��� ��� �޼��� ����
		System.out.printf("====================================================\n");//���м� ���
		System.out.printf("%2s  %5s%8s%5s%5s%5s%5s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");//��� ���
		System.out.printf("====================================================\n");//���м� ���
	}
	
	public static void ItemPrint(int k08_i) {//���� ��� �޼��� ����
		OneRec1 k08_rec;//Ŭ���� ������Ʈ ����
		k08_rec = k08_ArrayOneRec.get(k08_i); //���� i��°�� ���� Ŭ���� ��ü�� ����
		System.out.printf("%03d   %7s%7d%7d%7d%7d%8.1f\n",//��� ���� ����
				k08_rec.student_id(), k08_rec.name(), k08_rec.kor(), k08_rec.eng(), k08_rec.mat(), k08_rec.sum(), k08_rec.ave());
		
		k08_sumkor += k08_rec.kor();//�������� ����
		k08_sumeng += k08_rec.eng();//�������� ����
		k08_summat += k08_rec.mat();//�������� ����
		k08_sumsum += k08_rec.sum();//���հ� ����
		k08_sumave += k08_rec.ave();//��� ����
	}
	
	public static void Reset() { //���� �޼��� ����
		k08_sumkor = 0;//�������� �հ� �ʱ�ȭ
		k08_sumeng = 0;//�������� �հ� �ʱ�ȭ
		k08_summat = 0;//�������� �հ� �ʱ�ȭ
		k08_sumsum = 0;//���հ��� �ʱ�ȭ
		k08_sumave = 0;//����� �ʱ�ȭ
		k08_cnt = 0; // �������� �ο��� ī��Ʈ �ʱ�ȭ
	}
	
	public static void PageTotalPrint() { //���������� ��� ��� �޼��� ����
		double k08_nanum = (double) k08_cnt;//������ �ο��� ī��Ʈ ����� ����ȯ
		System.out.printf("====================================================\n");//���м� ���
		System.out.printf("����������\n");//���ڿ� ���
		System.out.printf("�հ�%18d%7d%7d%7d%8.1f\n", //��հ��� �������̹Ƿ� %f�������� ���  
				k08_sumkor, k08_sumeng, k08_summat, k08_sumsum,  k08_sumave);
		System.out.printf("���%18.1f%7.1f%7.1f%7.1f%8.1f\n",  //��� %f�������� ���
				k08_sumkor / k08_nanum, k08_sumeng / k08_nanum, k08_summat / k08_nanum, k08_sumsum / k08_nanum,  k08_sumave / k08_nanum);
	}
	
	public static void TailPrint() { //���� ������ ��� ��� �޼��� ����
		double k08_nanum = (double)k08_nu;//���� �ο��� ��������ȯ
		k08_nukor += k08_sumkor; // �������� ����� ���հ� ����
		k08_nueng += k08_sumeng; // �������� ����� ���հ� ����
		k08_numat += k08_summat; // �������� ���м��� ���հ� ����
		k08_nusum += k08_sumsum; // �������� ���հ� ����
		k08_nuave += k08_sumave; // �������� ����� ����
		
		System.out.printf("----------------------------------------------------\n");//���м� ���
		System.out.printf("����������\n");//���ڿ� ���
		System.out.printf("�հ�%18d%7d%7d%7d%8.1f\n",//���� ������ �հ� ���  
				k08_nukor, k08_nueng, k08_numat, k08_nusum,  k08_nuave);
		System.out.printf("���%18.1f%7.1f%7.1f%7.1f%8.1f\n\n\n", //���� ������ ��� ���
				k08_nukor / k08_nanum, k08_nueng / k08_nanum, k08_numat / k08_nanum, k08_nusum / k08_nanum,  k08_nuave / k08_nanum);

	}
	
	public static void dataSort() {//������ ���� �޼��� ����
		Comparator<OneRec1> k08_comp = new Comparator<OneRec1>() {
			public int compare(OneRec1 a1, OneRec1 a2) {
				
				return (a2.sum() - a1.sum());
			}
		};
		Collections.sort(k08_ArrayOneRec, k08_comp);
	}
}
