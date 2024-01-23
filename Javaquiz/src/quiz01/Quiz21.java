package quiz01;

public class Quiz21 {

	public static void main(String[] args) {
		
		//큰 값을 출력해주세요.
		int[] arr = {34, 65, 12, 34, 56, 34, 100, 54, 21 };
	
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("가장 큰 수는:" + max);
		
		
		
		
		
		
	}
}
