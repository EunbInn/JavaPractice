package Lecture06;

import java.util.Scanner;

public class P06_11 {
//20210427 ������ ������ Ŭ������� ����_����
	public static void main(String[] args) {
		Scanner k08_sc = new Scanner(System.in);//��ĳ�� ��ü ����
		TvRemoconX k08_remocon = new TvRemoconX();// Ŭ���� ��ü ����

		int k08_userInputChannel = k08_sc.nextInt();//�ֿܼ��� �Է¹��� ���ڸ� ��Ƽ�� ������ ����
		while (true) {//�ݺ��� ����
			if (k08_userInputChannel >= k08_remocon.k08_channel_limit_dn //�ּ�ä��<= �Է¹��� �� <=�ִ�ä�� �̸�
					&& k08_userInputChannel <= k08_remocon.k08_channel_limit_up) {
				k08_remocon.k08_channel = k08_userInputChannel;//������ Ŭ���� ä�� ������ �ش� �� ����
				for (int k08_i = 0; k08_i < 10; k08_i++) {// 0~9���� �ݺ��� ����
					k08_remocon.k08_ChannelUp();// TvRemocon Ŭ������ ä�� up�޼��� ȣ��

					System.out.printf("[%s]\n", k08_remocon.k08_help);// TvRemocon Ŭ������ ��Ʈ�� ȣ��
				}
				k08_remocon.k08_CheckBattery();//���͸� üũ �޼��� ȣ��
				System.out.printf("[%s]\n", k08_remocon.k08_help);//���ڿ� ���
				for (int k08_i = 0; k08_i < 10; k08_i++) {// 0~9���� �ݺ��� ����
					k08_remocon.k08_ChannelDn();// TvRemocon Ŭ������ ä�� down�޼��� ȣ��

					System.out.printf("[%s]\n", k08_remocon.k08_help);// TvRemocon Ŭ������ ��Ʈ�� ȣ��
				}
				k08_remocon.k08_CheckBattery();//���͸� üũ �޼��� ȣ��
				System.out.printf("[%s]\n", k08_remocon.k08_help);//���ڿ� ���
				break;//�ݺ��� Ż��
			} else {//�ƴ϶��
				System.out.println("�ٽ� �Է����ּ���");//���Է� �䱸 ���
				k08_userInputChannel = k08_sc.nextInt();//�ֿܼ��� �Է¹��� ���ڸ� ��Ƽ�� ������ ����
			}
		}

		int k08_userInputVolum = k08_sc.nextInt();//�ֿܼ��� �Է¹��� ���ڸ� ��Ƽ�� ������ ����

		while (true) {
			if (k08_userInputVolum >= k08_remocon.k08_volum_limit_dn //�ּҺ���<= �Է¹��� �� <=�ִ뺼�� �̸�
					&& k08_userInputVolum <= k08_remocon.k08_volum_limit_up) {
				k08_remocon.k08_volum = k08_userInputVolum;//������ Ŭ���� ���� ������ �ش� �� ����
				for (int k08_i = 0; k08_i < 5; k08_i++) {// 0~4���� �ݺ��� ����
					k08_remocon.k08_VolUp();//TvRemocon Ŭ������ ����up�޼��� ȣ��

					System.out.printf("[%s]\n", k08_remocon.k08_help);// TvRemocon Ŭ������ ��Ʈ�� ȣ��
				}
				k08_remocon.k08_CheckBattery();//���͸� üũ �޼��� ȣ��
				System.out.printf("[%s]\n", k08_remocon.k08_help);//���ڿ� ���

				for (int k08_i = 0; k08_i < 5; k08_i++) {// 0~4���� �ݺ��� ����
					k08_remocon.k08_VolDn();// TvRemocon Ŭ������ ����down�޼��� ȣ��

					System.out.printf("[%s]\n", k08_remocon.k08_help);// TvRemocon Ŭ������ ��Ʈ�� ȣ��
				}
				k08_remocon.k08_CheckBattery();//���͸� üũ �޼��� ȣ��
				System.out.printf("[%s]\n", k08_remocon.k08_help);//���ڿ� ���
				break;//�ݺ��� Ż��
			} else {//�ƴ϶��
				System.out.println("�ٽ� �Է����ּ���");//���Է� �䱸 ���
				k08_userInputVolum = k08_sc.nextInt();//�ֿܼ��� �Է¹��� ���ڸ� ��Ƽ�� ������ ����
			}
		}

	}

}
