package Lecture06;
//20210427 김은비 변수와 메서드(2)
public class P06_2 {
	static int k08_iStatic;//integer type 전역변수 static으로 선언
	
	public static void k08_add(int k08_i) {//integer type을 인자로 받는 스테틱 메서드 선언
		k08_iStatic++;//전역변수 iStatic에 +1
		System.out.printf("add메소드에서 -> iStatic = [%d]\n", k08_iStatic);//iStatic 출력
		System.out.printf("add메소드에서 -> i = [%d]\n", k08_i);//인자 i출력
	}
	
	public static int k08_add2(int k08_i) {//integer type을 인자로 받는 스테틱 메서드 선언
		k08_iStatic++;//전역변수 iStatic에 +1
		k08_i++;//인자 i + 1
		System.out.printf("add2메소드에서 -> iStatic = [%d]\n", k08_iStatic);//iStatic 출력
		System.out.printf("add2메소드에서 -> i = [%d]\n", k08_i);//인자 i출력
		
		return k08_i;//i 리턴
	}
	
	public static void main(String[] args) {//메인 시작
		
		int k08_iMain;//인티저타입 변수 선언
		
		k08_iMain = 1;//변수 iMain에 1저장
		k08_iStatic = 1;//전역변수 iStatic에 1 저장
		
		System.out.printf("*********************************************\n");//구분선 출력
		System.out.printf("메소드 호출 전 메인에서 -> iStatic = [%d]\n", k08_iStatic);//iStatic 출력
		System.out.printf("메소드 호출 전 메인에서 -> i = [%d]\n", k08_iMain);//iMain 출력
		System.out.printf("*********************************************\n");//구분선 출력
		
		k08_add(k08_iMain);//add매서드에 iMain 인자로 넣고 호출
		
		System.out.printf("*********************************************\n");//구분선 출력
		System.out.printf("메소드 호출 후 메인에서 -> iStatic = [%d]\n", k08_iStatic);//iStatic 출력
		System.out.printf("메소드 호출 후 메인에서 -> i = [%d]\n", k08_iMain);//iMain 출력
		System.out.printf("*********************************************\n");//구분선 출력
		
		k08_iMain = k08_add2(k08_iMain);//add매서드에 iMain 인자로 넣고 리턴받은 값을 iMain변수에 저장
		
		System.out.printf("*********************************************\n");//구분선 출력
		System.out.printf("메소드 add2 호출 후 메인에서 -> iStatic = [%d]\n", k08_iStatic);//iStatic 출력
		System.out.printf("메소드 add2 호출 후 메인에서 -> i = [%d]\n", k08_iMain);//iMain 출력
		System.out.printf("*********************************************\n");//구분선 출력

	}

}
