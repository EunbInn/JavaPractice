package Lecture07;

import java.util.ArrayList;

public class P07_7 {

	public static void main(String[] args) {
		ArrayList k08_iAL = new ArrayList();//��̸���Ʈ ���� �� ����
		
		k08_iAL.add("abc");//��̸���Ʈ�� ���� ä���
		k08_iAL.add("abcd");//��̸���Ʈ�� �� ä���
		k08_iAL.add("efga");//��̸���Ʈ�� �� ä���
		k08_iAL.add("���ٳ�1");//��̸���Ʈ�� �� ä���
		k08_iAL.add("1234124");//��̸���Ʈ�� �� ä���
		k08_iAL.add("8��24��");//��̸���Ʈ�� �� ä���
		
		System.out.printf("*******************************************\n");//���м� ���
		System.out.printf(" ���� ArraySize %d\n",k08_iAL.size());//���� ��� ������ ���
		for (int k08_i = 0; k08_i < k08_iAL.size(); k08_i++) {//��� �����ŭ �ݺ��� ����
			System.out.printf("ArrayList %d = %s\n", k08_i, k08_iAL.get(k08_i));//��� ���� ���
		}
		k08_iAL.set(3, "���溯��");//��� 3��° �׸� ���뺯��
		System.out.printf("*******************************************\n");//���м� ���
		System.out.printf(" ���뺯�� ArraySize %d\n",k08_iAL.size());//���� ���� �� ��� ������ ���
		for (int k08_i = 0; k08_i < k08_iAL.size(); k08_i++) {//��� �����ŭ �ݺ��� ����
			System.out.printf("ArrayList %d = %s\n", k08_i, k08_iAL.get(k08_i));//��� ���� ���
		}
		k08_iAL.remove(4);//��� �� 4��°�׸� ����
		System.out.printf("*******************************************\n");//���м� ���
		System.out.printf(" ���뺯�� ArraySize %d\n",k08_iAL.size());//���� ���� �� ��� ������ ���
		for (int k08_i = 0; k08_i < k08_iAL.size(); k08_i++) {//��� �����ŭ �ݺ��� ����
			System.out.printf("ArrayList %d = %s\n", k08_i, k08_iAL.get(k08_i));//��� ���� ���
		}
		k08_iAL.sort(null);//����Ʈ ����: ���� -> ���ĺ� -> �ѱ�
		System.out.printf("*******************************************\n");//���м� ���
		System.out.printf(" ����Ʈ Sort ArraySize %d\n",k08_iAL.size());//���� ���� �� ��� ������ ���
		for (int k08_i = 0; k08_i < k08_iAL.size(); k08_i++) {//��� �����ŭ �ݺ��� ����
			System.out.printf("ArrayList %d = %s\n", k08_i, k08_iAL.get(k08_i));//��� ���� ���
		}
		k08_iAL.clear();//��̸���Ʈ ��ü ����
		System.out.printf("*******************************************\n");//���м� ���
		System.out.printf(" ���� ���� ArraySize %d\n",k08_iAL.size());//���� ���� ���
		for (int k08_i = 0; k08_i < k08_iAL.size(); k08_i++) {//��� �����ŭ �ݺ��� ����
			System.out.printf("ArrayList %d = %s\n", k08_i, k08_iAL.get(k08_i));//��� ���� ���
		}

	}

}
