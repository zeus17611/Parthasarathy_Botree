package ManipulationOfRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OgClass {
	public static void main(String []args)
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		Book1 book1=(Book1)context.getBean("b1");
		Book2 book2=(Book2)context.getBean("b2");
		System.out.println(book1);
		System.out.println(book2);
		
	}
}
