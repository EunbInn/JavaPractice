package Lecture06;

public class P06_12 {
//20210427 김은비 overriding 연습_메인
	public static void main(String[] args) {
		Elevator3 k08_elev3;// 클래스 객체선언

		k08_elev3 = new Elevator3();// 객체생성
		for (int i = 0; i < 10; i++) {// 0~9까지 반복문 실행
			k08_elev3.k08_up();// 업 메서드 호출하여 실행
			System.out.printf("MSG elev3[%s]\n", k08_elev3.k08_help);// 스트링 help호출하여 출력
		}

		for (int i = 0; i < 10; i++) {// 0~9까지 반복문 실행
			k08_elev3.k08_down();// 다운 메서드 호출하여 실행
			System.out.printf("MSG elev3[%s]\n", k08_elev3.k08_help);// 스트링 help호출하여 출력
		}
		
		k08_elev3.k08_Repair();//repair 매소드 호출
		System.out.printf("MSG elev3[%s]\n", k08_elev3.k08_help);//스트링 help호출 및 출력
	}

}
