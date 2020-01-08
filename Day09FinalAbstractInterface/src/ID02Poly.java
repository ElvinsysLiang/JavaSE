/**
* @author Elvinsys
* @version 2019年3月8日 上午11:52:20
* @Description:关于多态的描述与使用
*/

/*
 * 	多态
 * 	（0）简单来说，多态就是通过实例化下层对象，然后把地址值赋给上层引用，
 * 		并利用上层引用访问继承自同一个上层的不同下层实例的过程。
 * 	（1）同一个对象在不同时刻体现出来的不同状态。
 * 	（2）多态的前提：
 * 			A:有继承或者实现关系。
 * 			B:有方法重写。
 * 			C:有父类或者父接口引用指向子类对象。
 * 		
 * 		多态的分类：
 * 			A:具体类多态
 * 				class Fu {}
 * 				class Zi extends Fu {}
 * 				Fu f = new Zi();
 * 			B:抽象类多态
 * 				abstract class Fu {}
 * 				class Zi extends Fu{}
 * 				Fu f = new Zi();
 * 			C:接口多态
 * 				interface class Fu {}
 * 				class Zi implements Fu {}
 * 				Fu f = new Zi();
 * 	(3)多态中的成员访问特点
 * 		A:成员变量
 * 			编译看左边，运行看左边
 * 		B:构造方法
 * 			子类的构造都会默认访问父类构造
 * 		C:成员方法
 * 			编译看左边，运行看右边
 * 		D:静态方法
 * 			编译看左边，运行看左边
 * 		（关键是，只有方法有重写，所以成员方法的运行才是看右边
 * 	（4）多态的好处：
 * 		A:提高代码的维护性（继承体现）
 * 		B:提高方法的扩展性（多态体现）
 * 	（5）多态的弊端：
 * 		父类的对象无法使用子类对象的特定功能
 * 		（子类可以当做父类使用，但父类不能作为子类使用）
 * 	（6）多态中的转型
 * 		A:向上转型——从子到父
 * 		B:向下转型——从父到子
 * 	（7）多态的理解：孔子装爹的案例
 * 	（8）多态的练习：
 * 		A:猫狗案例
 * 		B:老师和学生案例
 */

//练习1：猫狗案例
//定义三个类：Animal类、Cat类、Dog类

/* 	（1）Animal类
 * 		成员变量：
 * 			private name	String
 * 			private age		int
 * 		构造方法：
 * 			public Animal(){}
 * 			public Animal(String name, int age){}
 * 		成员方法：
 * 			public String getName(){}			String
 * 			public void setName(String name){}	void
 * 			public int getAge(){}				int
 * 			public void setAge(){}				void
 * 			public void show(){}				void
 * 			public void work(){}				void
 */
class Animal {
	private String name;
	private int age;
	public Animal() {};
	public Animal(String name, int age) {
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
		System.out.println("名字叫："+getName()+"，年龄为："+getAge());
	}
	public void work() {
		System.out.println("动物的工作就是生存");
	}
}

/* 	（2）Cat类
 * 		成员变量：继承自父类Animal
 * 		构造方法：
 * 			public Cat(){}
 * 			public Cat(String name, int age){}
 * 		成员方法：继承自父类，并重写work方法和新增play方法
 * 			public void work(){}					void
 * 			public void play(){}
 */
class Cat extends Animal {
	public Cat() {}
	public Cat(String name, int age) {
		super(name,age);
	}
	public void work() {
		System.out.println("猫的工作是抓老鼠");
	}
	public void play() {
		System.out.println("猫喜欢喵喵叫");
	}
}

/* 	（3）Dog类
 * 		成员变量：继承自父类Animal
 * 		构造方法：
 * 			public Dog(){}
 * 			public Dog(String name, int age){}
 * 		成员方法：继承自父类，并重写work方法和新增play方法
 * 			public void work(){}					void
 * 			public void play(){}		
 */
class Dog extends Animal {
	public Dog() {}
	public Dog(String name, int age) {
		super(name,age);
	}
	public void work() {
		System.out.println("狗的工作就是看门口");
	}
	public void play() {
		System.out.println("狗喜欢玩皮球");
	}
}

public class ID02Poly {

	public static void main(String[] args) {
		P.i("测试练习1，实例化一个猫，用来测试无参构造");
		Animal a = new Cat();
		P.i("实例化完成，并把地址值赋给Animal型的应用a");
		P.i("现在打印一下这个动物的信息：");
		a.show();
		P.i("并没有数据，这是当然的，因为无参构造没有进行赋值");
		P.i("对姓名和年龄进行赋值...");
		a.setName("Jaco");
		a.setAge(3);
		P.i("再打印这个动物的信息：");
		a.show();
		P.i("使用work()方法");
		a.work();
		P.i("想用喵类所特有的play()方法，但，不能使用，因为实例化对象类型是Animal");
		//a.play();
		P.c();
		
		P.i("现在把这个动物进行向下转型，变成一个喵的对象");
		Cat c = (Cat)a;
		P.i("打印一下这个喵的信息：");
		c.show();
		P.i("使用work()方法");
		c.work();
		P.i("现在由于对象c类型是Cat，所以可以用play()方法了");
		c.play();
		P.c();
		
		P.i("测试练习1，实例化一个狗，用来测试带参构造");
		a = new Dog("Lily", 2);
		P.i("实例化完成，并把地址值赋给Animal型的应用a");
		P.i("现在打印一下这个动物的信息：");
		a.show();
		P.i("使用work()方法");
		a.work();
		P.i("想用狗类所特有的play()方法，但，不能使用，因为实例化对象类型是Animal");
		//a.play();
		P.c();
		
		P.i("现在把这个动物进行向下转型，变成一个喵的对象");
		Dog d = (Dog)a;
		P.i("打印一下这个狗的信息：");
		d.show();
		P.i("使用work()方法");
		d.work();
		P.i("现在由于对象d类型是Dog，所以可以用play()方法了");
		d.play();
		P.c();
		
		
		

	}

}





















