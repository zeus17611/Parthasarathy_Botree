package JFS.BookInventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBook {
	String bname="Goblet of Fire";
	@Autowired
	firstClass obj1;
	@Autowired
	secondClass obj2;
	public firstClass getObj1() {
		return obj1;
	}
	public void setObj1(firstClass obj1) {
		this.obj1 = obj1;
	}
	public secondClass getObj2() {
		return obj2;
	}
	public void setObj2(secondClass obj2) {
		this.obj2 = obj2;
	}
	@Autowired
	@Qualifier("firstClass")
	myFirstInterface ref1;
	public void displayMyBook() {
		System.out.println("My Book name is Java 17");
		obj1.favbk();
		obj2.favbk();
		ref1.favbk();
	}
}