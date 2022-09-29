package array;

public class Array_Make {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = { 1,2,3,4,5,6,7,8,9,20};
		System.out.println("Adress of s" + s );
		
		for(int i = 0 ; i < s.length;i++) {
			System.out.println(s[i]);
		}
		
		int[] s2 = new int[5];
		System.out.println("Adress of s2 " + s2);
		
		s2[0] = 100;
		s2[1] = 200;
		s2[2] = 300;
		
		s2[s2.length - 1] = 400;
	}

}
