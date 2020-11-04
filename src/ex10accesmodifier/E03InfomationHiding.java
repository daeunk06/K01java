package ex10accesmodifier;
class FruitSeller{
	
	 private int numOfApple;
	 private int myMoney;
	 private final int APPLE_PRICE;
	/*
	 상수는 값의 변경이 불가능하고, 단 한번만 초기화 됙 때문에 일반적인
	 멤버 메소드에서는 초기화 할 수 없다.
	 그러나 생성자 메소드에서는 초기화가 가능하다
	 마음대로 호출할 수 없고, 객체생성시 단 한번만 호출되는 특성이 동일하니까
	 한번이상 초기화 되지 않음이 되장된다.
	 */
	public  FruitSeller(int money, int appleNum, int price) {
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
class FruitBuyer{
	private int myMoney;
	private int numOfApple;
	public FruitBuyer(int _myMoney, int _numOfApple) {
		myMoney =_myMoney;
		numOfApple =_numOfApple;
	}
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자] 현재잔액"+myMoney );
		System.out.println("[구매자] 사과갯수"+ numOfApple);
	}
	
}
public class E03InfomationHiding {

	public static void main(String[] args) {

		//판매자 1
		FruitSeller seller1 = new FruitSeller(0, 100, 1000);
		//판매자2
		FruitSeller seller2 = new FruitSeller(0, 80, 500);
		
		FruitBuyer buyer = new FruitBuyer(10000, 0);
		
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
		멤버변수를 private 으로 선언하면 외부클래스에서는 접근이 불가능하므로
		아래코드는 에러발생
		즉, 멤버변수의 정보은닉을 통해 비정상적인 접근을 차단하고, 멤버 메소드를
		통해서만 구매가 이뤄질 수 있도록 구현한다.
		 */
//		seller1.myMoney += 1000;//판매자1에게 천원 지불하고
//		seller1.numOfApple -= 50;//사과 50개 구입
//		buyer.numOfApple += 50;
//		
//		seller2.myMoney += 1000;//판매자2에게 천우너 지불하고
//		seller2.numOfApple -= 70;//사과70개 구입
//		buyer.numOfApple += 70;//하지만 구매자의 보유금액은 차감안됨
//		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		
	}

}
