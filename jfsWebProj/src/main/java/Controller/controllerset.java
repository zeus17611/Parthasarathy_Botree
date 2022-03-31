package Controller;
import java.util.*;
import java.sql.*;
import model.product;

public class controllerset {
	public static List<product> allproduct() throws ClassNotFoundException, SQLException {
        List<product> prodlist = new ArrayList<product>();
        String query = "select * from pro";
        ResultSet rs = jdconnection.getresultset(query);
        while (rs.next()) {
        	System.out.println("----------------------------------------------------------------------------------");
            System.out.println(rs.getInt("Product_Id") + " " + rs.getString("Product_name") + " " +
            rs.getString("Product_Stock")+ " " + rs.getInt("Product_Price"));
            String pname = rs.getString("Product_name");
            String pdetail = rs.getString("Product_stock");
            int pprice = rs.getInt("Product_Price");
            String pid = rs.getString("Product_id");
            prodlist.add(new product(pid,pname,pdetail,pprice));

        }
        return prodlist;
    }
	public static void  insertshow() throws ClassNotFoundException, SQLException {
        String query = "insert into pro(Product_Id,Product_name,Product_Stock,Product_price)values(?,?,?,?)";
       jdconnection.insert(query);
    }

    public static int updateshow() throws ClassNotFoundException, SQLException {

        String query = ("update pro set Product_Stock=? where Product_id=?");
        jdconnection.update(query);

        return 0;

    }
    public static int deleteshow() throws ClassNotFoundException, SQLException {
        String query = ("delete from pro where Product_Id=?");
        jdconnection.delete(query);

        return 0;
    }


}

