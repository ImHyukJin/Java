package day03;

import java.util.Arrays;

public class ArrayMatrix {

	public static void main(String[] args) {
		
		//2차원 배열 - 배열안에 배열이 들어간다.
		/*
		 * {
		 * 		{1,2,3},
		 * 		{1,2,3},
		 * 		{1,2,3},
		 * }
		 * 
		 */
		
		//이차원 배열을 만드는 방법1
		//int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		int[] arr3 = {7,8,9};
		int[][] arr = {arr1, arr2, arr3};
		
		//인덱스의 접근
		System.out.println(  arr[0]  ); //배열
		System.out.println(  Arrays.toString( arr[0] ));
		System.out.println(  Arrays.toString( arr[1] ));
		System.out.println(  Arrays.toString( arr[2] ));
		//2차원 배열에 접근
		
		System.out.println( arr[0][0] );
		System.out.println( arr[0][1] );
		System.out.println( arr[0][2] );
		
		arr[0][0] = 100; //0행 0열 값 변경
		System.out.println( arr[0][0] );
		
		System.out.println("-------------------------------");
		//2차원 배열에 순차적 접근
		//행
		for(int i = 0; i < arr.length; i++) {
			//열
			for(int j = 0; j < arr[i].length; j++ ) {
				
				System.out.println(arr[i][j]);
			}
			
		}
		
		System.out.println("-------------------------------");
		//이차원 배열을 만드는 방법2
		int[][] ar = new int[3][4]; //행렬
		
		//ar 2차원 배열에 1~12까지 값을 순서대로 저장
		int x = 1;
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = x++; //값을 대입하고 증가
			}
		}
		
		//2차원의 배열의 값을 문자열로 출력
		System.out.println( Arrays.deepToString(ar) );
		
		
		
		
		
		
	}
}
