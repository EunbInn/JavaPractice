package Lecture06;
//20210427 ������ ����������(1)_����
public class P06_4Main {
	private static int k08_inVal;//integer type private �������� ����
	
	public static void k08_up() {//static �޼��� ����
		k08_inVal++;//�������� + 1
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k08_inVal);//���������� ���ڿ� ���
	}
	
	public static void main(String[] args) {//���� ����
		k08_inVal = 0;//���������� 0 ����
		P06_4 k08_elev;//P06_4 Ŭ���� ��ü ����
		
		k08_elev = new P06_4();//Ŭ���� ��ü ����
		
		k08_up();//�� Ŭ������ up�޼��� ȣ��
		
		for (int k08_i = 0; k08_i < 10; k08_i++) {//0~9���� �ݺ��� ����
			k08_elev.k08_up();//P06_4 Ŭ������ up�޼��� ȣ��
			
			System.out.printf("MSG[%s]\n", k08_elev.k08_help);//P06_4 Ŭ������ ��Ʈ�� help ȣ��
		}
		
		for (int k08_i = 0; k08_i < 10; k08_i++) {//0~9���� �ݺ��� ����
			k08_elev.k08_down();//P06_4 Ŭ������ down�޼��� ȣ��
			
			System.out.printf("MSG[%s]\n", k08_elev.k08_help);//P06_4 Ŭ������ ��Ʈ�� help ȣ��
		}

	}

}
