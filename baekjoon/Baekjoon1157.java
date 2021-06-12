package algorithm;

import java.io.IOException;

public class Baekjoon1157 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] cnt = new int[26];

			int one = 0;
			int max = 0;
			while((one = System.in.read()) != 10) {
				if(one>=97) one -= 32;
				if(++cnt[one-65] > max) {
					max= cnt[one-65];
				}
			}
			
			int maxCount = 0;
			int maxValue = 0;
			for (int i = 0; i < cnt.length; i++) {
				if(cnt[i]==max) {
					maxCount++;
					maxValue = i;
				}
			}
			
			char result = ' ';
			if(maxCount==1) result = (char)(maxValue+65);
			else result = '?';
			
			System.out.println(result);
	}
}
