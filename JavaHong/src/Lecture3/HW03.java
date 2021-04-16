package Lecture3;
//20210401_김은비_정수형 변수의 나눗셈(feat.몫과 나머지)
public class HW03 {//클래스 선언

	public static void main(String[] args) {//메인에서부터 시작
		int k08_ii;//integer type 변수 정의 및 선언
		
		k08_ii = 1000 / 3;// 1000을 3으로 나눈 몫을 k08_ii변수에 저장
		System.out.printf("#3-1 : %d\n", k08_ii);//변수 k08_ii 출력
		
		k08_ii = 1000 % 3;// 1000을 3으로 나눈 나머지를 k08_ii변수에 저장
		System.out.printf("#3-2 : %d\n", k08_ii);//변수 k08_ii 출력
		
		for (int k08_i = 0; k08_i < 20; k08_i++) {//i를 0 ~19 사이로 for 루프를 통해 출력
			System.out.printf("#3-3 : %d\t", k08_i); //출력시 간격을 맞추고 싶어 \t삽입
			
			if (((k08_i + 1) % 5) == 0) {//i를 5로 나눈 나머지가 0일 경우 개행
				System.out.printf("\n");
			}
		}

	}

}
