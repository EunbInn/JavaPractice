package Lecture06;

public class P06_8 {
//20210427 ������ ���������� ������_����
	public static void main(String[] args) {
		Elevator2 k08_elev;//P06_4 Ŭ���� ��ü ����
		
		k08_elev = new Elevator2();//Ŭ���� ��ü ���� : ������ ���� ����
		
		for (int i = 0; i < 10; i++) {
			k08_elev.k08_up();//Elevator2 Ŭ������ up�޼��� ȣ��
			
			System.out.printf("MSG[%s]\n", k08_elev.k08_help);//Elevator2 Ŭ������ ��Ʈ�� help ȣ��
			
		}
		
		for (int k08_i = 0; k08_i < 10; k08_i++) {//0~9���� �ݺ��� ����
			k08_elev.k08_down();//Elevator2 Ŭ������ down�޼��� ȣ��
			
			System.out.printf("MSG[%s]\n", k08_elev.k08_help);//Elevator2 Ŭ������ ��Ʈ�� help ȣ��
		}
		
		Elevator2 k08_elevUP = new Elevator2(5);//Ŭ���� ��ü ���� : ������ ���� ����
		System.out.printf("MSG[%s]\n", k08_elevUP.k08_help);//Elevator2 Ŭ������ ��Ʈ�� help ȣ��
		
		Elevator2 k08_elevDN = new Elevator2(-5);//Ŭ���� ��ü ���� : ������ ���� ����
		System.out.printf("MSG[%s]\n", k08_elevDN.k08_help);//P06_4 Ŭ������ ��Ʈ�� help ȣ��

	}

}
