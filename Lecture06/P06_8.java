package Lecture06;

public class P06_8 {
//20210427 김은비 엘레베이터 생성자_메인
	public static void main(String[] args) {
		Elevator2 k08_elev;//P06_4 클래스 객체 선언
		
		k08_elev = new Elevator2();//클래스 객체 생성 : 생성자 인자 없음
		
		for (int i = 0; i < 10; i++) {
			k08_elev.k08_up();//Elevator2 클래스의 up메서드 호출
			
			System.out.printf("MSG[%s]\n", k08_elev.k08_help);//Elevator2 클래스의 스트링 help 호출
			
		}
		
		for (int k08_i = 0; k08_i < 10; k08_i++) {//0~9까지 반복문 실행
			k08_elev.k08_down();//Elevator2 클래스의 down메서드 호출
			
			System.out.printf("MSG[%s]\n", k08_elev.k08_help);//Elevator2 클래스의 스트링 help 호출
		}
		
		Elevator2 k08_elevUP = new Elevator2(5);//클래스 객체 생성 : 생성자 인자 있음
		System.out.printf("MSG[%s]\n", k08_elevUP.k08_help);//Elevator2 클래스의 스트링 help 호출
		
		Elevator2 k08_elevDN = new Elevator2(-5);//클래스 객체 생성 : 생성자 인자 있음
		System.out.printf("MSG[%s]\n", k08_elevDN.k08_help);//P06_4 클래스의 스트링 help 호출

	}

}
