package Lecture06;
//20210427 ������ ����������(1)
public class P06_4 {
	int k08_limit_up_floor = 10; // ���������� �ִ��� ����
	int k08_limit_down_floor = 0;// ���������� ������ ����
	int k08_floor = 1;//��Ƽ��Ÿ�� �������� ���� �� 1 ����
	String k08_help;//��Ʈ��Ÿ�� �������� ����
	
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
