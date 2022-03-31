package spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class driverclass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("BeanConfig.xml");
//	BookPublisher bookpublisher=(BookPublisher)context.getBean("bookpublisherbean");
//	System.out.println(bookpublisher);
	bookList bList=(bookList)context.getBean("listbean");
	System.out.println(bList);
	
}
}