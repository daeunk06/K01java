package ex21jdbc.prepared;

import java.util.Date;
import java.util.Scanner;

import ex21jdbc.statement.insertQuery;

public class InsertQuery extends IConnectImpl{
	
	public InsertQuery() {
		super(ORACLE_DRIVER , "kosmo","1234");
	}
	
	@Override
	public void execute() {
		try {
			//1.쿼리문 준비 : 값의 세팅이 필요한 부분을 ?(인파라미터)로 대체
			String query = "INSERT INTO member VALUES (? ,? ,?,?)";
			
			//2.prepared객체 생성: 생성시 준비한 쿼리문을 인자로 전달한다.
			psmt = con.prepareStatement(query);
			
			//3.DB에 입력할 값을 사용자로 부터 입력받음.
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디:");
			String id = scan.nextLine();
			System.out.println("패스워드:");
			String pw = scan.nextLine();
			System.out.println("이름:");
			String name = scan.nextLine();
			
			//4.인파라미터 설정 : ?의 순서대로 설정하고 DB 이므로 인덱스는 1부터
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			//날짜를 문자열로 입력하는 경우
			//psmt.setString(4, "2018-11-20");
			
			//날짜를 date타입으로 입력하는 경우
			/*
			 현재날짜를 자바에서 입력하면 util로 가져와서 sql패키지로 타입 변환
			 이떄 date형으로 입력되기에 setDate()로 인파라미터 설정.
			 */
			java.util.Date utillDate = new Date();
			java.sql.Date sqlDate = new java.sql.Date(utillDate.getTime());
			psmt.setDate(4, sqlDate);
			//5.쿼리실행을 위해 prepared객체를 실행한다.
			int affected = psmt.executeUpdate();
			System.out.println(affected +"행이 입력되었습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();//자원해제
		}
	}
	public static void main(String[] args) {
		new InsertQuery().execute();
	}
}




















