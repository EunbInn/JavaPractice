package Lecture06;

public class P06_10 {
//20210427 ������ ���������� ���Ŭ���� �̿�_����
	public static void main(String[] args) {
		Elevator3 k08_elev3;//Ŭ���� ��ü����
		
		k08_elev3 = new Elevator3();//��ü����
		for (int i = 0; i < 10; i++) {//0~9���� �ݺ��� ����
			k08_elev3.k08_up();//�� �޼��� ȣ���Ͽ� ����
			System.out.printf("MSG elev3[%s]\n", k08_elev3.k08_help);//��Ʈ�� helpȣ���Ͽ� ���
		}
		
		for (int i = 0; i < 10; i++) {//0~9���� �ݺ��� ����
			k08_elev3.k08_down();//�ٿ� �޼��� ȣ���Ͽ� ����
			System.out.printf("MSG elev3[%s]\n", k08_elev3.k08_help);//��Ʈ�� helpȣ���Ͽ� ���
		}
		
		k08_elev3.k08_Repair();//����� �޼��� ȣ��
		System.out.printf("MSG elev3[%s]\n", k08_elev3.k08_help);//��Ʈ�� helpȣ���Ͽ� ���
		
	}

}
