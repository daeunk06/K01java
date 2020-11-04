package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class Qu_04_03 {

	public static void main(String[] args)throws IOException{

		Scanner scanner = new Scanner(System.in);
		int kor, eng , math , avg, rank;
		System.out.print("국어:");
		kor = scanner.nextInt();
		System.out.print("영어:");
		eng = scanner.nextInt();
		System.out.print("수학:");
		math = scanner.nextInt();
	
		avg = (kor + eng + math) / 3;
		rank = avg / 10;
		System.out.println("평균점수:"+ avg);
		
		switch(rank) {
		case 10: case 9:
			System.out.println("학점:A"); break;
		case 8:
			System.out.println("학점:B");break;
		case 7:
			System.out.println("학점:C");break;
		case 6:
			System.out.println("학점:D");break;
		default:
			System.out.println("학점:");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
