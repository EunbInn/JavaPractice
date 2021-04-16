package Lecture04;
//20210402_김은비_for문
public class HW02 {//클래스선언

	public static void main(String[] args) {//메인에서 시작
		int k08_sum = 0; //for loop 전, integer type 선언하면서 누적 연산 할 변수 0으로 초기화
		
		for (int k08_i = 0; k08_i < 10; k08_i++) {//i 가 0 부터 1씩 증가하며 9가 될 때까지 아래 내용 반복
			k08_sum = k08_sum + k08_i;//처음 sum값은 0 이므로 1씩 증가하는 i를 서로 더함
		}
		System.out.printf("sum %d\n", k08_sum);//for loop 결과물 출력
		
		for (int 
				k08_i = 1; k08_i < 10; k08_i++) {//변수 i의 값이 1부터 1씩 증가하며 1~9까지 반복문 실행
			System.out.printf("**************\n");//구분선 출력
			System.out.printf("  구구단 %d 단 \n", k08_i);//구구단 단 출력
			System.out.printf("**************\n", k08_i);//구분선 출력
			for (int j = 1; j < 10; j++) {//변수 j의 값이 1부터 1씩 증가하며 1~9까지 반복문 실행 (i 1번에, j 9번 실행)
				System.out.printf("  %d * %d = %d \n", k08_i, j, (k08_i * j));//구구단 포맷으로 출력 (i * j = n * 1 ~ 9)
			}
		}

	}

}
