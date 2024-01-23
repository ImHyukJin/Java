package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	public static int lowerbound(int[] arr , int target) {
		  int left = 0; int right = arr.length;

		while(left< right) {
			int mid = (left+right) /2;

			if(arr[mid]>=target) {	
				right = mid;
			}else {
				left = mid+1;
			}
		}



		return right;
	}
	public static int upperbound(int[] arr , int target) {
		 int left = 0; int right = arr.length;
		
		while(left< right) {
			int mid = (left+right) /2;
			
			if(arr[mid]<=target) {
				left = mid+1;
			}else {
				right = mid;
			}
		}
		
		
		
		return right;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i]=a;
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M ;i++) {
			int a =Integer.parseInt(st1.nextToken());
			sb.append(String.valueOf(upperbound(arr,a)-lowerbound(arr,a)));
			sb.append(" ");
			
		}
		
		System.out.println(sb);
	}
}