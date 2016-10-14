import java.lang.reflect.*;
public class ClassDemo{
	public static void main(String[] args)throws Exception{
		//1、每个类中有一个静态的属性叫做class
		Class clazz=Student.class;
		//2、通过对象的getClass()方法来获得；
		Class clazz1=new Student("hh",20).getClass();
		//3、通过class.forName()来获得
		Class clazz2=Class.forName("Student");
		//通过无参的构造方法创建出实例对象
		Student s=(Student)clazz2.newInstance();
		System.out.println(clazz);
		s.study();
		System.out.println(clazz1);
		System.out.println(clazz2);
		//通过getConstructor()获取有参的构造方法
		//可变参数，你要几个参数类，就写几个。到时候jvm会
	}
}
class Student{
	int age;
	String name;
	private String name1="a1";
	private String name2="a2";
	private String name3="a3";
	private String name4="a4";
	public Student(){}
	public Student(String name,int  age){
		this.age=age;
		this.name=name;
	}
	public Student(String name){
		this.name=name;
	}
	public void study(){
		System.out.println("学好java");
	}
	public void study(String s){
		System.out.println("学好"+s);
	}
}