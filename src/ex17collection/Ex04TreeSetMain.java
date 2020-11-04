package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

/*
 TreeSet<T>컬렉션
 -트리라는 자료구조를 기반으로 한 Set컬렉션이다
 -Set의 기본적인 특성은 동일하나, Tree알고리즘을 통해
 	정렬되어 저장된다. 정렬의 기준은 개발자가 직접 정의할 수 있다
 -정렬의 기준을 정하기위해 Comparable<T> 인터페이스를 구현해야한다.
 */
class MyString implements Comparable<MyString>{
	
	String str;

	public MyString(String str) {
		this.str = str;
	}
	//멤버변수 str의 길이를 구해 반환한다.
	public int getLength() {
		return str.length();
	}
	/*
	 정렬의 기준을 위해 오버라이딩한 메소드를 가나다와 같은 사전순, 무자열의 길이 등
	 다양하게 설정할 수 있다.
	 아래 코드는 오름차순(작은것->큰것) 정렬일때 사용한다.
	 1과 -1의 위치가 바뀌면 내림차순이 된다.
	 */
	@Override
	public int compareTo(MyString paramStr) {

		//정렬의 순서는 문자열의 길이를 기준으로 한다.
		if(getLength()> paramStr.getLength())
			return 1;
		else if (getLength()< paramStr.getLength())
			return -1;
		else
			return 0;
		
		//문자열의 알파벳 순서대로 정렬한다.
//		if(str.compareTo(paramStr.str)>0)
//			return 1;
//		else if(str.compareTo(paramStr.str)<0)
//			return -1;
//		else
//			return 0;
	
	}
	
	@Override
	public String toString() {
		return str;
	}
}

public class Ex04TreeSetMain {

	public static void main(String[] args) {

		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		System.out.println(tree1.add(2));// set은 중복저장 허용안돼
		
		//중복이 제거되어 4개만 저장된다.
		System.out.println("저장된 데이터 수:"+ tree1.size()+"개");//4개
		
		Iterator<Integer> itr1 = tree1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		/*********************************************/
		
		/*
		 -문자열의 길이가 정렬의 기준일때는 아래 7글자인 KOSMOXX는
		 	1개만 삽입된다
		 -문자욜을 compareTo()를 통해 비교해서 정렬할때는 모든 문자열이
		 	set에 삽입된다.
		 */
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		tree2.add(new MyString("Orange"));//6
		tree2.add(new MyString("Apple"));//5
		tree2.add(new MyString("Moon"));//4
		tree2.add(new MyString("KOSMO61"));//7
		tree2.add(new MyString("KOSMO62"));//7
		tree2.add(new MyString("KOSMO63"));//7
		tree2.add(new MyString("KOSMO64"));//7
		
		Iterator<MyString> itr2 = tree2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}





































