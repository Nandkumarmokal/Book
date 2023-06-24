package com.book;

import java.util.Scanner;

public class BookController {

	public static void main(String[] args) {
		Scanner scanner;
		int choice;
		char ch;
		BookDao bookDao = new BookDao();
		do {
		System.out.println("Press 1 for save book");
		System.out.println("Press 2 for save book");
		
		scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1:BookEntity bookEntity = BookUtitlty.prepareBookData(scanner); 
				boolean IsAdded=bookDao.saveBook(bookEntity);
				System.out.println(IsAdded);
		break;
		case 2:System.out.println("pressed 2 for Delete book");
		break;
		default:
		break;	
		}
		
		System.out.println("Do u want to continue Y/N");
		ch=scanner.next().charAt(0);
		}while(ch=='Y' || ch=='y');
		System.out.println("Terminated");
		System.out.println("Hello");		

	}

}
