package algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers5 {

	public static void main(String[] args) {

		//int[] numbers = {3, 30, 34, 5, 9, 377, 37, 1000};
		//int[] numbers = {0, 0, 0, 0};
		//int[] numbers = {2, 20, 220};
		int[] numbers = {220, 20, 2};
		//int[] numbers = {10, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//int[] numbers= {3, 30, 34, 5, 9};
				
		System.out.println(solution(numbers));		
	}

	
	public static String solution(int[] numbers) {
	    
		String answer = "";
		String[] strNum = new String[numbers.length];
	    for (int i = 0; i < numbers.length; i++) {
			strNum[i] = String.valueOf(numbers[i]);
		}
	    
	    Arrays.sort(strNum, new Comparator<String>() {
	    	@Override
	    	public int compare(String o1, String o2) {
	    		//System.out.printf("%s / %s\n", o2 + o1, o1 + o2);
	    		return (o2 + o1).compareTo(o1 + o2);
	    	}        	
		});
	    //System.out.println(Arrays.toString(strNum));
	
	    for (String s : strNum) {
			answer += s;
		}        
		
	    return answer.startsWith("0") ? "0": answer;
	}
}