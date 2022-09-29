package ArrayApplication;

import java.util.Random;

public class ArrayRandom {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		Random r = new Random();
		
		for(int i = 0 ; i < lotto.length ; i ++) {
			lotto[i] = r.nextInt(32) + 1;
		}
		
		for(int i = 0 ; i < lotto.length ; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
