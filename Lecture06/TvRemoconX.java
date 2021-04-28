package Lecture06;
//20210427 김은비 리모콘 클래스상속 연습
public class TvRemoconX extends TvRemocon {//TvRemocon 클래스 상속받아 사용
	int k08_battery = 100;//battery 인티저 선언 및 임의값 저장
	void k08_CheckBattery() {//새로운 매서드 생성
		k08_help = String.format("배터리가 %d%%남았습니다", k08_battery);//배터리 잔량 스트링에 저장
		k08_battery--;//배터리변수 -1
	}
}
