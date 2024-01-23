package Constructor;
	//객체가 생성될 때 객체의 상태(멤버변수)를 '초기화'하는데 사용
	//new 키워드 다음에 오는 것을 '생성자'라고 한다
	//*반환 유형이 없다* , 클래스 *이름*과 대/소문자까지 똑같이 만들어야한다.
	//생성자는 다른유형으로 여러개 생성가능(오버로딩)
	
class Calculator {
	int left ;
	int right ;
	
	public Calculator(int left, int right) { // 생성자 (메소드의 이름은 클래스의 이름이 같아야함)
		this.left = left ;
		this.right = right ;
	}
	public void sum() {
		System.out.println(left+right);
	}

	public void avg() {
		System.out.println((left+right)/2);
	}
}
public class Constructor1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(10,20) ; //생성자 호출해서 객체 생성
		c1.sum();								//setOprand 없이 사용가능
		c1.avg();
		
		Calculator c2 = new Calculator(20,40);
		c2.sum();
		c2.avg();
		
		
	}
}
