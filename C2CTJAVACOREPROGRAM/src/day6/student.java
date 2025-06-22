package day6;

public class student {
	
private String sname;
private static int id;
private int reg; 
public student() {

id++;
reg++;
System.out.println("constructor called");
}
static {

System.out.println("Static block executed");


}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public static int getId() {
	return id;
}
public static void setId(int id) {
	student.id = id;
}
public int getReg() {
	return reg;
}
public void setReg(int reg) {
	this.reg = reg;
}
@Override
public String toString() {
	return "student [id:"+id+",reg="+reg+",sname=" + sname + ", reg=" + reg + "]";
}


}