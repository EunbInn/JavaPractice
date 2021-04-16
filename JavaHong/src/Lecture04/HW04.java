package Lecture04;
//20210402_김은비_숫자형, 문자형 비교
public class HW04 {//클래스 선언

	public static void main(String[] args) {//메인에서 시작
		int k08_iI;//integer type 변수 선언 및 정의
		double k08_iD;//double type 변수 선언 및 정의
		
		k08_iI = 10 / 3; // 10 / 3 으로 나눈 값을 변수 iI에 저장 (정수형 끼리의 나눗셈 = 소수점 아래 버리고 정수부분만 취함)
		k08_iD = 10 / 3.0;//10 / 3.0 결과 값 iD에 저장(정수형, 실수형 나눗셈 실수형 변수에 저장 = 소수점 아래까지 취함) 
		
		if (k08_iI == k08_iD) { // 정수타입 연산과 실수타입 연산의 결과가 다르므로 Not equal 이 출력될 것이다.
			System.out.printf("equal\n");//true일 경우 출력
		} else {//false 일 경우 출력하되 iI를 double타입으로 출력. 이미 연산을 마친 값이기 때문에 형태만 변할 뿐 값이 달라지지 않는다.
			System.out.printf("Not equal[%f][%f]\n", (double)k08_iI, k08_iD); 
		}
		
		//출력시에는 유효숫자만 출력하기에 같아보일 수 있으나 iD의 실제 값은 "3.333...."이라 3.33333처럼 정해진 값과 다르다. 
		if (k08_iD == 3.33333) {
			System.out.printf("equal\n");//true 면 출력
		} else {
			System.out.printf("Not equal[3.333333][%f]\n", k08_iD);//false면 출력
		}
		
		k08_iD = (int)k08_iD;//integer 타입으로 형변환하면서 소수점 아래 버림. 저장은 double 변수에 했으므로 타입은 double
		if (k08_iI == k08_iD) {//윗줄에서 버림처리하여 값이 같으므로 equal 출력
			System.out.printf("equal\n");//true면 출력
		} else {//false면 출력: integer 변수 -> double로 형변환 
			System.out.printf("Not equal[%f][%f]\n", (double)k08_iI, k08_iD);
		}
		
		//int로 인쇄하라지만 변수 iD는 double이므로 ".0.."함께 출력되며 %d 로 출력 불가
		System.out.printf("int로 인쇄[%d][%f]\n", k08_iI, k08_iD);
		System.out.printf("double로 인쇄[%f][%f]\n", (double)k08_iI, k08_iD);//변수 iI를 형변환하여 두 변수 모두 double로 출력
		
		char k08_a = 'c';//character type 변수 선언 및 정의, 'c' 변수에 저장
		
		if (k08_a == 'b') System.out.printf("a는 b이다\n");//false
		if (k08_a == 'c') System.out.printf("a는 c이다\n");//true면 출력 -> k08_a에 저장된 값이 'c'이므로 출력
		if (k08_a == 'd') System.out.printf("a는 d이다\n");//false

		String k08_aa = "abcd";//String 클래스에 문자열 abcd 저장
		
		if (k08_aa.equals("abcd")) {//String은 변수가 아닌 클래스이기 때문에 등호 사용 불가, .equals method 호출하여 사용
			System.out.printf("aa는 abcd이다\n");//true면 출력 -> 조건과 값이 동일하기 때문에 출력
		} else {
			System.out.printf("aa는 abcd가 아니다\n");//false면 출력
		}
		
		boolean k08_bb = true; //boolean 변수 선언 및 정의, true 값 저장
		
		if (!!k08_bb) { //부정의 부정이기 때문에 true이며, 변수 bb의 값과 일치하므로 조건문 true
			System.out.printf("bb가 아니고 아니면 참이다\n");//true일 경우 출력
		} else {
			System.out.printf("bb가 아니고 아니면 거짓이다\n");//false 일 경우 출력
		}
	}

}
