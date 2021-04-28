package Lecture07;

import java.text.DecimalFormat;

public class P07_2 {

	public static void main(String[] args) {
		String [] OneRec = {
				"01  aaaaa엑스트라버진올리브오일                3,000         1             3,000",
				"02  비비고김치만두                             2,000         1             2,000",
				"03  안주나라불막창볶음                         7,300         3               900",
				"04* 다크초코마들렌500g                         5,600         1             5,600",
				"05  삼립촉촉한모닝식빵                         3,000         3             9,000",
				"06  식물나라바디워시라벤더200ml                7,250         1             7,250",
				"07  보풀제거기여분배터리                      12,000         2            24,000",
				"08  꼬북칩초코츄러스맛                         3,400         3            10,200",
				"09  코카콜라제로콜라330ml                      1,200         2             2,400",
				"10* 하얀나라점보롤휴지(그린소프트)30입        21,000         1            31,000",
				"11* 가나초콜릿마일드(레드)                     1,500         2             3,000",
				"12  오레오즈시리얼마시멜로우                   5,000         2            10,000",
				"13  형광싸인펜24색                             5,620         1             5,620",
				"14  지구색연필12색                             4,560         2             9,120",
				"15  홈데코원목보석함(로즈우드)                 1,200         1             1,200",
				"16  글레이즈도넛스퀴즈                         7,200         2            12,400",
				"17  말랑말랑슬라임(옐로우)                     8,200         4            32,800",
				"18  글로리아유리병                             3,250         3             9,750",
				"19  클린하우스빗자루녹색100cm                  7,000         1             7,000",
				"20* 유한락스욕실청소200ml                     21,000         2            42,000",
				"21* 8핀충전기(2m)                              9,180         1             9,180",
				"22  버니니스트로베리500ml                      1,500         3             4,500",
				"23  테라맥주500ml                              1,600         2             3,200",
				"24  s                                          4,500         4            18,000",
				"25  집편한세상양은냄비m                        5,700         1             5,700",
				"26* 비비고매콤육개장                           1,420         2             2,840",
				"27* 까르보불닭볶음면5개입                      5,500         1             5,500",
				"28  진라면순한맛5개입                          7,200         2            14,400",
				"29  오뚜기3분카레순한맛                        1,200         4             4,800",
				"30* 오뚜기3분짜장                              1,200         2             2,400",
				"31  LG디오스냉장고(양문형)                 9,990,000         3        19,970,000",
				"32  싱싱쌈채소세트100g                           550         1               550"};

		calculate(OneRec);

	}
	
	public static void calculate(String[] result) {
		DecimalFormat df = new DecimalFormat("###,###,###");
		String [] add = new String[result.length];
		
		for (int i = 0; i < result.length; i++) {
			String temp = result[i].substring(25);
			String[] temp_arr = temp.split(" ");
			String ret = "";
			for (int j = 0; j < temp_arr.length; j++) {
				if (temp_arr[j].isEmpty() == false) {
					ret += temp_arr[j].replaceAll(",","") + " "; 
				}
			}
			add[i] = ret;
		}
		
		for (int i = 0; i < add.length; i++) {
			String[] str = add[i].split(" ");
			int price = Integer.parseInt(str[0]);
			int num = Integer.parseInt(str[1]);
			int total = Integer.parseInt(str[2]);
			
			if ((price * num) != total) {
				System.out.println("*************************************\n");
				System.out.printf("오류[%s]\n",result[i]);
				
				result[i] = result[i].replace(df.format(total), df.format(price * num));

				System.out.printf("수정[%s]\n",result[i]);
				System.out.println("*************************************\n");
			}
		}
		
	}

}
