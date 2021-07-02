package algorithm;

public class Programmers6 {

	public static void main(String[] args) {

		int n = 10;	
		System.out.println(solution(n));
		
	}
	public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int remainder = 0;
        
        while(n != 0) {
        	remainder = n % 3;
        	n /= 3;
        	if(remainder == 0) {
        		n--;
        		remainder = 4;
        	}
        	sb.insert(0, remainder);
        }
        return sb.toString();
	}
}