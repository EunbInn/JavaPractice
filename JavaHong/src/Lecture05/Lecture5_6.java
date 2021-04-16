package Lecture05;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lecture5_6 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String[] itemName = {"연세 마카다미아 초코우유","비비고 김치만두","안주야 불막창볶음","다크초코마들렌 500g","삼립 촉촉한 모닝 식빵",
				"식물나라 바디워시 라벤더 200ml","샤프란 섬유유연제 리필용 500ml","꼬북칩 초코츄러스맛","코카콜라 제로콜라 330ml","하얀나라 점보롤휴지(그린) 30입",
				"","","","","","","","","","","","","","","","","","","","","",""};
		int[] itemPrice = {1200,4000,7300,5600,3000,
				7250,8000,1500,1200,21000,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] itemNum = {1200,4000,7300,5600,3000,
				7250,8000,1500,1200,21000,
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		boolean[] TaxFree = {true,true,true,true,false,true,false,true,true,true,
				true,true,false,true,true,true,true,true,true,true,
				true,true,false,true,true,true,true,true,true,true,true,false};
		
		System.out.printf("                   이마트 죽전점 (031)888-1234\n");
		System.out.printf("       emart       206-86-50913 강희석\n");
		System.out.printf("                   용인 수지구 포은대로 552\n");
		System.out.printf("\n영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		
		System.out.printf("\n[구매]%15.20s%26.20s\n", sdf.format(cal.getTime()), "POS:0011-9861");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("  상품명            단가      수량         금액\n");
		System.out.printf("------------------------------------------------\n");
		for (int i = 0; i < itemName.length; i++) {
			String taxCheck = "";
			if (TaxFree[i] == false) {
				taxCheck = "* " + itemName[i];
			} else {
				taxCheck = "  " + itemName[i];
			}
			System.out.println(strForm(taxCheck, 14) + i);
			if ((i + 1) % 5 == 0) {
				System.out.printf("------------------------------------------------\n");
			}
		}
		System.out.printf("------------------------------------------------\n");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("------------------------------------------------\n");

	}
	
	public static String strForm(String str, int leng) {
		String temp = "";
		return temp;
	}

}
