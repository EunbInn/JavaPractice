package Lecture05;
//20210412 김은비 달력 출력
public class Lecture5_3 {

	public static void main(String[] args) {
		int k08_iWeekday = 5; //요일당 0~6사이로 두고 1월 첫 시작일을 금요일로 맞추기 위해 6번째 날인 5로 초기화
		
		int[] k08_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//월별 마지막 날을 배열에 저장, 2월 윤달로 29일이 말일
		
		
		//for문을 12월까지로 이동
		for (int k08_iMon = 0; k08_iMon < 12; k08_iMon++) {
			System.out.printf("\n\n         %d월\n", k08_iMon + 1);
			System.out.printf("=======================\n");
			System.out.printf(" 일 월 화 수 목 금 토\n");
			for (int k08_i = 1; k08_i <= k08_iEnd[k08_iMon]; k08_i++) {
				if (k08_i == 1 && k08_iWeekday != 0) {
					for (int k08_j = 0; k08_j < k08_iWeekday; k08_j++) {
						System.out.printf("%5s", "");
					}
					System.out.printf("%4.3s", k08_i + " ");
				} else {
					System.out.printf("%5.3s", k08_i + " ");
				}
				k08_iWeekday++;
				if (k08_iWeekday == 7) {
					k08_iWeekday = 0;
					System.out.printf("\n");
				}
			}
		}

	}

}
