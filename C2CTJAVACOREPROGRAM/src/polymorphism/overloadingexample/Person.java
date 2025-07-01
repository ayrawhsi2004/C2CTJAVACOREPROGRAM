package polymorphism.overloadingexample;

public class Person {

private int pid;
private String name;
private String city;
public Person()
{
this.pid=100;
this.name= "Ishwarya";
this.city="chennai";

}
public Person(int pid,String name)
{
this.pid=200;
this.name= "jenifer";
this.city="pudhuchery";

}
public Person(int pid ,String name,String city)
{
this.pid=pid;
this.name= name;
this.city=city;
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
}

}
