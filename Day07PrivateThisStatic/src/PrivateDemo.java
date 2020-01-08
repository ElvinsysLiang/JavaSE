/**
* @author Elvinsys
* @version 创建时间：2019年2月27日 上午9:42:42
* @ClassName PrivateDemo
* @Description 类的封装概念及使用
*/

/*
 * 	类的封装
 * 	（1）概念：
 * 		隐藏实现细节，提供公共的访问方式
 * 	（2）好处：
 * 		A:隐藏实现细节，提供公共的访问方式
 * 		B:提高代码的复用性
 * 		C:提高代码的安全性
 * 	（3）设计原则
 * 		把不想让外界知道的实现细节给隐藏起来，提供公共的访问方式
 * 	（4）private是封装的一种体现。
 * 		封装：类，方法，private修饰成员变量
 * 	（5）private关键字：
 * 		A:用来修饰成员变量和成员方法
 * 		B:被private修饰后的成员只能在本类中被访问
 * 		C:成员变量通过private修饰
 * 		D：提供对应的getXxx()/setXxx()方法访问成员变量
 * 		E:在setXxx()中可加入校验代码，防止数据错误
 */

/*
 * 	定义一个学生类
 * 	成员变量：
 * 		name				string
 * 		age					int
 * 	成员方法：
 * 		getName()			String
 * 		setName(String)		void
 * 		getAge()			int
 * 		setAge(int)			void
 * 		show()				void
 */

class StudentPrivate {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		//age = a;
		//加入数据校验代码
		if (a<0 || a>110) {
			System.out.println("数据有误");
			return;
		} else {
			age = a;
		}
	}
	public void show() {
		System.out.println("姓名："+name+
				"，年龄："+age);
	}
}

public class PrivateDemo {

	public static void main(String[] args) {
		StudentPrivate stu = new StudentPrivate();
		stu.show();
		stu.setName("Jaco");
		stu.setAge(12);
		stu.show();
	}

}






















