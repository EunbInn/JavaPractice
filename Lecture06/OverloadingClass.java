package Lecture06;
//20210427 ������ �޼��� �����ε� ����
public class OverloadingClass {
	//��� �� �Ȱ��� �̸��� �޼���� �����ϴ� ���� �� �޼����� ���ڰ� �ٸ��� �˾Ƽ� �ش��ϴ� �޼��带 ȣ���Ͽ� ��밡��
	//�̷� ����� method overloading�̶�� �Ѵ�
	public int k08_sum(int k08_a, int k08_b) {//�ΰ��� ��Ƽ���� ���ڷ� �޴� �޼��� ����
		return k08_a + k08_b;//�� ���ڸ� ���� �� ����
	}
	
	public int k08_sum(int k08_a, int k08_b, int k08_c) {//������ ��Ƽ���� ���ڷ� �޴� �޼��� ����
		return k08_a + k08_b + k08_c;//�� ���ڸ� ���� �� ����
	}
	
	public int k08_sum(int k08_a, int k08_b, int k08_c, int k08_d) {//�װ��� ��Ƽ���� ���ڷ� �޴� �޼��� ����
		return k08_a + k08_b + k08_c + k08_d;//�� ���ڸ� ���� �� ����
	}
	
	public double k08_sum(double k08_a, double k08_b) {//�ΰ��� �������� ���ڷ� �޴� �޼��� ����
		return k08_a + k08_b;//�� ���ڸ� ���� �� ����
	}
}
