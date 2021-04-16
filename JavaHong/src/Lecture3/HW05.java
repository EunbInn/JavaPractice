package Lecture3;
//20210401_김은비_소수점 이하 자리의 계산(반올림, 버림)
public class HW05 {//클래스 선언

	public static void main(String[] args) {//메인부터 시작
		int k08_MyVal = 14 / 5; //integer type의 변수는 나눗셈을 할 때, 소수점 이하 자리는 버림을 하게 됨
		
		System.out.printf("#5-1 : %d\n", k08_MyVal);//변수 출력
		
		double k08_MyValF; //double type 변수 선언 및 정의
		
		//14/5의 값을 변수에 저장. 단, 변수가 double타입일 지라도 정수형 숫자끼리 계산일 시에는 소수점 아래 수는 버림 처리 됨
		k08_MyValF = 14 / 5; 
		System.out.printf("#5-2 : %f\n", k08_MyValF);//float 형태로 변수 출력
		
		k08_MyValF = 14.0 / 5;//14.0/5의 값을 변수에 저장. 하나라도 실수일 시 계산결과 역시 실수
		System.out.printf("#5-3 : %f\n", k08_MyValF);//변수 출력
		
		k08_MyValF = (14.0 / 5) + 0.5;//14.0/5으 값에 0.5를 더하여 변수에 저장 
		System.out.printf("#5-4 : %f\n", k08_MyValF);//변수 출력
		
		k08_MyVal = (int)((14.0 / 5) + 0.5);//14.0/5 +0.5를 integer 변환 및 소수점 아래 버림 -> 반올림 처리
		System.out.printf("#5-5 : %d\n", k08_MyVal);//변수 출력

	}

}
