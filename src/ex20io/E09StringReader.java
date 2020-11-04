package ex20io;

import java.io.BufferedReader;
import java.io.FileReader;

public class E09StringReader {
	public static void main(String[] args) {
		
		try {
			
			BufferedReader in = new BufferedReader(
					new FileReader("src/ex20io/String.txt")
					);
			String str;
			while (true) {
				/*
				 개행(줄바꿈)이 등장하기 정까지의 데이터를 한번에 읽어온다
				 죽, 한줄씩 읽어오게 된다.
				 */
				str = in.readLine();
				
				if(str==null) {
					break;
				}
				/*
				 입력시 newLine()을 통해 개행정보가 입력되지만, 읽어드린
				 문자열에서는 개행저오가 존재 하지 않는다 따라서 개행을 하려면
				 println()을 사용해야한다.
				 */
				System.out.println(str);
			}
			in.close();
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
