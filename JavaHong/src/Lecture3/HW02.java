package Lecture3;
//20210401_김은비_누적 및 합 구하기
public class HW02 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 시작
	
		int k08_sum; // 되도록 처음에 변수 선언 및 정의 (integer type)
		
		k08_sum = 0; //루프, 누적 전 변수 '0'으로 초기화
		
		//for 문을 i가 1~100으로 하나씩 증가하는 동안 수행
		//k08_sum변수는 현재 0이므로 1 ~ 100까지의 누적합을 구하는 연산
		for (int k08_i = 1; k08_i < 101; k08_i++) {
			k08_sum = k08_sum + k08_i; 
		}
		
		System.out.printf("#2 : %d\n", k08_sum); //루프 결과값 출력
		System.out.printf("#2-2 : %d\n", k08_sum / 100);//루프 결과값을 100으로 나눈 값(평균) 출력
		
		int[] k08_v = {1,2,3,4,5}; //integer type 배열 선언 및 정의, 값 저장
		int k08_vSum;//integer type 변수 선언 및 정의
		
		k08_vSum = 0; //누적, 루프 전 변수값 '0'으로 초기화
		
		//i값이 배열의 길이만큼 돌 수 있도록 조건 입력
		//k08_vSum변수의 초기값은 0 이므로 루프로 배열의 값을 모두 더하는 것과 같음
		for (int k08_i = 0; k08_i < k08_v.length; k08_i++) {
			k08_vSum = k08_vSum + k08_v[k08_i];
		}
		
		System.out.printf("#2-3 : %d\n", k08_vSum); //루프 결과값 출력
		

	}

}
