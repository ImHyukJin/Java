package Programers;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution2 {
	static int answer;
	static int target;
	static int[] numbers;
	public static void dfs(int index , int sum){
		//중지 조건
		if(index== numbers.length){
			if(sum == target){
				answer++;
			}
			System.out.println(sum);
			return ;
		}
		//구현 동작
		dfs(index+1,sum+numbers[index]);
		dfs(index+1,sum-numbers[index]);
	}
	public static void main(String[] args) {
		int[] numbers1 = {1,1,1,1,1};
		numbers = numbers1;
		target = 3;
		
		dfs(0,0);
		System.out.println(answer);
	}
    }
