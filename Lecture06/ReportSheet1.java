package Lecture06;

public class ReportSheet1 {
	//20210427 ������ ����ǥ ���(1)
	public static void main(String[] args) {
		int k08_iPerson = 20;//��Ƽ�� ���� �� ����ο� ���� ����
		
		InputData k08_inData = new InputData(k08_iPerson);//Ŭ���� ��ü ���� �� ������ ���� �Է�
		
		for (int k08_i = 0; k08_i < k08_iPerson; k08_i++) {//iPerson�� ����ŭ �ݺ��� ����
			String k08_name = String.format("����%02d", k08_i);//��Ʈ�� ��ü ���� �� �� ����
			int k08_kor = (int)(Math.random() * 100);//�������� �����Լ����ؼ� �� ����
			int k08_eng = (int)(Math.random() * 100);//�������� �����Լ��� �� ����
			int k08_mat = (int)(Math.random() * 100);//�������� �����Լ��� �� ����
			//inputDataŬ������ SetData�޼ҵ� ȣ���Ͽ� ���� �Է�
			k08_inData.SetData(k08_i, k08_name, k08_kor, k08_eng, k08_mat);
		}
		
		for (int k08_i = 0; k08_i < k08_iPerson; k08_i++) { // iPerson�� ����ŭ �ݺ��� ����
			System.out.printf("��ȣ: %d, �̸�: %s, ����: %d, ����: %d, ����: %d, ����: %d, ���: %f\n",//����Ʈ ���� ����
					k08_i, k08_inData.k08_name[k08_i], k08_inData.k08_kor[k08_i], 
					k08_inData.k08_eng[k08_i], k08_inData.k08_mat[k08_i],
					k08_inData.k08_sum[k08_i], k08_inData.k08_ave[k08_i]);//inputData���� �� �������� �迭 ȣ���Ͽ� ���
		}

	}

}
