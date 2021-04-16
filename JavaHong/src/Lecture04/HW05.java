package Lecture04;
//20210402_김은비_범위를 주어 비교(찾기)
public class HW05 {//클래스 선언

	public static void main(String[] args) {//메인에서 시작
		int k08_iVal;//integer type 형변환
		
		for (int k08_i = 0; k08_i < 300; k08_i++) {// 변수 i 가 0부터 ~299가 될때까지 반복문 실행
			k08_iVal = 5 * k08_i;// i * 5(5의배수) 값을 iVal 변수에 저장
			if (k08_iVal >= 0 && k08_iVal < 10) {//iVal 변수값이 0~9일 경우 숫자 앞에 '일' 출력
				System.out.printf("일 %d\n", k08_iVal);
			} else if (k08_iVal >= 10 && k08_iVal < 100) {//iVal 변수값이 10~99일 경우 숫자 앞에 '십' 출력
				System.out.printf("십 %d\n", k08_iVal);
			} else if (k08_iVal >= 100 && k08_iVal < 1000) {//iVal 변수값이 100~999일 경우 숫자 앞에 '백' 출력
				System.out.printf("백 %d\n", k08_iVal);
			} else {
				System.out.printf("천 %d\n", k08_iVal);//iVal 변수값이 1000이상 일 경우 숫자 앞에 '천' 출력 (iVal 최대값 1495)
			}
		}
		
		for (int k08_i = 1; k08_i < 13; k08_i++) {//i가 1~12 사이일 경우 반복문 실행
			System.out.printf(" %d월 =>", k08_i);//i값이 증가하면서 "i월" 출력
			for (int k08_j = 1; k08_j < 32; k08_j++) {//j가 1~31 사이일 경우 반복문 실행
				
				System.out.printf(" %d",k08_j);//j값이 증가하면서 "j"출력
				
				if (k08_i == 1 && k08_j == 31) break;// i = 1, j = 31 두가지 조건 모두 충족시 break
				if (k08_i == 2 && k08_j == 28) break;// i = 2, j = 28 두가지 조건 모두 충족시 break
				if (k08_i == 3 && k08_j == 31) break;// i = 3, j = 31 두가지 조건 모두 충족시 break
				if (k08_i == 4 && k08_j == 30) break;// i = 4, j = 30 두가지 조건 모두 충족시 break
				if (k08_i == 5 && k08_j == 31) break;// i = 5, j = 31 두가지 조건 모두 충족시 break
				if (k08_i == 6 && k08_j == 30) break;// i = 6, j = 30 두가지 조건 모두 충족시 break
				if (k08_i == 7 && k08_j == 31) break;// i = 7, j = 31 두가지 조건 모두 충족시 break
				if (k08_i == 8 && k08_j == 31) break;// i = 8, j = 31 두가지 조건 모두 충족시 break
				if (k08_i == 9 && k08_j == 30) break;// i = 9, j = 30 두가지 조건 모두 충족시 break
				if (k08_i == 10 && k08_j == 31) break;// i = 10, j = 31 두가지 조건 모두 충족시 break
				if (k08_i == 11 && k08_j == 30) break;// i = 11, j = 30 두가지 조건 모두 충족시 break
				if (k08_i == 12 && k08_j == 31) break;// i = 12, j = 31 두가지 조건 모두 충족시 break
				System.out.printf(",");//콤마 출력을 break 아래에 두면 마지막 숫자 출력시에는 break가 먼저 실행되어 콤마 출력 x
			}
			System.out.printf("\n");//이중 변수 j의 반복문이 한 번 끝날 때마다 줄바꿈
		}
		
		System.out.println();
		
		
		for (int k08_i = 1; k08_i < 13; k08_i++) {//i가 1~12 사이일 경우 반복문 실행
			System.out.printf(" %d월 =>", k08_i);//i값이 증가하면서 "i월" 출력
			for (int k08_j = 1; k08_j < 32; k08_j++) {//j가 1~31 사이일 경우 반복문 실행
				
				System.out.printf(" %d",k08_j);//j값이 증가하면서 "j"출력
				
				//i와 j 조건 동시에 만족할 경우 break
				if ((k08_i == 4 || k08_i == 6 || k08_i == 9 || k08_i == 11) && (k08_j == 30)) break;
				else if (k08_i == 2 && (k08_j == 30)) break;//i와 j 조건 동시에 만족할 경우 break
				else if (k08_j == 31) break; // j = 31을 만족할 경우 break
				
				System.out.printf(","); //콤마 출력: break 뒤에 와서 마지막 숫자 출력시 출력x
			}
			System.out.printf("\n");//이중 변수 j의 반복문이 한 번 끝날 때마다 줄바꿈
		}
		
		
		System.out.println();
		
		for (int k08_i = 1; k08_i < 13; k08_i++) {//i가 1~12 사이일 경우 반복문 실행
			System.out.printf(" %d월 =>", k08_i);//i값이 증가하면서 "i월" 출력
			LOOP: for (int k08_j = 1; k08_j < 32; k08_j++) {//j가 1~31 사이일 경우 반복문 실행
				
				System.out.printf(" %d,",k08_j);//j값이 증가하면서 "j,"출력
				
				switch(k08_i) {//i값에 따른 조건 설정
				case 4:case 6:case 9:case 11:// i가 4,6,9,11일 경우 30까지만 출력
					if (k08_j == 30) break LOOP;//조건 충족시 LOOP가 있는 곳으로 정상적으로 break 후 다음 반복문 실행
					break;//switch case문 탈출
				case 2:// i가 2일 경우 28까지만 출력
					if (k08_j == 28) break LOOP;//조건 충족시 LOOP가 있는 곳으로 정상적으로 break 후 다음 반복문 실행
					break;//switch case문 탈출
				}
			}
			System.out.printf("\n");//이중 변수 j의 반복문이 한 번 끝날 때마다 줄바꿈
		}
		
		int[] k08_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31}; // 배열에 마지막 날짜 저장
		
		for (int k08_i = 1; k08_i < 13; k08_i++) {//i가 1~12 사이일 경우 반복문 실행
			System.out.printf(" %d월 =>", k08_i);//i값이 증가하면서 "i월" 출력
			for (int k08_j = 1; k08_j < 32; k08_j++) {//j가 1~31 사이일 경우 반복문 실행
				
				System.out.printf(" %d",k08_j);//j값이 증가하면서 "j"출력
				
				if (k08_iLMD[k08_i - 1] == k08_j) break; // j가 배열의 i-1번째 숫자와 같으면 break
				
				System.out.printf(","); //콤마 출력: break 뒤에 와서 마지막 숫자 출력시 출력x
			}
			System.out.printf("\n");//이중 변수 j의 반복문이 한 번 끝날 때마다 줄바꿈
		}
		
	}
}
