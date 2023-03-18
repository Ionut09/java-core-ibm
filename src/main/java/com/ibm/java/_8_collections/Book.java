package com.ibm.java._8_collections;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "Book[title: " + title + ", author: " + author + ", isbn: " + isbn + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		
		Book book = (Book) o;
		
		return isbn.equals(book.isbn);
	}
	
	public int hashCode() {
		return isbn.hashCode();
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
