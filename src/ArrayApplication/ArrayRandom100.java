package ArrayApplication;

import java.util.Scanner;

public class ArrayRandom100 {

	public static void main(String[] args) {
		int same = 0;
		Scanner sc = new Scanner(System.in);
		
		String[] lastWant = new String[3];
		String[] thisWant = new String[3];
		
		
		for(int i = 0 ; i < lastWant.length ; i++) {
			System.out.print("작년에 가고 싶었던 곳 " + (i+1) + "\n");
			lastWant[i] = sc.next();
		}
		
		for(int i = 0 ; i < thisWant.length ; i++) {
			System.out.println("올해 가고 싶었던 곳 " + (i+1) + "n");
			thisWant[i] = sc.next();
		}
		
		for(int i = 0 ; i < lastWant.length ; i ++ ) {
			for(int j = 0 ; j < thisWant.length ; j++ ) {
				if(lastWant[i].equals(thisWant[j])) {
					same++;
				}
			}	
		}
		
		System.out.println("Same : " + same);
	}

}
