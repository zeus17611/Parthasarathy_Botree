package JFS.BookInventory;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
    {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        MyBook myBook=context.getBean(MyBook.class);
        myBook.displayMyBook();
        //System.out.println(xpExPEL);
    }
}