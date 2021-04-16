package Lecture04;
//20210402_김은비_숫자읽기고급
public class HW07 {//클래스선언

	public static void main(String[] args) {//메인에서 시작
		int k08_iNumVal = 1001034567;//integer type 변수 선언 및 정의, 변수에 1001034567 저장
		
		String k08_sNumVal = String.valueOf(k08_iNumVal);//integer 변수 String으로 변환
		
		String k08_sNumVoice = ""; //String타입 오브젝트 생성 및 초기화
		
		int k08_i, k08_j;//integer type 변수 두개 설정
		
		String[] k08_units = {"영","일","이","삼","사","오","육","칠","팔","구"}; //배열에 문자열 저장
		String[] k08_unitX = {"","십","백","천","만","십","백","천","억","십"}; // 배열에 단위 문자열 저장
		
		k08_i = 0; //루프 전 i 값 0으로 초기화
		k08_j = k08_sNumVal.length() - 1; // 루프 전 i 값 배열 길이 - 1로 초기화
		
		while(true) {//while 반복문 시작
			if (k08_i >= k08_sNumVal.length()) break; //변수 i가 sNumVal의 문자 길이와 같거나 커질 시 break
			
			System.out.printf("%s[%s]", // 출력 type 지정
					k08_sNumVal.substring(k08_i, k08_i + 1),//문자열 sNumVal에서 i번째에 있는 문자 출력
					//문자열 sNumVal에서 i번째에 있는 문자를 integer형태로 형변환 하여 해당 숫자 위치에 있는 unit 배열의 문자열 출력 
					k08_units[Integer.parseInt(k08_sNumVal.substring(k08_i, k08_i + 1))]);
			
			if (k08_sNumVal.substring(k08_i, k08_i + 1).equals("0")) {//문자열 sNumVal에서 i번째에 있는 문자가 0일 때
				//unitX배열 내 j번째 문자열이 "만"과 일치하거나 "억"과 일치하면 sNumVoice 배열에 해당 문자를 sNumVoice 에 누적
				if (k08_unitX[k08_j].equals("만") || k08_unitX[k08_j].equals("억")) {
					k08_sNumVoice = k08_sNumVoice + "" + k08_unitX[k08_j];
				} else {
					//아닐 경우 실행되는 내용 없음
				}
			} else {//문자열 sNumVal에서 i번째에 있는 문자가 0이 아닐 때,
				//문자열 sNumVal에서 i번째에 있는 문자를 integer형태로 형변환 하여 해당 숫자 위치에 있는 unit 배열의 문자열과
				//unitX배열 내 j번째 문자열을 함께 sNumVoice에 누적
				k08_sNumVoice = k08_sNumVoice
						+ k08_units[Integer.parseInt(k08_sNumVal.substring(k08_i, k08_i + 1))]
					    + k08_unitX[k08_j];
			}
			k08_i++;//숫자를 읽는 건 왼쪽에서 오른쪽으로 읽어야하므로 ++
			k08_j--;//단위는 거꾸로 계산하여 붙여야하므로 --
		}
		System.out.printf("\n %s[%s]\n", k08_sNumVal,k08_sNumVoice);//최종으로 누적된 문자열 출력
	}

	
}
