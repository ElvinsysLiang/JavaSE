/**
* @author Elvinsys
* @version 创建时间：2019年2月27日 上午9:08:24
* @ClassName ArgsDemo
* @Description 形式参数的问题（基本类型与引用类型）
*/

/*
 * 	形式参数的问题：
 * 	（1）基本类型：形式参数的改变不影响实际参数
 * 	（2）引用类型：形式参数的改变直接影响实际参数
 */

//形式参数是基本类型
class Demo {
	public int sum(int a, int b) {
		return a+b;
	}
}

//形式参数是引用类型
class Student {
	public void show() {
		System.out.println("我爱学习");
	}
}

class StudentShow {
	public void method(Student s) {
		//该方法把一个类的对象作为形式参数
		s.show();
	}
}

public class ArgsDemo {

	public static void main(String[] args) {
		//要用到Student.show()，就必须先实例化
		Student s = new Student();
		//然后把该对象作为参数传进去
		StudentShow ss = new StudentShow();
		ss.method(s);
		//但，也可以用匿名对象处理
		System.out.println("利用匿名对象：");
		new StudentShow().method(new Student());
		

	}

}























