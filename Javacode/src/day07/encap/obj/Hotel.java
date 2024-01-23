package day07.encap.obj;

public class Hotel {
	
	//멤버변수
	private Chef chef; 
	
	//생성자
	//호텔이 생성될 때 초기값을 갖는다.
	public Hotel() {
		this.chef = new Chef(); 
	}
	
	//객체를 매개변수로 받는 setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//객체를 반환하는 getter
	public Chef getChef() {
		return chef; 
	}
	
	
	
	
	
	
	
	
	
	
	
}
