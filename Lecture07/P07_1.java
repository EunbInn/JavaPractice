package Lecture07;

public class P07_1 {
	//20210428 ������ �ѱ۰��
	public static void main(String[] arg) {
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ�abcd", 15)); // �޼��� ȣ��� ����Ʈ ���̸� 15�� ������ ���ڿ� ���(���� ���ڿ� ��)
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ��ѱ�aa", 15)); // �޼��� ȣ��� ����Ʈ ���̸� 15�� ������ ���ڿ� ���(���� ���ڿ� ��)
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ�aa", 15)); // �޼��� ȣ��� ����Ʈ ���̸� 15�� ������ ���ڿ� ���(���� ���ڿ� ��)
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ��ѱ�aa", 15));// �޼��� ȣ��� ����Ʈ ���̸� 15�� ������ ���ڿ� ���(���� ���ڿ� ��)
		System.out.printf("�ѱ���[%s]��\n", HanCount("�ѱ��ѱ�aa"));//�ѱ� ���� ī��Ʈ ���
	}
	
	public static String HanBlankForeword(String k08_han, int k08_leng) {// ��Ʈ��Ÿ�԰� ��Ƽ��Ÿ���� ���ڷ� �޾� ��Ʈ���� �����ϴ� �ż��� ����
		if (k08_han.getBytes().length <= k08_leng) { // ���� ���ڿ��� ����Ʈ�� ���ϴ� �ڸ��� ����Ʈ�� ���ų� ���� ���
			int k08_blank = k08_leng - k08_han.getBytes().length;//���� ���� = ���ϴ� ��� ����Ʈ�� - ���ڷ� ���� ���ڿ� ����Ʈ ��
			
			for (int k08_i = 0; k08_i < k08_blank; k08_i++) {//������ ���� ������ ���̸�ŭ �ݺ��� ����
				k08_han += " ";// ���ڿ��� ���� �߰�
			}
			return k08_han; // ������ ���ڿ� ����
			
		} else { //���ڿ��� ����Ʈ ���� ���ϴ� ����Ʈ �� ���� Ŭ ���
			int k08_cnt = 0;//��Ƽ��Ÿ�� ���� ���� �� 0���� �ʱ�ȭ
			String k08_temp = "";//��Ʈ��Ÿ�� ������Ʈ ���� �� ""�� �ʱ�ȭ
			
			for (char k08_ch : k08_han.toCharArray()) {//ĳ���� Ÿ�� ���� ����, ���ڷ� ���� ���ڿ��� ĳ���� �迭�� �ְ� �迭 ���̸�ŭ �ݺ��� ����
				k08_cnt += String.valueOf(k08_ch).getBytes().length;//ī��Ʈ ������ �ѱ��ڸ����� ����Ʈ���� ����
				if (k08_cnt > k08_leng) break;//ī��Ʈ�� ���ϴ� ���� ����Ʈ ������ Ŀ���� �ݺ��� Ż�� 
				k08_temp += String.valueOf(k08_ch);//ī��Ʈ�� ���ϴ� ���� ����Ʈ ������ Ŀ���� ������ �ؽ�Ʈ�� �ѱ��ھ� ����
			}
			
			int k08_blank = k08_leng - k08_temp.getBytes().length;//���� ���� = ���ϴ� ��� ����Ʈ�� - ���ڷ� ���� ���ڿ� ����Ʈ ��
			
			for (int k08_i = 0; k08_i < k08_blank; k08_i++) {//������ ���� ������ ���̸�ŭ �ݺ��� ����
				k08_temp += " ";// ���ڿ��� ���� �߰�
			}
			
			return k08_temp;//������ ���ڿ� ����
		}
	}
	
	public static String HanBlankBackword(String k08_han, int k08_leng) {// ��Ʈ��Ÿ�԰� ��Ƽ��Ÿ���� ���ڷ� �޾� ��Ʈ���� �����ϴ� �ż��� ����
		if (k08_han.getBytes().length <= k08_leng) {// ���� ���ڿ��� ����Ʈ�� ���ϴ� �ڸ��� ����Ʈ�� ���ų� ���� ���
			int k08_blank = k08_leng - k08_han.getBytes().length;//���� ���� = ���ϴ� ��� ����Ʈ�� - ���ڷ� ���� ���ڿ� ����Ʈ ��
			
			for (int k08_i = 0; k08_i < k08_blank; k08_i++) {//������ ���� ������ ���̸�ŭ �ݺ��� ����
				k08_han = " " + k08_han;// ���ڿ� �տ� ���� �߰�
			}
			return k08_han;// ������ ���ڿ� ����
		} else { //���ڿ��� ����Ʈ ���� ���ϴ� ����Ʈ �� ���� Ŭ ���
			int k08_cnt = 0;//��Ƽ��Ÿ�� ���� ���� �� 0���� �ʱ�ȭ
			String k08_temp = "";//��Ʈ��Ÿ�� ������Ʈ ���� �� ""�� �ʱ�ȭ
			
			for (char k08_ch : k08_han.toCharArray()) {//ĳ���� Ÿ�� ���� ����, ���ڷ� ���� ���ڿ��� ĳ���� �迭�� �ְ� �迭 ���̸�ŭ �ݺ��� ����
				k08_cnt += String.valueOf(k08_ch).getBytes().length;//ī��Ʈ ������ �ѱ��ڸ����� ����Ʈ���� ����
				if (k08_cnt > k08_leng) break;//ī��Ʈ�� ���ϴ� ���� ����Ʈ ������ Ŀ���� �ݺ��� Ż�� 
				k08_temp += String.valueOf(k08_ch);//ī��Ʈ�� ���ϴ� ���� ����Ʈ ������ Ŀ���� ������ �ؽ�Ʈ�� �ѱ��ھ� ����
			}
			
			int k08_blank = k08_leng - k08_temp.getBytes().length;//���� ���� = ���ϴ� ��� ����Ʈ�� - ���ڷ� ���� ���ڿ� ����Ʈ ��
			
			for (int k08_i = 0; k08_i < k08_blank; k08_i++) {//������ ���� ������ ���̸�ŭ �ݺ��� ����
				k08_temp = " " + k08_temp;// ���ڿ� �տ� ���� �߰�
			}
			
			return k08_temp;//������ ���ڿ� ����
		}
	}
	
	public static int HanCount(String k08_han) {//��Ʈ�� Ÿ���� ���ڷ� �޾� ��Ƽ���� �����ϴ� �޼��� ����
		int k08_cnt = 0;//��Ƽ�� ���� ���� �� �ʱ�ȭ
		for (char k08_ch : k08_han.toCharArray()) {//ĳ���� Ÿ�� ���� ����, ���ڷ� ���� ���ڿ��� ĳ���� �迭�� �ְ� �迭 ���̸�ŭ �ݺ��� ����
			if (String.valueOf(k08_ch).getBytes().length > 1) {//���ϴ� ������ ����Ʈ ���̰� 1���� ũ��
				k08_cnt++;//ī��Ʈ ���� + 1
			}
		}
		
		return k08_cnt;//ī��Ʈ ����
	}

}
