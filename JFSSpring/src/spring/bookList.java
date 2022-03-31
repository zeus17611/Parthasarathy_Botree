package spring;

import java.util.List;

public class bookList {
	List<String> bookList;

	public List<String> getBookList() {
		return bookList;
	}

	public void setBookList(List<String> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "bookList [bookList=" + bookList + "]";
	}
	
	

}
