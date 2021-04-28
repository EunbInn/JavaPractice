package Lecture07;

public class P07_6 {

	public static void main(String[] args) {
		int k08_iPerson = 5;// 인티저 타입 변수 선언 및 값 저장
		
		OneRec [] k08_inData = new OneRec[k08_iPerson];//iPerson의 값만큼의 크기를 가진 클래스형태 배열 생성
		
		k08_inData[0] = new OneRec("홍길01", 100, 100, 90);//각 배열마다 클래스 인스턴스 생성
		k08_inData[1] = new OneRec("홍길02", 90, 90, 90);//각 배열마다 클래스 인스턴스 생성
		k08_inData[2] = new OneRec("홍길03", 80, 70, 90);//각 배열마다 클래스 인스턴스 생성
		k08_inData[3] = new OneRec("홍길04", 70, 60, 90);//각 배열마다 클래스 인스턴스 생성
		k08_inData[4] = new OneRec("홍길05", 60, 100, 90);//각 배열마다 클래스 인스턴스 생성
		
		for (int i = 0; i < k08_iPerson; i++) {//iPerson의 크기만큼 반복문 실행
			OneRec one = k08_inData[i]; //배열의 i번째로 생성했던 클래스 호출
			System.out.printf("번호: %d, 이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %f\n",//프린트 형식 지정 및 출력
					i + 1, one.name(), one.kor(), one.eng(), one.mat(), one.sum(), one.ave());
		}
		
	}

}
