package Lecture06;

public class Elevator3 extends Elevator2 {//extends�̿��Ͽ� elevator2Ŭ���� ��ӹ޾� �̿�
	//20210427 ������ ���������� ���Ŭ���� �̿�
	void k08_Repair() {//���ο� �ż��� ����
		k08_help = String.format("�������Դϴ�");//�ش� ������ ���ڿ� ���� : elevator2Ŭ������ ��ӹ޾� Ÿ�Լ��� ���ص� ��
	}
	
	void k08_up() { //up �ż��� ����
		if (k08_floor >= k08_limit_up_floor) {//�ֻ����Ͻ�
			k08_help = "������ ���Դϴ�";//help�� �ش� ���ڿ� ����
		} else {
			k08_floor = k08_floor + 2; //�ֻ����� �ƴ� �� 2���� �ö�
			k08_help = String.format("%d���Դϴ�", k08_floor);//help�� �ش� ���ڿ� ����
		}
		
		this.k08_down();//down �޼��� ȣ���Ͽ� 1ĭ ������
	}
	
	void k08_down() {//���������� �ٿ�
		super.k08_down();//��ӹ��� Ŭ������ down�� ȣ���Ͽ� ����
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.k08_help);//help ���
	}
}
