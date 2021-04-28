package Lecture06;
//20210427 김은비 엘레베이터(1)
public class P06_4 {
	int k08_limit_up_floor = 10; // 전역변수로 최대층 설정
	int k08_limit_down_floor = 0;// 전역변수로 최하층 설정
	int k08_floor = 1;//인티저타입 전역변수 선언 후 1 저장
	String k08_help;//스트링타입 전역변수 선언
	
	void k08_up() {//층 올라가는 매서드 선언
		if (k08_floor == k08_limit_up_floor) {//floor의 값이 최대층 설정값과 같을 때
			k08_help = "마지막 층입니다";//스트링 help에 해당 문자열 저장
		} else {//아니라면
			k08_floor++;//floor의 값 + 1
			k08_help = String.format("%d층입니다", k08_floor);//스트링 help에 해당 문자열 저장
		}
	}
	
	void k08_down() {//층 내려가는 매서드 선언
		if (k08_floor == k08_limit_down_floor) {//floor의 값이 최저층 설정값과 같을 때
			k08_help = "처음 층입니다";//스트링 help에 해당 문자열 저장
		} else {//아니라면
			k08_floor--;//floor의 값 - 1
			k08_help = String.format("%d층입니다", k08_floor);//스트링 help에 해당 문자열 저장
		}
	}

}
