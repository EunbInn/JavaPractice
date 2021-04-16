package Lecture04;
//20210402_김은비_숫자읽기
public class HW06 {//클래스 선언 

	public static void main(String[] args) {//메인에서 시작
		String[] k08_units = {"영","일","이","삼","사","오","육","칠","팔","구"}; //배열에 문자열 저장
		
		for (int k08_i = 0; k08_i < 101; k08_i++) {// i가 0~100사이일 동안 반복문 실행
			if (k08_i >= 0 && k08_i < 10) { // 0 =< i < 10 조건을 충족할 시 i번째 배열 출력
				System.out.printf("일의 자리 : %s\n", k08_units[k08_i]);
			} else if (k08_i >= 10 && k08_i < 100) {// 10 =< i < 100일 경우
				int k08_i10,k08_i0; //integer type 변수 두가지 선언 및 정의
				k08_i10 = k08_i / 10;// 변수 i 를 10으로 나눈 몫을 i10에 저장(10의 자리)
				k08_i0 = k08_i % 10;// 변수 i를 10으로 나눈 나머지를 i0에 저장(1의 자리)
				if (k08_i0 == 0) {//i의 1의 자리가 0일 경우 i10번째 배열 을 "N십"의 꼴로 출력
					System.out.printf("십의 자리 : %s십\n", k08_units[k08_i10]);
				} else {//그 외에는 i10번째 배열과 i0번째 배열을 불러와"N십M"의 꼴로 출력
					System.out.printf("십의 자리 : %s십%s\n", k08_units[k08_i10],k08_units[k08_i0]);
				}
			} else System.out.printf("==> %d\n", k08_i); //i가 100일 경우 출력
		}
		
		

	}


}
