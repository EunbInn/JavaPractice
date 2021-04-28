package Lecture06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportSheet2 {
//20210428 김은비 성적표 출력(2)
	public static void main(String[] args) {
		int k08_iPerson = 45;//인원수 인티저 변수 선언 후 저장
		Date k08_date = new Date();//날짜 객체 생성
		SimpleDateFormat k08_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//날짜 포맷 설정
		
		InputData k08_inData = new InputData(k08_iPerson);//클래스 객체 생성하며 생성자 값 입력
		
		for (int k08_i = 1; k08_i <= k08_iPerson; k08_i++) {//변수 iPerson값만큼 반복문 실행
			String k08_name = String.format("김은%02d", k08_i);//스트링 포맷 한글2자 + 숫자2자리로하여 저장
			int k08_kor = (int)(Math.random() * 100);//랜덤함수 인티저로 변환하여 변수 저장
			int k08_eng = (int)(Math.random() * 100);//랜덤함수 인티저로 변환하여 변수 저장
			int k08_mat = (int)(Math.random() * 100);//랜덤함수 인티저로 변환하여 변수 저장
			k08_inData.SetData(k08_i - 1, k08_name, k08_kor, k08_eng, k08_mat);//inputData 클래스의 SetData 메서드 호출 및 인자 입력
		}
		
		System.out.printf("                  성적집계표\n\n");//성적집계표 제목 출력
		System.out.printf("                       출력일자 : %s\n", k08_sdf.format(k08_date));//출력일자 출력
		System.out.printf("=====================================================\n");//구분선 출력
		System.out.printf("번호     이름     국어   영어   수학   총점    평균\n");//헤더 출력
		System.out.printf("=====================================================\n");//구분선 출력
		for (int k08_i = 0; k08_i < k08_iPerson; k08_i++) {//iPerson값만큼 반복문 실행
			System.out.printf("%03d   %7s%7d%7d%7d%7d%7.1f\n",//출력 포맷 지정
					k08_i + 1, k08_inData.k08_name[k08_i], k08_inData.k08_kor[k08_i], //inputData클래스의 배열변수 호출하여 출력 
					k08_inData.k08_eng[k08_i], k08_inData.k08_mat[k08_i],
					k08_inData.k08_sum[k08_i], k08_inData.k08_ave[k08_i]);
		}
		
		System.out.printf("=====================================================\n");//구분선
		k08_inData.sumAll();//합계구하는 메서드 호출
		k08_inData.aveAll();//평균구하는 메서드 호출
		System.out.printf("합계%18d%7d%7d%7d%7.1f\n",  //출력 포맷 지정 및 변수 호출하여 출력
				k08_inData.k08_sumKor, k08_inData.k08_sumEng,  k08_inData.k08_sumMat,  k08_inData.k08_sumAll,  k08_inData.k08_sumAve);
		System.out.printf("평균%18.1f%7.1f%7.1f%7.1f%7.1f\n",  //출력 포맷 지정 및 변수 호출하여 출력
				k08_inData.k08_aveKor,  k08_inData.k08_aveEng,  k08_inData.k08_aveMat, k08_inData.k08_aveAll, k08_inData.k08_aveAve);
	}

}
