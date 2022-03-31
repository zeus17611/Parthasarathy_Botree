package ManipulationOfRef;

public class Book2 {
	int bookId;
	String bookName;
	

	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	@Override
	public String toString() {
		return "Book2 [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	

}
