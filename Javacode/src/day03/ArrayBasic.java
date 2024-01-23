package day03;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		//배열의 개념 - 동일한 타입만 저장하는 붙어있는 상자
		//배열만드는법 2가지
		
		//int[] arr = new int[크기];
		//int[] arr = {1,2,3};
		
		//배열의 사용
		int[] arr = new int[5];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		//배열의 내부를 문자열로 확인
		System.out.println(  Arrays.toString(arr)  );
		
		//배열의 길이를 확인하는 속성
		System.out.println( arr.length );
		
		System.out.println("---------------------------");
		
		//배열의 순회(회전)
		//배열의 합
		int sum = 0;
		
		int i = 0;
		while( i < arr.length ) {
			
			System.out.println("인덱스" + i + "의 값:" + arr[i] );
			sum += arr[i]; //배열 요소들의 합계
			
			i++;
		}
		
		System.out.println("배열요소의 합:" + sum);
		
		
		
		
		
		
	}
}
