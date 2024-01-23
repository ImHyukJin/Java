package quiz21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 읽어들일 파일명을 정확히 입력을 받습니다.
		 * 
		 * 2. upload폴더에 해당파일이 있으면, 이 파일을 copy폴더로 복사하면 됩니다
		 * 
		 * 3. 파일명이 없다면 FileNotFoundException처리
		 * 	  복사도중 에러가 난다면 IOException처리
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일명 입력>");
		String name = scan.next();
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + name; 
		String copypath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\copy\\" + name;
		
		try {
			
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(copypath);
			
			byte[] arr = new byte[100];
			int result;
			
			while( (result = fis.read(arr) ) != -1  ) {
				fos.write(arr, 0, result);
			}
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일이 없습니다");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("복사중 예기치 않은 에러가 발생했습니다");
		} 

		
		
		
		
	}
}
