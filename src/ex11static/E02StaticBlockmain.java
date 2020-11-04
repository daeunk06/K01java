package ex11static;

public class E02StaticBlockmain {

	public static void main(String[] args) {

		System.out.println("static블럭 - 다른 클래스의 매인 메소드 실행");
		
		StaticBlock sb = new StaticBlock();
		System.out.println("StaticBlock.staticVar"+ StaticBlock.staticVar);
	}

}
