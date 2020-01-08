/**
* @author Elvinsys
* @version 2019年3月8日 下午5:03:38
* @Description:猫狗案例，分析以及实现过程
*/

/*
 * 	猫狗案例，加入跳高的额外功能
 * 	（1）分析：从具体到抽象
 * 		猫：
 * 			有姓名、年龄等特征
 * 			有吃饭、睡觉等行为
 * 		狗：
 * 			有姓名、年龄等特征
 * 			有吃饭，睡觉等行为
 * 		因此可以把这些共性的特征与行为抽取为一个父类
 * 		动物：
 * 			姓名、年龄
 * 			吃饭、睡觉
 * 		它们睡觉都睡在地板上，可以用同一个方法实现
 * 		但是吃的东西不一样，所以吃饭用抽象方法来实现
 * 		因此，动物类是一个抽象类
 * 		而跳高，属于额外的一个扩展行为，并不是所有猫和狗
 * 		都具有这个行为，因此，跳高作为一个接口来实现
 * 		接口：
 * 			跳高	
 * 	（2）实现：从抽象到具体
 *	（3）使用：使用具体类
 */
//定义跳高接口
interface Jumpping {
	public abstract void jump();
}

//定义动物类
abstract class Animal2 {
	private String name;
	private int age;
	public Animal2() {}
	public Animal2(String name, int age) {
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
		System.out.println("这只动物的名字叫："+getName()
				+"，它有"+getAge()+"岁了。");
	}
	public void sleep() {
		System.out.println("动物都喜欢睡觉");
	}
	public abstract void eat();
}

//定义猫类
class Cat2 extends Animal2 {
	public Cat2() {}
	public Cat2(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

//定义狗类
class Dog2 extends Animal2 {
	public Dog2() {}
	public Dog2(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("狗爱啃骨头");
	}
}

//定义超级猫
class SuperCat extends Cat2 implements Jumpping {
	public SuperCat() {}
	public SuperCat(String name, int age) {
		super(name,age);
	}
	public void jump() {
		System.out.println("这个猫会跳高");
	}
}

//定义超级狗
class SuperDog extends Dog2 implements Jumpping {
	public SuperDog() {}
	public SuperDog(String name, int age) {
		super(name,age);
	}
	public void jump() {
		System.out.println("这个狗会跳高");
	}
}

public class ID06InterfaceAnimal {

	public static void main(String[] args) {
		P.i("用无参构造测试跳高猫，实例化跳高猫，并赋值给动物类引用");
		Animal2 a2 = new SuperCat();
		a2.setName("Jaco");
		a2.setAge(3);
		P.i("这个动物的信息是：");
		a2.show();
		P.i("这个动物要睡觉，要吃东西，能跳高吗？");
		a2.sleep();
		a2.eat();
		P.i("不能跳高，因为只是个动物，不一定就会跳高");
		//a2.jump();
		P.i("但是，由于它是个跳高猫，我们把它向下转型...");
		SuperCat sc = (SuperCat)a2;
		sc.jump();
		P.c();
		
		P.i("用带参构造测试跳高狗，实例化跳高狗，并赋值给动物类引用");
		a2 = new SuperDog("Lily", 2);
		P.i("这个动物的信息是：");
		a2.show();
		P.i("这个动物要睡觉，要吃东西，能跳高吗？");
		a2.sleep();
		a2.eat();
		P.i("不能跳高，因为只是个动物，不一定就会跳高");
		//a2.jump();
		P.i("但是，由于它是个跳高狗，我们把它向下转型...");
		SuperDog sg = (SuperDog)a2;
		sg.jump();
	}

}





























