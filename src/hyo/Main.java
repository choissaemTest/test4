package hyo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static
	void main (String args[] ) throws IOException{
		
		System.out.println("1.���� �߰�");
		System.out.println("2.���� �˻�");
		System.out.println("3.���� ����");
		System.out.println("4.�����մϴ�");
		
		
		System.out.println("hello");
		
		
		
		int choice =-1;
		
		String str;
		Scanner scan=new Scanner(System.in);
		System.out.println("�޴��� �����ϼ���:");
		
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
			System.out.println("�����մϴ�");
			System.exit(0);
			break;
		default :
			System.out.println("�߸� �Է��ϼ˽��ϴ�.");
		}
	}
	public static void insertbook() throws IOException {
		FileWriter fw= new FileWriter("c:\\test\30120_��ȿâ.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("hello");
		System.out.println("�̸��� �Է����ּ���.");
		Scanner scan = null;
		String name=scan.nextLine();
		System.out.println("���ڸ� �Է����ּ���.");
		String author=scan.nextLine();
		System.out.println("������ �Է����ּ���.");
		int cost=scan.nextInt();
		
	
		bw.close();
	}


	public static void searchbook() {
		// TODO Auto-generated method stub
		System.out.println("������ �˻��մϴ�.");
		
	}
	public static void deletebook() {
		// TODO Auto-generated method stub
		System.out.println("������ �����մϴ�.");
	}


}
