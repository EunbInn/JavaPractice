package Lecture07;

import java.util.ArrayList;

public class P07_8 {

	public static void main(String[] args) {
		int k08_testMax = 1000000; // integer 변수 선언 및 값 저장
		ArrayList k08_arr = new ArrayList();//어레이리스트 선언 및 정의
		
		for (int k08_i = 0; k08_i < k08_testMax; k08_i++) {//testMax의 값 만큼 반복문 실행
			k08_arr.add((int)(Math.random() * 1000000));//0~1000000사이의 값을 랜덤함수로 어레이리스트에 추가
		}
		
		for (int k08_i = 0; k08_i < k08_arr.size(); k08_i++) {//어레이리스트 사이즈만큼 반복문 실행
			System.out.printf(" ArrayList %d = %d\n", k08_i, k08_arr.get(k08_i));//어레이리스트 내용 출력
		}
		
		System.out.printf("*******************************************\n");//구분선 출력
		k08_arr.sort(null);//어레이리스트 정렬
		
		for (int k08_i = 0; k08_i < k08_arr.size(); k08_i++) {//어레이리스트 사이즈만큼 반복문 실행
			System.out.printf(" ArrayList %d = %d\n", k08_i, k08_arr.get(k08_i));//어레이리스트 내용 출력
		}

	}

}
