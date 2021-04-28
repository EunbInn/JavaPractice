package Lecture06;

public class P06_1 {

	public static void k08_iamMethod() {//아무 값도 리턴하지 않는 퍼블릭 스테틱 매소드 선언
		System.out.printf("Call me method~~\n");//문자열 출력
	}
	public static void main(String[] args) {//메인 시작
		P06_1.k08_iamMethod();//클래스명.메서드명으로 메서드 호출
		
		k08_iamMethod();//한 클래스 내의 스태틱 메서드는 바로 메인에 호출 가능

	}

}
