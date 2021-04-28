package Lecture06;

public class ReportSheet1 {
	//20210427 김은비 성적표 출력(1)
	public static void main(String[] args) {
		int k08_iPerson = 20;//인티저 선언 및 사람인원 임의 저장
		
		InputData k08_inData = new InputData(k08_iPerson);//클래스 객체 생성 및 생성자 인자 입력
		
		for (int k08_i = 0; k08_i < k08_iPerson; k08_i++) {//iPerson의 값만큼 반복문 실행
			String k08_name = String.format("김은%02d", k08_i);//스트링 객체 생성 및 값 저장
			int k08_kor = (int)(Math.random() * 100);//국어점수 랜덤함수통해서 값 저장
			int k08_eng = (int)(Math.random() * 100);//수학점수 랜덤함수로 값 저장
			int k08_mat = (int)(Math.random() * 100);//영어점수 랜덤함수로 값 저장
			//inputData클래스의 SetData메소드 호출하여 인자 입력
			k08_inData.SetData(k08_i, k08_name, k08_kor, k08_eng, k08_mat);
		}
		
		for (int k08_i = 0; k08_i < k08_iPerson; k08_i++) { // iPerson의 값만큼 반복문 실행
			System.out.printf("번호: %d, 이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %f\n",//프린트 형식 지정
					k08_i, k08_inData.k08_name[k08_i], k08_inData.k08_kor[k08_i], 
					k08_inData.k08_eng[k08_i], k08_inData.k08_mat[k08_i],
					k08_inData.k08_sum[k08_i], k08_inData.k08_ave[k08_i]);//inputData에서 각 데이터의 배열 호출하여 출력
		}

	}

}
