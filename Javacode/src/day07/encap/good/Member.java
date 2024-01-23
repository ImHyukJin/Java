package day07.encap.good;

public class Member {

	//특정 알고리즘 가진 클래스가 아니고, 단순히 값을 저장하는 용도의 클래스
	private String id;
	private String name;
	private String email;
	private int age;
	private String phone;
	private String address;
	
	//기본생성자
	public Member() {
	}
	
	//모든 멤버변수를 매개값으로 받는 생성자 alt + shift + s
	public Member(String id, String name, String email, int age, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	//....
	//alt + shift + s로 자동생성
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
	
}
