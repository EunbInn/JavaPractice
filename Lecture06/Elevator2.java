package Lecture06;
//20210427 ������ ���������� ������
public class Elevator2 {
	int k08_limit_up_floor; // ���������� �ִ���
	int k08_limit_down_floor;// ���������� ������
	int k08_floor;//��Ƽ��Ÿ�� �������� ����
	String k08_help;//��Ʈ��Ÿ�� �������� ����
	
	Elevator2() {//���ڸ� ���� �ʴ� ������ ����
		k08_limit_up_floor = 10; // �ִ��� ����
		k08_limit_down_floor = 0;// ������ ����
		k08_floor = 1;//������ ����
		System.out.printf("���������� �ذ��Ϸ�\n"); // �ش� ���ڿ� ���
	}
	
	Elevator2(int k08_a) { //��Ƽ��Ÿ�� ���ڸ� �޴� ������ ����
		k08_limit_up_floor = 10; // �ִ��� ����
		k08_limit_down_floor = 0;// ������ ����
		k08_floor = 1;//������ ����
		System.out.printf("���������� �ذ��Ϸ�[%d]\n", k08_a);//���ڰ��� �Բ� ���ڿ� ���
		
		if (k08_a > 0) {//���� a�� 0���� ũ��
			for (int k08_i = 0; k08_i < k08_a; k08_i++) {//a��ŭ �ݺ��� ����
				this.k08_up();//�� Ŭ���� �� up�żҵ� ȣ��
			}
		} else if (k08_a < 0) {//0���� ������
			for (int k08_i = 0; k08_i < (k08_a * -1); k08_i++) {//a �� -1�� ���Ѱ� ��ŭ �ݺ��� ����
				this.k08_down();//�� Ŭ���� �� down�żҵ� ȣ��
			}
		}
	}
	
	void k08_up() {//�� �ö󰡴� �ż��� ����
		if (k08_floor == k08_limit_up_floor) {//floor�� ���� �ִ��� �������� ���� ��
			k08_help = "������ ���Դϴ�";//��Ʈ�� help�� �ش� ���ڿ� ����
		} else {//�ƴ϶��
			k08_floor++;//floor�� �� + 1
			k08_help = String.format("%d���Դϴ�", k08_floor);//��Ʈ�� help�� �ش� ���ڿ� ����
		}
	}
	
	void k08_down() {//�� �������� �ż��� ����
		if (k08_floor == k08_limit_down_floor) {//floor�� ���� ������ �������� ���� ��
			k08_help = "ó�� ���Դϴ�";//��Ʈ�� help�� �ش� ���ڿ� ����
		} else {//�ƴ϶��
			k08_floor--;//floor�� �� - 1
			k08_help = String.format("%d���Դϴ�", k08_floor);//��Ʈ�� help�� �ش� ���ڿ� ����
		}
	}
}
