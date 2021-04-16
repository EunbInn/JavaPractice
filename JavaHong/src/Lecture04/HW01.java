package Lecture04;

import java.util.Scanner;

//20210402_김은비_if문
public class HW01 {//클래스선언

	public static void main(String[] args) {//메인에서 시작
		Scanner k08_sc = new Scanner(System.in); //Scanner class 호출
		int k08_age = k08_sc.nextInt(); //integer타입의 변수 선언 후 Scanner 클래스를 통해 받은 수를 변수에 저장하도록 설정
		
		if (k08_age >= 20 && k08_age < 60) {// 변수의 input 값이 20~59 사이일 시, "성인 입니다" 출력 
			System.out.println("성인입니다.");
		} else if (k08_age >=14 && k08_age < 20) {
			System.out.println("청소년 입니다."); // 변수의 input 값이 14 ~ 20 사이일 시, "청소년 입니다" 출력
		} else if (k08_age >= 6 && k08_age < 14  ) {
			System.out.println("어린이 입니다."); //변수의 input 값이 6~13 사이일 시, "어린이 입니다" 출력
		} else {
			System.out.println("교통비 우대 대상입니다.");//변수의 input 값이 60이상인 경우 "교통비 우대 대상입니다" 출력
		}
		
	}

}
