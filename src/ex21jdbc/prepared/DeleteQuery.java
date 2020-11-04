package ex21jdbc.prepared;

public class DeleteQuery extends IConnectImpl {

	@Override
	public void execute() {
		try {
			
			String query = "DELETE FROM member WHERE id=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, scanValue("삭제할 아이디"));
			System.out.println(psmt.executeUpdate()
					+ "행이 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		
	}
	public static void main(String[] args) {

		new DeleteQuery().execute();
	}

}
