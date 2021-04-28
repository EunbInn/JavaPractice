package Lecture07;

public class P07_1 {
	//20210428 김은비 한글계산
	public static void main(String[] arg) {
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15)); // 메서드 호출로 바이트 길이를 15로 지정한 문자열 출력(공백 문자열 뒤)
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글한글aa", 15)); // 메서드 호출로 바이트 길이를 15로 지정한 문자열 출력(공백 문자열 뒤)
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글aa", 15)); // 메서드 호출로 바이트 길이를 15로 지정한 문자열 출력(공백 문자열 앞)
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글한글aa", 15));// 메서드 호출로 바이트 길이를 15로 지정한 문자열 출력(공백 문자열 앞)
		System.out.printf("한글은[%s]개\n", HanCount("한글한글aa"));//한글 개수 카운트 출력
	}
	
	public static String HanBlankForeword(String k08_han, int k08_leng) {// 스트링타입과 인티저타입을 인자로 받아 스트링을 리턴하는 매서드 선언
		if (k08_han.getBytes().length <= k08_leng) { // 만약 문자열의 바이트가 원하는 자르기 바이트와 같거나 작을 경우
			int k08_blank = k08_leng - k08_han.getBytes().length;//공백 길이 = 원하는 출력 바이트수 - 인자로 받은 문자열 바이트 수
			
			for (int k08_i = 0; k08_i < k08_blank; k08_i++) {//위에서 구한 공백의 길이만큼 반복문 실행
				k08_han += " ";// 문자열에 공백 추가
			}
			return k08_han; // 수정된 문자열 리턴
			
		} else { //문자열의 바이트 수가 원하는 바이트 수 보다 클 경우
			int k08_cnt = 0;//인티저타입 변수 선언 및 0으로 초기화
			String k08_temp = "";//스트링타입 오브젝트 선언 및 ""로 초기화
			
			for (char k08_ch : k08_han.toCharArray()) {//캐릭터 타입 변수 선언, 인자로 받은 문자열을 캐릭터 배열에 넣고 배열 길이만큼 반복문 실행
				k08_cnt += String.valueOf(k08_ch).getBytes().length;//카운트 변수에 한글자마다의 바이트길이 누적
				if (k08_cnt > k08_leng) break;//카운트가 원하는 리턴 바이트 수보다 커지면 반복문 탈출 
				k08_temp += String.valueOf(k08_ch);//카운트가 원하는 리턴 바이트 수보다 커지기 전까지 텍스트에 한글자씩 누적
			}
			
			int k08_blank = k08_leng - k08_temp.getBytes().length;//공백 길이 = 원하는 출력 바이트수 - 인자로 받은 문자열 바이트 수
			
			for (int k08_i = 0; k08_i < k08_blank; k08_i++) {//위에서 구한 공백의 길이만큼 반복문 실행
				k08_temp += " ";// 문자열에 공백 추가
			}
			
			return k08_temp;//수정된 문자열 리턴
		}
	}
	
	public static String HanBlankBackword(String k08_han, int k08_leng) {// 스트링타입과 인티저타입을 인자로 받아 스트링을 리턴하는 매서드 선언
		if (k08_han.getBytes().length <= k08_leng) {// 만약 문자열의 바이트가 원하는 자르기 바이트와 같거나 작을 경우
			int k08_blank = k08_leng - k08_han.getBytes().length;//공백 길이 = 원하는 출력 바이트수 - 인자로 받은 문자열 바이트 수
			
			for (int k08_i = 0; k08_i < k08_blank; k08_i++) {//위에서 구한 공백의 길이만큼 반복문 실행
				k08_han = " " + k08_han;// 문자열 앞에 공백 추가
			}
			return k08_han;// 수정된 문자열 리턴
		} else { //문자열의 바이트 수가 원하는 바이트 수 보다 클 경우
			int k08_cnt = 0;//인티저타입 변수 선언 및 0으로 초기화
			String k08_temp = "";//스트링타입 오브젝트 선언 및 ""로 초기화
			
			for (char k08_ch : k08_han.toCharArray()) {//캐릭터 타입 변수 선언, 인자로 받은 문자열을 캐릭터 배열에 넣고 배열 길이만큼 반복문 실행
				k08_cnt += String.valueOf(k08_ch).getBytes().length;//카운트 변수에 한글자마다의 바이트길이 누적
				if (k08_cnt > k08_leng) break;//카운트가 원하는 리턴 바이트 수보다 커지면 반복문 탈출 
				k08_temp += String.valueOf(k08_ch);//카운트가 원하는 리턴 바이트 수보다 커지기 전까지 텍스트에 한글자씩 누적
			}
			
			int k08_blank = k08_leng - k08_temp.getBytes().length;//공백 길이 = 원하는 출력 바이트수 - 인자로 받은 문자열 바이트 수
			
			for (int k08_i = 0; k08_i < k08_blank; k08_i++) {//위에서 구한 공백의 길이만큼 반복문 실행
				k08_temp = " " + k08_temp;// 문자열 앞에 공백 추가
			}
			
			return k08_temp;//수정된 문자열 리턴
		}
	}
	
	public static int HanCount(String k08_han) {//스트링 타입을 인자로 받아 인티저를 리턴하는 메서드 선언
		int k08_cnt = 0;//인티저 변수 선언 및 초기화
		for (char k08_ch : k08_han.toCharArray()) {//캐릭터 타입 변수 선언, 인자로 받은 문자열을 캐릭터 배열에 넣고 배열 길이만큼 반복문 실행
			if (String.valueOf(k08_ch).getBytes().length > 1) {//비교하는 문자의 바이트 길이가 1보다 크면
				k08_cnt++;//카운트 변수 + 1
			}
		}
		
		return k08_cnt;//카운트 리턴
	}

}
