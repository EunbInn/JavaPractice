package Lecture06;

public class P06_1 {

	public static void k08_iamMethod() {//�ƹ� ���� �������� �ʴ� �ۺ� ����ƽ �żҵ� ����
		System.out.printf("Call me method~~\n");//���ڿ� ���
	}
	public static void main(String[] args) {//���� ����
		P06_1.k08_iamMethod();//Ŭ������.�޼�������� �޼��� ȣ��
		
		k08_iamMethod();//�� Ŭ���� ���� ����ƽ �޼���� �ٷ� ���ο� ȣ�� ����

	}

}
