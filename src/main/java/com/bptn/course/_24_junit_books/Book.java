package com.bptn.course._24_junit_books;

public class Book {
	private String title;
	private double price;

	// Constructor
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	// Getter for title
	public String getTitle() {
		return title;
	}

	// Method to return book info
	public String getBookInfo() {
		return title + " - " + price;
	}
}
