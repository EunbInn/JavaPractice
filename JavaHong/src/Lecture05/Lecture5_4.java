package Lecture05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

//20210412 ������ ������ ���
public class Lecture5_4 {//Ŭ���� ����

	public static void main(String[] args) {//���ο��� ����
		DecimalFormat k08_df = new DecimalFormat("###,###,###");//decimal format���� ���� ���� ����(�޸����)
		Calendar k08_cal = Calendar.getInstance();//�ý��� ��¥�� �̿��ϱ� ���� calendar.getInstance() ���
		SimpleDateFormat k08_sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // ��¥ ������ �������� ���� ���˰� ��ġ��Ű��
		
		Scanner k08_sc = new Scanner(System.in);//������ �Է¹��� ��ĳ�� ������Ʈ ����

		int k08_iTax, k08_iOrigin; //���ݰ� ���� ������ ������ ���� Ÿ�� ���� �� ����
		int k08_iPrice = k08_sc.nextInt();//������ integer type���� �Է¹���
		// price = origin(1 + 0.1)
		// tax = price - origin
		// origin = price / 1.1
		k08_iOrigin = (int) (k08_iPrice / 1.1);
		//tax�� ��� ������ 10%�� ����ϴµ�, 10%�� ���� �Ҽ��� ���� �ڸ��� ���� ���(���������� ��ȯ�� ���� ��)�� �ƴ� ��� ����� �޸��Ѵ�
		//tax�� �Ҽ��� �Ʒ� ���� ������� �ʰ� +1�� �ø��Ͽ� ����.
		if ((k08_iOrigin * 0.1) > (int) (k08_iOrigin * 0.1)) {
			k08_iTax = (int) (k08_iOrigin * 0.1) + 1;//�Ҽ��� ���� �ڸ��� ���� ��� ������ 10% ���Ͽ� ������ ��ȯ�� ���� + 1
		} else {
			k08_iTax = (int) (k08_iOrigin * 0.1);//�Ҽ��� ���� �ڸ��� ���� ��� ������ 10%���� ���� ���������� ��ȯ
		}


		System.out.printf("�ſ����\n");//������ �ֻ�� ���� ���
		System.out.printf("%s%25.20s\n", "�ܸ��� : 2N68665898", "��ǥ��ȣ : 041218");//��� �ܸ��� ��ȣ�� ��ǥ��ȣ ���
		System.out.printf("������ : �Ѿ��ġ�\n");//���Ը� ���
		System.out.printf("%.35s\n%s\n", "�� �� : ��� ������ �д籸 Ȳ����� 351���� 10 ,", "1��");//���� �ּ� ���
		System.out.printf("��ǥ�� : ��â��\n");//���� ��ǥ�� ���
		System.out.printf("%s%28.20s\n", "����� : 752-53-00558", "TEL : 7055695");//����ڹ�ȣ �� ���� ��ȭ��ȣ ���
		System.out.printf("-------------------------------------------------\n");//���м� ���
		System.out.printf("%s%16.20s ��\n",k08_blank("��    ��",15), k08_df.format(k08_iOrigin));//�̸� �����ص� �������� ���� ���
		System.out.printf("%s%16.20s ��\n",k08_blank("�� �� ��", 15), k08_df.format(k08_iTax));//�̸� �����ص� �������� ���� ���
		System.out.printf("%s%16.20s ��\n",k08_blank("��    ��", 15), k08_df.format(k08_iPrice));//�̸� �����ص� �������� �Ѿ� ���(�Է¹��� �ݾ�)
		System.out.printf("-------------------------------------------------\n");//���м� ���
		System.out.printf("�츮ī��\n");//�̿� ī�� ���
		System.out.printf("%s%13.11s\n", "ī���ȣ : 5387-20**-****-4613(S)", "�Ͻú�");//ī���ȣ �� ���� ��� ���
		System.out.printf("�ŷ��Ͻ� : %s\n", k08_sdf.format(k08_cal.getTime()));//�̸������ص� ��¥ Ÿ������ ��ȯ�Ͽ� �ŷ��Ͻ� �ý��� ��¥�� ���
		System.out.printf("���ι�ȣ : 70404427\n");//���� ���ι�ȣ ���
		System.out.printf("�ŷ���ȣ : 357734873739\n");//���� �ŷ� ��ȣ ���
		System.out.printf("%s%22s\n", "���� : ��ī���", "���� : 720068568");//���� ó�� ī���� �� ������ ��ȣ ���
		System.out.printf("�˸� : EDC����ǥ\n");//�˸� ���
		System.out.printf("���� : TEL)1544-4700\n");//���� ��ȣ ���
		System.out.printf("-------------------------------------------------\n");//���м� ���
		System.out.printf("%26s\n", "* �����մϴ� *");//������ ���
		System.out.printf("%47s\n", "ǥ��v2.08_20200212");

	}
	
	public static String k08_blank(String k08_temp, int k08_length) {//��Ʈ�� Ÿ�԰� ��Ƽ�� Ÿ���� ���ڷ� �ް� ��Ʈ�� Ÿ���� �����ϴ� �޼��� ����
		if (k08_temp.length() > k08_length) { // ���� ��ü�� ���̰� ���ڷ� ���� ���̺��� Ŭ ��
			k08_temp = k08_temp.substring(0,k08_length); // 0-���� ��ŭ ���꽺Ʈ������ �ڸ���
			
			}
		
		int k08_blank = (k08_length * 2) - k08_temp.getBytes().length;//���ڷι��� ����*2 - ����Ʈ���̷� ����� ���� ���� ����
			

		for (int i = 0; i < k08_blank; i++) { //0~������̸�ŭ �ݺ��� ����
			k08_temp = k08_temp + " ";//���������� ���� �ձ�
		}
		
		return k08_temp; //����� ����
	}

}