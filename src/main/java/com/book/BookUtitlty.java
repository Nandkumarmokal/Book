package com.book;

import java.util.Scanner;

public class BookUtitlty {

	

	public static BookEntity prepareBookData(Scanner scanner) {
		System.out.println("Enter Book Id");
		double id = scanner.nextDouble();
		
		System.out.println("enter book name");
		String bname = scanner.next();
		
		System.out.println("enter qty");
		int qty = scanner.nextInt();
		
		System.out.println("enter price");
		int price = scanner.nextInt();
		
		BookEntity bookEntity = new BookEntity(id, bname, price, price);
		
		return bookEntity;
	}
}
