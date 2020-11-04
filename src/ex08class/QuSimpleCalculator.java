package ex08class;
class CalculatorEx{
	//멤버변수 : 각 연산의 횟수를 카운트 하기위한 용도
	int c1,c2,c3,c4;
	//초기화를 위한 멤버메소드
	public void init(){
		int c1,c2,c3,c4 = 0;
		}
	public double add(double a,double b) {
		//덧셈연산을 수행하면 +1 증가
		c1++;
		return a+b;
	}
	public double min(double a,double b) {
		c2++;
		return a-b;
	}
	public double mul(double a,double b) {
		c3++;
		return a * b;}
	public double div(double a,double b) {
		c4++;
		return a / b;
	}
	//연산 횟수를 출력하는  멤버메소드
	public void showOpCount() {
		System.out.println("덧셈횟수:"+c1);
		System.out.println("뺄셈횟수:"+c2);
		System.out.println("곱셈횟수:"+c3);
		System.out.println("나눗셈횟수:"+c4);
	}
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();

	}

}
