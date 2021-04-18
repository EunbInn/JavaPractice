package JavaLecture5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lecture5_5 { //Ŭ���� ����
	
	public static void main(String[] args) { //���ο��� ����
		DecimalFormat k08_df = new DecimalFormat("###,###,###"); // ���� �޸� ��� ��� ����
		Calendar k08_cal = Calendar.getInstance(); //��û ��� �ý��� ��¥�� �������� ���� Calendar.getInstance ���
		SimpleDateFormat k08_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); //���� ����Ʈ ������ �̿��� ������ ���� �־��� �Ͱ� ������ ��¥ ����� ����
		String k08_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)"; // ù��° ������ �̸� ��Ʈ������ ���� �� ������ ������ ����
		String k08_itemcode1 = "1031617";//ù��° �������ڵ带 ��Ʈ��Ÿ������ �����ϰ� ������ ������ ����
		int k08_price1 = 3000;// ù��° �������� ���� integer type ���� �� ������ ����
		int k08_amount1 = 1;//ù��° ������ integer type���� ���� �� ���� ������ ����

		String k08_itemname2 = "�극�� �ֱٱ� �Ŀ�ġ(Ȳ��)"; // �ι�° ������ �̸� ��Ʈ������ ���� �� ������ ������ ����
		String k08_itemcode2 = "1104042";//�ι�° �������ڵ� ��Ʈ��Ÿ������ �����ϰ� ������ ������ ����
		int k08_price2 = 1000;// �ι�° �������� ������ integer type���� ���� �� ������ ����
		int k08_amount2 = 1;//�ι�° ������ integer type���� ���� �� ���� ������ ����

		String k08_itemname3 = "���ɹ��� ưư�����۶�(330ml)"; // ����° ������ �̸� ��Ʈ������ ���� �� ������ ������ ����
		String k08_itemcode3 = "1811019";//����° �������ڵ带 ��Ʈ��Ÿ������ ����, ������ ������ ����
		int k08_price3 = 2000;// ����° �������� ���� integer type ���� �� ������ ����
		int k08_amount3 = 1;//����° ������ integer type ���� �� ������ ���� ������ ����
		
		int k08_sumPrice = k08_price1 + k08_price2 + k08_price3; // integer type�� ���� ���� �� ������ ������ ���� ����
		int k08_originPrice = (int) (k08_sumPrice / 1.1); //total price = original price + tax -> tp = orp + (orp * 0.1) -> orp = tp / 1.1
		int k08_taxPrice =  0; //tax���� ������ ������ integer type���� ���� �� 0���� ���� �� ����;
		
		//tax�� ��� ������ 10%�� ����ϴµ�, 10%�� ���� �Ҽ��� ���� �ڸ��� ���� ���(���������� ��ȯ�� ���� ��)�� �ƴ� ��� ����� �޸��Ѵ�
		//tax�� �Ҽ��� �Ʒ� ���� ������� �ʰ� +1�� �ø��Ͽ� �޴� ����̴�.
		if ((int) (k08_originPrice * 0.1) < (k08_originPrice * 0.1)) { 
			k08_taxPrice = (int) (k08_originPrice * 0.1) + 1;//�Ҽ��� ���� �ڸ��� ���� ��� ������ 10% ���Ͽ� ������ ��ȯ�� ���� + 1
		} else {
			k08_taxPrice = (int) (k08_originPrice * 0.1);//�Ҽ��� ���� �ڸ��� ���� ��� ������ 10%���� ���� ���������� ��ȯ
		}
		
		System.out.printf("\n                \"���ΰ��Դ��̼�\"\n"); //���� ���� �� ����κ� ��� ū����ǥ�� �������ø� ����Ͽ� ǥ��
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");//������ ���
		System.out.printf("��ȭ:031-702-6016\n");//��ȭ��ȣ ���
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");//���� �ּ� ���
		System.out.printf("��ǥ:������,��ȣ�� 213-81-52063\n");//��ǥ��� ����ڹ�ȣ ���
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (����\n��)\n");//�д������� �ּ� ���
		System.out.printf("================================================\n");//���м� ���
		System.out.printf("%26s\n%28s\n","�Һ����߽ɰ濵(CCM) �������","ISO 9001 ǰ���濵�ý��� �������"); //�Һ��� �߽ɰ濵�� ǰ���濵�ý��� ���� ���� ���
		System.out.printf("================================================\n");//���м� ���
		System.out.printf("         ��ȯ/ȯ�� 14��(04��26��)�̳�\n");//��ȯ, ȯ���� ���� �Ⱓ ���
		System.out.printf("(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n");//��ȯ ȯ�� ��� �ȳ� ���� ���
		System.out.printf("       ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n"); // ��ȯ ȯ�� �Ұ� ���� ���
		System.out.printf("         üũī�� ��� �� �ִ� 7�� �ҿ�\n"); //ī�� ��� ���� ���� ���
		System.out.printf("================================================\n");//���м� ���
		System.out.printf("[POS 1058231]%24s\n", k08_sdf.format(k08_cal.getTime()));//���� ��ȣ�� �̸� �����ص� ��¥ �������� ��¥ ���
		System.out.printf("================================================\n");//���м� ���
		//blank�޼��带 �̿��Ͽ� ������ �̸��� ���ϴ� ���ڼ���ŭ �ڸ��� ���� �ο�, decimal format �̿��Ͽ� �ܰ��� �� ����(�ܰ�*����)�� �޸� �����Ͽ� ���
		System.out.printf("%s%8.8s%4s%8s\n", k08_blank(k08_itemname1, 14), k08_df.format(k08_price1),
				k08_amount1 + "", k08_df.format(k08_price1 * k08_amount1));
		System.out.printf("[%s]\n", k08_itemcode1);//ù��° �������ڵ� ���
		//blank�޼��带 �̿��Ͽ� ������ �̸��� ���ϴ� ���ڼ���ŭ �ڸ��� ���� �ο�, decimal format �̿��Ͽ� �ܰ��� �� ����(�ܰ�*����)�� �޸� �����Ͽ� ���
		System.out.printf("%s%8.8s%4s%8s\n", k08_blank(k08_itemname2, 14), k08_df.format(k08_price2),
				k08_amount2 + "", k08_df.format(k08_price2 * k08_amount2));
		System.out.printf("[%s]\n", k08_itemcode2);//�ι�° �������ڵ� ���
		//blank�޼��带 �̿��Ͽ� ������ �̸��� ���ϴ� ���ڼ���ŭ �ڸ��� ���� �ο�, decimal format �̿��Ͽ� �ܰ��� �� ����(�ܰ�*����)�� �޸� �����Ͽ� ���
		System.out.printf("%s%8.8s%4s%8s\n", k08_blank(k08_itemname3, 14), k08_df.format(k08_price3),
				k08_amount3 + "", k08_df.format(k08_price3 * k08_amount3));
		System.out.printf("[%s]\n", k08_itemcode3);//����° �������ڵ� ���
		System.out.printf("================================================\n");//���м� ���
		System.out.printf("%s%20s\n",k08_blank2("�����հ�",15), k08_df.format(k08_originPrice));//���� ����������ִ� blank2�޼���� �����հ� ���� ����, ���� �հ� ���
		System.out.printf("%s%20s\n", k08_blank2("�ΰ���",15), k08_df.format(k08_taxPrice));//���� ����������ִ� blank2�޼���� �ΰ��� ���� ����, ���� �հ��� ���� ���
		System.out.printf("------------------------------------------------\n");//���м� ���
		System.out.printf("�Ǹ��հ�%40s\n", k08_df.format(k08_sumPrice));//������ ������������ ��ȯ�Ͽ� ���հ�ݾ� ���
		System.out.printf("================================================\n");//���м� ���
		System.out.printf("�ſ�ī��%40s\n", k08_df.format(k08_sumPrice));//�ſ�ī�� �����ݾ��� �Ǹ��հ�� ������ �ݾ����� ���
		System.out.printf("------------------------------------------------\n");//���м� ���
		System.out.printf("�츮ī��                        538720**********\n");//ī��� �� ī���ȣ ���
		System.out.printf("���ι�ȣ 77982843(0)%18s %s\n","���αݾ�",k08_df.format(k08_sumPrice));//���� ���� ��ȣ�� ���� �ݾ�(�Ǹ��հ�) ���
		System.out.printf("================================================\n");//���м� ���
		System.out.printf("%27s �д缭����\n", k08_sdf.format(k08_cal.getTime()));//������� �������� ���
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");//��ǰ �� ��Ÿ���� ��ȣ ���
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n\n");//����� �� ���̼� ���� ���� ��ȣ ���
		System.out.printf("               2112820610158231\n");//���ڵ� ��ȣ ���
		System.out.printf("------------------------------------------------\n");//���м� ���
		System.out.println(" �� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n   ȸ������ �� �پ��� ������ ����������! ��");//�귣�� Ȩ������ �� ���� ȫ���� ���
		

	}
	public static String k08_blank(String k08_temp, int k08_length) { //��Ʈ�� Ÿ�԰� ��Ƽ�� Ÿ���� ���ڷ� �ް� ��Ʈ�� Ÿ���� �����ϴ� �޼��� ����
		
		if (k08_temp.length() > k08_length) { // ���� ��ü�� ���̰� ���ڷ� ���� ���̺��� Ŭ ��
			k08_temp = k08_temp.substring(0,k08_length); // 0-���� ��ŭ ���꽺Ʈ������ �ڸ���
			
			}
		
		int k08_blank = (k08_length * 2) - k08_temp.getBytes().length;//���ڷι��� ����*2 - ����Ʈ���̷� ����� ���� ���� ����
			

		for (int i = 0; i < k08_blank; i++) { //0~������̸�ŭ �ݺ��� ����
			k08_temp = k08_temp + " ";//���������� ���� �ձ�
		}
		
		return k08_temp; //����� ����
	}
	
	public static String k08_blank2(String k08_temp, int k08_length) {//��Ʈ�� Ÿ�԰� ��Ƽ�� Ÿ���� ���ڷ� �ް� ��Ʈ�� Ÿ���� �����ϴ� �޼��� ����
		
		if (k08_temp.length() > k08_length) { // ���� ��ü�� ���̰� ���ڷ� ���� ���̺��� Ŭ ��
			k08_temp = k08_temp.substring(0,k08_length); // 0-���� ��ŭ ���꽺Ʈ������ �ڸ���
			
			}
		
		int k08_blank = (k08_length * 2) - k08_temp.getBytes().length;//���ڷι��� ����*2 - ����Ʈ���̷� ����� ���� ���� ����
			


		for (int i = 0; i < k08_blank; i++) {//0~������̸�ŭ �ݺ��� ����
			k08_temp = " " + k08_temp;//�������� ���� �ձ�
		}

		return k08_temp;//����� ����
	}
	
}
