package Baekjoon ;
import java.util.Scanner;



public class Main2 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int[] A = new int[9];
	for(int i = 0 ;i<9;i++) {
		A[i] = sc.nextInt();
		
	}
	int a = 0 ;
	int max = A[0];
	for(int i = 0 ; i<9;i++) {
	
		if(max<A[i]) {
			max=A[i] ;
			a = i ;
		}
	
	}
	System.out.println(max);
	System.out.println(a+1);
}
	}