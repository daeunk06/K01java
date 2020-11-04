package ex05Method;
/*
 * 오류코드
 * 1. 감소연사자로 인해  cnt값은 차감되지만..
 * 2. 조건식의 위치가 잘못되어..
 * 3. 재귀호출을 하기전에 종료 체크를 할 수 있도록 수정해야한다.
  
 * stackOverflow
 * :스택은 함수가 종료되기 전까지 모든 정보를 저장하는 메모리로 유한한
 * 공간이기 때문에 무한루프에 빠지게 되면 저장능력을 초과하여 에러가 발생한다.
 */
public class E08RecursiveError {

	public static void main(String[] args) {

		showHi(3);
	}
	public static void showHi(int cnt) {
		System.out.println("Hi~1");
		System.out.println("cnt="+cnt);
		if(cnt==1) {
			return;}
		showHi(--cnt);//showHi(cn--); 이건 에러 후위감소는 같은수가 계속 호출됨

		/*
		 감소연산자가 뒤에 있으면 cnt의 값이 감소하기 전 함수를 호출하게 되므로 
		 무한루프에 빠진다.
		 */
		
	}

}
