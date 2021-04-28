package Lecture06;

import java.util.Scanner;

public class P06_11 {
//20210427 김은비 리모콘 클래스상속 연습_메인
	public static void main(String[] args) {
		Scanner k08_sc = new Scanner(System.in);//스캐너 객체 생성
		TvRemoconX k08_remocon = new TvRemoconX();// 클래스 객체 생성

		int k08_userInputChannel = k08_sc.nextInt();//콘솔에서 입력받은 숫자를 인티저 변수에 저장
		while (true) {//반복문 실행
			if (k08_userInputChannel >= k08_remocon.k08_channel_limit_dn //최소채널<= 입력받은 값 <=최대채널 이면
					&& k08_userInputChannel <= k08_remocon.k08_channel_limit_up) {
				k08_remocon.k08_channel = k08_userInputChannel;//리모콘 클래스 채널 변수에 해당 값 저장
				for (int k08_i = 0; k08_i < 10; k08_i++) {// 0~9까지 반복문 실행
					k08_remocon.k08_ChannelUp();// TvRemocon 클래스의 채널 up메서드 호출

					System.out.printf("[%s]\n", k08_remocon.k08_help);// TvRemocon 클래스의 스트링 호출
				}
				k08_remocon.k08_CheckBattery();//배터리 체크 메서드 호출
				System.out.printf("[%s]\n", k08_remocon.k08_help);//문자열 출력
				for (int k08_i = 0; k08_i < 10; k08_i++) {// 0~9까지 반복문 실행
					k08_remocon.k08_ChannelDn();// TvRemocon 클래스의 채널 down메서드 호출

					System.out.printf("[%s]\n", k08_remocon.k08_help);// TvRemocon 클래스의 스트링 호출
				}
				k08_remocon.k08_CheckBattery();//배터리 체크 메서드 호출
				System.out.printf("[%s]\n", k08_remocon.k08_help);//문자열 출력
				break;//반복문 탈출
			} else {//아니라면
				System.out.println("다시 입력해주세요");//재입력 요구 출력
				k08_userInputChannel = k08_sc.nextInt();//콘솔에서 입력받은 숫자를 인티저 변수에 저장
			}
		}

		int k08_userInputVolum = k08_sc.nextInt();//콘솔에서 입력받은 숫자를 인티저 변수에 저장

		while (true) {
			if (k08_userInputVolum >= k08_remocon.k08_volum_limit_dn //최소볼륨<= 입력받은 값 <=최대볼륨 이면
					&& k08_userInputVolum <= k08_remocon.k08_volum_limit_up) {
				k08_remocon.k08_volum = k08_userInputVolum;//리모콘 클래스 볼륨 변수에 해당 값 저장
				for (int k08_i = 0; k08_i < 5; k08_i++) {// 0~4까지 반복문 실행
					k08_remocon.k08_VolUp();//TvRemocon 클래스의 볼륨up메서드 호출

					System.out.printf("[%s]\n", k08_remocon.k08_help);// TvRemocon 클래스의 스트링 호출
				}
				k08_remocon.k08_CheckBattery();//배터리 체크 메서드 호출
				System.out.printf("[%s]\n", k08_remocon.k08_help);//문자열 출력

				for (int k08_i = 0; k08_i < 5; k08_i++) {// 0~4까지 반복문 실행
					k08_remocon.k08_VolDn();// TvRemocon 클래스의 볼륨down메서드 호출

					System.out.printf("[%s]\n", k08_remocon.k08_help);// TvRemocon 클래스의 스트링 호출
				}
				k08_remocon.k08_CheckBattery();//배터리 체크 메서드 호출
				System.out.printf("[%s]\n", k08_remocon.k08_help);//문자열 출력
				break;//반복문 탈출
			} else {//아니라면
				System.out.println("다시 입력해주세요");//재입력 요구 출력
				k08_userInputVolum = k08_sc.nextInt();//콘솔에서 입력받은 숫자를 인티저 변수에 저장
			}
		}

	}

}
