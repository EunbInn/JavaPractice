package Lecture07;

import java.util.ArrayList;

public class P07_9 {
	static ArrayList<OneRec1> k08_ArrayOneRec = new ArrayList<OneRec1>(); //Ŭ������ ��̸���Ʈ ���� �� ����
	
	static int k08_sumkor = 0;//�������� �հ� ����ƽ ��Ƽ�� Ÿ������ ���� �� �ʱ�ȭ
	static int k08_sumeng = 0;//�������� �հ� ����ƽ ��Ƽ�� Ÿ������ ���� �� �ʱ�ȭ
	static int k08_summat = 0;//�������� �հ� ����ƽ ��Ƽ�� Ÿ������ ���� �� �ʱ�ȭ
	static int k08_sumsum = 0;//���հ����� ����ƽ ��Ƽ�� Ÿ������ ���� �� �ʱ�ȭ
	static int k08_sumave = 0;//����� ���� ����ƽ ��Ƽ�� Ÿ������ ���� �� �ʱ�ȭ
	static final int k08_iPerson = 20; // �ο��� ���� ���ȭ
	
	public static void main(String[] args) { //���ο��� ����
		dataSet();//������ �� �޼��� ȣ��
		HeaderPrint();//��� ���
		for (int k08_i = 0; k08_i < k08_ArrayOneRec.size(); k08_i++) {//Ŭ���� ����� �����ŭ �ݺ��� ����
			ItemPrint(k08_i);//i������ ���ڷ� �޾� �δ� ���� ���
		}
		TailPrint();//������ �κ�(���, �հ�) ���
	}
	
	public static void dataSet() {//�����͸� �ִ� �޼��� ����
		for (int k08_i = 1; k08_i <= k08_iPerson; k08_i++) {//���� iPerson����ŭ �ݺ��� ����
			String k08_name = String.format("����%02d", k08_i);//��Ʈ�� ���� �ѱ�2�� + ����2�ڸ����Ͽ� ����
			int k08_kor = (int)(Math.random() * 100);//�����Լ� ��Ƽ���� ��ȯ�Ͽ� ���� ����
			int k08_eng = (int)(Math.random() * 100);//�����Լ� ��Ƽ���� ��ȯ�Ͽ� ���� ����
			int k08_mat = (int)(Math.random() * 100);//�����Լ� ��Ƽ���� ��ȯ�Ͽ� ���� ����
			k08_ArrayOneRec.add(new OneRec1(k08_i, k08_name, k08_kor, k08_eng, k08_mat));//inputData Ŭ������ SetData �޼��� ȣ�� �� ���� �Է�
		}
	}
	
	public static void HeaderPrint() {//��� ��� �޼��� ����
		System.out.printf("=========================================\n");//���м� ���
		System.out.printf("%2s  %4s  %2s %2s %2s %2s  %2s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");//��� ���
		System.out.printf("=========================================\n");//���м� ���
	}
	
	public static void ItemPrint(int k08_i) {//���� ��� �޼��� ����
		OneRec1 k08_rec;//Ŭ���� ������Ʈ ����
		k08_rec = k08_ArrayOneRec.get(k08_i); //���� i��°�� ���� Ŭ���� ��ü�� ����
		System.out.printf("%4d   %4s  %3d %3d %3d   %3d %6.2f\n",//��� ���� ����
				k08_rec.student_id(), k08_rec.name(), k08_rec.kor(), k08_rec.eng(), k08_rec.mat(), k08_rec.sum(), k08_rec.ave());
		
		k08_sumkor += k08_rec.kor();//�������� ����
		k08_sumeng += k08_rec.eng();//�������� ����
		k08_summat += k08_rec.mat();//�������� ����
		k08_sumsum += k08_rec.sum();//���հ� ����
		k08_sumave += k08_rec.ave();//��� ����
	}
	
	public static void TailPrint() {
		double k08_nanum = (double)k08_ArrayOneRec.size();//��� ����� ��������ȯ
		System.out.printf("*****************************************\n");//���м� ���
		System.out.printf("�����հ� %d   �������: %6.2f\n", k08_sumkor, k08_sumkor / k08_nanum); // ���� �հ�� ��� ���
		System.out.printf("�����հ� %d   �������: %6.2f\n", k08_sumeng, k08_sumeng / k08_nanum);// ���� �հ�� ��� ���
		System.out.printf("�����հ� %d   �������: %6.2f\n", k08_summat, k08_summat / k08_nanum);// ���� �հ�� ��� ���
		System.out.printf("*****************************************\n");//���м� ���
		System.out.printf("������հ� %d   �����: %6.2f\n", k08_sumave, k08_sumave / k08_nanum);// ���հ�� ����� ���
	}

}
