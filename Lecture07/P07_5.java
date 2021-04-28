package Lecture07;

public class P07_5 {
	//20210428 김은비 배열의 최대, 최소값 찾기
	public static void main(String[] args) {
		//integer 배열에 배열값 저장
		int [] k08_iArray = {1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 
				33, 11, 21, 11, 2121, 121, 5, 6, 234};
		
		for (int k08_i = 0; k08_i < k08_iArray.length; k08_i++) {//배열 크기 만큼 반복문 실행
			System.out.printf("iArray[%d] = %d\n", k08_i ,k08_iArray[k08_i]);//배열 i번째 값 출력
		}
		
		int k08_iMax = k08_iArray[0]; //맥스 변수에 배열 0번째 값 저장
		int k08_iMin = k08_iArray[0]; //미니멈 변수에 배열 0번째 값 저장
		int k08_iMaxPt = 0;
		int k08_iMinPt = 0;
		
		for (int k08_i = 0; k08_i < k08_iArray.length; k08_i++) { //배열 크기만큼 반복문 실행
			if (k08_iMax < k08_iArray[k08_i]) { //현재 맥스 변수 값이 배열 i번째 값보다 작을 경우
				k08_iMax = k08_iArray[k08_i]; //맥스 변수에 배열 i번째 값 저장
				k08_iMaxPt = k08_i; //몇번째 값인지 저장
			} else if (k08_iMin > k08_iArray[k08_i]) { //현재 미니멈 변수 값이 배열 i번째 값보다 클 경우
				k08_iMin = k08_iArray[k08_i]; //미니멈 변수에 배열 i번째 값 저장
				k08_iMinPt = k08_i;//몇번째 값인지 저장
			}
		}
		
		System.out.printf("Max Value: iArray[%d] = %d\n", k08_iMaxPt, k08_iMax);//최대값 출력
		System.out.printf("Min Value: iArray[%d] = %d\n", k08_iMinPt, k08_iMin);//최소값 출력
	}

}
