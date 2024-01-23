package day07.encap.good;


public class MainClass {

	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		
		//me.day = 100;
		
		//값의 저장
		me.setYear(2022);
		me.setMonth(12);
		me.setDay(30);
		me.setSsn("123123-1231231");
		
		//값의 사용
		int year = me.getYear();
		int month = me.getMonth();
		int day = me.getDay();
		String ssn = me.getSsn();
		
		System.out.println(year + "년" + month + "월" + day + "일입니다");
		System.out.println("주민번호:" + ssn);
		
		
		
		
		
		
		

		
		
	}
}
