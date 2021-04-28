package Lecture06;
//20210427 김은비 메서드 오버로딩 연습
public class OverloadingClass {
	//모두 다 똑같은 이름의 메서드라도 리턴하는 값과 각 메서드의 인자가 다르면 알아서 해당하는 메서드를 호출하여 사용가능
	//이런 기능을 method overloading이라고 한다
	public int k08_sum(int k08_a, int k08_b) {//두개의 인티저를 인자로 받는 메서드 선언
		return k08_a + k08_b;//두 인자를 더한 값 리턴
	}
	
	public int k08_sum(int k08_a, int k08_b, int k08_c) {//세개의 인티저를 인자로 받는 메서드 선언
		return k08_a + k08_b + k08_c;//세 인자를 더한 값 리턴
	}
	
	public int k08_sum(int k08_a, int k08_b, int k08_c, int k08_d) {//네개의 인티저를 인자로 받는 메서드 선언
		return k08_a + k08_b + k08_c + k08_d;//네 인자를 더한 값 리턴
	}
	
	public double k08_sum(double k08_a, double k08_b) {//두개의 더블형을 인자로 받는 메서드 선언
		return k08_a + k08_b;//두 인자를 더한 값 리턴
	}
}
