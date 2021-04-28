package Lecture06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportSheet2 {
//20210428 ������ ����ǥ ���(2)
	public static void main(String[] args) {
		int k08_iPerson = 45;//�ο��� ��Ƽ�� ���� ���� �� ����
		Date k08_date = new Date();//��¥ ��ü ����
		SimpleDateFormat k08_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//��¥ ���� ����
		
		InputData k08_inData = new InputData(k08_iPerson);//Ŭ���� ��ü �����ϸ� ������ �� �Է�
		
		for (int k08_i = 1; k08_i <= k08_iPerson; k08_i++) {//���� iPerson����ŭ �ݺ��� ����
			String k08_name = String.format("����%02d", k08_i);//��Ʈ�� ���� �ѱ�2�� + ����2�ڸ����Ͽ� ����
			int k08_kor = (int)(Math.random() * 100);//�����Լ� ��Ƽ���� ��ȯ�Ͽ� ���� ����
			int k08_eng = (int)(Math.random() * 100);//�����Լ� ��Ƽ���� ��ȯ�Ͽ� ���� ����
			int k08_mat = (int)(Math.random() * 100);//�����Լ� ��Ƽ���� ��ȯ�Ͽ� ���� ����
			k08_inData.SetData(k08_i - 1, k08_name, k08_kor, k08_eng, k08_mat);//inputData Ŭ������ SetData �޼��� ȣ�� �� ���� �Է�
		}
		
		System.out.printf("                  ��������ǥ\n\n");//��������ǥ ���� ���
		System.out.printf("                       ������� : %s\n", k08_sdf.format(k08_date));//������� ���
		System.out.printf("=====================================================\n");//���м� ���
		System.out.printf("��ȣ     �̸�     ����   ����   ����   ����    ���\n");//��� ���
		System.out.printf("=====================================================\n");//���м� ���
		for (int k08_i = 0; k08_i < k08_iPerson; k08_i++) {//iPerson����ŭ �ݺ��� ����
			System.out.printf("%03d   %7s%7d%7d%7d%7d%7.1f\n",//��� ���� ����
					k08_i + 1, k08_inData.k08_name[k08_i], k08_inData.k08_kor[k08_i], //inputDataŬ������ �迭���� ȣ���Ͽ� ��� 
					k08_inData.k08_eng[k08_i], k08_inData.k08_mat[k08_i],
					k08_inData.k08_sum[k08_i], k08_inData.k08_ave[k08_i]);
		}
		
		System.out.printf("=====================================================\n");//���м�
		k08_inData.sumAll();//�հ豸�ϴ� �޼��� ȣ��
		k08_inData.aveAll();//��ձ��ϴ� �޼��� ȣ��
		System.out.printf("�հ�%18d%7d%7d%7d%7.1f\n",  //��� ���� ���� �� ���� ȣ���Ͽ� ���
				k08_inData.k08_sumKor, k08_inData.k08_sumEng,  k08_inData.k08_sumMat,  k08_inData.k08_sumAll,  k08_inData.k08_sumAve);
		System.out.printf("���%18.1f%7.1f%7.1f%7.1f%7.1f\n",  //��� ���� ���� �� ���� ȣ���Ͽ� ���
				k08_inData.k08_aveKor,  k08_inData.k08_aveEng,  k08_inData.k08_aveMat, k08_inData.k08_aveAll, k08_inData.k08_aveAve);
	}

}
