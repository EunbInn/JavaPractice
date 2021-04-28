package Lecture06;

public class InputData {
	//전역변수 선언
	String[] k08_name;//String 배열 선언
	int[] k08_kor, k08_eng, k08_mat, k08_sum;//integer 배열 선언
	double[] k08_ave;//double 배열 선언
	int k08_sumKor, k08_sumEng, k08_sumMat, k08_sumAll;//인티저 변수 선언
	double k08_sumAve, k08_aveKor, k08_aveEng, k08_aveMat, k08_aveAll, k08_aveAve;//더블형 변수 선언
	int k08_addKor = 0;//누적 국어 합계 인티저로 선언 후 초기화
	int k08_addEng = 0;//누적 영어 합계 인티저로 선언 후 초기화
	int k08_addMat = 0;//누적 수학 합계 인티저로 선언 후 초기화
	int k08_addAll = 0;//누적 합계의 합계 인티저로 선언 후 초기화
	double k08_addAve = 0;//누적 평균 합계 더블로 선언 후 초기화
	double k08_addAveKor, k08_addAveEng, k08_addAveMat, k08_addAveAll, k08_addAveAve;//더블형 변수 선언
	
	InputData(int k08_input) {//생성자에 integer 값 인자로 받음
		this.k08_name = new String[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_kor = new int[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_eng = new int[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_mat = new int[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_sum = new int[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_ave = new double[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_sumKor = 0;//변수 초기화
		this.k08_sumEng = 0;//변수 초기화
		this.k08_sumMat = 0;//변수 초기화
		this.k08_sumAll = 0;//변수 초기화
		this.k08_sumAve = 0;//변수 초기화
		this.k08_aveKor = 0;//변수 초기화
		this.k08_aveEng = 0;//변수 초기화
		this.k08_aveMat = 0;//변수 초기화
		this.k08_aveAll = 0;//변수 초기화
		this.k08_aveAve = 0;//변수 초기화
		
	}
	
	public void Reset(int k08_input) {//리셋 메서드 선언
		this.k08_name = new String[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_kor = new int[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_eng = new int[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_mat = new int[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_sum = new int[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_ave = new double[k08_input];//인자로 받은 수만큼의 크기를 가진 배열 생성
		this.k08_sumKor = 0;//변수 초기화
		this.k08_sumEng = 0;//변수 초기화
		this.k08_sumMat = 0;//변수 초기화
		this.k08_sumAll = 0;//변수 초기화
		this.k08_sumAve = 0;//변수 초기화
		this.k08_aveKor = 0;//변수 초기화
		this.k08_aveEng = 0;//변수 초기화
		this.k08_aveMat = 0;//변수 초기화
		this.k08_aveAll = 0;//변수 초기화
		this.k08_aveAve = 0;//변수 초기화
	}
	
	//인티저인자 4개와 스트링인자 1개를 받는 메서드 선언
	public void SetData(int k08_i, String k08_name, int k08_kor, int k08_eng, int k08_mat) {
		this.k08_name[k08_i] = k08_name;//i번째에 스트링 값 저장
		this.k08_kor[k08_i] = k08_kor;//i번째에 국어점수 저장
		this.k08_eng[k08_i] = k08_eng;//i번째에 영어점수 저장
		this.k08_mat[k08_i] = k08_mat;//i번째에 수학점수 저장
		this.k08_sum[k08_i] = k08_kor + k08_eng + k08_mat;//i번째에 국영수 합 저장
		this.k08_ave[k08_i] = (k08_kor + k08_eng + k08_mat) / 3.0;//i번째에 국영수 합을 3.0으로 나눈 더블값 저장
	}
	
	public void sumAll() {//값을 더하는 메서드 선언(페이지)
		for (int i = 0; i < k08_kor.length; i++) {//국어점수 배열의 크기만큼 반복문 실행
			k08_sumKor += k08_kor[i];//국어점수 누적하여 더하기
			k08_sumEng += k08_eng[i];//영어점수 누적하여 더하기
			k08_sumMat += k08_mat[i];//수학점수 누적하여 더하기
			k08_sumAll += k08_sum[i];//합계 점수 누적하여 더하기
			k08_sumAve += k08_ave[i];//평균점수 누적하여 더하기
		}
		
	}
	
	public void aveAll() {//값의 평균을 내는 메서드 선언(페이지)
		k08_aveKor = k08_sumKor / (double) k08_kor.length; //더블형 연산을 위해 나누는 값 더블형으로 변환하여 연산하여 국어 평균에 저장
		k08_aveEng = k08_sumEng / (double) k08_eng.length; //더블형 연산을 위해 나누는 값 더블형으로 변환하여 연산하여 영어 평균에 저장
		k08_aveMat = k08_sumMat / (double) k08_mat.length; //더블형 연산을 위해 나누는 값 더블형으로 변환하여 연산하여 수학 평균에 저장
		k08_aveAll = k08_sumAll / (double) k08_sum.length; //더블형 연산을 위해 나누는 값 더블형으로 변환하여 연산하여 합계 평균에 저장
		k08_aveAve = k08_sumAve / (double) k08_ave.length; //더블형 연산을 위해 나누는 값 더블형으로 변환하여 연산하여 평균의 평균에 저장
	}
	
	public void addAll() {//값을 더하는 메서드 선언(누적페이지)
		k08_addKor += k08_sumKor;//페이지 국어 합계 누적
		k08_addEng += k08_sumEng;//페이지 영어 합계 누적
		k08_addMat += k08_sumMat;//페이지 수학 합계 누적
		k08_addAll += k08_sumAll;//페이지 총계의 합계 누적
		k08_addAve += k08_sumAve;//페이지 평균의 합 누적
	}
	
	public void addAve(int number) {//평균을 내는 메서드 선언(누적페이지)
		double num = (double)number;//인자로 받은 인원수 더블형으로 저장
		k08_addAveKor = k08_addKor / num; //누적된 합계값 누적 인원수로 나눔
		k08_addAveEng = k08_addEng / num; //누적된 합계값 누적 인원수로 나눔
		k08_addAveMat = k08_addMat / num; //누적된 합계값 누적 인원수로 나눔
		k08_addAveAll = k08_addAll / num; //누적된 합계값 누적 인원수로 나눔
		k08_addAveAve = k08_addAve / num; //누적된 합계값 누적 인원수로 나눔
	}
	
}
