package spring;


public class Book {
	int price;
	String bookName,authorName;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", bookName=" + bookName + ", authorName=" + authorName + "]";
	}
	}
