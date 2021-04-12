package JavaLecture5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

//20210412 김은비 영수증 출력
public class Lecture5_4 {

	public static void main(String[] args) {
		DecimalFormat k08_df = new DecimalFormat("###,###,###");
		Calendar k08_cal = Calendar.getInstance();
		SimpleDateFormat k08_sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Scanner k08_sc = new Scanner(System.in);

		int k08_iTax, k08_iOrigin;
		int k08_iPrice = k08_sc.nextInt();
		// price = origin(1 + 0.1)
		// tax = price - origin
		k08_iOrigin = (int) (k08_iPrice / 1.1);
		if ((k08_iOrigin * 0.1) > (int) (k08_iOrigin * 0.1)) {
			k08_iTax = (int) (k08_iOrigin * 0.1) + 1;
		} else {
			k08_iTax = (int) (k08_iOrigin * 0.1);
		}

		k08_iOrigin = k08_iPrice - k08_iTax;

		System.out.printf("신용승인\n");
		System.out.printf("%s%20.20s\n", "단말기 : 2N68665898", "전표번호 : 041218");
		System.out.printf("가맹점 : 한양김치찌개\n");
		System.out.printf("%.35s\n%s\n", "주 소 : 경기 성남시 분당구 황새울로 351번길 10 ,", "1층");
		System.out.printf("대표자 : 유창신\n");
		System.out.printf("%s%20.20s\n", "사업자 : 752-53-00558", "TEL : 7055695");
		System.out.printf("----------------------------------------\n");
		System.out.printf("%s%s 원\n",blank("금   액", 34), k08_df.format(k08_iOrigin));
		System.out.printf("%s%s 원\n",blank("부 가 세", 37), k08_df.format(k08_iTax));
		System.out.printf("%s%s 원\n",blank("합   계", 34), k08_df.format(k08_iPrice));
		System.out.printf("----------------------------------------\n");
		System.out.printf("우리카드\n");
		System.out.printf("%s%7.11s\n", "카드번호 : 5387-20**-****-4613(S)", "일시불");
		System.out.printf("거래일시 : %s\n", k08_sdf.format(k08_cal.getTime()));
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("%s%22s\n", "매입 : 비씨카드사", "가맹 : 720068568");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("%23s\n", "* 감사합니다 *");
		System.out.printf("%39s\n", "표준v2.08_20200212");

	}
	
	public static String blank(String a, int length) {
		String k08_temp = a + "                                     ";
		
		String k08_blank = new String(k08_temp.getBytes(), 0, length);
		
		return k08_blank;
	}

}
