package Lecture04;

import java.text.DecimalFormat;

//20210402_김은비_피라미드 찍기
public class HW09 {//클래스선언

	public static void main(String[] args) {//메인에서 시작
		int k08_n, k08_m; //integer type 변수 두가지 선언 및 정의
		
		k08_m =20;//변수 m에 20 저장
		k08_n = 1;//변수 n에 1 저장
		
		while(true) {
			for (int k08_i = 0; k08_i < k08_m; k08_i++) System.out.printf(" ");// i가 0~m사이일때 공백 반복 출력
			for (int k08_i = 0; k08_i < k08_n; k08_i++) System.out.printf("*");// i가 0~n사이일때 * 반복 출력
			System.out.printf("\n");//줄바꿈
			
			k08_m = k08_m - 1;//m값 1씩 줄이기(공백은 1씩 줄어든다)
			k08_n = k08_n + 2;//n값 2씩 증가(별은 2씩 늘려 1,3,5,7...개씩 찍을 수 있도록 함)
			
			if (k08_m < 0) break; //m값이 0보다 작아지면 while문 탈출
		}
		
		String k08_item = "사과"; //String 오브젝트 생성 및 문자열 사과 저장
		int k08_unit_price = 5000;//integer type 변수 선언 5000 저장
		int k08_num = 500;//integer type 변수 선언 500 저장
		int k08_total = 0;//integer type 변수 선언 및 0으로 초기화
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");//DecimalFormat 메서드로 숫자 출력형태 지정 (콤마)
		
		System.out.printf("======================================================\n");//구분선 출력
		//항목 출력 (%N.Ms의 꼴로 얼마나공백을 주고 문자열의 몇번째 자리까지 출력할지 지정)
		System.out.printf("%16.20s%8.8s%8.8s%10.8s\n","품목","단가","수량","합계");
		System.out.printf("======================================================\n");//구분선 출력
		
		//항목에 대한 값 출력_decimal format이용으로 문자열 출력(%N.Ms의 꼴로 얼마나공백을 주고 문자열의 몇번째 자리까지 출력할지 지정)
		System.out.printf("%16.20s%9.10s%9.10s%11.10s\n",
				k08_item, df.format(k08_unit_price), df.format(k08_num), df.format(k08_unit_price * k08_num));
		System.out.printf("======================================================\n");//구분선 출력

	}

}
