package algorithm;

public class Programmers1 {

	public static void main(String[] args) {

		String s = "abcde";
		System.out.println(solution(s));

	}

	public static String solution(String s) {
		return s.substring((s.length()-1) / 2, (s.length()/2) + 1);
	}
}
