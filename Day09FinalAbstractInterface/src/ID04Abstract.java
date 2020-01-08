/**
* @author Elvinsys
* @version 2019年3月8日 下午3:11:32
* @Description:抽象类Abstract的描述和使用
*/

/*
 *	抽象类
 *	（1）把多个共性的东西提取到一个类中，这与类的继承相似，但如果继承之后的某些方法
 *		一定会被重写，这个时候，对于这些一定会被重写的方法，就不能给出具体的方法体。
 *		没有方法体的方法，被称为抽象方法，包含抽象方法的类，被称作抽象类。
 *	（2）抽象类的特点
 *		A:抽象类和抽象方法必须用关键字abstract修饰
 *		B:抽象类中不一定有抽象方法，但是有抽象方法的类一定是抽象类
 *		C:抽象类不能实例化
 *		D:抽象类的子类：
 *			a:可以是一个抽象类。
 *			b:可以是一个具体类，这个类必须重写抽象类中的所有抽象方法
 *	（3）抽象类的成员特点：
 *		A:成员变量
 *			有变量，有常量
 *		B:构造方法
 *			有构造方法
 *		C:成员方法
 *			有抽象，有非抽象
 *	（4）抽象类的练习
 *		A:猫狗案例练习
 *		B:老师案例练习
 *		C:学生案例练习
 *		D:员工案例练习
 *	（5）抽象类的几个小问题
 *		A:抽象类有构造方法，但是不能实例化，其构造方法的作用是用于访问父类数据的初始化
 *		B:一个类如果没有抽象方法，却被定义为抽象类，起作用是为了不让给该类创建对象
 *		C:abstract不能和哪些关键字共存
 *			a:final		冲突。（被final修饰的类无法被继承，而抽象类一定要被继承）
 *			b:private	冲突。（被final修饰的方法无法被重写，但是抽象方法一定要被重写）
 *			c:static	无意义
 */

/*
 * 	练习2：老师案例
 * 	定义三个类：Teacher类，BasTeacher类，AdvTeacher类
 */

/*	Teacher类（抽象类）
 * 		成员变量：
 * 			private name	String
 * 			private age		int
 * 		构造方法：
 * 			public Teacher() {}
 * 			public Teacher(String name, int age) {}
 * 		成员方法：	
 * 			public getName() {}	String
 * 			public setName() {}	void
 * 			public getAge() {}		int
 * 			public setAge() {}		void
 * 			public show() {}		void
 * 			public abstract work();	void//抽象方法
 */
abstract class Teacher {
	private String name;
	private int age;
	public Teacher() {}
	public Teacher(String name, int age) {
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
		System.out.println("这个老师的名字叫："+getName()+"，年龄是："
				+getAge());
	}
	public abstract void work();
}

/*	BasTeacher类（具体类，继承自Teacher类）
 * 		成员变量：（继承Teacher）
 * 		构造方法：
 * 			public BasTeacher() {}
 * 			public BasTeacher(String name, int age) {}
 * 		成员方法：（继承自Teacher，并对抽象方法进行重写）
 * 			public work() {}	void
 */
class BasTeacher extends Teacher {
	public BasTeacher() {}
	public BasTeacher(String name, int age) {
		super(name, age);
	}
	public void work() {
		System.out.println("基础班的老师教JavaSE");
	}
}

/*	AdvTeacher类（具体类，继承自Teacher类）
 * 		成员变量：（继承Teacher）
 * 		构造方法：
 * 			public AdvTeacher() {}
 * 			public AdvTeacher(String name, int age) {}
 * 		成员方法：（继承自Teacher，并对抽象方法进行重写）
 * 			public work() {}	void
 */
class AdvTeacher extends Teacher {
	public AdvTeacher() {}
	public AdvTeacher(String name, int age) {
		super(name, age);
	}
	public void work() {
		System.out.println("高级班的老师教JavaEE");
	}
}

//showInfo类，用于通过传入的父类引用，打印子类的信息
class showInfo {
	public static void show(Teacher t) {
		t.show();
		t.work();
	}
}

public class ID04Abstract {

	public static void main(String[] args) {
		P.i("现在测试具体类BasTeacher");
		P.i("用无参构造后，把地址传给Teacher的对象t");
		Teacher t = new BasTeacher();
		P.i("对t对象进行初始化...");
		t.setName("Jaco");
		t.setAge(22);
		P.i("打印老师的信息，以及工作内容：");
		//t.show();
		//t.work();
		//用一下代码代替上面两行代码
		showInfo.show(t);
		P.c();
		
		P.i("现在测试具体类AdvTeacher");
		P.i("用带参构造后，把地址传给Teacher的对象t");
		t = new AdvTeacher("Kuto",33);
		P.i("打印老师的信息，以及工作内容：");
		//t.show();
		//t.work();
		showInfo.show(t);
	}

}
























