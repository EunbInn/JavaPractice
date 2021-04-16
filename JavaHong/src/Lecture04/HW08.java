package Lecture04;
//20210402_김은비_띄어쓰기 연습
public class HW08 {//클래스선언
	
	public static void main(String[] args) {//메인에서 시작

		for (int k08_i = 0; k08_i < 10; k08_i++) {// i가 0~9사이일 동안 반복문 실행
			for (int k08_j = 0; k08_j < k08_i; k08_j++) System.out.printf(" ");//j가 0 ~ (i - 1) 동안 공백 반복 출력
			System.out.printf("%d\n", k08_i);//j반복문 종료시 i출력 후 줄바꿈
		}
		
		System.out.println();
		
		double k08_fSin;// double 타입 변수 선언 및 정의
		
		for (int k08_i = 0; k08_i < 360; k08_i++) {//0~359(= 1~360)까지의 sin 값이 어떻게 나오는지 알기위해 반복문 이용  
			//sinX도는 1- =< sinX =< 1 값, sin함수는 인자로 라디언 값을 받기때문에 각도(i) * 파이 / 180 넣는다
			k08_fSin = Math.sin(k08_i * 3.141592 / 180);
			System.out.printf("%d sin ==>%f\n", k08_i, k08_fSin);//각도에 따른 sin값 출력
		}
		
		for (int k08_i = 0; k08_i < 360; k08_i++) {//i 변수의 값이 0~359 사이일 동안 반복문 실행  
			//sinX도는 1- =< sinX =< 1 값, sin함수는 인자로 라디언 값을 받기때문에 각도(i) * 파이 / 180 넣는다
			k08_fSin = Math.sin(k08_i * 3.141592 / 180);
			
			// sin값에 대하여 범위를 0~2로 하고 *50(반지름) 하여 0~100사이의 y값을 갖는 sin함수 그래프를 그릴 수 있다.
			int k08_iSpace = (int)((1.0 - k08_fSin) * 50);
			for (int k08_j = 0; k08_j < k08_iSpace; k08_j++) System.out.printf(" ");//0~iSpace의 값(y) 만큼의 공백 출력
			System.out.printf("*[%f][%d]\n", k08_fSin, k08_iSpace);//각 위치에서의 sin값과 그래프 y값 출력 
			
			
		}
		

	}

}
