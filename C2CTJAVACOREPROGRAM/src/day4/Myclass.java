package day4;

public class Myclass {

	private static Myclass s1 = new Myclass();
	
	
			
	public static Myclass getObj()
	
	{
		return s1;
	}

	private int sid ;
	private String sname;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "Myclass [sid=" + sid + ", sname=" + sname + "]";
	}
	private Myclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}

	
	
	

