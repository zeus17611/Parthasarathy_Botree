package JFS.BookInventory;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AspectOP {
	//@Before("execution(public void displayMyBook())")
	@After("execution(public void displayMyBook())")
	public void loginfo()
	{
		System.out.println("hello!!!");
		System.out.println("Alohomora!!!");
	}
}