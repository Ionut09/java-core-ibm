package com.ibm.java._8_collections;

public interface LibraryManager {
	
	void addBookToLibrary(Book book);
	
	void viewInventory(); //toate detaliile
	
	int searchBook(String isbn); //definim egalitatea intre Book's
	
	boolean removeBook(Book book);
	
	void replaceOldBook(Book old, Book newBook);
	
	Object getLibraryContent();
}
