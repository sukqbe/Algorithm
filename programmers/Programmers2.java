package algorithm;

public class Programmers2 {

	public static void main(String[] args) {

		int a = -1000000;
		int b = 5000000;
		
		long result = solution(a, b);
		
		System.out.println(result);
		
	}
	
	public static long solution(int a, int b) {
	       
	    long answer = (((long)a + b) * (Math.abs(a - b) + 1)) / 2;
	        
	    return answer;
	}

}
