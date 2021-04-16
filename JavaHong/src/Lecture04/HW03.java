package Lecture04;
//20210402_김은비_for문
public class HW03 {//클래스선언

	public static void main(String[] args) {//메인에서 시작
		int k08_sum = 0; //for loop 전, integer type 선언하면서 누적 연산 할 변수 0으로 초기화
		
		for (int k08_i = 0; k08_i < 10; k08_i++) {//i 가 0 부터 1씩 증가하며 9가 될 때까지 아래 내용 반복
			k08_sum = k08_sum + k08_i;//처음 sum값은 0 이므로 1씩 증가하는 i를 서로 더함
		}
		System.out.printf("sum %d\n", k08_sum);//for loop 결과물 출력
		
		for (int k08_i = 1; k08_i < 10; k08_i++) {//변수 i의 값이 1부터 1씩 증가하며 1~9까지 반복문 실행
			System.out.printf("**************\n");//구분선 출력
			System.out.printf("  구구단 %d 단 \n", k08_i);//구구단 단 출력
			System.out.printf("**************\n", k08_i);//구분선 출력
			for (int j = 1; j < 10; j++) {//변수 j의 값이 1부터 1씩 증가하며 1~9까지 반복문 실행 (i 1번에, j 9번 실행)
				System.out.printf("  %d * %d = %d \n", k08_i, j, (k08_i * j));//구구단 포맷으로 출력 (i * j = n * 1 ~ 9)
			}
			
		}
		
		int k08_iA, k08_iB;// integer 타입의 변수 두가지 선언 및 정의
		
		k08_iA = 0;// 반복문 연산 전 0으로 초기화
		while(true) {//while문 시작
			k08_iB = 0;// 반복문 연산 전 0으로 초기화
			while(true) {//두번째 while문 시작
				System.out.printf("*"); // 별찍기
				
				if (k08_iA == k08_iB) break; //두 변수가 서로 값이 같을 경우 두번째 while문 탈출
				k08_iB++;//변수 iB 1 증가
			}
			System.out.printf("\n");// 줄바꾸기
			k08_iA++;// 변수 iA 1 증가
			if (k08_iA == 30) break; //변수 iA가 30이 되면 반복문 완전 탈출 
		}

	}

}
