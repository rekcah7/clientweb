package test;

public class Person {
	String name;
	int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void print(){
		System.out.println("성  명"+name+"나  이   "+age);
	}

}
