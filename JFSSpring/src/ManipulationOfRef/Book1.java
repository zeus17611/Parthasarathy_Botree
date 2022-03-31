package ManipulationOfRef;

public class Book1 {
	int bookid;
	String bookname;
	
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public void display(){
		System.out.println(bookid);
	}
	
	@Override
	public String toString() {
		return "Book1 [bookid=" + bookid + ", bookname=" + bookname + "]";
	}
	


}
