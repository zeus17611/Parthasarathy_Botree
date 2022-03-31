package spring;
public class BookPublisher {
	Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "BookPublisher [book=" + book + "]";
	}
}
