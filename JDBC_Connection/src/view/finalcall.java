package view;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.sql.*;
import Controller.controllerset;
import Controller.jdconnection;
import model.product;



public class finalcall {
	 @SuppressWarnings("unused")
	public void display() throws ClassNotFoundException, SQLException {
		 @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
	      Label:
	      while(true) {
	        //Scanner s = new Scanner(System.in);
	        System.out.println("ENTER \n 1 SELL \n 2.BUY\n 3.EXIT \n 4.filter");
	        int key;
	        key=s.nextInt();
	        switch (key) {
	        case 1:{
	        	while(true)
	        	{
	        		List<product> prodlist2=controllerset.allproduct();
		            //List<product> prodlist=controllerset.allproduct();
		            for (product p:prodlist2)
		            		System.out.println(p);
	        		System.out.println("1.ADD A PRODUCT /n 2.DELETE A PRODUCT /n 3.UPDATE THE STOCK /n 4.GOTO PREVIOUS MENU");
	        		int k=s.nextInt();
	        		switch(k)
	        		{
	        		case 1:
	        			controllerset.insertshow();
	        			System.out.println("Item Added");
	        			break;
	        		case 2:
	        			controllerset.deleteshow();
	        			System.out.println("Item deleted");
	        			break;
	        		case 3:
	        			controllerset.updateshow();
	        			break;
	        		case 4:
	        			break;
	        		}
	        	}
//	            controllerset.insertshow();
//	            break;
	        }
//	        case 2:{
//	            controllerset.updateshow();
//	            break;
//	        }
//	        case 3:{
//	            controllerset.deleteshow();
//	            break;
//
//	        } 
	        case 2:
	            List<product> prodlist1=controllerset.allproduct();
	            prodlist1.forEach(System.out::println);
	            System.out.println("----------------------------------------------------------------------------------");
	    		System.out.println("ENTER THE PRODUCT YOU WANT TO PURCHASE");
	    		int purchid=s.nextInt();
	    		System.out.println("can we process the order y/n");
	    		char u=s.next().charAt(0);
	    		if(u=='y' || u=='Y')
	    		{
	    			System.out.println("enter your upi id");
	    			String upi=s.next();
	    			System.out.println("enter your upi pin");
	    			String upipin=s.next();
	    			String query = ("update pro set Product_Stock=Product_Stock-1 where Product_id=?");
	    		    jdconnection.update(query);
	    		    break;	
	    			}
	    			System.out.println("DO YOU WISH TO CONTINUE SHOPING Y/N:");
	    			char ch=s.next().charAt(0);
	    			if(ch=='y'|| ch=='Y')
	    			{
	    				break Label;
	    			}
	    			else
	    			{
	    				System.out.println("Thankyou for ordering with us");
	    			}
	    			System.out.println("------------------------------------------------------------------------------");
	            break;
	        case 3:{
	            break;
	        }
	        case 4:
	        		List<product> prodlist=controllerset.allproduct();
	        		List<product> l1=prodlist.stream().filter(i->i.getPname().contains("POCO")).collect(Collectors.toList());
	        		//l1.forEach(System.out::println);
	        		l1.stream().map(i->i.getPprice()*2);
	        		l1.forEach(System.out::println);
	        		break;
	        default:
	                System.out.println("Improper Input");  
	    }
	      }
	    }
	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        finalcall fc = new finalcall();
	        fc.display();
	    }
}
