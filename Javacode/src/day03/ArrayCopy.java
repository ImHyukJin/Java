package day03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//복사는 2가지 개념
		//얕은복사 - 주소값의 복사
		//깊은복사 - 완전히 새로운 배열을 만들고 요소도 옴기는
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr;
		
		arr2[0] = 100; //얕은복사는 원본배열의 값도 변경합니다.
		System.out.println( Arrays.toString(arr) );
		System.out.println( Arrays.toString(arr2) );
		
		//깊은복사
		int[] newArr = new int[arr.length];
		
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[0] = 200; //사본의 값을 바꾸더라도 원본에 영향이 없다.
		
		System.out.println("원본" + Arrays.toString(arr));
		System.out.println("사본" + Arrays.toString(newArr));
		
		
		System.out.println("-----------------------------");
		
		int[] copy = Arrays.copyOf(arr, arr.length); //복사할배열, 복사할길이
		System.out.println("사본" + Arrays.toString(copy));
		
		
		
		
		
		
		
		
	}
}
