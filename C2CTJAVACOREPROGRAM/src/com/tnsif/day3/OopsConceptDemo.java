package com.tnsif.day3;

public class OopsConceptDemo {

private int SerialName;
private String name;
private int age;
public int getSerialName() {
	return SerialName;
}
public void setSerialName(int serialName) {
	SerialName = serialName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "OopsConceptDemo [SerialName=" + SerialName + ", name=" + name + ", age=" + age + "]";
}







}
