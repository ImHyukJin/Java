package day05;

public class ObjectBasic01 {

	public static void main(String[] args) {
	
		//만약 객체를 사용하지 않는다면?
		System.out.println("1번 계산기 사용");
		System.out.println( add(10)  );
		System.out.println( add(20)  );
		System.out.println( add(30)  );
		
		System.out.println("2번 계산기 사용");
		System.out.println( add2(10)  );
		
		
		
	} //end main
	
	static int result;
	static int add(int a) {
		result += a; 
		return result;
	}
	
	static int result2;
	static int add2(int a) {
		result2 += a;
		return result2;
	}

	
	
	
	
	
	
}
