package array;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner sc =new Scanner(System.in);
		for(int i = 0; i< num.length ; i++) {
			System.out.println("Enter Number");
			num[i] = sc.nextInt();
		}
		
		System.out.println(num[0] + num[2]);
		sc.close();
	}

}
