package Lecture07;

public class OneRec1 {
	private int k08_student_id;//private 인티저타입 변수 선언
	private String k08_name; //private 스트링타입 객체 선언
	private int k08_kor; //private 인티저타입 변수 선언
	private int k08_eng; //private 인티저타입 변수 선언
	private int k08_mat; //private 인티저타입 변수 선언
	
	//스트링 1개, 인티저 4개 를 인자로 받는 생성자 생성
	public OneRec1(int k08_student_id, String k08_name, int k08_kor, int k08_eng, int k08_mat) {
		this.k08_student_id = k08_student_id;
		this.k08_name = k08_name;//이름 변수에 받아온 스트링 타입 인자 저장
		this.k08_kor = k08_kor;//국어 변수에 받아온 국어점수 인자 저장
		this.k08_eng = k08_eng;//영어 변수에 받아온 영어점수 인자 저장
		this.k08_mat = k08_mat;//수학 변수에 받아온 수학 점수 인자 저장
	}
	
	public int student_id() {//인티저를 리턴하는 메서드 선언
		return this.k08_student_id;//학번 리턴
	}
	
	public String name() {// 스트링을 리턴하는 메서드 선언
		return this.k08_name;//이름 리턴
	}
	
	public int kor() {//인티저를 리턴하는 메서드 선언
		return this.k08_kor;//국어점수 리턴
	}
	
	public int eng() {//인티저를 리턴하는 메서드 선언
		return this.k08_eng;//영어 점수 리턴
	}
	
	public int mat() {//인티저를 리턴하는 메서드 선언
		return this.k08_mat;//수학 점수 리턴
	}
	
	public int sum() {//인티저를 리턴하는 메서드 선언
		return this.k08_kor + this.k08_eng + this.k08_mat;//국+수+영 총 합을 리턴
	}
	
	public double ave() {//더블형 값을 리턴한느 메서드 선언
		return this.sum() / 3.0;//sum()메서드에서 리턴한 값을 3.0으로 나눈 값 리턴
	}
}
