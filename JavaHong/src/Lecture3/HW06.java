package Lecture3;
//20210401_김은비_단순세금계산
public class HW06 {//클래스 선언

	public static void main(String[] args) {//메인에서 시작
		int k08_val = 271;//integer 변수 정의, 선언 후 271 값으로 저장
		int k08_rate = 3;//integer 변수 정의, 선언 후 3을 변수에 저장
		
		//tax변수를 integer 타입으로 정의하고 선언, TaxCalc06 클래스에 있는 k08Taxcal 함수 호출
		//integer type을 인자로 받는 함수로, val변수와 rate변수를 인자로 넣어주었다.
		int k08_tax = TaxCalc06.k08Taxcal(k08_val, k08_rate);
		
		System.out.printf("*******************************************\n");//구분선 출력
		System.out.printf("*               단순 세금 계산               *\n");//제목 출력
		//실제 세금 = 세전가격 * 세율 / 100 이 때, val,rate 변수가 모두 integer타입이므로 소수점 아래까지 출력하기위해 100.0 곱함
		System.out.printf("실제 세금계산: %f\n", k08_val * k08_rate / 100.0);
		
		//세전가격: val, 세금: tax, 세포가: val + tax
		System.out.printf("세전가격: %d 세금: %d 세포함가격: %d\n", k08_val, k08_tax, k08_val + k08_tax);
		
		System.out.printf("*******************************************\n");//구분선 출력

	}

}
