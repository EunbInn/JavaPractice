package Lecture3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//20210401_김은비_단순환전계산
public class HW08 {//클래스 선언

	public static void main(String[] args) {//메인에서 시작
		int k08_MyWon = 1000000;//integer 타입 MyWon 변수 정의 및 1000000 저장 
		double k08_MoneyEx = 1130.50;//4/1 자 달러 환율 : double type 저장
		double k08_commission = 0.003; //환전 수수료 0.3% 지정
		
		int k08_usd, k08_remain;
		//원화 잔돈: 환전희망 금액 - 환전금액 * 환율 => integer 변환하여 소수점 아래 버림
		
		double k08_ComPerOne = k08_MoneyEx * k08_commission;//달러당수수료: 환율 * 환전 수수료
		
		k08_usd = (int)(k08_MyWon / (k08_MoneyEx + k08_ComPerOne)); //환전 희망 금액/(환율 + 달러당수수료) integer 변환하여 소수점 아래 버림
		double k08_totalcom = k08_usd * k08_ComPerOne;//총 수수료: 환전달러*달러당 수수료
		
		int k08_i_totalcom;//총 수수료의 정수부분 출력을 해 형변환값 저장을 위한 integer type 변수 선언 및 정의
		
		//(올림처리)double 타입 총 수수료의 값이 소수점 아래 수를 버림 한 값과 다를 때,
		//integer타입 형변환 후 + 1
		//같을 때에는 integer형변환만 한 후 i_totalcom변수에 값 저장
		if (k08_totalcom != (double)((int)k08_totalcom)) {
			k08_i_totalcom = (int)k08_totalcom + 1;
		} else {
			k08_i_totalcom = (int)k08_totalcom;
		}
		
		DecimalFormat k08_df = new DecimalFormat("###,###,###,###");// 숫자 format을 정해서 출력하기(String type)
		
		System.out.printf("********************************************************************\n");//구분선 출력
		System.out.printf("*                        (정확한) 수수료 적용 환전                       *\n");//제목 출력
		System.out.printf("총 수수료: %s원 => 미화: %s달러, 달러당 수수료:  %f원\n",      //DecimalFormat이 String type이므로
							k08_df.format(k08_i_totalcom),                       //출력도 String %s로 변경하여 출력
							k08_df.format(k08_usd), 
							k08_ComPerOne);//수수료 관련 값출력
		//잔돈 : 원화-(환전금액을 원화로 바꾼금액)-환전수수료 => 소수점 아래 버림
		k08_remain = (int)(k08_MyWon-k08_usd *k08_MoneyEx - k08_i_totalcom);
		System.out.printf("총 한화환전금액: %s원 => 미화: %s달러, 수수료청구: %s원 잔돈: %s원\n",
							k08_df.format(k08_MyWon), 
							k08_df.format(k08_usd), 
							k08_df.format(k08_i_totalcom), 
							k08_df.format(k08_remain));//환전액 관련 값 출력
		
		Calendar k08_cal = Calendar.getInstance();
		SimpleDateFormat k08_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		System.out.printf("최종실행시간: %s\n", k08_sdf.format(k08_cal.getTime()));
		System.out.printf("********************************************************************\n");//구분선 출력

	}

}
