package array;

public class ArrayMake02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		
		for(int i = 0 ; i < num.length ; i ++ ) {
			num[i] = i;
			System.out.println(num[i]);
		}
		
		System.out.println("Index num" + num);
	}

}
