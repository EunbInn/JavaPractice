package doitnow;
ikdmjdai
import java.util.Scanner;
import java.util.Stack;
test!!!
public class WordCount {
	public static void main(String[] args) { 	
		WordCount main = new WordCount();
		
<<<<<<< HEAD
		main.getWordCount();
	,,,,,	
=======
Count()dmdslkmv
		
>>>>>>> b144e9ab2a30ddabf864ac8f608b5f523de17f47
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void getWordCount() {
		String input = sc.nextLine();
		String word = sc.next();
		String[] inputArr = input.split("");
		String[] wordArr = word.split("");
		int[] alphcnt = new int[wordArr.length];
		
		for (int i = 0; i < wordArr.length; i++) {
			int cnt = 0;
			int cnt2 = 0;
			for (int j = 0; j < inputArr.length; j++) {
				if (wordArr[i].equals(inputArr[j])) {
					cnt++;
				}
			}
			for (int k = 0; k < wordArr.length; k++) {
				if (wordArr[i].equals(wordArr[k])) {
					cnt2++;
				}
			}
			alphcnt[i] = cnt / cnt2;
		}

		int min = alphcnt[0];
		for (int i = 0; i < wordArr.length; i++) {
			if (alphcnt[i] <= min) {
				min = alphcnt[i];
			} else {
				
			}
		}
		System.out.println(min);
	}
}



