/**
* @author Elvinsys
* @version 2019年3月4日 下午4:43:20
* Description:继承的概念及运用
*/

/*
 * 	继承
 * 	（1）把多个类中相同的成员提取出来定义到一个独立的类中，然后让多个类
 * 		和独立的类产生关系，这样多个类就具备了这些内容，这个关系叫继承
 * 	（2）Java中继承的格式：
 * 		A:用关键字extends表示
 * 		B:格式：class 子类名 extends 父类名 {}
 * 	（3）继承的好处：
 * 		A:提高了代码的复用性
 * 		B:提高了代码的维护性
 * 		C:让类与类产生了一个关系，是多态的前提
 * 	（4）继承的弊端：
 * 		A:让类的耦合性增强，这样某个类的变化，就会影响其他和该类相关的类
 * 			软件设计的原则：低耦合，高内聚
 * 			低耦合：尽量减少类与类之间的关系
 * 			高内聚：提高单独一个类能够完成的功能性
 * 		B:打破了封装
 * 	（5）Java中继承的特点
 * 		A:Java中类只能支持单继承，就是说只能有一个父类
 * 		B:Java中可以多层继承，多个类逐一继承，成为一个继承体系
 * 	（6）Java中继承的注意事项：
 * 		A:子类不能继承父类的私有成员
 * 		B:子类不能继承父类的构造方法，但可以通过super来访问
 * 		C:不要为了部分功能而去继承
 * 	（7）适合使用继承的情景
 * 		继承体现了“X是Y”的关系，那么X类就能够继承Y类
 * 	（8）Java继承中的成员关系
 * 		A:成员变量
 * 			a:子类的成员变量名称和父类中的成员变量名称不一样的话，很正常
 * 			b:子类的成员变量名称和父类中的成员变量名称一样的话，按照如下顺序超找：
 * 				在子类方法的局部范围找，有就是用
 * 				如果没找到，再到子类成员范围找，有就是用
 * 				如果还没找到，最后去父类的成员范围找，有就是用
 * 				还找不着，就报错。
 * 		B:构造方法
 * 			a:子类的构造方法默认去访问父类的无参构造方法，
 * 				目的是子类访问父类的数据的初始化
 * 			b:父类中如果没有无参构造，子类通过super去明确调用父类的带参构造
 * 				或者子类通过this调用本身的其他构造，但一定会有一个去访问父类
 * 					推荐让父类提供无参构造
 * 		C:成员方法
 * 			a:子类的成员方法和父类中的成员方法名称不一致，这个很正常
 * 			b:子类的成员方法和父类中的成员方法名称一致，按照以下顺序查找
 * 				在子类中找 > 在父类中找 > 找不到就报错
 * 	（9）两个面试题：
 * 		A:Override和Overload的区别？Overload是否可以改变返回值类型
 * 			Override是方法重写：
 * 			在子类中的成员方法名与父类中的成员方法名一样，用于子类把父类的公有方法重新覆写。
 * 			返回值类型和参数列表可以不同，只是名字相同
 * 			Overload是方法重载：
 * 			是同一个类中出现的方法名称相同，参数不同的现象
 * 			不仅是名字，连返回值类型和参数列表必须相同
 * 		B：this和super的区别和各自的作用
 * 			this：代表当前类的对象引用
 * 			super：代表父类储存空间的表示。
 * 	（10）数据初始化的面试题
 * 		A:一个类的初始化过程
 * 		B:子类和父类的构造执行过程
 * 		C:分层初始化
 * 	（11）案例：
 * 		A:学生和老师案例（继承前，继承后）
 * 		B:猫狗案例的分析和实现
 */

public class ExtendsDemo {

