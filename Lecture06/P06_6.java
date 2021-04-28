package Lecture06;

public class P06_6 {

	public static void main(String[] args) {
		//20210427 김은비 메서드 오버로딩 연습_메인
		OverloadingClass k08_oc = new OverloadingClass();//오버로딩 메서드를 생성해둔 클래스 객체생성
		
		System.out.printf("2개의 덧셈이 호출됨 [%d]\n", k08_oc.k08_sum(1, 2));//첫번째 메서드 호출 - 인티저형 인자 2
		System.out.printf("3개의 덧셈이 호출됨 [%d]\n", k08_oc.k08_sum(1, 2, 3));//두번째 메서드 호출 - 인티저형 인자 3
		System.out.printf("4개의 덧셈이 호출됨 [%d]\n", k08_oc.k08_sum(1, 2, 3, 4));//세번째 메서드 호출 - 인티저형 인자 4
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", k08_oc.k08_sum(1.3, 2.4));//네번째 메서드 호출 - 더블형 인자 2

	}

}
