package Lecture07;

import java.text.DecimalFormat;

public class P07_2 {

	public static void main(String[] args) {
		String [] OneRec = {
				"01  aaaaa����Ʈ������ø������                3,000         1             3,000",
				"02  �����ġ����                             2,000         1             2,000",
				"03  ���ֳ���Ҹ�â����                         7,300         3               900",
				"04* ��ũ���ڸ��鷻500g                         5,600         1             5,600",
				"05  �︳�����Ѹ�׽Ļ�                         3,000         3             9,000",
				"06  �Ĺ�����ٵ���ö󺥴�200ml                7,250         1             7,250",
				"07  ��Ǯ���ű⿩�й��͸�                      12,000         2            24,000",
				"08  ����Ĩ�����򷯽���                         3,400         3            10,200",
				"09  ��ī�ݶ������ݶ�330ml                      1,200         2             2,400",
				"10* �Ͼᳪ������������(�׸�����Ʈ)30��        21,000         1            31,000",
				"11* �������ݸ����ϵ�(����)                     1,500         2             3,000",
				"12  ��������ø��󸶽ø�ο�                   5,000         2            10,000",
				"13  ����������24��                             5,620         1             5,620",
				"14  ����������12��                             4,560         2             9,120",
				"15  Ȩ���ڿ��񺸼���(������)                 1,200         1             1,200",
				"16  �۷�����ӽ�����                         7,200         2            12,400",
				"17  ��������������(���ο�)                     8,200         4            32,800",
				"18  �۷θ���������                             3,250         3             9,750",
				"19  Ŭ���Ͽ콺���ڷ���100cm                  7,000         1             7,000",
				"20* ���Ѷ������û��200ml                     21,000         2            42,000",
				"21* 8��������(2m)                              9,180         1             9,180",
				"22  ���ϴϽ�Ʈ�κ���500ml                      1,500         3             4,500",
				"23  �׶����500ml                              1,600         2             3,200",
				"24  s                                          4,500         4            18,000",
				"25  �����Ѽ����������m                        5,700         1             5,700",
				"26* �������������                           1,420         2             2,840",
				"27* ����Ҵߺ�����5����                      5,500         1             5,500",
				"28  �������Ѹ�5����                          7,200         2            14,400",
				"29  ���ѱ�3��ī�����Ѹ�                        1,200         4             4,800",
				"30* ���ѱ�3��¥��                              1,200         2             2,400",
				"31  LG����������(�繮��)                 9,990,000         3        19,970,000",
				"32  �̽̽�ä�Ҽ�Ʈ100g                           550         1               550"};

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
				System.out.printf("����[%s]\n",result[i]);
				
				result[i] = result[i].replace(df.format(total), df.format(price * num));

				System.out.printf("����[%s]\n",result[i]);
				System.out.println("*************************************\n");
			}
		}
		
	}

}
