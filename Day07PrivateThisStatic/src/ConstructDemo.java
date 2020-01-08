/**
* @author Elvinsys
* @version 创建时间：2019年2月27日 上午10:18:55
* @ClassName ConstructDemo
* @Description 构造方法的介绍与使用
*/

/*
 * 	构造方法
 * 	（1）作用：用于对对象的数据进行初始化
 * 	（2）格式：
 * 		A:方法名和类名相同
 * 		B:没用返回值类型，连void都不能有
 * 		C:没有返回值
 * 		D:构造方法可以有return，另外在任意void类型方法的最后
 * 			都可以协商return
 * 	（3）构造方法的注意事项
 * 		A:如果我们没有给出任何构造方法，系统提供一个默认的无参构造方法
 * 		B:如果我们给出任意构造方法，系统将不提供默认构造方法
 * 			最好是有参构造和无参构造一齐手动给出
 * 	（4）给成员变量赋初始值的方式
 * 		A:setXxx()
 * 		B:带参构造方法
 * 		
 */

//利用构造方法，对PrivateStudent类进行重构
class ConStudent {
	private String name;
	private int age;
	public ConStudent() {}
	public ConStudent(String name, int age) {
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
		System.out.println("姓名："+name+"，年龄："
				+age);
	}
}

public class ConstructDemo {

	public static void main(String[] args) {
		ConStudent cs1 = new ConStudent();
		cs1.show();
		cs1.setName("Jaco");
		cs1.setAge(11);
		cs1.show();
		System.out.println("---");
		ConStudent cs2 = new ConStudent("Ann",12);
		cs2.show();
		cs2.setName("Ann2");
		cs2.setAge(13);
		cs2.show();
	}

}

















