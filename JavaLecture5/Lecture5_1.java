package Lecture05;
//20210412 김은비 구구단 출력
public class Lecture5_1 {

	public static void main(String[] args) {//메인에서 시작
		//3에 한 번씩 개행을 하기 위해 변수 i의 증가 폭을 +3으로 하고
		//반복의 범위는 구구단 범위에 맞춰 1~9까지로 함
		for (int k08_i = 1; k08_i < 10; k08_i += 3) { 
			System.out.printf("***************\t***************\t***************\n");//구분선 출력
			//한 줄에 3개씩 직접 입력하여 출력 i단 i+1단 i+2단씩 출력
			System.out.printf("   구구단 %d 단   \t   구구단 %d 단   \t   구구단 %d 단   \n",k08_i, (k08_i + 1), (k08_i + 2));
			System.out.printf("***************\t***************\t***************\n");//구분선 출력
			//이중 for문 내에 있는 변수는 범위는 i의 범위와 같지만 증가 폭은 1로 함
			for (int k08_j = 1; k08_j < 10; k08_j++) { 
				//바깥쪽 for문과 마찬가지로 직접 수동으로 입력하여 3줄 출력 j값은 그대로, i값만 i, i+1, i+2로 하여 출력 및 계산
				//오른쪽 정렬을 하기 위해 숫자를 string형식으로 변환하여 출력
				System.out.printf("  %d x %d = %3.3s \t  %d x %d = %3.3s \t  %d x %d = %3.3s \n",
						k08_i, k08_j, (k08_i * k08_j), //i단의 * j값
						(k08_i + 1), k08_j, ((k08_i + 1) * k08_j), //i + 1단의 * j값 
						(k08_i + 2), k08_j, ((k08_i + 2) * k08_j) );//i + 2단의 * j값
				
			}
			System.out.println();//이중 for믄 한 턴 끝나면 줄바꿈
		}
	}

}
