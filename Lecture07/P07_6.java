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
		
	}

}
