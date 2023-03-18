package com.ibm.java._8_collections;

import com.ibm.java._5_oop.inheritance.Lion;

public class Librarian {
	
	public static void main(String[] args) {
//		LibraryManager manager = new ListLibraryManager();
		LibraryManager manager = new MapLibraryManager();
		
		manager.addBookToLibrary(new Book("moby Dick", "Herman Melville", "123456789"));
		manager.addBookToLibrary(new Book("Head First Java first ediiton", "Jeane Boyarsky", "234567890"));
		manager.addBookToLibrary(new Book("OCA study guide", "Jeane Boyarsky", "3456789"));
		
		manager.viewInventory();
		System.out.println("headFirstJavaRaft = " + manager.searchBook("234567890"));
		manager.removeBook(new Book("moby Dick", "Herman Melville", "123456789"));
		manager.viewInventory();
		
		Book old = new Book("Head First Java first ediiton", "Jeane Boyarsky", "234567890");
		Book newBook = new Book("Head First Java second editon", "Jeane Boyarsky", "5421254122");
		manager.replaceOldBook(old, newBook);
		manager.viewInventory();
		System.out.println("list: toString -> " + manager.getLibraryContent());
		
		Book b1 = new Book("moby Dick", "Herman Melville", "123456789");
		Book b2 = new Book("moby Dick", "Herman Melville", "123456789");
		
		System.out.println(b1.equals(b2));
		System.out.println(b1 == b2);
		Book b2Copy = b2;
		
		System.out.println("b1.equals(new Lion(100, 200)) = " + b1.equals(new Lion(100, 200)));
	
	}
	
}
