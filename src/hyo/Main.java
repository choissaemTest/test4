package hyo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static
	void main (String args[] ) throws IOException{
		
		System.out.println("1.도서 추가");
		System.out.println("2.도서 검색");
		System.out.println("3.도서 삭제");
		System.out.println("4.종료합니다");
		
		
		System.out.println("hello");
		
		
		
		int choice =-1;
		
		String str;
		Scanner scan=new Scanner(System.in);
		System.out.println("메뉴를 선택하세여:");
		
		choice=scan.nextInt();
		str=scan.nextLine();
		
	
		switch(choice){
		case 1:
			insertbook();
			break;
		case 2:
			searchbook();
			break;
		case 3:
			deletebook();
			break;
		case 4:
			System.out.println("종료합니다");
			System.exit(0);
			break;
		default :
			System.out.println("잘못 입력하셧습니다.");
		}
	}
	public static void insertbook() throws IOException {
		FileWriter fw= new FileWriter("c:\\test\30120_이효창.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("hello");
		System.out.println("이름을 입력해주세여.");
		Scanner scan = null;
		String name=scan.nextLine();
		System.out.println("저자를 입력해주세여.");
		String author=scan.nextLine();
		System.out.println("가격을 입력해주세여.");
		int cost=scan.nextInt();
		
	
		bw.close();
	}


	public static void searchbook() {
		// TODO Auto-generated method stub
		System.out.println("도서를 검색합니다.");
		
	}
	public static void deletebook() {
		// TODO Auto-generated method stub
		System.out.println("도서를 삭제합니다.");
	}


}
