package day07.encap.good;

public class MyBirth {

	//은닉 - 중요한 정보(멤버변수, 메서드) private으로 선언
	private int day;
	private int month;
	private int year;
	private String ssn;
	
	/*
	 * 은닉 변수에 값에 접근할 때, 미리 생성해 놓은 getter/setter메서드를 사용해서 접근합니다.
	 * 
	 * setter메서드
	 * 1. 은닉변수에 값을 저장하기 위한 메서드
	 * 2. 접근제어자를 public으로 선언하고 이름은 set멤버변수명 으로 지정
	 * 
	 */
	public void setDay(int day) {
		
		if(day < 0 || day > 31) {
			System.out.println("잘못된 값인데요?");
			return;
		}
		
		this.day = day;
	}
	/*
	 * getter메서드
	 * 1. 은닉변수의 값을 조회하기 위한 메서드
	 * 2. 접근제어자를 public으로 선언하고 이름은 get멤버변수명 으로 지정
	 * 
	 */
	public int getDay() {
		return day;
	}
	
	/*
	 * 1. month, year, ssn에 대한 getter, setter
	 * 
	 * month - 1~12월 까지만 저장
	 * year - 1950~2023년 이하인 경우만 저장
	 * ssn - "-" 제거후에 13자리만 저장
	 * 
	 */
	
	//setter
	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			System.out.println("잘못된 월 입니다");
			return;
		}
		this.month = month;
	}
	
	//getter
	public int getMonth() {
		return month;
	}
	
	//setter
	public void setYear(int year) {
		if(year < 1950 || year > 2023) {
			System.out.println("잘못된 년도 입니다");
			return;
		}
		this.year = year;
	}
	
	//getter
	public int getYear() {
		return year;
	}
	
	//setter -ssn
	public void setSsn(String ssn) {
		
		ssn = ssn.replace("-", "");
		if(ssn.length() != 13 ) {
			System.out.println("길이는 13자리 입니다");
			return;
		}
		
		this.ssn = ssn;
	}
	
	//getter
	public String getSsn() {
		return ssn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
