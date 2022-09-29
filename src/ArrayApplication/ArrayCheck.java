package ArrayApplication;

import java.util.Random;

public class ArrayCheck {

	public static void main(String[] args) {
		int[] answer = new int[990];
		int[] myAns = new int[990];
		int o = 0;
		int x = 0;
		char y = ' ';
		
		Random r = new Random();
		
		
		System.out.println("Num\t정답\t내답");
		for(int i = 0 ; i < answer.length ; i ++ ) {
			answer[i] = r.nextInt(4) + 1;
		}
		
		for(int i = 0 ; i < answer.length ; i ++ ) {
			myAns[i] = r.nextInt(4) + 1;
		}
		
		for(int i  = 0 ; i < answer.length ; i ++) {
			if(answer[i] == myAns[i]) {
				o++;
				y = 'o';
			}else {
				x++;
				y = 'x';
			}
			System.out.println(i+1 + ".\t" + answer[i] + "\t" + myAns[i] + "\t 정답여부 : " + y);
		}
		
		System.out.println("맞은 개수 : " + o);
		System.out.println("틀린 개수 : " + x);
	}

}
