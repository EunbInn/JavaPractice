package Lecture07;

public class OneRec1 {
	private int k08_student_id;//private ��Ƽ��Ÿ�� ���� ����
	private String k08_name; //private ��Ʈ��Ÿ�� ��ü ����
	private int k08_kor; //private ��Ƽ��Ÿ�� ���� ����
	private int k08_eng; //private ��Ƽ��Ÿ�� ���� ����
	private int k08_mat; //private ��Ƽ��Ÿ�� ���� ����
	
	//��Ʈ�� 1��, ��Ƽ�� 4�� �� ���ڷ� �޴� ������ ����
	public OneRec1(int k08_student_id, String k08_name, int k08_kor, int k08_eng, int k08_mat) {
		this.k08_student_id = k08_student_id;
		this.k08_name = k08_name;//�̸� ������ �޾ƿ� ��Ʈ�� Ÿ�� ���� ����
		this.k08_kor = k08_kor;//���� ������ �޾ƿ� �������� ���� ����
		this.k08_eng = k08_eng;//���� ������ �޾ƿ� �������� ���� ����
		this.k08_mat = k08_mat;//���� ������ �޾ƿ� ���� ���� ���� ����
	}
	
	public int student_id() {//��Ƽ���� �����ϴ� �޼��� ����
		return this.k08_student_id;//�й� ����
	}
	
	public String name() {// ��Ʈ���� �����ϴ� �޼��� ����
		return this.k08_name;//�̸� ����
	}
	
	public int kor() {//��Ƽ���� �����ϴ� �޼��� ����
		return this.k08_kor;//�������� ����
	}
	
	public int eng() {//��Ƽ���� �����ϴ� �޼��� ����
		return this.k08_eng;//���� ���� ����
	}
	
	public int mat() {//��Ƽ���� �����ϴ� �޼��� ����
		return this.k08_mat;//���� ���� ����
	}
	
	public int sum() {//��Ƽ���� �����ϴ� �޼��� ����
		return this.k08_kor + this.k08_eng + this.k08_mat;//��+��+�� �� ���� ����
	}
	
	public double ave() {//������ ���� �����Ѵ� �޼��� ����
		return this.sum() / 3.0;//sum()�޼��忡�� ������ ���� 3.0���� ���� �� ����
	}
}
