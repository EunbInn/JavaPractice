package Lecture06;

import java.util.Scanner;

public class P06_9 {
//20210427 김은비 리모콘 메인
	public static void main(String[] args) {
		Scanner k08_sc = new Scanner(System.in);//스캐너 객체 생성

		int k08_userInputChannel = k08_sc.nextInt();//콘솔에서 입력받은 숫자를 인티저 변수에 저장
		TvRemocon k08_remocon = new TvRemocon(k08_userInputChannel, 1);// 클래스 객체 생성 및 생성자 인자 입력
		
		int k08_userInputVolum = k08_sc.nextInt();//콘솔에서 입력받은 숫자를 인티저 변수에 저장
		k08_remocon = new TvRemocon(k08_userInputVolum, 2);// 클래스 객체 생성 및 생성자 인자 입력

		

	}
}
