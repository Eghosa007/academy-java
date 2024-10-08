package com.bptn.course._17_arrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {

		ArrayList <String> myBooks = new ArrayList<>();
		
		myBooks.add ("Book1");
		myBooks.add ("Book2");
		myBooks.add ("Book3");
		myBooks.remove(1);
		
		
	System.out.println("My favourite books are: " + myBooks);
	System.out.println(myBooks.size());
	System.out.println(myBooks.get(myBooks.size() - 1));


	
	for(String book : myBooks) {
		System.out.println(book);
		
	}
	
	System.out.println(myBooks.get(0));
	if(myBooks.contains("Book1")) {
		System.out.print("Book Found");
	} else {
		System.out.print("Book not found");

		
	}
	
	}
}
