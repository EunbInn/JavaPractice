package Lecture06;

public class P06_6 {

	public static void main(String[] args) {
		//20210427 ������ �޼��� �����ε� ����_����
		OverloadingClass k08_oc = new OverloadingClass();//�����ε� �޼��带 �����ص� Ŭ���� ��ü����
		
		System.out.printf("2���� ������ ȣ��� [%d]\n", k08_oc.k08_sum(1, 2));//ù��° �޼��� ȣ�� - ��Ƽ���� ���� 2
		System.out.printf("3���� ������ ȣ��� [%d]\n", k08_oc.k08_sum(1, 2, 3));//�ι�° �޼��� ȣ�� - ��Ƽ���� ���� 3
		System.out.printf("4���� ������ ȣ��� [%d]\n", k08_oc.k08_sum(1, 2, 3, 4));//����° �޼��� ȣ�� - ��Ƽ���� ���� 4
		System.out.printf("������ ������ ȣ��� [%f]\n", k08_oc.k08_sum(1.3, 2.4));//�׹�° �޼��� ȣ�� - ������ ���� 2

	}

}
