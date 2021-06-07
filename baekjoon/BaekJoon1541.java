package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1541 {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		int result = 0;
		String[] arr = input.split("\\-");
		String[] temp = arr[0].split("\\+");


		for (int i = 0; i < temp.length; i++) {
			result+=Integer.parseInt(temp[i]);
		}

		for (int i = 1; i < arr.length; i++) {
			temp = arr[i].split("\\+");
				for (int k = 0; k < temp.length; k++) {
					result -= Integer.parseInt(temp[k]);
				}
		}
		System.out.println(result);
	}
}
