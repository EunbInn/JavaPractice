package Lecture07;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class P07_10 {
	static ArrayList<OneRec1> k08_ArrayOneRec = new ArrayList<OneRec1>(); //클래스의 어레이리스트 선언 및 정의
	
	static int k08_sumkor = 0;//국어점수 합계 스테틱 인티저 타입으로 선언 및 초기화
	static int k08_sumeng = 0;//영어점수 합계 스테틱 인티저 타입으로 선언 및 초기화
	static int k08_summat = 0;//수학점수 합계 스테틱 인티저 타입으로 선언 및 초기화
	static int k08_sumsum = 0;//총합계점수 스테틱 인티저 타입으로 선언 및 초기화
	static double k08_sumave = 0;//총평균 점수 스테틱 인티저 타입으로 선언 및 초기화
	static int k08_nukor = 0; //스태틱 인티저로 변수선언 및 국어 누적값 초기화
	static int k08_nueng = 0; //스태틱 인티저로 변수선언 및 영어 누적값 초기화
	static int k08_numat = 0;//스태틱 인티저로 변수선언 및 수학 누적값 초기화
	static int k08_nusum = 0;//스태틱 인티저로 변수선언 및 총게 누적값 초기화
	static double k08_nuave = 0;//스태틱 더블로 변수선언 및 평균 누적값 초기화
	static final int k08_iRealPerson = 200; // 총 인원 수 지정
	static int k08_iPerson = 30; // 페이지당 인원수 지정 상수화
	static int k08_pageCnt = 0; //페이지 수 인티저로 선언 및 초기화
	static int k08_cnt = 0; // 페이지당 인원수 카운트 인티저로 선언 및 초기화
	static int k08_nu = 0; // 총 누적인원수 인티저로 선언 및 초기화
	
	public static void main(String[] args) { //메인에서 시작
		dataSet();//데이터 셋 메서드 호출
	//	dataSort(); //data 정렬 메서드 호출
		TitlePrint();//타이틀 출력
		HeaderPrint();//헤더 출력
		for (int k08_i = 0; k08_i < k08_ArrayOneRec.size(); k08_i++) {//클래스 어레이의 사이즈만큼 반복문 실행
			ItemPrint(k08_i);//i변수를 인자로 받아 인당 점수 출력
			k08_cnt++; // 카운트 + 1
			k08_nu++; // 누적인원 + 1
			//i + 1을 페이지당 인원수로 나눈 나머지가 0이고 i + 1값이 어레이 사이즈와 같지 않을때
			if ((k08_i + 1) % k08_iPerson == 0 && (k08_i + 1) != k08_ArrayOneRec.size()) { 
				PageTotalPrint();//현재 페이지 합계 평균 출력
				TailPrint();//누적 페이지 (평균, 합계) 출력
				TitlePrint();//제목 출력
				HeaderPrint();//헤더 출력
				Reset();//값 리셋 (페이지당 합계, 카운트 등)
			} else if ((k08_i + 1) == k08_ArrayOneRec.size()) {//i + 1 값이 어레이 사이즈와 같을 때
				PageTotalPrint();//현재 페이지 합계 평균 출력
				TailPrint();//누적페이지 평균, 합계 출력
			}
		}
	}
	
	public static void dataSet() {//데이터를 넣는 메서드 선언
		for (int k08_i = 1; k08_i <= k08_iRealPerson; k08_i++) {//변수 iRealPerson값만큼 반복문 실행
			String k08_name = String.format("김은%03d", k08_i);//스트링 포맷 한글2자 + 숫자2자리로하여 저장
			int k08_kor = (int)(Math.random() * 100);//랜덤함수 인티저로 변환하여 변수 저장
			int k08_eng = (int)(Math.random() * 100);//랜덤함수 인티저로 변환하여 변수 저장
			int k08_mat = (int)(Math.random() * 100);//랜덤함수 인티저로 변환하여 변수 저장
			k08_ArrayOneRec.add(new OneRec1(k08_i, k08_name, k08_kor, k08_eng, k08_mat));//inputData 클래스의 SetData 메서드 호출 및 인자 입력
		}
	}
	
	public static void TitlePrint() {//타이틀 출력 메서드 선언
		Date k08_date;//데이트 객체 선언
		SimpleDateFormat k08_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//날짜 포맷 설정
		k08_date = new Date();//데이트 객체 생성
		k08_pageCnt++;//페이지카운트 + 1
		System.out.printf("                    성적집계표\n\n");//성적 집계표 제목 출력
		System.out.printf("PAGE: %d               출력일자 : %s\n", k08_pageCnt, k08_sdf.format(k08_date));//페이지수와 일자 출력
	}
	
	public static void HeaderPrint() {//헤더 출력 메서드 선언
		System.out.printf("====================================================\n");//구분선 출력
		System.out.printf("%2s  %5s%8s%5s%5s%5s%5s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");//헤더 출력
		System.out.printf("====================================================\n");//구분선 출력
	}
	
	public static void ItemPrint(int k08_i) {//점수 출력 메서드 선언
		OneRec1 k08_rec;//클래스 오브젝트 선언
		k08_rec = k08_ArrayOneRec.get(k08_i); //인자 i번째의 값을 클래스 객체에 저장
		System.out.printf("%03d   %7s%7d%7d%7d%7d%8.1f\n",//출력 포맷 지정
				k08_rec.student_id(), k08_rec.name(), k08_rec.kor(), k08_rec.eng(), k08_rec.mat(), k08_rec.sum(), k08_rec.ave());
		
		k08_sumkor += k08_rec.kor();//국어점수 누적
		k08_sumeng += k08_rec.eng();//영어점수 누적
		k08_summat += k08_rec.mat();//수학점수 누적
		k08_sumsum += k08_rec.sum();//총합계 누적
		k08_sumave += k08_rec.ave();//평균 누적
	}
	
	public static void Reset() { //리셋 메서드 선언
		k08_sumkor = 0;//국어점수 합계 초기화
		k08_sumeng = 0;//영어점수 합계 초기화
		k08_summat = 0;//수학점수 합계 초기화
		k08_sumsum = 0;//총합계점 초기화
		k08_sumave = 0;//총평균 초기화
		k08_cnt = 0; // 페이지당 인원수 카운트 초기화
	}
	
	public static void PageTotalPrint() { //현재페이지 통계 출력 메서드 선언
		double k08_nanum = (double) k08_cnt;//페이지 인원수 카운트 더블로 형변환
		System.out.printf("====================================================\n");//구분선 출력
		System.out.printf("현재페이지\n");//문자열 출력
		System.out.printf("합계%18d%7d%7d%7d%8.1f\n", //평균값만 더블형이므로 %f형식으로 출력  
				k08_sumkor, k08_sumeng, k08_summat, k08_sumsum,  k08_sumave);
		System.out.printf("평균%18.1f%7.1f%7.1f%7.1f%8.1f\n",  //모두 %f형식으로 출력
				k08_sumkor / k08_nanum, k08_sumeng / k08_nanum, k08_summat / k08_nanum, k08_sumsum / k08_nanum,  k08_sumave / k08_nanum);
	}
	
	public static void TailPrint() { //누적 페이지 통계 출력 메서드 선언
		double k08_nanum = (double)k08_nu;//누적 인원수 더블형변환
		k08_nukor += k08_sumkor; // 페이지당 국어성적 총합계 누적
		k08_nueng += k08_sumeng; // 페이지당 영어성적 총합계 누적
		k08_numat += k08_summat; // 페이지당 수학성적 총합계 누적
		k08_nusum += k08_sumsum; // 페이지당 총합계 누적
		k08_nuave += k08_sumave; // 페이지당 총평균 누적
		
		System.out.printf("----------------------------------------------------\n");//구분선 출력
		System.out.printf("누적페이지\n");//문자열 출력
		System.out.printf("합계%18d%7d%7d%7d%8.1f\n",//누적 페이지 합계 출력  
				k08_nukor, k08_nueng, k08_numat, k08_nusum,  k08_nuave);
		System.out.printf("평균%18.1f%7.1f%7.1f%7.1f%8.1f\n\n\n", //누적 페이지 평균 출력
				k08_nukor / k08_nanum, k08_nueng / k08_nanum, k08_numat / k08_nanum, k08_nusum / k08_nanum,  k08_nuave / k08_nanum);

	}
	
	public static void dataSort() {//데이터 정렬 메서드 선언
		Comparator<OneRec1> k08_comp = new Comparator<OneRec1>() {
			public int compare(OneRec1 a1, OneRec1 a2) {
				
				return (a2.sum() - a1.sum());
			}
		};
		Collections.sort(k08_ArrayOneRec, k08_comp);
	}
}
