package Lecture06;
//20210427 김은비 엘레베이터(1)_메인
public class P06_4Main {
	private static int k08_inVal;//integer type private 전역변수 선언
	
	public static void k08_up() {//static 메서드 선언
		k08_inVal++;//전역변수 + 1
		System.out.printf("난 그냥 메소드[%d]\n", k08_inVal);//전역변수와 문자열 출력
	}
	
	public static void main(String[] args) {//메인 시작
		k08_inVal = 0;//전역변수에 0 저장
		P06_4 k08_elev;//P06_4 클래스 객체 선언
		
		k08_elev = new P06_4();//클래스 객체 생성
		
		k08_up();//본 클래스의 up메서드 호출
		
		for (int k08_i = 0; k08_i < 10; k08_i++) {//0~9까지 반복문 실행
			k08_elev.k08_up();//P06_4 클래스의 up메서드 호출
			
			System.out.printf("MSG[%s]\n", k08_elev.k08_help);//P06_4 클래스의 스트링 help 호출
		}
		
		for (int k08_i = 0; k08_i < 10; k08_i++) {//0~9까지 반복문 실행
			k08_elev.k08_down();//P06_4 클래스의 down메서드 호출
			
			System.out.printf("MSG[%s]\n", k08_elev.k08_help);//P06_4 클래스의 스트링 help 호출
		}

	}

}
