/**
* @author Elvinsys
* @version 创建时间：2019年2月21日 下午12:46:57
* @ClassName OO
* @Description 面向对象的思想
*/

/*	面向对象程序设计的思想
 * 	（1）概念：面向对象是基于面向过程的编程思想
 * 	（2）特点：
 * 		A:是一种更符合我们思考习惯的思想
 * 		B:把复杂的事情简单化
 * 		C:让我们从执行者变成了指挥者
 * 	（3）类与对象
 * 		A:类，具有现实世界事物的抽象特征
 * 			属性：事物的基本描述
 * 			行为：事物的功能
 * 		B:Java语言中最基本的单位是类，所以我们要用类来体现事物
 * 		C:类
 * 			成员变量	事物的属性
 * 			成员方法	事物的行为
 * 		D:举例：
 * 			类：学生
 * 			对象：班上的小黄同学
 * 	（4）类的定义及使用
 * 		A:类的定义
 * 			成员变量	定义格式和以前一样，位置不同，在类中，方法外
 * 			成员方法	定义格式和以前一样，去掉static
 * 		B：使用类的内容
 * 			1）怎么创建对象，这叫对象的实例化，格式是：
 * 				类名 对象名 = new 类名（）；
 * 			2）如何使用成员变量和成员方法
 * 				对象名.成员变量
 * 				对象名.成员方法（）
 * 	（5）案例：
 * 		A：学生类的定义和使用
 * 		B：手机类的定义和使用
 * 	（6）Java程序的开发，设计和特征
 * 		A:开发：就是不断的创建对象，通过对象调用功能
 * 		B:设计：就是管理和维护对象之间的关系
 * 		C：特征：
 * 			1）封装
 * 			2）继承
 * 			3）多态
 */

//定义手机类
class Phone {
	String brand;	//成员变量：品牌
	int price;		//成员变量：价格
	String color;	//成员变量：颜色
	
	public Phone() {
		System.out.println("无参实例化了一个Phone类");
	}
	public void call(String name) {
		//成员方法：打电话
		System.out.println("给"+name+"打电话");
	}
	
	public void sendMessage(String name, String message) {
		//成员方法：给谁发信息
		System.out.println("给"+name+"发个关于"+message+"的信息");
	}
	
	public void printInfo() {
		//成员方法：打印成员变量的内容
		System.out.println("手机的品牌是："+brand+"，价格为："+price+"，颜色是："+color);
	}
}

//定义学生类
class Student {
	String name;
	int age;
	String sex;
	
	public Student() {
		System.out.println("无参实例化了一个Student类");
	}
	
	public void study() {
		System.out.println("学生要学习");
	}
	
	public void sleep() {
		System.out.println("学习累了要睡觉");
	}
	
	public void eat() {
		System.out.println("饿了就要吃饭");
	}
	
	public void printInfo() {
		//成员方法：打印成员变量的内容
		System.out.println("学生的姓名是："+name+"，年龄："+age+"，性别是："+sex);
	}
}

public class OO {

	public static void main(String[] args) {
		//定义可能要用到的变量（这里应该没什么需要用到的变量吧
		ptf("在main函数中使用上面定义好的手机类");
		ptf("实例化一个手机类");
		Phone p = new Phone();
		ptf("给brand、price、color三个成员变量赋值，并打印");
		p.brand = "xiaomi";
		p.price = 1000;
		p.color = "red";
		p.printInfo();
		ptf("使用call（）方法和sendMessage（）成员方法");
		p.call("Jaco");
		p.sendMessage("Ai", "Hello");
		ptc();
		ptf("实例化一个学生类");
		Student stu = new Student();
		ptf("给name、age、sex三个成员变量赋值，并打印");
		stu.name = "Mr.King";
		stu.age = 10;
		stu.sex = "man";
		stu.printInfo();
		ptf("使用study（）、sleep（）、eat（）三个成员方法");
		stu.study();
		stu.sleep();
		stu.eat();
		ptc();
	}

	public static void ptf(String info) {
		//输出注释的方法
		System.out.println(info);
	}
	
	public static void ptc() {
		//输出分隔符的方法
		System.out.println("---------------");
	}
}





















