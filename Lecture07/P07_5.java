package Lecture07;

public class P07_5 {
	//20210428 ������ �迭�� �ִ�, �ּҰ� ã��
	public static void main(String[] args) {
		//integer �迭�� �迭�� ����
		int [] k08_iArray = {1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 
				33, 11, 21, 11, 2121, 121, 5, 6, 234};
		
		for (int k08_i = 0; k08_i < k08_iArray.length; k08_i++) {//�迭 ũ�� ��ŭ �ݺ��� ����
			System.out.printf("iArray[%d] = %d\n", k08_i ,k08_iArray[k08_i]);//�迭 i��° �� ���
		}
		
		int k08_iMax = k08_iArray[0]; //�ƽ� ������ �迭 0��° �� ����
		int k08_iMin = k08_iArray[0]; //�̴ϸ� ������ �迭 0��° �� ����
		int k08_iMaxPt = 0;
		int k08_iMinPt = 0;
		
		for (int k08_i = 0; k08_i < k08_iArray.length; k08_i++) { //�迭 ũ�⸸ŭ �ݺ��� ����
			if (k08_iMax < k08_iArray[k08_i]) { //���� �ƽ� ���� ���� �迭 i��° ������ ���� ���
				k08_iMax = k08_iArray[k08_i]; //�ƽ� ������ �迭 i��° �� ����
				k08_iMaxPt = k08_i; //���° ������ ����
			} else if (k08_iMin > k08_iArray[k08_i]) { //���� �̴ϸ� ���� ���� �迭 i��° ������ Ŭ ���
				k08_iMin = k08_iArray[k08_i]; //�̴ϸ� ������ �迭 i��° �� ����
				k08_iMinPt = k08_i;//���° ������ ����
			}
		}
		
		System.out.printf("Max Value: iArray[%d] = %d\n", k08_iMaxPt, k08_iMax);//�ִ밪 ���
		System.out.printf("Min Value: iArray[%d] = %d\n", k08_iMinPt, k08_iMin);//�ּҰ� ���
	}

}
