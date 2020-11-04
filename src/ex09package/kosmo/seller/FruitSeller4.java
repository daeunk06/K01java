package ex09package.kosmo.seller;

public class FruitSeller4 {
	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	/*
	 상수는 값의 변경이 불가능하고, 단 한번만 초기화 됙 때문에 일반적인
	 멤버 메소드에서는 초기화 할 수 없다.
	 그러나 생성자 메소드에서는 초기화가 가능하다
	 마음대로 호출할 수 없고, 객체생성시 단 한번만 호출되는 특성이 동일하니까
	 한번이상 초기화 되지 않음이 되장된다.
	 */
	public  FruitSeller4(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	public int saleApple(int money) {
		int num =money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자] 남은사과갯수"+ numOfApple);
		System.out.println("[판매자] 판매수익"+ myMoney);
	}
}
