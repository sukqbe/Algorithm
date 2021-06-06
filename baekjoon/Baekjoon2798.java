package algorithm;

import java.util.Scanner;

public class Baekjoon2798 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] cards = new int[n];
		for (int i = 0; i < n; i++) {
			cards[i] = scanner.nextInt();
		}
		int answer = play(cards, m, n);
		System.out.println(answer);
	}

	private static int play(int[] cards, int m, int n) {

		int answer = 0;
		int sum = 0;
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int k = j+1; k < n; k++) {
					sum = cards[i]+cards[j]+cards[k];
					if(sum <= m && sum > answer) answer = sum;
				}
			}
		}
		return answer;
	}
}