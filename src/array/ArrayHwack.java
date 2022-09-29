package array;

public class ArrayHwack {
	public static void main(String[] args) {
		//int 배열 5개 생
		int[] arr = {0,0,0,0,0};
		
		//배열 크기 프린
		System.out.println("Size of arr : " + arr.length);
		
		
		//첫번째 배열에 100을 넣고 프린트 
		arr[0] = 100;
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(" ");
		
		//마지막 배열에 500을 넣고 프린트
		arr[arr.length-1] = 400;
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		
		//배열의 3번째 위치에 200을 넣고 프린트
		arr[2] = 100;
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		
		//배열의 전체를 프린
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		
		//배열의 전체를 인덱스와 함께 프린트
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.println("Index of arr[" + i + "]" + arr[i] + " ");
		}
		System.out.println(" ");
	}
}
