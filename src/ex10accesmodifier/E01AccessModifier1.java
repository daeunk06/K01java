package ex10accesmodifier;

/*
 class를 정의할 때는 반드시 public  과 default만 사용해야한다
private class DefaultCalss1{
	void myFunc() {
		System.out.println("난 정의 할 수 없는 class");
	}
	*/
/*
 접근지정자를 생략했으므로 default클래스로 지정된다
 해당 클래스는 동일 패키지 내에서만 접근가능하다.
 */
class DefaultCalss1{
	void myFunc() {
		System.out.println("DefaultCalss클래스의 myFunc()메소드 호출");
	}
}
/*
public 클래스는 해당java파일을 대표하는 클래스로 파일명과 도일하고 다른 패키지에서도
접근가능하다. public 클래스는 하나의 자바파일에 하나만 정의 할 수있다.
*/
public class E01AccessModifier1 {
	
	//멤버변수를 가각의 접근지정자를 통해 선언
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	/*
	 동일클래스내에서는  private멤버라 할지라도 접근가능
	 즉, 동일 클래스면 접근지정자에 영향을 받지않는다.
	 */
	private void privateMethod() {
		privateVar = 100;
		System.out.println("prvateMethod()메소드 호출");
	}
	void defaultMethod() {
		privateVar = 200;
		System.out.println("defaultMethod()메소드 호출");
	}
	/*
	 private 으로 선언된 멤버(변수 혹은 메소드)를 외붕 클래스에서 접근하고
	 싶을 대 public으로 선언된 멤버메소드를 이용해 간접적 접근 할 수 있다.
	 */
	void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod()메소드 호출");
		privateMethod();
	}
	

}
