package algorithm;

import java.util.Scanner;

public class Baekjoon2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		System.out.println(getTime(h,m));
	}
	private static String getTime(int h, int m) {
		m += (h*60) - 45;
		if(m<0) m += 1440;
		return String.format("%d %d", m/60, m%60);
	}
}
