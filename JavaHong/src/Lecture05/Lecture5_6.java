package JavaLecture5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lecture5_6 {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		String[] itemName = {"���� ��ī�ٹ̾� ���ڿ���","���� ��ġ����","���־� �Ҹ�â����","��ũ���ڸ��鷻 500g","�︳ ������ ��� �Ļ�",
				"�Ĺ����� �ٵ���� �󺥴� 200ml","������ ���������� ���ʿ� 500ml","����Ĩ �����򷯽���","��ī�ݶ� �����ݶ� 330ml","�Ͼᳪ�� ����������(�׸�) 30��",
				"","","","","","","","","","","","","","","","","","","","","",""};
		int[] itemPrice = {1200,4000,7300,5600,3000,
				7250,8000,1500,1200,21000,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] itemNum = {1,4,3,1,1,
				1,2,3,2,1,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		boolean[] TaxFree = {true,true,false,true,false,true,false,true,true,true,
				true,true,false,true,true,true,true,true,true,true,
				true,true,false,true,true,true,true,true,true,true,true,false};
		
		System.out.printf("                   �̸�Ʈ ������ (031)888-1234\n");
		System.out.printf("       emart       206-86-50913 ����\n");
		System.out.printf("                   ���� ������ ������� 552\n");
		System.out.printf("\n������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		
		System.out.printf("\n[����]%15.20s%26.20s\n", sdf.format(cal.getTime()), "POS:0011-9861");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("  ��ǰ��            �ܰ�      ����         �ݾ�\n");
		System.out.printf("------------------------------------------------\n");
		for (int i = 0; i < itemName.length; i++) {
			String taxCheck = "";
			if (TaxFree[i] == false) {
				taxCheck = "* " + itemName[i];
			} else {
				taxCheck = "  " + itemName[i];
			}
			System.out.printf("%s%10.12s%5.5s%10.12s\n",strForm(taxCheck, 14), df.format(itemPrice[i]), itemNum[i] + "", df.format(itemPrice[i] * itemNum[i]));
			if ((i + 1) % 5 == 0) {
				System.out.printf("------------------------------------------------\n");
			}
		}
		System.out.printf("------------------------------------------------\n");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("------------------------------------------------\n");

	}
	
	public static String strForm(String k08_temp, int k08_length) {
		
		if (k08_temp.length() > k08_length) {
			k08_temp = k08_temp.substring(0,k08_length);
			
			}
		
		int k08_blank = 24 - k08_temp.getBytes().length;

		for (int i = 0; i < k08_blank; i++) {
			k08_temp = k08_temp + " ";
		}
		
		return k08_temp;
	}
}


