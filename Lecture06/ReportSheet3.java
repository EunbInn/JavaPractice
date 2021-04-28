package Lecture06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportSheet3 {
//20210428 ������ ��������ǥ ���(3)
	public static void main(String[] args) {
		int iRealPerson = 200;//��¥ �ο��� ��Ƽ�� ������ ����
		int k08_iPerson = 45;//�������� �ο��� ��Ƽ�������� ����
		Date date;//����Ʈ ��ü ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//��¥ ���� ����
		InputData k08_inData = new InputData(k08_iPerson);//Ŭ���� ��ü �����ϸ鼭 ������ �� �Է�

		int pageCnt = 0;//������ ī��Ʈ ��Ƽ���� ���� �� �ʱ�ȭ
		int number = 0;//�ѹ� ��Ƽ���� ���� �� �ʱ�ȭ
		int cnt = 0;//ī��Ʈ ��Ƽ���� ���� �� �ʱ�ȭ
		for (int k08_i = 1; k08_i <= iRealPerson; k08_i++) {//ū ������ 1���� ��¥ �ο�����ŭ �ݺ��� ����
			String k08_name = String.format("����%03d", k08_i);//�ѱ� 2���� + ���� 3�ڸ� �������� ��Ʈ���� ����
			int k08_kor = (int) (Math.random() * 100);//�����Լ��� ���� ���� ���Ͽ� ��Ƽ���� ����
			int k08_eng = (int) (Math.random() * 100);//�����Լ��� ���� ���� ���Ͽ� ��Ƽ���� ����
			int k08_mat = (int) (Math.random() * 100);//�����Լ��� ���� ���� ���Ͽ� ��Ƽ���� ����
			k08_inData.SetData(cnt, k08_name, k08_kor, k08_eng, k08_mat);//inputData Ŭ������ SetData�޼��� ȣ�� �� ���� �Է�
			cnt++;//ī��Ʈ + 1
			if (cnt % k08_iPerson == 0) {//cnt���� ���� �������� �ο����� ���� �������� 0�϶�,
				pageCnt++;//������ ī��Ʈ + 1
				date = new Date();//����Ʈ ��ü ����
				System.out.printf("                    ��������ǥ\n\n");//���� ����ǥ ���� ���
				System.out.printf("PAGE: %d               ������� : %s\n", pageCnt, sdf.format(date));//���������� ���� ���
				System.out.printf("=====================================================\n");//���м� ���
				System.out.printf("��ȣ     �̸�     ����   ����   ����   ����    ���\n");//��� ���
				System.out.printf("=====================================================\n");//���м� ���
				
				for (int k08_j = 0; k08_j< k08_iPerson; k08_j++) {//���� ������ 0���� �������� �ο��� ��ŭ �ݺ��� ����
					number++;//�ѹ� �� + 1
					System.out.printf("%03d   %7s%7d%7d%7d%7d%8.1f\n", number, k08_inData.k08_name[k08_j],
							k08_inData.k08_kor[k08_j], k08_inData.k08_eng[k08_j], k08_inData.k08_mat[k08_j],
							k08_inData.k08_sum[k08_j], k08_inData.k08_ave[k08_j]);	//���� �����Ͽ� Ŭ�������� ȣ���� �迭�� ���
				}
				
				System.out.printf("=====================================================\n");//���м� ���
				k08_inData.sumAll();//������ �հ� �޼��� ȣ��
				k08_inData.aveAll();//������ ��� �޼��� ȣ��
				System.out.printf("����������\n");//���ڿ� ���
				System.out.printf("�հ�%18d%7d%7d%7d%8.1f\n", //��հ��� �������̹Ƿ� %f�������� ���  
						k08_inData.k08_sumKor, k08_inData.k08_sumEng,  k08_inData.k08_sumMat,  k08_inData.k08_sumAll,  k08_inData.k08_sumAve);
				System.out.printf("���%18.1f%7.1f%7.1f%7.1f%8.1f\n",  //��� %f�������� ���
						k08_inData.k08_aveKor,  k08_inData.k08_aveEng,  k08_inData.k08_aveMat, k08_inData.k08_aveAll, k08_inData.k08_aveAve);
				
				System.out.printf("-----------------------------------------------------\n");//���м� ���
				k08_inData.addAll();//���� �հ� �޼��� ȣ��
				k08_inData.addAve(number);//���� ��� �޼��� ȣ��
				System.out.printf("����������\n");//���ڿ� ���
				System.out.printf("�հ�%18d%7d%7d%7d%8.1f\n",//���� ������ �հ� ���  
						k08_inData.k08_addKor, k08_inData.k08_addEng, k08_inData.k08_addMat, k08_inData.k08_addAll,  k08_inData.k08_addAve);
				System.out.printf("���%18.1f%7.1f%7.1f%7.1f%8.1f\n\n\n", //���� ������ ��� ���
						k08_inData.k08_addAveKor, k08_inData.k08_addAveEng, k08_inData.k08_addAveMat, 
						k08_inData.k08_addAveAll, k08_inData.k08_addAveAve);
				
				if ((iRealPerson - number) >= k08_iPerson) {// ���� ��ü �ο������� ���ݱ��� ó���� �ο����� �� ���� ������ ������� �ο������� ũ�ų� ���� ���
					k08_inData.Reset(k08_iPerson);//������ ������� �ο����� ���� ���ڷ� �־� ��갪(�迭, ������ �հ�, ��հ� ��) ����
				} else {//�ƴ϶��
					k08_iPerson = iRealPerson - number;//��ü �ο������� ���ݱ��� ó���� �ο����� �� ������ ������� �ο��� �缳��
					k08_inData.Reset(k08_iPerson);//������ ������� �ο����� ���� ���ڷ� �־� ��갪(�迭, ������ �հ�, ��հ� ��) ����
				}
				cnt = 0;//ī��Ʈ �ʱ�ȭ
			}
			
		}

		
	}

}
