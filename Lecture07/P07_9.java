package Lecture07;

import java.util.ArrayList;

public class P07_9 {
	static ArrayList<OneRec1> k08_ArrayOneRec = new ArrayList<OneRec1>(); //클래스의 어레이리스트 선언 및 정의
	
	static int k08_sumkor = 0;//국어점수 합계 스테틱 인티저 타입으로 선언 및 초기화
	static int k08_sumeng = 0;//영어점수 합계 스테틱 인티저 타입으로 선언 및 초기화
	static int k08_summat = 0;//수학점수 합계 스테틱 인티저 타입으로 선언 및 초기화
	static int k08_sumsum = 0;//총합계점수 스테틱 인티저 타입으로 선언 및 초기화
	static int k08_sumave = 0;//총평균 점수 스테틱 인티저 타입으로 선언 및 초기화
	static final int k08_iPerson = 20; // 인원수 지정 상수화
	
	public static void main(String[] args) { //메인에서 시작
		dataSet();//데이터 셋 메서드 호출
		HeaderPrint();//헤더 출력
		for (int k08_i = 0; k08_i < k08_ArrayOneRec.size(); k08_i++) {//클래스 어레이의 사이즈만큼 반복문 실행
			ItemPrint(k08_i);//i변수를 인자로 받아 인당 점수 출력
		}
		TailPrint();//마지막 부분(평균, 합계) 출력
	}
	
	public static void dataSet() {//데이터를 넣는 메서드 선언
		for (int k08_i = 1; k08_i <= k08_iPerson; k08_i++) {//변수 iPerson값만큼 반복문 실행
			String k08_name = String.format("김은%02d", k08_i);//스트링 포맷 한글2자 + 숫자2자리로하여 저장
			int k08_kor = (int)(Math.random() * 100);//랜덤함수 인티저로 변환하여 변수 저장
			int k08_eng = (int)(Math.random() * 100);//랜덤함수 인티저로 변환하여 변수 저장
			int k08_mat = (int)(Math.random() * 100);//랜덤함수 인티저로 변환하여 변수 저장
			k08_ArrayOneRec.add(new OneRec1(k08_i, k08_name, k08_kor, k08_eng, k08_mat));//inputData 클래스의 SetData 메서드 호출 및 인자 입력
		}
	}
	
	public static void HeaderPrint() {//헤더 출력 메서드 선언
		System.out.printf("=========================================\n");//구분선 출력
		System.out.printf("%2s  %4s  %2s %2s %2s %2s  %2s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");//헤더 출력
		System.out.printf("=========================================\n");//구분선 출력
	}
	
	public static void ItemPrint(int k08_i) {//점수 출력 메서드 선언
		OneRec1 k08_rec;//클래스 오브젝트 선언
		k08_rec = k08_ArrayOneRec.get(k08_i); //인자 i번째의 값을 클래스 객체에 저장
		System.out.printf("%4d   %4s  %3d %3d %3d   %3d %6.2f\n",//출력 포맷 지정
				k08_rec.student_id(), k08_rec.name(), k08_rec.kor(), k08_rec.eng(), k08_rec.mat(), k08_rec.sum(), k08_rec.ave());
		
		k08_sumkor += k08_rec.kor();//국어점수 누적
		k08_sumeng += k08_rec.eng();//영어점수 누적
		k08_summat += k08_rec.mat();//수학점수 누적
		k08_sumsum += k08_rec.sum();//총합계 누적
		k08_sumave += k08_rec.ave();//평균 누적
	}
	
	public static void TailPrint() {
		double k08_nanum = (double)k08_ArrayOneRec.size();//어레이 사이즈를 더블형변환
		System.out.printf("*****************************************\n");//구분선 출력
		System.out.printf("국어합계 %d   국어평균: %6.2f\n", k08_sumkor, k08_sumkor / k08_nanum); // 국어 합계와 평균 출력
		System.out.printf("영어합계 %d   영어평균: %6.2f\n", k08_sumeng, k08_sumeng / k08_nanum);// 영어 합계와 평균 출력
		System.out.printf("수학합계 %d   수학평균: %6.2f\n", k08_summat, k08_summat / k08_nanum);// 수학 합계와 평균 출력
		System.out.printf("*****************************************\n");//구분선 출력
		System.out.printf("반평균합계 %d   반평균: %6.2f\n", k08_sumave, k08_sumave / k08_nanum);// 총합계와 총평균 출력
	}

}
