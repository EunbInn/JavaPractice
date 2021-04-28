package Lecture06;

public class InputData {
	//�������� ����
	String[] k08_name;//String �迭 ����
	int[] k08_kor, k08_eng, k08_mat, k08_sum;//integer �迭 ����
	double[] k08_ave;//double �迭 ����
	int k08_sumKor, k08_sumEng, k08_sumMat, k08_sumAll;//��Ƽ�� ���� ����
	double k08_sumAve, k08_aveKor, k08_aveEng, k08_aveMat, k08_aveAll, k08_aveAve;//������ ���� ����
	int k08_addKor = 0;//���� ���� �հ� ��Ƽ���� ���� �� �ʱ�ȭ
	int k08_addEng = 0;//���� ���� �հ� ��Ƽ���� ���� �� �ʱ�ȭ
	int k08_addMat = 0;//���� ���� �հ� ��Ƽ���� ���� �� �ʱ�ȭ
	int k08_addAll = 0;//���� �հ��� �հ� ��Ƽ���� ���� �� �ʱ�ȭ
	double k08_addAve = 0;//���� ��� �հ� ����� ���� �� �ʱ�ȭ
	double k08_addAveKor, k08_addAveEng, k08_addAveMat, k08_addAveAll, k08_addAveAve;//������ ���� ����
	
	InputData(int k08_input) {//�����ڿ� integer �� ���ڷ� ����
		this.k08_name = new String[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_kor = new int[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_eng = new int[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_mat = new int[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_sum = new int[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_ave = new double[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_sumKor = 0;//���� �ʱ�ȭ
		this.k08_sumEng = 0;//���� �ʱ�ȭ
		this.k08_sumMat = 0;//���� �ʱ�ȭ
		this.k08_sumAll = 0;//���� �ʱ�ȭ
		this.k08_sumAve = 0;//���� �ʱ�ȭ
		this.k08_aveKor = 0;//���� �ʱ�ȭ
		this.k08_aveEng = 0;//���� �ʱ�ȭ
		this.k08_aveMat = 0;//���� �ʱ�ȭ
		this.k08_aveAll = 0;//���� �ʱ�ȭ
		this.k08_aveAve = 0;//���� �ʱ�ȭ
		
	}
	
	public void Reset(int k08_input) {//���� �޼��� ����
		this.k08_name = new String[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_kor = new int[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_eng = new int[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_mat = new int[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_sum = new int[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_ave = new double[k08_input];//���ڷ� ���� ����ŭ�� ũ�⸦ ���� �迭 ����
		this.k08_sumKor = 0;//���� �ʱ�ȭ
		this.k08_sumEng = 0;//���� �ʱ�ȭ
		this.k08_sumMat = 0;//���� �ʱ�ȭ
		this.k08_sumAll = 0;//���� �ʱ�ȭ
		this.k08_sumAve = 0;//���� �ʱ�ȭ
		this.k08_aveKor = 0;//���� �ʱ�ȭ
		this.k08_aveEng = 0;//���� �ʱ�ȭ
		this.k08_aveMat = 0;//���� �ʱ�ȭ
		this.k08_aveAll = 0;//���� �ʱ�ȭ
		this.k08_aveAve = 0;//���� �ʱ�ȭ
	}
	
	//��Ƽ������ 4���� ��Ʈ������ 1���� �޴� �޼��� ����
	public void SetData(int k08_i, String k08_name, int k08_kor, int k08_eng, int k08_mat) {
		this.k08_name[k08_i] = k08_name;//i��°�� ��Ʈ�� �� ����
		this.k08_kor[k08_i] = k08_kor;//i��°�� �������� ����
		this.k08_eng[k08_i] = k08_eng;//i��°�� �������� ����
		this.k08_mat[k08_i] = k08_mat;//i��°�� �������� ����
		this.k08_sum[k08_i] = k08_kor + k08_eng + k08_mat;//i��°�� ������ �� ����
		this.k08_ave[k08_i] = (k08_kor + k08_eng + k08_mat) / 3.0;//i��°�� ������ ���� 3.0���� ���� ���� ����
	}
	
	public void sumAll() {//���� ���ϴ� �޼��� ����(������)
		for (int i = 0; i < k08_kor.length; i++) {//�������� �迭�� ũ�⸸ŭ �ݺ��� ����
			k08_sumKor += k08_kor[i];//�������� �����Ͽ� ���ϱ�
			k08_sumEng += k08_eng[i];//�������� �����Ͽ� ���ϱ�
			k08_sumMat += k08_mat[i];//�������� �����Ͽ� ���ϱ�
			k08_sumAll += k08_sum[i];//�հ� ���� �����Ͽ� ���ϱ�
			k08_sumAve += k08_ave[i];//������� �����Ͽ� ���ϱ�
		}
		
	}
	
	public void aveAll() {//���� ����� ���� �޼��� ����(������)
		k08_aveKor = k08_sumKor / (double) k08_kor.length; //������ ������ ���� ������ �� ���������� ��ȯ�Ͽ� �����Ͽ� ���� ��տ� ����
		k08_aveEng = k08_sumEng / (double) k08_eng.length; //������ ������ ���� ������ �� ���������� ��ȯ�Ͽ� �����Ͽ� ���� ��տ� ����
		k08_aveMat = k08_sumMat / (double) k08_mat.length; //������ ������ ���� ������ �� ���������� ��ȯ�Ͽ� �����Ͽ� ���� ��տ� ����
		k08_aveAll = k08_sumAll / (double) k08_sum.length; //������ ������ ���� ������ �� ���������� ��ȯ�Ͽ� �����Ͽ� �հ� ��տ� ����
		k08_aveAve = k08_sumAve / (double) k08_ave.length; //������ ������ ���� ������ �� ���������� ��ȯ�Ͽ� �����Ͽ� ����� ��տ� ����
	}
	
	public void addAll() {//���� ���ϴ� �޼��� ����(����������)
		k08_addKor += k08_sumKor;//������ ���� �հ� ����
		k08_addEng += k08_sumEng;//������ ���� �հ� ����
		k08_addMat += k08_sumMat;//������ ���� �հ� ����
		k08_addAll += k08_sumAll;//������ �Ѱ��� �հ� ����
		k08_addAve += k08_sumAve;//������ ����� �� ����
	}
	
	public void addAve(int number) {//����� ���� �޼��� ����(����������)
		double num = (double)number;//���ڷ� ���� �ο��� ���������� ����
		k08_addAveKor = k08_addKor / num; //������ �հ谪 ���� �ο����� ����
		k08_addAveEng = k08_addEng / num; //������ �հ谪 ���� �ο����� ����
		k08_addAveMat = k08_addMat / num; //������ �հ谪 ���� �ο����� ����
		k08_addAveAll = k08_addAll / num; //������ �հ谪 ���� �ο����� ����
		k08_addAveAve = k08_addAve / num; //������ �հ谪 ���� �ο����� ����
	}
	
}
