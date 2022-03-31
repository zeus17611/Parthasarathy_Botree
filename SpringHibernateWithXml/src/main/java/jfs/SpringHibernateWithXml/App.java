package jfs.SpringHibernateWithXml;
import java.lang.reflect.InaccessibleObjectException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class App 
{
  @SuppressWarnings("unchecked")
public static void main(String[] args) throws InaccessibleObjectException
    {
    	Configuration configuration=new Configuration().configure().addAnnotatedClass(Mobile.class).addAnnotatedClass(User.class);   	
    	ServiceRegistry serviceRegistry= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	
    	
    	
    	
    	
    	
    	SessionFactory sFactory=configuration.buildSessionFactory(serviceRegistry);
    	Session session=sFactory.openSession();
    	session.beginTransaction();
    	
    	
    	
    	
    	
    	
    	User user=new User();
    	user.setUserId(44);
    	user.setUserName("Gaurav");
    	User user1=new User();
    	user1.setUserId(2);
    	user1.setUserName("Harsha");
    	User user2=new User();
    	user2.setUserId(3);
    	user2.setUserName("Partha");
    	Mobile mbl=new Mobile();
    	mbl.setmId(1);
    	mbl.setmName("Poco");
    	mbl.setmStock(20);
    	mbl.setmPrice(20000);
    
    	
    	Mobile mbl2=new Mobile();
    	mbl.setmId(2);
    	mbl2.setmName("oneplus");
    	mbl2.setmStock(20);
    	mbl2.setmPrice(100000);
    	Mobile mbl3=new Mobile();
    	mbl3.setmId(3);
    	mbl3.setmName("realme");
    	mbl3.setmStock(20);
    	mbl3.setmPrice(100000);
    	Mobile mbl4=new Mobile();
    	mbl4.setmId(4);
    	mbl4.setmName("nokia");
    	mbl4.setmStock(20);
    	mbl4.setmPrice(100000);
    	Mobile mbl5=new Mobile();
    	mbl5.setmId(5);
    	mbl5.setmName("vivo");
    	mbl5.setmStock(20);
    	mbl5.setmPrice(100000);
    	
    	
    	

    	Query query1=session.createQuery("from User where UserId=11");
    	List<User> uList1=query1.list();
    	for(User p:uList1)
    	{
    		System.out.println(p);
    	}
    	Query query3=session.createQuery("update User set UserName='Faf Duplesis' where UserId=3");
    	int v=query3.executeUpdate();
    	System.out.println(v+" Rows affected");
    	
    	
    	
    	Query query4=session.createQuery("delete from User where UserId=44");
    	int vl=query4.executeUpdate();
    	System.out.println(vl+" Rows affected");
    	Query query=session.createQuery("from User order by UserId desc");
    	@SuppressWarnings("unused")
		List<User> uList=query.list();
    	for(User p:uList)
    	{
    		System.out.println(p);
    	}
    	Query query5=session.createQuery("select UserName from User");
    	@SuppressWarnings("unused")
		List<String> uList2=query5.list();
    	for(String p:uList2)
    	{
    		System.out.println(p);
    	}
    	

    	
    	
    	session.save(mbl);
    	session.save(mbl2);
    	session.save(mbl3);
    	session.save(mbl4);
    	session.save(mbl5);
    	
//    	Query query7=session.createQuery("delete from Mobile where mId>5");
//    	int vl1=query7.executeUpdate();
//    	System.out.println(vl1);
//    	
    	
    	
    	Query q1=session.createQuery("select sum(mPrice) from Mobile");
    	System.out.println("sum is"+q1.uniqueResult());
    	
    	
    	
    	
    	Query query8=session.createQuery("select max(mPrice) from Mobile");
    	System.out.println("Maximum Priced mobile is"+query8.uniqueResult());
    	
//    	
//    	Query query9=session.createQuery("select mId,mName, max(mPrice) from Mobile");
//    	System.out.println("Maximum Priced mobile is"+query9.uniqueResult());

    	Query q2=session.createQuery("select UserId,UserName,mId from producttable.User inner join producttable.Mobile where Mobile.mId=User.UserId");
    	List<User> l1=q2.list();
      	for(User p:l1)
    	{
    		System.out.println(p);
    	}

    	session.getTransaction().commit();
    	
    	
    	
    }
}
