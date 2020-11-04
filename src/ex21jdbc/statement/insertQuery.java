package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertQuery {
	
	//멤버변수
	Connection con;//DB연결을 위한 객체
	Statement stmst;//쿼리전송 및 실행을 위한 객체
	
	//생성자
	public insertQuery() {
		try {
			//1.오라클 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//2.커넥션 객체를 통해 DB연결
			con = DriverManager.getConnection(
					"jdbc:oracle:thin://@localhost:1521:orcl",
					"kosmo","1234");
			System.out.println("오라클 DB연결성공");
		}
		catch (ClassNotFoundException e) {
			//ojdbc6.jar 파일이 없거나 연동되지 않았을때 예외발생
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
		catch (SQLException e) {
			//커넥션URL이나 계정명이 잘못되었을 때 예외발생
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("알수 없는 예외 발생");
		}
	}//end of InsertSQL
	 
	//쿼리 작성 및 실행메소드
	private void execute() {
		try {
			//3.Statement객체 생성을 위한 메소드 호출
			stmst = con.createStatement();
			
			//4.SQL문(쿼리문) 작성
			String sql = "INSERT INTO member VALUES "
					+ "('test3', '3333', '3길동', SYSDATE)";
			//5.쿼리실행 및 결과값 반환
			/*
			 executeUpdate() :쿼리문이 insert/update/delete와 같이
			 	기존 레코드에 영향을 미치는경우에 사용된다. 실행후 영향을 받은
			 	행의 갯수가int형으로 반홚된다.
			 executeQuery() :select 쿼리를 실행할 때 호출하는 메소드로
			 	레코드에 영향을 미치지 않고 조회만 하는 경우 사용된다.
			 	조회한 레코드를 반환값으로 받아야 하므로 ResulteSet객체를
			 	반환타입으로 사용하게 된다.
			 */
			int affected = stmst.executeUpdate(sql);
			System.out.println(affected + "행이 입력되었습니다.");
		} catch (SQLException e) {
			System.out.println("쿼리실행에 문제가 발생하였습니다.");
		}
		finally {
			close();
		}
	}// end of execute
	private void close() {
		try {
			if(stmst!=null) stmst.close();
			if(con!=null) con.close();
			System.out.println("DB자원 반납완료");
		} catch (SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다");
		}
	}
	public static void main(String[] args) {
		//실행방법1: 객체생서후 참조변수에 대입후 메소드 호출
//		insertQuery isq = new insertQuery();
//		isq.execute();
		
		//실행방법2 : 객체생성과 동시에 메소드호출
		new insertQuery().execute();
		
	}//end of main

}
