package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		int c = Integer.parseInt(br.readLine());

		int[] scoreArr = null;
		double sum, avg, count;
		int score, scoreCount;

		for (int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine());
			scoreCount = Integer.parseInt(st.nextToken());
            
			scoreArr = new int[scoreCount];
			sum = 0;
			for (int k = 0; k < scoreCount; k++) {
				score = Integer.parseInt(st.nextToken());
				sum += score;
				scoreArr[k] = score;				
			}
			avg = sum / scoreCount;
			count = 0;
			for (int k = 0; k < scoreCount; k++) {
				if(scoreArr[k] > avg) count++; 
			}
			bw.write(String.format("%.3f%%\n", count / scoreCount * 100));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}