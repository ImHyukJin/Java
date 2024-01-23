package Interface;

interface I1{
	public void x();
}
interface I2{
	public void z();
}
public class Interfaces_example3 implements I1,I2{

	public void x() {}
	public void z() {}
}
// 하나의 클래스가 여러개의 인터페이스를 구현 할 수 있다. interface_example3가 I1,I2를 구현
// 인터페이스 상속도 가능하다
interface I3{
	public void x();
}

interface I4 extends I3 {
	public void z();
}
class B implements I4 {
	public void x() {}
	public void z(){}
}
//인터페이스도 상속이 된다



/*abstract vs interface
 *인터페이스는 클래스가 아닌 인터페이스 고유한 형태, 추상클래스는 일반적인 클래스
 *인터페이스는 구체적인 로직이나 상태가 절대 없고,추상클래스는 상속을 강제하지만 일반적인 구체적인 로직이나 상태를 가질 수 있다. 
 */
 
