package Lecture06;

public class P06_7 {
//20210427 ������ �����ε� ����2_����
	public static void main(String[] args) {
		Overloading2 k08_ov = new Overloading2();//�����ε��޼ҵ� Ŭ���� ��ü ����
		int k08_kor = 100;//��Ƽ�� Ÿ�� ���� ���� �� �� ����
		int k08_eng = 100;//��Ƽ�� Ÿ�� ���� ���� �� �� ����
		int k08_mat = 100;//��Ƽ�� Ÿ�� ���� ���� �� �� ����
		int k08_sci = 100;//��Ƽ�� Ÿ�� ���� ���� �� �� ����
		int k08_soc = 100;//��Ƽ�� Ÿ�� ���� ���� �� �� ����
		
		System.out.printf("3�� ����ǥ\n");//3�� ����ǥ ���� ���
		System.out.printf("====================================================\n");//���м� ���
		System.out.printf("�̸�    ����   ����  ����  ����  ���\n");//��� ���
		System.out.printf("====================================================\n");//���м� ���
		System.out.printf("������  %d    %d   %d   %d   %d\n", //������ ������ �����ε����� ȣ���� ��, ��� ���
				k08_kor, k08_eng, k08_mat, k08_ov.k08_sum(k08_kor, k08_eng, k08_mat), k08_ov.k08_ave(k08_kor, k08_eng, k08_mat));
		
		System.out.printf("\n4�� ����ǥ\n");//4�� ����ǥ ���� ���
		System.out.printf("====================================================\n");//���м� ���
		System.out.printf("�̸�    ����   ����  ����   ����  ����   ���\n");//��� ���
		System.out.printf("====================================================\n");//���м� ���
		System.out.printf("������  %d    %d   %d   %d    %d   %.1f\n", //�װ��� ������ �����ε����� ȣ���� ��, ��� ���
				k08_kor, k08_eng, k08_mat, k08_sci, k08_ov.k08_sum(k08_kor, k08_eng, k08_mat, k08_sci),
				k08_ov.k08_ave(k08_kor, k08_eng, k08_mat, k08_sci));
		
		System.out.printf("\n5�� ����ǥ\n");//5�� ����ǥ ���� ���
		System.out.printf("====================================================\n");//���м� ���
		System.out.printf("�̸�    ����   ����  ����   ����  ��ȸ  ����   ���\n");//��� ���
		System.out.printf("====================================================\n");//���м� ���
		System.out.printf("������  %d    %d   %d    %d   %d   %d   %.1f\n",//�ټ����� ������ �����ε����� ȣ���� ��, ��� ���
				k08_kor, k08_eng, k08_mat, k08_sci, k08_soc, k08_ov.k08_sum(k08_kor, k08_eng, k08_mat, k08_sci, k08_soc), 
				k08_ov.k08_ave(k08_kor, k08_eng, k08_mat, k08_sci, k08_soc));

	}

}
