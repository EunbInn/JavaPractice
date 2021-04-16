package Lecture3;

public class TaxCalc06 {//클래스 선언
	
	//다른 곳에서도 오브젝트 생성 없이 호출할 수 있도록 static, integer타입의 값을 반환하기 위해 int
	public static int k08Taxcal(int k08_val, int k08_rate) {//integer 타입 인자 2개를 받고 각각 val,rate로 변수 선언
		int k08_ret;//ret변수 선언 및 정의(=세금)
		
		//val*rate를 double타입으로 나눠도 integer타입으로 나눈 값과 같을 때(결과값이 정수일 때), val*rate /100 그대로 반환
		//val*rate를 double타입으로 나눈 값에 소수점 이하 자리가 있을 경우, val*rate /100에 + 1 하여 반환(올림처리)
		if (((double)k08_val *(double)k08_rate / 100.0) == k08_val * k08_rate /100) {
			k08_ret = k08_val * k08_rate / 100;
		} else {
			k08_ret = k08_val * k08_rate / 100 + 1;
		}
		
		return k08_ret;//조건에 따라 저장된 변수 값 반환
	}
}
