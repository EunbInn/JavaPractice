package Lecture06;
//20210427 ������ ������ �޼��� Ŭ����
public class TvRemocon {
	int k08_volum_limit_up;//�ִ뺼�� ��Ƽ�� ����
	int k08_volum_limit_dn;//�ּҺ��� ��Ƽ�� ����
	int k08_volum;//��Ƽ������ ����
	String k08_help;//��Ʈ�� ����
	int k08_channel_limit_up;//�ִ�ä�� ��Ƽ�� ����
	int k08_channel_limit_dn;//�ּ� ä�� ��Ƽ�� ����
	int k08_channel;//��Ƽ������ ����
	final int k08_channelVal = 1;//ä�� ���� �� ����
	final int k08_volumVal = 2;//���� ���ð� ����
	
	public TvRemocon() {
		k08_volum_limit_up = 15;//�ִ� ������ ����
		k08_volum_limit_dn = 0;//�ּ� ������ ����
		k08_channel_limit_up = 30;//�ִ� ä�ΰ� ����
		k08_channel_limit_dn = 1;//�ּ� ä�ΰ� ����
	}
	
	public TvRemocon(int k08_volOrCh, int k08_choice) {
		k08_volum_limit_up = 15;//�ִ� ������ ����
		k08_volum_limit_dn = 0;//�ּ� ������ ����
		k08_channel_limit_up = 30;//�ִ� ä�ΰ� ����
		k08_channel_limit_dn = 1;//�ּ� ä�ΰ� ����
		k08_volum = k08_volOrCh;//�Է� ������ ����
		k08_channel = k08_volOrCh;//�Է� ������ ����
		if (k08_choice == k08_channelVal && k08_channel > 0) {//���ڷ� �޾ƿ� choice ���� ���� 1�� ���� ä�κ����� >0 �϶�
			System.out.printf("ä���Է�[CH%d]\n", k08_channel);//���� �Է¹��� �� ���
			for (int i = 0; i < 10; i++) {//0~9 �ݺ��� ����
				k08_ChannelUp();//ä�ξ� �޼ҵ� ȣ���Ͽ� ����
			}
			System.out.printf("[%s]\n",k08_help);//����� ���
			for (int i = 0; i < 10; i++) {//0~9 �ݺ��� ����
				k08_ChannelDn();//ä�δٿ� �޼ҵ� ȣ���Ͽ� ����		
			}
			System.out.printf("[%s]\n",k08_help);//����� ���
		} else if (k08_choice == k08_channelVal && k08_channel < 0) {//���ڷ� �޾ƿ� choice ���� ���� 1�� ���� ä�κ����� <0 �϶�
			System.out.printf("ä���Է�[CH%d]\n", k08_channel);//���� �Է¹��� �� ���
			k08_channel *= -1;//������ -1�� ���� ������ ����
			for (int i = 0; i < 10; i++) {//0~9 �ݺ��� ����
				k08_ChannelUp();//ä�ξ� �޼ҵ� ȣ���Ͽ� ����
			}
			System.out.printf("[%s]\n",k08_help);//����� ���
			for (int i = 0; i < 10; i++) {//0~9 �ݺ��� ����
				k08_ChannelDn();//ä�δٿ� �޼ҵ� ȣ���Ͽ� ����			
			}
			System.out.printf("[%s]\n",k08_help);//����� ���
		} else if (k08_choice == k08_volumVal && k08_volum > 0) {//���ڷ� �޾ƿ� choice ���� ���� 2�� ���� ���������� >0 �϶�
			System.out.printf("���纼��[Vol%d]\n", k08_volum);//���� �Է¹��� �� ���
			for (int i = 0; i < 5; i++) {//0~4 �ݺ��� ����
				k08_VolUp();//������ �޼ҵ� ȣ���Ͽ� ����
			}
			System.out.printf("[%s]\n",k08_help);//����� ���
			for (int i = 0; i < 5; i++) {//0~4 �ݺ��� ����
				k08_VolDn();//�����ٿ� �޼ҵ� ȣ���Ͽ� ����
			}
			System.out.printf("[%s]\n",k08_help);//����� ���
		} else if (k08_choice == k08_volumVal && k08_volum < 0) {//���ڷ� �޾ƿ� choice ���� ���� 2�� ���� ä�κ����� <0 �϶�
			System.out.printf("���纼��[Vol%d]\n", k08_volum);//���� �Է¹��� �� ���
			k08_volum *= -1;//������ -1�� ���� ������ ����
			for (int i = 0; i < 5; i++) {//0~4 �ݺ��� ����
				k08_VolUp();//�����ٿ� �޼ҵ� ȣ���Ͽ� ����
			}
			System.out.printf("[%s]\n",k08_help);//����� ���
			for (int i = 0; i < 5; i++) {//0~4 �ݺ��� ����
				k08_VolDn();
			}
			System.out.printf("[%s]\n",k08_help);//����� ���
		}
	}
	
	void k08_VolUp() {//������ �޼��� ����
		if (k08_volum == k08_volum_limit_up) { //���� ���� ���� �ִ뺼������ �����ϴٸ�
			k08_help = "�ִ� ũ�� �Դϴ�.";//��Ʈ���� �ش� ���ڿ� ����
		} else {//�װ� �ƴ϶��
			k08_volum++;// + 1
			k08_help = String.format("Vol %d", k08_volum);//��Ʈ���� �ش� ���ڿ� ����
		}
	}
	
	void k08_VolDn() {//�����ٿ� �޼��� ����
		if (k08_volum == k08_volum_limit_dn) { //���� ���� ���� �ּҺ������� �����ϴٸ�
			k08_help = "������ �� ���� �� �����ϴ�.";//��Ʈ���� �ش� ���ڿ� ����
		} else {//�װ� �ƴ϶��
			k08_volum--;// - 1
			k08_help = String.format("Vol %d", k08_volum);//��Ʈ���� �ش� ���ڿ� ����
		}
		
	}
	
	void k08_ChannelUp() {//ä�ξ� �޼��� ����
		if (k08_channel == k08_channel_limit_up) { //ä�� ���� ���� �ִ�ä�ΰ��� �����ϴٸ�
			k08_help = "�� �̻� ä���� �������� �ʽ��ϴ�.";//��Ʈ���� �ش� ���ڿ� ����
		} else {//�װ� �ƴ϶��
			k08_channel++;// + 1
			k08_help = String.format("CH %d", k08_channel);//��Ʈ���� �ش� ���ڿ� ����
		}
		
	}
	
	void k08_ChannelDn() {//ä�δٿ� �޼��� ����
		if (k08_channel == k08_channel_limit_dn) { //ä�� ���� ���� �ּ�ä�ΰ��� �����ϴٸ�
			k08_help = "�� �̻� ä���� �������� �ʽ��ϴ�.";//��Ʈ���� �ش� ���ڿ� ����
		} else {//�װ� �ƴ϶��
			k08_channel--;// - 1
			k08_help = String.format("CH %d", k08_channel);//��Ʈ���� �ش� ���ڿ� ����
		}
	}
}
