/**
* @author Elvinsys
* @version 2019年3月8日 下午6:03:56
* @Description:教师学生案例，用接口实现额外功能
*/

/*
 * 	定义一个接口
 * 		PlayMusic：用于实现额外功能
 * 	定义五个类
 * 		Person2：从教师和学生中抽象出来的抽象类
 * 		Teather2：具体的教师类，继承自Person2
 * 		Student2：具体的学生类，继承自Person2
 * 		SuperTeather：具有额外功能的老师，继承自Teacher2
 * 		SuperStudent：具有额外功能的学生，继承自Student2
 */

interface PlayMusic {
	public abstract void playGuitar();
}

abstract class Person {
	private String name;
	private int age;
	public Person() {}
	public Person(String name, int age) {
		setName(name);
		setAge(age);
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
	public void show() {
		System.out.println("这个人的名字叫："+getName()
				+"，他的年龄是："+getAge());
	}
	public abstract void eat();
}

class Teacher2 extends Person {
	public Teacher2() {}
	public Teacher2(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("学生就应该要吃肉");
	}
}

class Student2 extends Person {
	public Student2() {}
	public Student2(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("老师要减肥，吃点素的");
	}
}

class SuperTeacher extends Teacher2 implements PlayMusic {
	public SuperTeacher() {}
	public SuperTeacher(String name, int age) {
		super(name, age);
	}
	public void playGuitar() {
		System.out.println("会弹吉他的老师真帅气");
	}
}

class SuperStudent extends Student2 implements PlayMusic {
	public SuperStudent() {}
	public SuperStudent(String name, int age) {
		super(name, age);
	}
	public void playGuitar() {
		System.out.println("会弹吉他的学生真腻害");
	}
}

public class ID07InterfacePerson {

	public static void main(String[] args) {
		P.i("无参构造实例化超级老师，并把地址传给人类的引用");
		Person p = new SuperTeacher();
		P.i("给这个人的信息进行初始化...");
		p.setName("Jaco");
		p.setAge(33);
		P.i("输出这个人的信息...");
		p.show();
		P.i("这个人能不能弹吉他呢？");
		//p.playGuitar();
		P.i("是不可以的，因为，人不一定会弹吉他，但是，他是一个超级老师");
		P.i("向下转型一下...");
		SuperTeacher st = (SuperTeacher)p;
		st.playGuitar();
		P.c();
		
		P.i("带参构造实例化超级学生，并把地址传给人类的引用");
		p = new SuperStudent("Lisa",12);
		P.i("输出这个人的信息...");
		p.show();
		P.i("这个人能不能弹吉他呢？");
		//p.playGuitar();
		P.i("是不可以的，因为，人不一定会弹吉他，但是，他是一个超级学生");
		P.i("向下转型一下...");
		SuperStudent ss = (SuperStudent)p;
		ss.playGuitar();
		P.c();

	}

}






















