package ex08class;
class FruitSeller2{
	
	int numOfApple;
	int myMoney;
	int apple_price;
	/*
	 상수에서 변수로 변경함. 
	 클래스의 멤버상수로 정의하는 경우 선언과 동시에 초기화
	 해야하니까 상수는 초기값 없는 형태로 선언불가능.
	 */
	
	/*
	 apple_price를 상수에서 변수로 변경한 이유는
	 상수는 한번만 초기화퇴는 특성때문에 일반적인 멤버메소드내에서
	 초기화 불가능 멤버메소드는 개발자가 원할때 언제든 호출할수 있으므로, 
	 상수의 특성과는 맞지않다.
	 */
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	public int saleApple(int money) {
		int num =money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자] 남은사과갯수"+ numOfApple);
		System.out.println("[판매자] 판매수익"+ myMoney);
	}
}
class FruitBuyer2{
	int myMoney;
	int numOfApple;
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney =_myMoney;
		numOfApple =_numOfApple;
	}
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자] 현재잔액"+myMoney );
		System.out.println("[구매자] 사과갯수"+ numOfApple);
	}
	
}
public class E06FruitSalesMain2 {

	public static void main(String[] args) {

		/*
		 초기화메소드를 정의하였으므로 , 각각 성격이 다른 객체들을
		 생성 할 수 있다.
		 */
		//판매자 1: 보유갯수100, 단가 천원
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000);
		//판매자2 보유:80, 단가 오백원
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500);
		
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
		
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
