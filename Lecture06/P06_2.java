package Lecture06;
//20210427 ������ ������ �޼���(2)
public class P06_2 {
	static int k08_iStatic;//integer type �������� static���� ����
	
	public static void k08_add(int k08_i) {//integer type�� ���ڷ� �޴� ����ƽ �޼��� ����
		k08_iStatic++;//�������� iStatic�� +1
		System.out.printf("add�޼ҵ忡�� -> iStatic = [%d]\n", k08_iStatic);//iStatic ���
		System.out.printf("add�޼ҵ忡�� -> i = [%d]\n", k08_i);//���� i���
	}
	
	public static int k08_add2(int k08_i) {//integer type�� ���ڷ� �޴� ����ƽ �޼��� ����
		k08_iStatic++;//�������� iStatic�� +1
		k08_i++;//���� i + 1
		System.out.printf("add2�޼ҵ忡�� -> iStatic = [%d]\n", k08_iStatic);//iStatic ���
		System.out.printf("add2�޼ҵ忡�� -> i = [%d]\n", k08_i);//���� i���
		
		return k08_i;//i ����
	}
	
	public static void main(String[] args) {//���� ����
		
		int k08_iMain;//��Ƽ��Ÿ�� ���� ����
		
		k08_iMain = 1;//���� iMain�� 1����
		k08_iStatic = 1;//�������� iStatic�� 1 ����
		
		System.out.printf("*********************************************\n");//���м� ���
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> iStatic = [%d]\n", k08_iStatic);//iStatic ���
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> i = [%d]\n", k08_iMain);//iMain ���
		System.out.printf("*********************************************\n");//���м� ���
		
		k08_add(k08_iMain);//add�ż��忡 iMain ���ڷ� �ְ� ȣ��
		
		System.out.printf("*********************************************\n");//���м� ���
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> iStatic = [%d]\n", k08_iStatic);//iStatic ���
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� -> i = [%d]\n", k08_iMain);//iMain ���
		System.out.printf("*********************************************\n");//���м� ���
		
		k08_iMain = k08_add2(k08_iMain);//add�ż��忡 iMain ���ڷ� �ְ� ���Ϲ��� ���� iMain������ ����
		
		System.out.printf("*********************************************\n");//���м� ���
		System.out.printf("�޼ҵ� add2 ȣ�� �� ���ο��� -> iStatic = [%d]\n", k08_iStatic);//iStatic ���
		System.out.printf("�޼ҵ� add2 ȣ�� �� ���ο��� -> i = [%d]\n", k08_iMain);//iMain ���
		System.out.printf("*********************************************\n");//���м� ���

	}

}
