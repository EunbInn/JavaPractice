package Lecture07;

public class P07_3 {
	//20210428 ������ �����ڵ� �ʵ� ����ó��
	public static void main(String[] args) {
		//�޸��忡�� ������ ���� �ٺ��� String�迭�� ����
		String[] k08_OneRec = {"�õ�����û,��������û,����,��������  �б��ڵ�,�б���,�б����ڵ�,��������,1�г�,2�г�,3�г�,4�г�,5�г�,6�г�,Ư���б�,��ȸ�б�,�б޼�(��),�л���(��),�б޴��л���",
				"����Ư���ñ���û,������,����Ư���� ���ʱ�,S000003511,���ﱳ�����б��μ��ʵ��б�,2,����,4,4,4,5,5,5,1,0,28(1),614(6),21.93",
				"����Ư���ñ���û,������,����Ư���� ���α�,S000003563,������б�������кμ��ʵ��б�,2,����,5,5,5,5,5,5,1,0,31(1),627(7),20.23",
				"����Ư���ñ���û,����Ư���ð������ʱ�������û,����Ư���� ������,S010000738,���ﰳ���ʵ��б�,2,����,5,5,5,6,5,6,0,0,32(0),945(0),29.53",
				"����Ư���ñ���û,����Ư���ð������ʱ�������û,����Ư���� ������,S010000741,���ﱸ���ʵ��б�,2,����,4,4,5,5,4,5,1,0,28(1),504(6),18"};
		//ù��° ���� �ʵ�� �迭�� �޸��� ���ø��Ͽ� ����
		String[] k08_field_name = k08_OneRec[0].split(",");
		for (int k08_i = 1; k08_i < k08_OneRec.length; k08_i++) {//OneRec�� ũ�� - 1 ��ŭ �ݺ��� ���� 
			String[] k08_field = k08_OneRec[k08_i].split(",");//OnRec�� i��° ���ڿ��� �޸��� ���ø��Ͽ� �迭�� ���� (�ʵ尪)
			System.out.printf("*************************************************\n");//���м� ���
			for (int k08_j = 0; k08_j < k08_field_name.length; k08_j++) {//field �迭 ũ�⸸ŭ �ݺ��� ����
				System.out.printf("  %s : %s\n", k08_field_name[k08_j], k08_field[k08_j]); //�ʵ���� �ʵ尪 ���
			}
			System.out.printf("*************************************************\n");//���м� ���
		}
	}

}