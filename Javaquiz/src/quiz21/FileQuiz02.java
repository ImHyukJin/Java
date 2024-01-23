package quiz21;

import java.io.FileWriter;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. 파일명을 입력받습니다.
		 * 2. 사용자가 그만을 입력할 때까지, 작성할 내용을 입력받습니다.
		 * 3. 사용자가 그만을 입력했다면, 마지막에 단 1번으로 파일을 써내립니다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명>");
		String name = scan.nextLine();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + name;
		
		try {
			
			FileWriter fw = new FileWriter(path);
			
			String result = "";
			while(true) {
				String str = scan.nextLine();
				
				if(str.equals("그만")) break;
				
				result += str + "\n";
			}
			fw.write(result);
			
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
