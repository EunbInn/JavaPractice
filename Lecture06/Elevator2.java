package Lecture06;
//20210427 김은비 엘레베이터 생성자
public class Elevator2 {
	int k08_limit_up_floor; // 전역변수로 최대층
	int k08_limit_down_floor;// 전역변수로 최하층
	int k08_floor;//인티저타입 전역변수 선언
	String k08_help;//스트링타입 전역변수 선언
	
	Elevator2() {//인자를 받지 않는 생성자 선언
		k08_limit_up_floor = 10; // 최대층 설정
		k08_limit_down_floor = 0;// 최하층 설정
		k08_floor = 1;//현재층 저장
		System.out.printf("엘레베이터 준공완료\n"); // 해당 문자열 출력
	}
	
	Elevator2(int k08_a) { //인티저타입 인자를 받는 생성자 선언
		k08_limit_up_floor = 10; // 최대층 설정
		k08_limit_down_floor = 0;// 최하층 설정
		k08_floor = 1;//현재층 저장
		System.out.printf("엘레베이터 준공완료[%d]\n", k08_a);//인자값과 함께 문자열 출력
		
		if (k08_a > 0) {//만약 a가 0보다 크면
			for (int k08_i = 0; k08_i < k08_a; k08_i++) {//a만큼 반복문 실행
				this.k08_up();//본 클래스 내 up매소드 호출
			}
		} else if (k08_a < 0) {//0보다 작으면
			for (int k08_i = 0; k08_i < (k08_a * -1); k08_i++) {//a 에 -1을 곱한것 만큼 반복문 실행
				this.k08_down();//본 클래스 내 down매소드 호출
			}
		}
	}
	
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
