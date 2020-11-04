package ex07string;
/*
 stringBuffer 클래스
 	: string클래스는 내부 메소드를 이용해서 새로운 문자열을 생성하면
 	원래 문자열은 변하지 않고 새롭게 생성된 메모리에 문자열 저장
 	기존 메모리가 소멸되고 새로운 메모리가 생성되는 낭비를 막기위해 stringBuffer
 	클래스가 사용된다. 해당크래스는 새로운 매모리를 생성하지 않고 기존 메모리의
 	문자열을 변경한다.
 */
public class E03StringBuilderBuffer {

	public static void main(String[] args) {

		/*
		 append()
		 	:문자열의 끝에 새로운 문자열을 연결한다.
		 insert()
		 	: 저장한 인덱스 위치에 문자열을 삽입한다.
		 */
		StringBuffer strBuf = new StringBuffer("AB");
		strBuf.append(25);
		strBuf.append("Y").append(true);
		System.out.println("strBuf="+ strBuf);
		
		strBuf.insert(2,false);
		strBuf.insert(strBuf.length(),'Z');
		System.out.println("strBuf="+strBuf);
		
		System.out.println("String 과 StringBuffer의 "
		+ "참조값비교");
		String str1 = "코스모";
		String str2 = "코스모";
		if(str1==str2)
			System.out.println("연결전:주소값 동일");//[출력]
		else
			System.out.println("연결전: 주소값다름");
		str1 = str1 +"영원하라";
		if(str1==str2)
			System.out.println("연결 후 주소값 동일");
		else
			System.out.println("연결후: 주소값다름");//[출력]
		
		StringBuffer buf = new StringBuffer();
		System.out.println("buf" + buf);
		System.out.println("저장된 문자열크기"+ buf.length());
		System.out.println("기본버퍼크기"+ buf.capacity());
		
		buf.append("금일은 StringBuffer 공부중임")
			.append("오늘은 수욜~~^^");
		System.out.println("buf=" + buf);
		System.out.println("저장된 문자열크기"+ buf.length());
		System.out.println("기본버퍼크기"+ buf.capacity());
		
		
	}

}
