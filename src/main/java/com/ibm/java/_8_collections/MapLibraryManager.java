package com.ibm.java._8_collections;

import java.util.HashMap;
import java.util.Map;

public class MapLibraryManager implements LibraryManager {
	
	private Map<String, Book> libraryContent = new HashMap<>();
	
	@Override
	public void addBookToLibrary(Book book) {
		libraryContent.put(book.getIsbn(), book);
	}
	
	@Override
	public void viewInventory() {
		//		for (Entry<String, Book> entry : libraryContent.entrySet()) {
		//			System.out.println("Isbn: " + entry.getKey() + ", book: " + entry.getValue());
		//		}
		libraryContent.forEach((key, value) -> System.out.println("Isbn: " + key + ", book: " + value));
		System.out.println(libraryContent); //overrides toString
	}
	
	@Override
	public int searchBook(String isbn) {
		boolean containsBook = libraryContent.containsKey(isbn);
//		Book book = libraryContent.get(isbn); //null is key not present
//		Book bookDefault = libraryContent.getOrDefault(isbn, new Book(null, null, isbn));
		return containsBook ? 1 : 0;
	}
	
	@Override
	public boolean removeBook(Book book) {
		
		return libraryContent.remove(book.getIsbn(), book);
	}
	
	@Override
	public void replaceOldBook(Book old, Book newBook) {
		libraryContent.replace(old.getIsbn(), old, newBook);
//		libraryContent.computeIfPresent(old.getIsbn(), (oldValue, newValue) -> newValue);
	}
	
	public Map<String, Book> getLibraryContent() {
		return libraryContent;
	}
}
