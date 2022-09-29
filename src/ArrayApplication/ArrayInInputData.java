package ArrayApplication;

import java.util.Scanner;

public class ArrayInInputData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print("Enter Number : ");
			num[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print(num[i] + " ");
			
		}

	}

}
