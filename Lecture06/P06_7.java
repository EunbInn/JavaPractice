package Lecture06;

public class P06_7 {
//20210427 김은비 오버로딩 연습2_메인
	public static void main(String[] args) {
		Overloading2 k08_ov = new Overloading2();//오버로딩메소드 클래스 객체 생성
		int k08_kor = 100;//인티저 타입 변수 선언 및 값 저장
		int k08_eng = 100;//인티저 타입 변수 선언 및 값 저장
		int k08_mat = 100;//인티저 타입 변수 선언 및 값 저장
		int k08_sci = 100;//인티저 타입 변수 선언 및 값 저장
		int k08_soc = 100;//인티저 타입 변수 선언 및 값 저장
		
		System.out.printf("3월 성적표\n");//3월 성적표 제목 출력
		System.out.printf("====================================================\n");//구분선 출력
		System.out.printf("이름    국어   영어  수학  총점  평균\n");//헤더 출력
		System.out.printf("====================================================\n");//구분선 출력
		System.out.printf("김은비  %d    %d   %d   %d   %d\n", //세과목 점수와 오버로딩으로 호출한 합, 평균 출력
				k08_kor, k08_eng, k08_mat, k08_ov.k08_sum(k08_kor, k08_eng, k08_mat), k08_ov.k08_ave(k08_kor, k08_eng, k08_mat));
		
		System.out.printf("\n4월 성적표\n");//4월 성적표 제목 출력
		System.out.printf("====================================================\n");//구분선 출력
		System.out.printf("이름    국어   영어  수학   과학  총점   평균\n");//헤더 출력
		System.out.printf("====================================================\n");//구분선 출력
		System.out.printf("김은비  %d    %d   %d   %d    %d   %.1f\n", //네과목 점수와 오버로딩으로 호출한 합, 평균 출력
				k08_kor, k08_eng, k08_mat, k08_sci, k08_ov.k08_sum(k08_kor, k08_eng, k08_mat, k08_sci),
				k08_ov.k08_ave(k08_kor, k08_eng, k08_mat, k08_sci));
		
		System.out.printf("\n5월 성적표\n");//5월 성적표 제목 출력
		System.out.printf("====================================================\n");//구분선 출력
		System.out.printf("이름    국어   영어  수학   과학  사회  총점   평균\n");//헤더 출력
		System.out.printf("====================================================\n");//구분선 출력
		System.out.printf("김은비  %d    %d   %d    %d   %d   %d   %.1f\n",//다섯과목 점수와 오버로딩으로 호출한 합, 평균 출력
				k08_kor, k08_eng, k08_mat, k08_sci, k08_soc, k08_ov.k08_sum(k08_kor, k08_eng, k08_mat, k08_sci, k08_soc), 
				k08_ov.k08_ave(k08_kor, k08_eng, k08_mat, k08_sci, k08_soc));

	}

}
