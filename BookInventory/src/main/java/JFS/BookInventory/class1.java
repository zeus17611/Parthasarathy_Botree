package JFS.BookInventory;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class class1 {


	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        class2 cl2=context.getBean(class2.class);
		cl2.lame();
	}
	

}
