package algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers7 {

	public static void main(String[] args) {
		//int[] priorities = {2, 1, 3, 2};
		//Integer[] priorities = {3, 2, 4, 1, 2, 1};
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		//CABEFD
		System.out.println(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {
	    
	    Queue<Integer> q = new LinkedList<>();
	    for (int i : priorities) {
	    	q.add(i);			
		}
	    
	    int count = 0;
	    Arrays.sort(priorities);
	    //System.out.println(Arrays.toString(priorities));
	
	    for (int i = priorities.length-1; i >= 0 ; i--) {
			while(true) {
				location--;
				if(priorities[i] == q.peek()) {
					q.remove();
					count++;					
					if(location==-1) return count;
					break;
				}else {
					q.add(q.poll());
					if(location==-1) location = q.size()-1;
				}
			}
		}
	    return count;
	}
}
