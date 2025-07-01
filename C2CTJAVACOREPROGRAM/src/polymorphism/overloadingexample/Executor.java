package polymorphism.overloadingexample;

public class Executor {

	
	public static void main(String[] args) {
		System.out.print("1.Addition:"+overlaodingexample.addition("hello","world"));
		System.out.print("1.Addition:"+overlaodingexample.addition(12,100));
		System.out.print("1.Addition:"+overlaodingexample.addition(10,14.0f));
				System.out.print("1.Addition:"+overlaodingexample.addition(15.90f,58));
				System.out.print("1.Addition:"+overlaodingexample.addition(67.90f,7.90f));
Person p1=new Person();
System.out.println(p1);
 p1=new Person(101,"ishu");
System.out.println(p1);
p1=new Person(101,"ishu","city");
System.out.println(p1);
	}
	}


