package Lecture06;
//20210427 ������ �����ε� ����2
public class Overloading2 {
	
	public int k08_sum(int k08_kor, int k08_eng, int k08_mat) {//��Ƽ��Ÿ�� ���� 3�� - ��Ƽ���� ����
		return k08_kor + k08_eng + k08_mat;//���ڵ��� �� ����
	}
	
	public int k08_sum(int k08_kor, int k08_eng, int k08_mat, int k08_sci) {//��Ƽ��Ÿ�� ���� 4�� - ��Ƽ���� ����
		return k08_kor + k08_eng + k08_mat + k08_sci;//���ڵ��� �� ����
	}
	
	public int k08_sum(int k08_kor, int k08_eng, int k08_mat, int k08_sci, int k08_soc) {//��Ƽ��Ÿ�� ���� 5�� - ��Ƽ���� ����
		return k08_kor + k08_eng + k08_mat + k08_sci + k08_soc;//���ڵ��� �� ����
	}
	
	public int k08_ave(int k08_kor, int k08_eng, int k08_mat) {//��Ƽ��Ÿ�� ���� 3�� - ��Ƽ���� ����
		return (k08_kor + k08_eng + k08_mat) / 3;//���ڵ��� �� ��� ����
	}
	
	public double k08_ave(int k08_kor, int k08_eng, int k08_mat, int k08_sci) {//��Ƽ��Ÿ�� ���� 4�� - ���� ����
		return (k08_kor + k08_eng + k08_mat + k08_sci) / 4.0;//���ڵ��� �� ��� ����
	}
	
	public double k08_ave(int k08_kor, int k08_eng, int k08_mat, int k08_sci, int k08_soc) {//��Ƽ��Ÿ�� ���� 5�� - ���� ����
		return (k08_kor + k08_eng + k08_mat + k08_sci + k08_soc) / 5.0;//���ڵ��� �� ��� ����
	}
	
}
