package algorithm;

import java.util.HashMap;

public class Programmers4 {

	public static void main(String[] args) {

		//String[] phone_book = {"119", "97674223", "10", "1185524421", "1173", "11"};
		String[] phone_book = {"123", "456", "789"};
		System.out.println(solution(phone_book));

	}

	public static boolean solution(String[] phone_book) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (int i = 0; i < phone_book.length; i++) {
			hm.put(phone_book[i], i);
		}
				
		for (int i = 0; i < phone_book.length; i++) {
			for (int k = 0; k < phone_book[i].length(); k++) {
				if (hm.containsKey(phone_book[i].substring(0, k)) ) {
					return false;
				}
			}
		}
		return true;
	}
}
