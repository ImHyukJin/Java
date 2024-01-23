package quiz24;

public class Download implements Runnable{

	String sum = "동영상을 다운로드 합니다:";
	
	@Override
	public void run() {
		

		for(int i = 1; i <= 10; i++) {
			
			sum += "*";
			System.out.println(sum);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("동영상 다운로드 종료");
		
	}

	
	
	
}
