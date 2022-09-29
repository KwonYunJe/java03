package ArrayApplication;

public class ArrayApplicaion {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		for(int i =0 ; i < num.length ; i++) {
			num[i] = (i + 1) * 10;
		}
		
		System.out.println(num[0] + num[2]);
		
		
		String[] str = new String[3];
		
		str[0] = "Java";
		str[1] = "Spring";
		str[2] = "JSP";
		
		System.out.println(str[0] + "보다는 " + str[1]);
	}

}
