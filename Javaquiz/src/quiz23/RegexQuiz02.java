package quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
		//상품번호, GS25, (상품명), 가격 분리해서 출력.
		//1줄에대해서 패턴이 4개 나오고, 문자열을 각각 처리하는 반복 (중첩반복)
		
		String[] arr = {str, str2, str3 };
		
		String p1 = "\\d{6}-\\d{4,}";
		String p2 = "GS[25]*";
		String p3 = "\\([가-힣]+\\)";
		String p4 = "[0-9+,*]+,[0-9]{3}원*";
		
		for(int i = 0; i < arr.length; i++) {
			
			//System.out.println(arr[i]);
			Matcher m1 = Pattern.compile(p1).matcher(arr[i]);
			Matcher m2 = Pattern.compile(p2).matcher(arr[i]);
			Matcher m3 = Pattern.compile(p3).matcher(arr[i]);
			Matcher m4 = Pattern.compile(p4).matcher(arr[i]);
			
			if(m1.find() && m2.find() && m3.find() && m4.find() ) {
				System.out.println(m1.group());
				System.out.println(m2.group());
				System.out.println(m3.group());
				System.out.println(m4.group());
			}
			
			System.out.println("-----------------------------");
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
