package ex17collection;
import common.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Ex03ArrayList2 {

	 public static void main(String[] args) {
		 /*
		  아래 2개의 컬렉션은 내부적인 자료구조만 다르고, 구현방법은 모두 동일하다.
		  */
		LinkedList<Student> list2 = new LinkedList<Student>();
//		ArrayList<Student> list2 = new ArrayList()<Student>();
		
		//개발자가정의한 인스턴스 생성
		Student st1 = new Student("정우성",10,"2018");
		Student st2 = new Student("원빈",20,"2017");
		Student st3 = new Student("장동건",30,"2016");
		Student st4 = new Student("공유",40,"2015");

		//컬랙션에 인스턴스 저장함
		list2.add(st1);//인덱스0
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);//인덱스3
		list2.add(st2);//객체의 중복저장 list컬랙션은 허용.
		
		System.out.println("[중복저장후]");
		for(Student st : list2) {
			st.showInfo();
		}
		
		//객체삭제(인스턴스의 참조값을 통해 삭제함)
		//중복된 객체가 있으면 앞에있는 객체 하나만 삭제된다.
		list2.remove(st2);
		System.out.println("[중복저장된 객체 삭제 후]");
		for(Student st : list2) {
			st.showInfo();
		}
		System.out.println("[반복자 사용]");
		Iterator<Student> it2 = list2.iterator();
		while(it2.hasNext()) {
//			Student student = it2.next();
//			student.showInfo();
			/*
			 위와 동일한 문장임. next()를 통햐 갹채룰 가져온 후 
			 showInfo()로 객체 내용 출력
			 */
			it2.next().showInfo();
		}
		//List계열의 컬렉션은 인덱스로 접근 가능함.
		System.out.println("[일반 for문 사용]");
		for(int i=0; i<list2.size();i++) {
			//인덱스로 접근시 get()메소드 사용
			
			list2.get(i).showInfo();
		}
		
		System.out.println("[확장된for문사용]");
		for(Student st : list2) {
			st.showInfo();
	
		}

		//인덱스를 통해 삭제: 삭제 성공시 해당 객체가 반환된다.
		System.out.println("삭제된 객체의 이름:"
				+ list2.remove(2).name);
		//인스턴스 참조값을 통한 삭제: 삭제성공시 boolean값이 반환.
		System.out.println("인스턴스를 통한 삭제:"+list2.remove(st1));
		
		System.out.println("[인스턴스 삭제후]");
		for(Student st : list2) {
			st.showInfo();
		}
	 
	 }
	 
}
































