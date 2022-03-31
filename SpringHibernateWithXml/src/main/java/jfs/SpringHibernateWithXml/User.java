package jfs.SpringHibernateWithXml;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * @author PARTHASARATHY
 *
 */
@Entity
public class User {
	@Id
	int userId;
	String UserName;
	//@OneToOne
	//Mobile mobile;
//	@OneToMany
//	List<Mobile> mobiles=new ArrayList<Mobile>();
//	public List<Mobile> getMobiles() {
//		return mobiles;
//	}
//	public void setMobiles(List<Mobile> mobiles) {
//		this.mobiles = mobiles;
//	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public User() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", UserName=" + UserName + "]";
	}
	
}
