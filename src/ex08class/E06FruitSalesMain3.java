package ex08class;
class FruitSeller3{
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
	public  FruitSeller3(int money, int appleNum, int price) {
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
class FruitBuyer3{
	int myMoney;
	int numOfApple;
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney =_myMoney;
		numOfApple =_numOfApple;
	}
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자] 현재잔액"+myMoney );
		System.out.println("[구매자] 사과갯수"+ numOfApple);
	}

}
public class E06FruitSalesMain3 {

	public static void main(String[] args) {

		//판매자 1 돈, 사과, 가격
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		//판매자2
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자1,판매자 2에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1,5000);
		buyer.buyApple(seller2,5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}
