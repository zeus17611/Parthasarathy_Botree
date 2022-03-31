package jdbconn;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Scanner;


public class jdbccnn {
	@SuppressWarnings("unused")
	public static PreparedStatement pst;
	String pname;
	float pprice;
	int pid;
	String pstock;
	public void insert() throws SQLException{
		//String query1="INSERT INTO pro (product_name, Product_Id, Product_Price, Product_stock,) VALUES (?,?,?,?)";
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the product name");
		 this.pname=s1.next();
		System.out.println("Enter the product price");
	    this.pprice=s1.nextFloat();
		System.out.println("Enter the product id");
		 this.pid=s1.nextInt();
		System.out.println("Enter the product stock");
		this.pstock=s1.next();
		s1.close();
		
	}
	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/product";
		String user="root";
		String pass="root11";
		String name = null;
		int id = 0,price = 0;
		Timestamp d = null;
		jdbccnn obj=new jdbccnn();
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		obj.insert();
		Integer aInteger=0;
		String query="select * from pro";
		ResultSet rs=st.executeQuery("select * from pro");
		PreparedStatement pst=con.prepareStatement("INSERT INTO pro (product_name,Product_Id,Product_Price,Product_stock) VALUES (?,?,?,?)");
		pst.setString(1,obj.pname);
		pst.setInt(2,obj.pid);
		pst.setFloat(3,obj.pprice);
		pst.setString(4,obj.pstock);
		int rows=pst.executeUpdate();
		System.out.println("Query ok "+rows+" affected by pst");
		while(rs.next())
		{
		name =rs.getString("product_name");
		id=rs.getInt("Product_Id");
		price=rs.getInt("Product_Price");
		System.out.println("Product Name:"+name+" \n Product id:"+id+"\n Product Price:"+price+"\n added on:"+d);
		}
		st.close();
		con.close();
	}
}

