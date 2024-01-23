package quiz22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RamdaQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 오늘날짜_data.csv파일을 읽어들입니다.
		 * 2. 각각의 행데이터를 Data클래스에 저장하고 List에 추가합니다.
		 * 3. 각 데이터들 중에서 나이가 30세 이상이거나, 지역이 서울이 포함된 데이터만 추출
		 * 
		 */
		
		LocalDate date = LocalDate.now();
		String now =date.format(DateTimeFormatter.ofPattern("yyyy_MM_dd"));
		
		List<Data> list = new ArrayList<>(); ///
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + now + "_data.csv";
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			String str;
			while( (str = br.readLine()) != null) {
				System.out.println(str);
				
				String[] arr = str.replace(" ", "").split(","); //분리
				Data data = new Data(arr[0], arr[1], arr[2], arr[3]); //저장
				list.add(data); //리스트에 추가
			}
			
			
			List<Data> newList = list.stream()
			.filter( a -> Integer.parseInt(a.getAge()) >= 30 || a.getRegion().contains("서울") )
			.collect( Collectors.toList() ); //최종함수
			
			
			System.out.println(newList.toString());
			
			
			
			
			
			
			
			
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
}
