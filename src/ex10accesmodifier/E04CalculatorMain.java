package ex10accesmodifier;

import ex10accessmodifier.cal.Calculator;

public class E04CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		//연산의 결과 출력
		System.out.println("10+20="+cal.addTwonumber(10, 20));
		System.out.println("55+98="+ cal.addTwonumber(55, 98));
		System.out.println("100-77="+cal.subTwonumber(100, 77));

		//연산의 횟수 출력
		cal.showOpratingTimes();
	}

}
