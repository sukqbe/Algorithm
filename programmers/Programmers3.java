package algorithm;

import java.util.Arrays;

public class Programmers3 {

	public static void main(String[] args) {

		int[] arr = {4, 3, 2, 1};
		int[] result = solution(arr);
		System.out.println(Arrays.toString(result));

	}

	public static int[] solution(int[] arr) {
		int len = arr.length;
		if(len==1) return new int[] {-1};

		int min = arr[0];
		for (int i = 1; i < len; i++) {	//가장 작은 수 구하기
			if(min > arr[i]) {
				min = arr[i];
			}
		}

		int count = 0;
		for (int i = 0; i < len; i++) {	//가장 작은 수의 개수 구하기
			if(min==arr[i]) {
				count++;
			}
		}

		int[] answer = new int[len-count];
		for (int i = 0, k = 0; i < len; i++) {	//가장 작은 수들을 제외한 배열 만들기
			if(arr[i] != min) {
				answer[k++] = arr[i];
			}
		}
		return answer;
	}
}