package Lecture06;

public class Elevator3 extends Elevator2 {//extends이용하여 elevator2클래스 상속받아 이용
	//20210427 김은비 엘레베이터 상속클래스 이용
	void k08_Repair() {//새로운 매서드 선언
		k08_help = String.format("수리중입니다");//해당 변수에 문자열 저장 : elevator2클래스를 상속받아 타입선언 안해도 됨
	}
	
	void k08_up() { //up 매서드 선언
		if (k08_floor >= k08_limit_up_floor) {//최상층일시
			k08_help = "마지막 층입니다";//help에 해당 문자열 저장
		} else {
			k08_floor = k08_floor + 2; //최상층이 아닐 시 2층씩 올라감
			k08_help = String.format("%d층입니다", k08_floor);//help에 해당 문자열 저장
		}
		
		this.k08_down();//down 메서드 호출하여 1칸 내려감
	}
	
	void k08_down() {//엘레베이터 다운
		super.k08_down();//상속받은 클래스의 down을 호출하여 실행
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.k08_help);//help 출력
	}
}
