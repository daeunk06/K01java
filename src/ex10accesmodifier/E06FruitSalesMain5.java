package ex10accesmodifier;
class FruitSeller5{
	
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
	public  FruitSeller5(int money, int appleNum, int price) {
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
class FruitBuyer5{
	int myMoney;
	int numOfApple;
	public FruitBuyer5(int _myMoney, int _numOfApple) {
		myMoney =_myMoney;
		numOfApple =_numOfApple;
	}
	public void buyApple(FruitSeller5 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자] 현재잔액"+myMoney );
		System.out.println("[구매자] 사과갯수"+ numOfApple);
	}
	
}
public class E06FruitSalesMain5 {

	public static void main(String[] args) {

		//판매자 1
		FruitSeller5 seller1 = new FruitSeller5(0, 100, 1000);
		//판매자2
		FruitSeller5 seller2 = new FruitSeller5(0, 80, 500);
		
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);
		
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
		/*
		 아래의 코드는 문법저긍로 오류가 엇으나 지불금약과 구매한 사과의
		 관계가 전혀 맞지않는 논리적 오류 발생
		 즉, 코드(메소드)로 구현한 규칙이 완전 무너지게 된다
		 객체지향 프로그래밍에서는 이런 오류를 막기위해 멤버변수에 대한
		 "정보은닉"하도록 규정하고 있다.
		 */
		seller1.myMoney += 1000;//판매자1에게 천원 지불하고
		seller1.numOfApple -= 50;//사과 50개 구입
		buyer.numOfApple += 50;
		
		seller2.myMoney += 1000;//판매자2에게 천우너 지불하고
		seller2.numOfApple -= 70;//사과70개 구입
		buyer.numOfApple += 70;//하지만 구매자의 보유금액은 차감안됨
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		
	}

}
