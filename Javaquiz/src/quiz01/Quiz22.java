package quiz01;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		
		//백준 10818번
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int[] arr = new int[num];
		
		int i = 0;
		while(i < arr.length) {
			arr[i] = scan.nextInt();
			i++;
		}
		
		//최소, 최대
		int max = arr[0];
		int min = arr[0];
		
		int j = 0;
		while(j < arr.length) {
			if(arr[j] > max) {
				max = arr[j];
			} 
			if(arr[j] < min) {
				min = arr[j];
			}
			j++;
		}
		System.out.println(min + " " + max);
		
	}
}
