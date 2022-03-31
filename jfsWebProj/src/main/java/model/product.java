package model;

public class product {
	  private String pid;
	    private String pname;
	    private String pstock;
	    private int pprice;
	    public product() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    public product(String pid, String pname, String pstock, int pprice) {
	        super();
	        this.pid = pid;
	        this.pname = pname;
	        this.pstock = pstock;
	        this.pprice = pprice;
	        
	    }
	    public String getPid() {
	        return pid;
	    }
	    public void setPid(String pid) {
	        this.pid = pid;
	    }
	    public String getPname() {
	        return pname;
	    }
	    public void setPname(String pname) {
	        this.pname = pname;
	    }
	    public String getpstock() {
	        return pstock;
	    }
	    public void setPdetail(String pstock) {
	        this.pstock = pstock;
	    }
	    public int getPprice() {
	        return pprice;
	    }
	    public void setPprice(int pprice) {
	        this.pprice = pprice;
	    }
	    @Override
	    public String toString() {
	        return "pid=" + pid + "\t pname=" + pname + "\t  pstock=" + pstock + "\t pprice=" + pprice ;
	    }

}