	public static void main(String[] args) {
		P.i("测试人类");
		Person per = new Person("renlei", 1000);
		System.out.println("一个很腻害的人类，他的名字是："+per.getName()
			+"，年龄是："+per.getAge());
		per.job();
		P.i("测试学生类");
		Student stu = new Student("Jaco", 12, 99);
		System.out.println("有这么一个学生，名为："+stu.getName()
			+"，年龄是："+stu.getAge()+"，成绩是："+stu.getScore());
		stu.job();
		P.i("测试教师类");
		Teacher tc = new Teacher("Katu", 33, 3000);
		System.out.println("老师的姓名是："+tc.getName()
			+"，年龄为："+tc.getAge()+"，工资是："+tc.getSalary());
		tc.job();
		P.i("人类、学生类、教师类，测试完毕");
		P.c();
		
		P.i("现在开始测试动物类，猫类和狗类，于是，先实例化");
		P.i("测试动物类");
		Animal an = new Animal("黑人",3000, "黑色");
		System.out.println("有一种动物叫"+an.getName()+"，至今存活了"
			+an.getAge()+"年，皮肤的颜色是"+an.getColor());
		an.job();
		P.i("测试猫类");
		Cat ct = new Cat("Tom",3, "白色");
		System.out.println("有一只猫，名字叫"+ct.getName()+"，年龄是"
			+ct.getAge()+"，毛色为"+ct.getColor());
		ct.job();
		P.i("测试狗类");
		Dog dg = new Dog("阿旺",12, "黄色");
		System.out.println("这只狗叫"+dg.getName()+"有"
			+dg.getAge()+"岁那么老了，毛色是"+dg.getColor());
		dg.job();
		P.i("动物类，猫类和狗类，测试完毕");
		P.c();
		
	}

}
/*	案例1：
 * 	定义三个类：Person、Student、Teacher
 * 	（1）要求：使得Person类被Student类与Teacher继承
 */	

/* 	Person类：
* 		成员变量：
* 			private	name	String
* 			private	age		int
* 		构造方法：
* 			public	Person(){}
* 			public	Person(){String name, int age){}
* 		成员方法：
* 			public	getName()	String
* 			public	setName()	void
* 			public	getAge()	int
* 			public	setAge()	void
* 			public	job()		void
*/
class Person {
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
	public void job() {
		System.out.println("人类的本能是生存");
	}
}

/* 	（3）Student类：
* 		成员变量：继承父类，加入如下新增属性
* 			private	score		float
* 		构造方法：
* 			public Student(){}
* 			public Student(String name, int age, int score){}
* 		成员方法：继承父类，加入或重写如下方法
* 			public getScore()	float
* 			public setScore()	void
* 			public job()		void
* */
class Student extends Person {
	private float score;
	public Student() {}
	public Student(String name, int age, float score) {
		super(name, age);
		setScore(score);
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public void job() {
		System.out.println("学生的工作是学习");
	}
}

/* 	（4）Teacher类：
* 		成员变量：继承父类，加入如下新增属性
* 			private	salary	float
* 		构造方法：
* 			public Teacher(){}
* 			public Teacher(String name, int age, float salary){}
* 		成员方法：继承父类，加入或重写如下方法
* 			public getSalary()	float
* 			public setSalary()	void
* 			public job()		void
*/
class Teacher extends Person {
	private float salary;
	public Teacher() {}
	public Teacher(String name, int age, float salary) {
		super(name, age);
		setSalary(salary);
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void job() {
		System.out.println("老师的工作是教书");
	}
}

/*	案例2：
 * 	定义三个类：Animal、Cat、Dog
 * 	（1）要求：使得Animal类被Cat类和Dog类继承
 */

/* 	（2）Animal类：
 * 		成员变量：
 * 			private	name	String
 * 			private age		int
 * 			private color	String
 * 		构造方法：
 * 			public Animal() {}
 * 			public Animal(String name, int age, String color){}
 * 		成员方法：
 * 			public getName()				String
 * 			public setName(String name)		void
 * 			public getAge()					int
 * 			public setAge(int age)			void
 * 			public getColor()				String
 * 			public setColor(String color)	void
 * 			public job()					void
 */
class Animal {
	private String name;
	private int age;
	private String color;
	public Animal() {}
	public Animal(String name, int age, String color) {
		setName(name);
		setAge(age);
		setColor(color);
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void job() {
		System.out.println("动物的本能就是生存");
	}
}
/* 	（3）Cat类：
 * 		成员变量：继承Animal类
 * 		构造方法：
 * 			public Cat() {}
 * 			public Cat(String name, int age) {}
 * 		成员方法：继承Animal类，并重写一下方法
 * 			public job() 					void
 */
class Cat extends Animal {
	public Cat() {}
	public Cat(String name, int age, String color) {
		super(name, age, color);
	}
	public void job() {
		System.out.println("猫的工作就是喵喵叫");
	}
}
/* 	（4）Dog类：
 * 		成员变量：继承Animal类
 * 		构造方法：
 * 			public Dog() {}
 * 			public Dog(String name, int age) {}
 * 		成员方法：继承Animal类，并重写一下方法
 * 			public job() 					void
 */
class Dog extends Animal {
	public Dog() {}
	public Dog(String name, int age, String color) {
		super(name, age, color);
	}
	public void job() {
		System.out.println("狗的工作就是看门口");
	}
}













