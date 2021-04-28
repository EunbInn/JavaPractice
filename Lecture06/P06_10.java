package Lecture06;

public class P06_10 {
//20210427 김은비 엘레베이터 상속클래스 이용_메인
	public static void main(String[] args) {
		Elevator3 k08_elev3;//클래스 객체선언
		
		k08_elev3 = new Elevator3();//객체생성
		for (int i = 0; i < 10; i++) {//0~9까지 반복문 실행
			k08_elev3.k08_up();//업 메서드 호출하여 실행
			System.out.printf("MSG elev3[%s]\n", k08_elev3.k08_help);//스트링 help호출하여 출력
		}
		
		for (int i = 0; i < 10; i++) {//0~9까지 반복문 실행
			k08_elev3.k08_down();//다운 메서드 호출하여 실행
			System.out.printf("MSG elev3[%s]\n", k08_elev3.k08_help);//스트링 help호출하여 출력
		}
		
		k08_elev3.k08_Repair();//리페어 메서드 호출
		System.out.printf("MSG elev3[%s]\n", k08_elev3.k08_help);//스트링 help호출하여 출력
		
	}

}
