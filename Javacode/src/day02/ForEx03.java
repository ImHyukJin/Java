package day02;

import java.util.Arrays;

public class ForEx03 {

	public static void main(String[] args) {
		
		//1. 배열의 값을 옴기기
		//배열은 크기가 고정이라서 새로운 배열을 만들고, 값을 옴겨담는다. 
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; //원본배열
		int[] newArr = new int[5]; //옴겨담을 새로운배열
		
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println( Arrays.toString(newArr) );
		
		System.out.println("------------------------------------");
		//2. 배열의 자리를 바꾸는 방법.
//		int x = 10;
//		int y = 100;
//		int temp = 0;
//		
//		temp = y; //temp = y = x = temp;
//		y = x;
//		x = temp;
//		System.out.println(x);
//		System.out.println(y);
		
		int[] arr2 = {1, 2};

		int temp = arr2[0];
		arr2[0] = arr2[1];
		arr2[1] = temp;
		System.out.println( Arrays.toString(arr2) );
		
		System.out.println("------------------------------------");
		
		//랜덤하게 3번 자리바꾸기
		int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 1; i <= 3; i++) { //3바퀴
			
			int ran = (int)(Math.random() * arr3.length); //인덱스범위의 랜덤한 수
			int tmp = arr3[0];
			arr3[0] = arr3[ran];
			arr3[ran] = tmp;
			
			System.out.println("랜덤인덱스:" + ran );
			System.out.println(Arrays.toString(arr3));
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
