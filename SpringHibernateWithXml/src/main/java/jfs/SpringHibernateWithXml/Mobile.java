package jfs.SpringHibernateWithXml;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Mobile {
	
	@Id
	@GeneratedValue
	int mId;
	String mName;
	 int mPrice;
	int mStock;
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@OneToMany
//	List<User> users=new ArrayList<User>();

//	public List<User> getUsers() {
//		return users;
//	}
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}
	public Mobile(int mId, int mPrice, int mStock, String mName) {
		super();
		this.mId = mId;
		this.mPrice = mPrice;
		this.mStock = mStock;
		this.mName = mName;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public int getmPrice() {
		return mPrice;
	}
	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}
	public int getmStock() {
		return mStock;
	}
	public void setmStock(int mStock) {
		this.mStock = mStock;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	@Override
	public String toString() {
		return "Mobile [mId=" + mId + ", mPrice=" + mPrice + ", mStock=" + mStock + ", mName=" + mName + "]";
	}
}
