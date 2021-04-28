package Lecture06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportSheet3 {
//20210428 김은비 성적집계표 출력(3)
	public static void main(String[] args) {
		int iRealPerson = 200;//진짜 인원수 인티저 값으로 저장
		int k08_iPerson = 45;//페이지당 인원수 인티저값으로 저장
		Date date;//데이트 객체 선언
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//날짜 포맷 설정
		InputData k08_inData = new InputData(k08_iPerson);//클래스 객체 생성하면서 생성자 값 입력

		int pageCnt = 0;//페이지 카운트 인티저로 선언 및 초기화
		int number = 0;//넘버 인티저로 선언 및 초기화
		int cnt = 0;//카운트 인티저로 선언 및 초기화
		for (int k08_i = 1; k08_i <= iRealPerson; k08_i++) {//큰 포문은 1부터 진짜 인원수만큼 반복문 실행
			String k08_name = String.format("김은%03d", k08_i);//한글 2글자 + 숫자 3자리 포맷으로 스트링에 저장
			int k08_kor = (int) (Math.random() * 100);//랜덤함수로 국어 점수 구하여 인티저로 저장
			int k08_eng = (int) (Math.random() * 100);//랜덤함수로 영어 점수 구하여 인티저로 저장
			int k08_mat = (int) (Math.random() * 100);//랜덤함수로 수학 점수 구하여 인티저로 저장
			k08_inData.SetData(cnt, k08_name, k08_kor, k08_eng, k08_mat);//inputData 클래스의 SetData메서드 호출 및 인자 입력
			cnt++;//카운트 + 1
			if (cnt % k08_iPerson == 0) {//cnt변수 값을 페이지당 인원수로 나눈 나머지가 0일때,
				pageCnt++;//페이지 카운트 + 1
				date = new Date();//데이트 객체 생성
				System.out.printf("                    성적집계표\n\n");//성적 집계표 제목 출력
				System.out.printf("PAGE: %d               출력일자 : %s\n", pageCnt, sdf.format(date));//페이지수와 일자 출력
				System.out.printf("=====================================================\n");//구분선 출력
				System.out.printf("번호     이름     국어   영어   수학   총점    평균\n");//헤더 출력
				System.out.printf("=====================================================\n");//구분선 출력
				
				for (int k08_j = 0; k08_j< k08_iPerson; k08_j++) {//작은 포문은 0부터 페이지당 인원수 만큼 반복문 실행
					number++;//넘버 값 + 1
					System.out.printf("%03d   %7s%7d%7d%7d%7d%8.1f\n", number, k08_inData.k08_name[k08_j],
							k08_inData.k08_kor[k08_j], k08_inData.k08_eng[k08_j], k08_inData.k08_mat[k08_j],
							k08_inData.k08_sum[k08_j], k08_inData.k08_ave[k08_j]);	//포맷 설정하여 클래스에서 호출한 배열값 출력
				}
				
				System.out.printf("=====================================================\n");//구분선 출력
				k08_inData.sumAll();//페이지 합계 메서드 호출
				k08_inData.aveAll();//페이지 평균 메서드 호출
				System.out.printf("현재페이지\n");//문자열 출력
				System.out.printf("합계%18d%7d%7d%7d%8.1f\n", //평균값만 더블형이므로 %f형식으로 출력  
						k08_inData.k08_sumKor, k08_inData.k08_sumEng,  k08_inData.k08_sumMat,  k08_inData.k08_sumAll,  k08_inData.k08_sumAve);
				System.out.printf("평균%18.1f%7.1f%7.1f%7.1f%8.1f\n",  //모두 %f형식으로 출력
						k08_inData.k08_aveKor,  k08_inData.k08_aveEng,  k08_inData.k08_aveMat, k08_inData.k08_aveAll, k08_inData.k08_aveAve);
				
				System.out.printf("-----------------------------------------------------\n");//구분선 출력
				k08_inData.addAll();//누적 합계 메서드 호출
				k08_inData.addAve(number);//누적 평균 메서드 호출
				System.out.printf("누적페이지\n");//문자열 출력
				System.out.printf("합계%18d%7d%7d%7d%8.1f\n",//누적 페이지 합계 출력  
						k08_inData.k08_addKor, k08_inData.k08_addEng, k08_inData.k08_addMat, k08_inData.k08_addAll,  k08_inData.k08_addAve);
				System.out.printf("평균%18.1f%7.1f%7.1f%7.1f%8.1f\n\n\n", //누적 페이지 평균 출력
						k08_inData.k08_addAveKor, k08_inData.k08_addAveEng, k08_inData.k08_addAveMat, 
						k08_inData.k08_addAveAll, k08_inData.k08_addAveAve);
				
				if ((iRealPerson - number) >= k08_iPerson) {// 만약 전체 인원수에서 지금까지 처리한 인원수를 뺀 값이 페이지 출력제한 인원수보다 크거나 같을 경우
					k08_inData.Reset(k08_iPerson);//페이지 출력제한 인원수를 리셋 인자로 넣어 계산값(배열, 페이지 합계, 평균값 등) 리셋
				} else {//아니라면
					k08_iPerson = iRealPerson - number;//전체 인원수에서 지금까지 처리한 인원수를 뺀 값으로 출력제한 인원을 재설정
					k08_inData.Reset(k08_iPerson);//페이지 출력제한 인원수를 리셋 인자로 넣어 계산값(배열, 페이지 합계, 평균값 등) 리셋
				}
				cnt = 0;//카운트 초기화
			}
			
		}

		
	}

}
