package quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * 연화가 입사한 회사에서는 매일 오전 7시에 연계사에서 
		 * 날짜유형의 csv파일을 전송을 해줍니다.
		 * 
		 * ex) 2023_11_24_data.csv 유형의 파일입니다
		 * 
		 * 그래서 연화는 매일 아침마다 csv파일을 읽어서 데이터베이스에 저장하는
		 * 프로그램 코드를 만들어야 합니다.
		 * 
		 * 1. buffered를 사용해서 날짜_data.csv파일을 읽어서 한줄 한줄씩 출력해주세요. 
		 * 2. 읽은 데이터를 ,기준으로 분리해서 raw데이터를 Data객체에 저장하고 리스트에 저장하세요
		 */
//		LocalDate now = LocalDate.now();
//		String result = now.format(DateTimeFormatter.ofPattern("yyyy_MM_dd"));
//		System.out.println(result);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
		String result = sdf.format(date);
		//System.out.println(result);
		
		List<Data> list = new ArrayList<>();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\"+ result +"_data.csv";
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			String str;
			while( (str = br.readLine()) != null  ) {
				
				str = str.replace(" ", "");
				String[] arr = str.split(",");
				
				Data data = new Data(arr[0], arr[1], arr[2], arr[3]);
				list.add(data);
				//System.out.println(str);
			}
			
			System.out.println(list);
			
			br.close();//자원해제
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
