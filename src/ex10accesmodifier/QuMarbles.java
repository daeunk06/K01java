package ex10accesmodifier;
class ChildProperty{
	//1.멤버변수 어린아니가 보유하고 있는 구슬의 갯수
	int beadCnt;
	
	
	public ChildProperty(int beadCnt) {
		this.beadCnt = beadCnt;
	}
	//구슬치기 게임을 표현
	public void obtainBead(ChildProperty child,int n) {
	//게임에 승리한 어린이 > 해당메소드를 호출한 객체
		this.beadCnt += n;
	//게임에 패배한 어린이 > 메소드 호출시 매개변수로 전달된 객체
		child.beadCnt -= n;
		
	}
	public void showProperty() {
		System.out.println("보유 구슬의 개수"+beadCnt);
	}
}
public class QuMarbles {
	
	public static void main(String[] args)
	{        	
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);
	
		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 
	
		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);
	
		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);
	
		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
}

}
