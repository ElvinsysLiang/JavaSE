/**
* @author Elvinsys
* @version 2019年3月6日 下午8:17:08
* @Description:final关键字的概念与用法
*/

/*
 *	final关键字
 * 	（1）是最终的意思，可以修饰类、方法和变量。
 * 	（2）特点：
 * 		A:被它修饰的类，不能被继承。
 * 		B:被它修饰的方法，不能被子类重写
 * 		C:被它修饰的变量，是一个常量。在父类中不能被修改。
 * 		在子类中，若子类没有重新定义该变量，在子类中依然不能被修改
 * 		但，如果在子类中被重新定义为不含final的变量，则可以修改
 * 	（3）面试相关：
 * 		A:局部变量
 * 			a:基本类型	其值不能发生变化
 * 			b:引用类型	地址值不能发生变化，但是对象的内容是可以改变的
 * 		B:初始化时机
 * 			a:只能初始化一次
 * 			b:常见的值可以在定义的时候（推荐），或者是在构造方法中
 * 
 */

//测试1：被final修饰的类不能被继承
final class Fu1 {}
//提示无法继承被final继承的父类
/*
class Zi1 extends Fu1 {}
*/

//测试2：被final修饰的成员方法，无法被重写
class Fu2 {
	int i = 11;
	public final void setI(int i) {
		this.i = i;
	}
}
class Zi2 extends Fu2 {
	//提示无法覆盖被final修饰的方法
	/*	
	 * 	public void setI(int i) {
		this.i = i;
		System.out.println("i="+this.i);
	}
	*/
}

//测试3：被它修饰的变量，是一个常量。
class Fu3 {
	final int i = 1;
	/*	父类中的方法也无法修改被final修饰的成员变量
	public void setI(int i) {
		this.i = i;
	}*/
}
//但是，用Zi3继承Fu3，是可以重新定义在父类中被final修饰的成员变量的，
//如果被重新定义后，不含final，则可以进行赋值修改
class Zi3 extends Fu3 {
	int i = 2;
}

public class ID01Final {
	public static void main(String[] args) {
		P.i("测试3：父类中被final修饰的成员变量");
		P.i("先实例化fu3,然后通过父类对象对被final修饰的成员变量进行直接赋值");
		//Fu3 fu3 = new Fu3();
		//fu3.i = 2;
		P.i("提示无法对被final修饰的成员变量进行赋值");
		P.i("但是，假如用zi3继承fu3，并对父类中被final修饰的成员变量进行重定义");
		P.i("若重定义后，不含final，则该变量是可以修改的");
		P.i("实例化Zi3");
		Zi3 zi3 = new Zi3();
		System.out.println("重定义后，不含final的zi3.i="+zi3.i);
		P.c();
		
		//测试4：被final修饰的局部变量，若没有被赋值，可以进行一次赋值
		//在被初始化后，被final修饰的局部变量就变成了常量了，无法进行更改
		final int testI1;
		testI1 = 1;
		System.out.println("局部变量testI="+testI1);
		P.i("在被赋值一次后，就无法进行更改了");
		//testI1 = 2;
		P.i("同样，定义测试变量testI2");
		final int testI2 = 1;
		System.out.println("局部变量testI2="+testI2);
		P.i("在testI2初始化后，就无法进行更改了");
		//testI2 = 2;
		P.c();
		
		P.i("测试5：被final修饰的引用类型，地址值无法改变，");
		P.i("但里面的内容可以改变（如果内容没有被final修饰的话");
		P.i("用final实例化Zi3");
		final Zi3 zi33 = new Zi3();
		P.i("无法再为该引用分配新的地址");
		//zi33 = new Zi3();
		P.i("但是可以对里面的普通成员变量i进行赋值操作");
		P.i("对象zi33的变量i原来的值为："+zi33.i);
		zi33.i = 33;
		P.i("更改后的i值是："+zi33.i);
		P.c();
		
		P.i("但是咧，如果里面的值也是被final修饰的，就无法进行更改了");
		P.i("用final实例化Zi3");
		final Fu3 fu33 = new Fu3();
		P.i("无法再为该引用分配新的地址");
		//fu33 = new Fu3();
		P.i("对象fu33的变量i原来的值为："+fu33.i);
		P.i("由于i值是被final所修饰的，所以无法进行更改");
		//fu33.i = 33;
	}
}
























