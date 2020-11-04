package ex07string;

public class E02StringMethod {

	public static void main(String[] args) {
		System.out.println("String 클래스의 주요 메소드");

		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		/*
		 1] length()
		 	:문자열의 길이를 반환한다.
		 */
		System.out.println("str1의 길이:" + str1.length());
		System.out.println("str2의 길이:" + str2.length());
		/*
		 2] charAt(인덱스)
		 	:문자열에서 특정인덱스에 해당하는 문자 하나를
		 	반환한다. index는 0부터시작한다.
		 */
		System.out.println("str1의 두번째 문자:"
				+ str1.charAt(1));
		
		System.out.println("str2의 두번째 문자:"
				+ str2.charAt(1));
		/*
		 시나리오] 주민등록 번호를 이용하여 성별을 판단하는 프로그램을 작성하세요
		 190419 -300000 => 남자
		 190419 -400000 => 여자
		 */
		String juminNum = "190419 - 5000000";
		if(juminNum.charAt(7)=='1'
				|| juminNum.charAt(7)=='3') {
			System.out.println("남자입니다.");
		}
		else if(juminNum.charAt(7)=='2'
				|| juminNum.charAt(7)=='4') {
			System.out.println("여자입니다.");
		}
		else if(juminNum.charAt(7)=='5'
				|| juminNum.charAt(7)=='6') {
			System.out.println("외국인입니다.");
		}
		else 
			System.out.println("주민 번호가 잘못되었습니다.");
		
		/*
		 4] compareTo()
		 	: 두 문자열의 첫번째 문자부터 순차적으로 비교하면서
		 		앞의 문자열의 아스키코드가 크면 양수를 반환
		 		뒤의 문자열의 아스키코드가 크면 음수를 반환
		 		같으면 0을 반환한다.
		 */
		String str3 ="A";
		String str4 ="B";
		System.out.println(str3.compareTo(str4));//-1
		System.out.println(str4.compareTo(str3));//1
		System.out.println("ABC".compareTo("ABC")==0 ?
			"문자열이같다 " : "문자열이다르다"	);
		/*
		 5] concat()
		 	: 두개의 문자열을 연결할떄 사용한다. +기호와 동일한
		 	역할을 한다.
		 */
		System.out.println("JAVA".concat(" WORLD").concat(" GO"));
		System.out.println("JAVA" +(" WORLD") + (" GO"));
		/*
		 6] contains()
		 	:문자열에특정 문자열이 포함되어있는지를 판ㄷ단하여
		 	포함되었으면 true를 반환한다.
		 */
		System.out.println(str1.concat("TO"));
		System.out.println(str1.concat("tO"));
		/*
		 시나리오] 해당 문자열이 이메일 형식인지 검사하는 프로그램을 작성하시오.
		 hong@ikosmo.co.kr => 이메일형식임
		 not@never => 이메일형식이 아님
		 */
		//String email1 ="hong@ikosmo.co.kr";
		String email1 ="not@never";
		if(email1.contains("@") && email1.contains(".")) {
			System.out.println("이메일 형식임");
		}
		else
			System.out.println("이메일 형식이 아님");
		/*
		 7] endsWith()
		 	: 문자열이 특정문자열로 끝나면 true .아니면 false를 반환
		 8] startWith()
		 	: 문자열이 특정문자열로 시작하면 true .아니면 false를 반환
		 */
		System.out.println("www.daum.net".endsWith("net"));//true
		System.out.println("naver.com".startsWith("http"));//false
		
		/*
		 9]format()
		 	:출력 형식을 저장하여 문자열로 반환하고 싶을때 사용한다.
		 	printf()와 사용법은 동일하고 주로 웹어플리케이션을 제작할때 사용
		 */
		System.out.printf("국어: %d,영어:%d,수학:%d\n", 81, 92, 100);
		
		String formatStr =
				String.format("국어: %d,영어:%d,수학:%d\n", 81, 92, 100);
		System.out.println(formatStr);
		/*
		 10] indexOf()
		 	:문자열에서 특정 문자열의 시작 인덱스를 반환한디.
		 	만약 특정 문자열이 없다면 -1을 반환한다.
		 */
		System.out.println(str1.indexOf("ava"));//12
		System.out.println(str1.indexOf("J"));//-1
		System.out.println(email1.indexOf("@")!=-1 ? "이메일 형식이 맞음" : "이메일 형식이 아님" );
		/*
		 시나리오]
		 주민등록번호를 indexOf를 사용하여 성별을 구분하는
		 프로그램을 작성해라.
		 */
		//'-'(하이픈)의 위치를 찾아 +1하면 성별에 해당하는 문자를 얻을 수 있음.
		juminNum = "120403-3012345";
		int index = juminNum.indexOf("-") + 1;
		if(juminNum.charAt(index)=='3') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		/*
		 11] lastIndexOf()
		 	:사용법은 indexOf와 동일하나 문자열의 뒤에서 부터
		 	특정 문자열을 찾아 인덱스를 반환한다.
		 */
		System.out.println(str1.lastIndexOf("ava"));//12
		System.out.println(str1.lastIndexOf("j"));//14
		System.out.println("indexOf:" + str1.indexOf("a"));
		System.out.println("lastIndexOf:"
				+ str1.lastIndexOf("a"));
		/*
		 12] replace
		 	:특정 문자열을 찾아서 지정된 문자열로 변경한다.
		 	특정 문자열이 없으면 변경되지 않는다.(에러X)
		 */
		System.out.println("J를 G로 변겨하기");
		System.out.println(str1.replace("J", "G"));
		System.out.println("java를 KOSMO로 변경하기");
		System.out.println(str1.replace("java", "KOSMO"));
		
		
		/*
		 13] split()
		 	:문자열을 특정 구분자(토큰)으로 분리해서 string타이븨 배열로 변환한다.
		 	해당 구분자가 없는 경우에는 배열크기가 1인 String배열로 반환한다.
		 */
		String phoneNumber = "010-12234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(int i  =0; i<phoneArr.length; i++) {
			System.out.printf("phoneArr[%d]=%s\n",i,phoneArr[i]);
		}
		phoneArr = phoneNumber.split("%");
		for(int i=0; i<phoneArr.length;i++) {
			System.out.printf("phoneArr[%d]=%s\n",i,phoneArr[i]);
		}
		/*
		 14] substring()
		 	:사진인덱스만 있는 경우는 시작 인덱스에서 문자열의 끝까지를 반환함
		 	즉, 문자열을 자를 떄 사용하는 메소드
		 	사용1. :substring(index) ->이 경우 index로 부터
		 		문자ㅕㅇㄹ의 끝까지 잘라서 반환함
		 	사용2: substring(index1,index2) -> 인덱스에
		 		포함되는 부분만 잘라서 반환함.
		 */
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		
		/*
		 시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을 작성하시오
		 파일명 :my.file.images.jpg
		 */
		String filename = "my.file.images.jpg";
		int beginIndex = filename.lastIndexOf(".") + 1;
		System.out.println("파일의 확장자는:"+ filename.substring(beginIndex));
	}

}
