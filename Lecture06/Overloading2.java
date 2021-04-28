package Lecture06;
//20210427 김은비 오버로딩 연습2
public class Overloading2 {
	
	public int k08_sum(int k08_kor, int k08_eng, int k08_mat) {//인티저타입 인자 3개 - 인티저값 리턴
		return k08_kor + k08_eng + k08_mat;//인자들의 합 리턴
	}
	
	public int k08_sum(int k08_kor, int k08_eng, int k08_mat, int k08_sci) {//인티저타입 인자 4개 - 인티저값 리턴
		return k08_kor + k08_eng + k08_mat + k08_sci;//인자들의 합 리턴
	}
	
	public int k08_sum(int k08_kor, int k08_eng, int k08_mat, int k08_sci, int k08_soc) {//인티저타입 인자 5개 - 인티저값 리턴
		return k08_kor + k08_eng + k08_mat + k08_sci + k08_soc;//인자들의 합 리턴
	}
	
	public int k08_ave(int k08_kor, int k08_eng, int k08_mat) {//인티저타입 인자 3개 - 인티저값 리턴
		return (k08_kor + k08_eng + k08_mat) / 3;//인자들의 합 평균 리턴
	}
	
	public double k08_ave(int k08_kor, int k08_eng, int k08_mat, int k08_sci) {//인티저타입 인자 4개 - 더블값 리턴
		return (k08_kor + k08_eng + k08_mat + k08_sci) / 4.0;//인자들의 합 평균 리턴
	}
	
	public double k08_ave(int k08_kor, int k08_eng, int k08_mat, int k08_sci, int k08_soc) {//인티저타입 인자 5개 - 더블값 리턴
		return (k08_kor + k08_eng + k08_mat + k08_sci + k08_soc) / 5.0;//인자들의 합 평균 리턴
	}
	
}
