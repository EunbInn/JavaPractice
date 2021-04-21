package Lecture05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//20210415 김은비 이마트 영수증 출력
public class Lecture5_6 {//클래스선언
	
	public static void main(String[] args) {//메인에서 시작
		Calendar k08_cal = Calendar.getInstance();//시스템 날짜를 받기위해 calendar getinstance 를 이용
		SimpleDateFormat k08_sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //영수증 날짜 포맷을 참고하여 포맷 설정
		DecimalFormat k08_df = new DecimalFormat("###,###,###,###");//가격의 세자리마다 콤마를 출력해주기 위해 숫자 포맷 설정
		String[] k08_itemName = {"연세 마카다미아 초코우유","비비고 김치만두","안주야 불막창볶음","다크초코마들렌 500g","삼립 촉촉한 모닝 식빵",
							"식물나라 바디워시 라벤더 200ml","샤프란 섬유유연제 리필용 500ml","꼬북칩 초코츄러스맛","코카콜라 제로콜라 330ml",
							"하얀나라 점보롤휴지(그린) 30입","가나초콜릿 마일드(레드)","오레오즈 시리얼 마시멜로우","글라스데코 12색","미미의 장난감 상자",
							"홈데코 원목 보석함(로즈)","글레이즈 도넛 스퀴즈","말랑말랑 슬라임(옐로우)","요리보고조리봐도조리퐁",
							"클린하우스 빗자루 녹색 100cm","욕실청소 세정 락스 200ml","롤리롤리롤리팝 초코","버니니 스트로베리 500ml","테라 맥주 500ml",
							"집편한세상 양은냄비 s","집편한세상 양은냄비 m","비비고 엄마손맛 미역국","팔도 비빔면 5개입","진라면 순한맛 5개입",
							"오뚜기 3분카레 순한맛","오뚜기 3분짜장","춘천 닭갈비 매운양념","싱싱 쌈채소 세트 100g"}; //스트링 배열에 30개 이상의 아이템명 입력
		int[] k08_itemPrice = {1200,4000,7300,5600,3000,
							7250,8000,1500,1200,21000,
							1500,5000,8420,4560,1200,7200,
							8000,3250,7000,12000,980,
							15000,15600,4500,5700,1420,5500,
							7200,1200,1200,8500,3550}; //인티저 배열에 스트링 배열과 동일한 크기로 아이템의 값 입력
		int[] k08_itemNum = {1,4,3,1,1,1,2,3,2,1,//인티저 배열에 스트링 배열과 동일한 크기로 아이템 수량 입력
						10,2,1,2,1,2,4,3,1,2,
						1,1,2,3,1,2,1,1,4,2,1,1};
		boolean[] k08_TaxFree = {true,true,false,true,false,true,false,true,true,true,// 불린 배열에 스트링 배열과 동일한 크기로 true false 입력 -> 해당 값은 면세, 과세 항목 구분을 위함
				true,true,false,true,true,true,true,true,true,true,
				true,true,false,true,true,true,true,true,true,true,true,false};
		int k08_origin = 0; //origin price 인티저 타입 선언 및 초기화 
		int k08_tax = 0;//tax 인티저 타입 선언 및 초기화
		
		
		
		System.out.printf("                   이마트 죽전점 (031)888-1234\n"); //지점 및 지점 번호 출력
		System.out.printf("       emart       206-86-50913 강희석\n");//이마트 사업자번호 및 대표자명 출력
		System.out.printf("                   용인 수지구 포은대로 552\n");//지점 주소 출력
		System.out.printf("\n영수증 미지참시 교환/환불 불가\n");//환불 불가내용 출력
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");//환불 기간 안내 출력
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");//제외매장 관련 출력
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");//교환환불 방법 출력
		System.out.printf("\n[구매]%15.20s%26.20s\n", k08_sdf.format(k08_cal.getTime()), "POS:0011-9861");//구매일과 포스 등록번호 출력
		System.out.printf("------------------------------------------------\n");//구분선 출력
		System.out.printf("  상품명                      단가   수량   금액\n");//값 구분 카테고리 출력
		System.out.printf("------------------------------------------------\n");//구분선 출력
		int k08_sumNoTax = 0;//비과세항목 총 가격 변수 인티저로 선언
		int k08_sumTax = 0;//과세항목 총 가격 변수 인티저로 선언 
		for (int k08_i = 0; k08_i < k08_itemName.length; k08_i++) { //0~상품명 저장한 스트링 배열 크기만큼 반복문 실행
			String k08_taxCheck = "";//스트링 변수 선언 및 초기화
			if (k08_TaxFree[k08_i] == false) {//불린 배열 tax free의 i번째 저장값이 false일때
				k08_taxCheck = "* " + k08_itemName[k08_i];//아이템 이름 앞에 * 추가
				k08_sumNoTax += k08_itemPrice[k08_i];//no tax 합계 값 누적
				
			} else {//불린 배열 tzx free의 i번째 저장 값이 true일 때,
				k08_taxCheck = "  " + k08_itemName[k08_i];//아이템 이름 앞에 공백 추가(*붙인 값과 길이를 맞추기 위함)
				k08_sumTax += k08_itemPrice[k08_i];//tax항목 합계값 누적
			}
			//상품명, 단가, 수량, 금액 출력(금액과 관련된 숫자는 미리 지정해둔 콤마 추가 포맷으로 변경하여 출력
			System.out.printf("%s%10.12s%5.5s%9.12s\n",strForm(k08_taxCheck, 12), 
					k08_df.format(k08_itemPrice[k08_i]), k08_itemNum[k08_i] + "", k08_df.format(k08_itemPrice[k08_i] * k08_itemNum[k08_i]));
			if ((k08_i + 1) % 5 == 0) {//i + 1을 5로 나눈 나머지 값이 0일 때, 구분선과 줄바꿈 출력
				System.out.printf("------------------------------------------------\n");
			}
			
			
		}
		
		k08_origin = (int)(k08_sumTax / 1.1);
		k08_tax = k08_sumTax - k08_origin;
		int k08_totalSum = k08_sumNoTax + k08_sumTax;
		
		System.out.printf("\n%24.25s%19.16s\n","총 품목 수량", k08_itemName.length + "");
		System.out.printf("%25.25s%19.16s\n","(*)면 세  물 품", k08_df.format(k08_sumNoTax));
		System.out.printf("%25.25s%19.16s\n","과 세  물 품", k08_df.format(k08_origin));
		System.out.printf("%26.25s%19.16s\n","부   가   세", k08_df.format(k08_tax));
		System.out.printf("%27.25s%19.16s\n","합        계", k08_df.format(k08_totalSum));
		System.out.printf("  결 재 대 상 금 액%29.20s\n", k08_df.format(k08_totalSum));
		System.out.printf("------------------------------------------------\n");
		System.out.printf("0012 KEB 하나              541707**0484/35860658\n");
		System.out.printf("카드결제(IC)%24.20s/%8.10s\n","일시불",k08_df.format(k08_totalSum));
		System.out.printf("------------------------------------------------\n");
		System.out.printf("                 [신세계 포인트 적립]\n");
		System.out.printf("김*비 고객님의 포인트 현황입니다.\n");
		System.out.printf("금회발생포인트               9350**9995      164\n");
		System.out.printf("누계(가용)포인트                 5,637(   5,473) \n");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("       구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("차량번호 :%37.30s\n","34저****");
		System.out.printf("차량번호 :%38.30s\n","2021-03-03 20:20:04");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("캐셔:084599 양00%32s\n","1150");
		System.out.printf("                 l|l|l|l|l|l|l|\n");
		System.out.printf("          20210303/00119861/00164980/30");

	}
	
	public static String strForm(String k08_temp, int k08_length) {
		
		if (k08_temp.length() > k08_length) {
			k08_temp = k08_temp.substring(0,k08_length);
			
			}
		
		int k08_blank = (k08_length * 2) - k08_temp.getBytes().length;

		for (int k08_i = 0; k08_i < k08_blank; k08_i++) {
			k08_temp = k08_temp + " ";
		}
		
		return k08_temp;
	}
}