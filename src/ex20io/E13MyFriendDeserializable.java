package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class E13MyFriendDeserializable {

	public static void main(String[] args) {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(
				new FileInputStream("src/ex20io/friend_info.obj"));
			while(true) {
				//Friend객체를 복원한다.
				Friend friend = (Friend)in .readObject();
				//더이상 복우너할 객체가 없으면 루프를 탈출
				if(friend==null) break;
				friend.showAllData();
			}
		} 
		catch (Exception e) {
			System.out.println("복원시 예외발생");
			e.printStackTrace();
		}
		
			
		
		
	}
}
