package Lecture07;

public class P07_3 {
	//20210428 김은비 구분자된 필드 추출처리
	public static void main(String[] args) {
		//메모장에서 가져온 내용 줄별로 String배열에 저장
		String[] k08_OneRec = {"시도교육청,지역교육청,지역,정보공시  학교코드,학교명,학교급코드,설립구분,1학년,2학년,3학년,4학년,5학년,6학년,특수학급,순회학급,학급수(계),학생수(계),학급당학생수",
				"서울특별시교육청,교육부,서울특별시 서초구,S000003511,서울교육대학교부설초등학교,2,국립,4,4,4,5,5,5,1,0,28(1),614(6),21.93",
				"서울특별시교육청,교육부,서울특별시 종로구,S000003563,서울대학교사범대학부설초등학교,2,국립,5,5,5,5,5,5,1,0,31(1),627(7),20.23",
				"서울특별시교육청,서울특별시강남서초교육지원청,서울특별시 강남구,S010000738,서울개일초등학교,2,공립,5,5,5,6,5,6,0,0,32(0),945(0),29.53",
				"서울특별시교육청,서울특별시강남서초교육지원청,서울특별시 강남구,S010000741,서울구룡초등학교,2,공립,4,4,5,5,4,5,1,0,28(1),504(6),18"};
		//첫번째 줄을 필드명 배열에 콤마로 스플릿하여 저장
		String[] k08_field_name = k08_OneRec[0].split(",");
		for (int k08_i = 1; k08_i < k08_OneRec.length; k08_i++) {//OneRec의 크기 - 1 만큼 반복문 실행 
			String[] k08_field = k08_OneRec[k08_i].split(",");//OnRec의 i번째 문자열을 콤마로 스플릿하여 배열에 저장 (필드값)
			System.out.printf("*************************************************\n");//구분선 출력
			for (int k08_j = 0; k08_j < k08_field_name.length; k08_j++) {//field 배열 크기만큼 반복문 실행
				System.out.printf("  %s : %s\n", k08_field_name[k08_j], k08_field[k08_j]); //필드명과 필드값 출력
			}
			System.out.printf("*************************************************\n");//구분선 출력
		}
	}

}
