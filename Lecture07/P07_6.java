package Lecture07;

public class P07_6 {

	public static void main(String[] args) {
		int k08_iPerson = 5;// ��Ƽ�� Ÿ�� ���� ���� �� �� ����
		
		OneRec [] k08_inData = new OneRec[k08_iPerson];//iPerson�� ����ŭ�� ũ�⸦ ���� Ŭ�������� �迭 ����
		
		k08_inData[0] = new OneRec("ȫ��01", 100, 100, 90);//�� �迭���� Ŭ���� �ν��Ͻ� ����
		k08_inData[1] = new OneRec("ȫ��02", 90, 90, 90);//�� �迭���� Ŭ���� �ν��Ͻ� ����
		k08_inData[2] = new OneRec("ȫ��03", 80, 70, 90);//�� �迭���� Ŭ���� �ν��Ͻ� ����
		k08_inData[3] = new OneRec("ȫ��04", 70, 60, 90);//�� �迭���� Ŭ���� �ν��Ͻ� ����
		k08_inData[4] = new OneRec("ȫ��05", 60, 100, 90);//�� �迭���� Ŭ���� �ν��Ͻ� ����
		
	}

}
