package JFS.BookInventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class ExPEL {
	@Autowired
	MyBook myBook;
	
	@Value("{10+1}")
	int bookId;
	@Value("{myBook.bname.toLowerCase()}")
	String booknameString;
	@Override
	public String toString() {
		return "ExPEL [bookId=" + bookId + ", booknameString=" + booknameString + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBooknameString() {
		return booknameString;
	}
	public void setBooknameString(String booknameString) {
		this.booknameString = booknameString;
	}


}
