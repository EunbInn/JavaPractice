package Lecture06;
//20210427 ������ ������ Ŭ������� ����
public class TvRemoconX extends TvRemocon {//TvRemocon Ŭ���� ��ӹ޾� ���
	int k08_battery = 100;//battery ��Ƽ�� ���� �� ���ǰ� ����
	void k08_CheckBattery() {//���ο� �ż��� ����
		k08_help = String.format("���͸��� %d%%���ҽ��ϴ�", k08_battery);//���͸� �ܷ� ��Ʈ���� ����
		k08_battery--;//���͸����� -1
	}
}
