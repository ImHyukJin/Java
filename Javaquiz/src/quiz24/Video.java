package quiz24;

public class Video implements Runnable {

	@Override
	public void run() {
		
		System.out.println("음악을 15초간 재생합니다");
		
		for(int i = 1; i <= 15; i++) {
			
			System.out.println("링딩동~!");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("음악 재생 종료");
		
	}


	
	
}
