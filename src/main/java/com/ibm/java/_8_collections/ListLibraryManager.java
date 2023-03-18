package com.ibm.java._8_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListLibraryManager implements LibraryManager {
	
	private List<Book> libraryContent = new ArrayList<>();
	
	public List<Book> getLibraryContent() {
		return libraryContent;
	}
	
	public void addBookToLibrary(Book book) {
		libraryContent.add(book);
	}
	
	@Override
	public void viewInventory() {
		//		for (Book book : libraryContent) {
		//			System.out.println(book);
		//		}
		libraryContent.forEach(book -> System.out.println(book.toString()));//toString e chemata implcit
	}
	
	@Override
	public boolean removeBook(Book book) {
		//		int indexOf = libraryContent.indexOf(book);
		//		if (indexOf >= 0) {
		//			libraryContent.remove(indexOf);
		//		}
		
		boolean removed = libraryContent.remove(book);//egalitate
		if (removed) {
			System.out.println("Book " + book + " has been removed!");
		} else {
			System.out.println("Booknot present!");
		}
		return removed;
	}
	
	@Override
	public int searchBook(String isbn) {
		Book book = new Book(null, null, isbn);
		//		return libraryContent.contains(book); //book.equals(fiecare element din lista) -> 1 -> true
		return libraryContent.indexOf(book);  //book.equals(fiecare element din lista) -> 1 -> indexul
		//		libraryContent //
	}
	
	//	@Override -> check pt overrding
	public void replaceOldBook(Book old, Book newBook) {
		int indexOldBook = libraryContent.indexOf(old);
		if (indexOldBook >= 0) {
			//			libraryContent.remove(indexOldBook);
			//			libraryContent.add(indexOldBook, newBook);
			
			libraryContent.set(indexOldBook, newBook); //Update
			System.out.println("Old book has been replaced!");
		}
	}
	
	public Book getRandomBook(){
		Random random = new Random();
		int index = random.nextInt(libraryContent.size());
		return libraryContent.get(index);
	}
	
	public static void main(String[] args) {
		ListLibraryManager manager = new ListLibraryManager();
		manager.addBookToLibrary(new Book("moby Dick", "Herman Melville", "123456789"));
		manager.addBookToLibrary(new Book("Head First Java first ediiton", "Jeane Boyarsky", "234567890"));
		manager.addBookToLibrary(new Book("OCA study guide", "Jeane Boyarsky", "3456789"));
		
		System.out.println("listLibraryManager.getRandomBook() = " + manager.getRandomBook());
	}
}
