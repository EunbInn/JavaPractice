package Lecture3;
//20210401_김은비_소비자가 세금계산
public class HW07 {//클래스선언

	public static void main(String[] args) {//메인에서부터 시작
		String[] k08_item = {"바나나킥","웨하스","꼬북칩","오땅","오예스"}; //String 타입 배열 정의, 문자열(과자종류) 저장
		int[] k08_price = {1000,2000,2400,1450,3000};//integer 타입 배열 정의, 가격 저장
		int[] k08_amount = {10,2,1,3,5};//integer 타입 배열 정의, 수량 저장
		double k08_tax_rate = 0.1;//세율 10%로 0.1 정의
		int k08_total_sum = 0;//integer 타입 변수 정의,루프 전 누적 계산 값 0으로 초기화
		
		System.out.printf("***************************************\n");//구분선 출력
		System.out.printf("             과자 금액 계산                 \n");//제목 출력
		System.out.printf("=======================================\n");//구분선 출력
		System.out.printf("  항목        단가     수량          합계   \n");// 카테고리 열 출력
		
		//for loop으로 각 item 별 가격 수량과 곱하여 sum값 구하기
		//item 별 합계금액을 total_sum변수에 루프동안 누적하여 총 합계금액 저장
		//item 이름, 가격, 수량, item별 총금액 printf 명령어로 양식에 맞게 출력
		for (int k08_i = 0; k08_i < k08_item.length; k08_i++) {
			int k08_sum = k08_price[k08_i] * k08_amount[k08_i];
			k08_total_sum = k08_total_sum + k08_sum;
			System.out.printf(" %.5s \t %7d     %2d     %9d\n", k08_item[k08_i], k08_price[k08_i]
							,k08_amount[k08_i], k08_sum);
		}
		System.out.printf("***************************************\n");//구분선 출력
		System.out.printf(" 지불 금액 :   \t %20d\n", k08_total_sum);//고객이 지불해야하는 금액 출력
		
		int k08_total_net_price = (int)(k08_total_sum / (1 + k08_tax_rate));//세전금액 : 소비자가/(1 + 세율)
		System.out.printf(" 과세 금액 :   \t %20d\n", k08_total_net_price);//세전금액 출력
		int k08_tax = k08_total_sum - k08_total_net_price;//세금 = 소비자가 - 세전금액
		System.out.printf(" 세    금 :   \t %20d\n", k08_tax);//세금 출력

	}

}
