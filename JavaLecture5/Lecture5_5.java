package JavaLecture5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lecture5_5 {

	public static void main(String[] args) {
		DecimalFormat k08_df = new DecimalFormat("###,###,###");
		Calendar k08_cal = Calendar.getInstance();
		SimpleDateFormat k08_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String itemname1 = "퓨어에어 비말차단용마스크(최고급향)";
		String itemcode1 = "1031617";
		int price1 = 3000;
		int amount1 = 1;

		String itemname2 = "브레드 주근깨 파우치(황색)";
		String itemcode2 = "1104042";
		int price2 = 1000;
		int amount2 = 1;

		String itemname3 = "벚꽃무늬 튼튼유리글라스(330ml)";
		String itemcode3 = "1811019";
		int price3 = 2000;
		int amount3 = 1;
		
		System.out.printf("\n\n           \"국민가게다이소\"\n");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현\n동)\n");
		System.out.printf("====================================\n");
		System.out.printf("%24s\n%26s\n","소비자중심경영(CCM) 인증기업","ISO 9001 품질경영시스템 인증기업");
		System.out.printf("====================================\n");
		System.out.printf("      교환/환불 14일(04월26일)이내\n");
		System.out.printf(" (전자)영수증, 결제카드 지참 후 구입매장에서 가능\n");
		System.out.printf("     포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("      체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("====================================\n");
		System.out.printf("[POS 1058231]%23s\n", k08_sdf.format(k08_cal.getTime()));
		System.out.printf("====================================\n");
		System.out.printf("%s%10s%4s%7s\n", blank(itemname1, 31), price1 + "", amount1 + "", (price1 * amount1) + "");
		System.out.printf("[%s]\n", itemcode1);
		System.out.printf("%s%10s%4s%7s\n", blank(itemname2, 29), price2 + "", amount2 + "", (price2 * amount2) + "");
		System.out.printf("[%s]\n", itemcode2);
		System.out.printf("%s%10s%4s%7s\n", blank(itemname3, 31), price3 + "", amount3 + "", (price3 * amount3) + "");
		System.out.printf("[%s]\n", itemcode3);
		System.out.printf("=====================================\n");
		System.out.printf("%s\n",blank2("과세합계",8), itemcode1);
		System.out.printf("%s\n", blank2("부가세",6),itemcode1);
		System.out.printf("=====================================\n");
		System.out.printf("=====================================\n");

		

	}

	public static String blank(String a, int length) {
		String k08_temp = a + "                                     ";
		
		String k08_blank = new String(k08_temp.getBytes(), 0, length);
		
		return k08_blank;
	}
	
	public static String blank2(String a, int length) {
		String k08_temp = "                       " + a;
		
		String k08_blank = new String(k08_temp.getBytes(), length, k08_temp.length());
		
		return k08_blank;
	}
}
