package Lecture07;

import java.util.ArrayList;

public class P07_7 {

	public static void main(String[] args) {
		ArrayList k08_iAL = new ArrayList();//어레이리스트 선언 및 정의
		
		k08_iAL.add("abc");//어레이리스트에 값들 채우기
		k08_iAL.add("abcd");//어레이리스트에 값 채우기
		k08_iAL.add("efga");//어레이리스트에 값 채우기
		k08_iAL.add("가다나1");//어레이리스트에 값 채우기
		k08_iAL.add("1234124");//어레이리스트에 값 채우기
		k08_iAL.add("8월24일");//어레이리스트에 값 채우기
		
		System.out.printf("*******************************************\n");//구분선 출력
		System.out.printf(" 시작 ArraySize %d\n",k08_iAL.size());//시작 어레이 사이즈 출력
		for (int k08_i = 0; k08_i < k08_iAL.size(); k08_i++) {//어레이 사이즈만큼 반복문 실행
			System.out.printf("ArrayList %d = %s\n", k08_i, k08_iAL.get(k08_i));//어레이 내용 출력
		}
		k08_iAL.set(3, "변경변경");//어레이 3번째 항목 내용변경
		System.out.printf("*******************************************\n");//구분선 출력
		System.out.printf(" 내용변경 ArraySize %d\n",k08_iAL.size());//실행 내용 및 어레이 사이즈 출력
		for (int k08_i = 0; k08_i < k08_iAL.size(); k08_i++) {//어레이 사이즈만큼 반복문 실행
			System.out.printf("ArrayList %d = %s\n", k08_i, k08_iAL.get(k08_i));//어레이 내용 출력
		}
		k08_iAL.remove(4);//어레이 내 4번째항목 삭제
		System.out.printf("*******************************************\n");//구분선 출력
		System.out.printf(" 내용변경 ArraySize %d\n",k08_iAL.size());//실행 내용 및 어레이 사이즈 출력
		for (int k08_i = 0; k08_i < k08_iAL.size(); k08_i++) {//어레이 사이즈만큼 반복문 실행
			System.out.printf("ArrayList %d = %s\n", k08_i, k08_iAL.get(k08_i));//어레이 내용 출력
		}
		k08_iAL.sort(null);//리스트 정렬: 숫자 -> 알파벳 -> 한글
		System.out.printf("*******************************************\n");//구분선 출력
		System.out.printf(" 리스트 Sort ArraySize %d\n",k08_iAL.size());//실행 내용 및 어레이 사이즈 출력
		for (int k08_i = 0; k08_i < k08_iAL.size(); k08_i++) {//어레이 사이즈만큼 반복문 실행
			System.out.printf("ArrayList %d = %s\n", k08_i, k08_iAL.get(k08_i));//어레이 내용 출력
		}
		k08_iAL.clear();//어레이리스트 전체 삭제
		System.out.printf("*******************************************\n");//구분선 출력
		System.out.printf(" 전부 삭제 ArraySize %d\n",k08_iAL.size());//실행 내용 출력
		for (int k08_i = 0; k08_i < k08_iAL.size(); k08_i++) {//어레이 사이즈만큼 반복문 실행
			System.out.printf("ArrayList %d = %s\n", k08_i, k08_iAL.get(k08_i));//어레이 내용 출력
		}

	}

}
