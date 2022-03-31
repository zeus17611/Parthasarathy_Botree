package jdbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Scanner;

public class JDBCdao {
	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/product";
		String user="root";
		String pass="root11";
		String name = null;
		int id = 0,price = 0;
		Timestamp d = null;
		String query="select * from product.pro";
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the product name");
		String pname=s1.next();
		System.out.println("Enter the product price");
		float pprice=s1.nextFloat();
		System.out.println("Enter the product id");
		int pid=s1.nextInt();
		System.out.println("Enter the product stock");
		String pstock=s1.next();
		String query1="INSERT INTO pro (product_name, Product_Id, Product_Price, Product_stock,) VALUES (?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query1);
		pst.setString(1,pname);
		pst.setInt(2,pid);
		pst.setFloat(3,pprice);
		pst.setString(4,pstock);
		//int affected=st.executeUpdate("INSERT INTO pro (product_name, Product_Id, Product_Price, Product_stock) VALUES ('entrench',212,200,20);
		//System.out.println("Query ok "+affected+" affected");
		while(rs.next())
		{
		name =rs.getString("product_name");
		id=rs.getInt("Product_Id");
		price=rs.getInt("Product_Price");
		//d=rs.getTimestamp("product_time");
		System.out.println("Product Name:"+name+" \n Product id:"+id+"\n Product Price:"+price+"\n added on:"+d);
		}
		//System.out.println("Product Name:"+name+"Product id:"+id+"Product Price:"+price+"added on:"+d);
		
		st.close();
		con.close();
		s1.close();
	}

}
