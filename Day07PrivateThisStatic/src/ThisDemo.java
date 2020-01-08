/**
* @author Elvinsys
* @version 创建时间：2019年2月27日 上午10:05:32
* @ClassName ThisDemo
* @Description this关键字的使用
*/

/*
 * 	This关键字
 * 	（1）代表当前类的引用对象
 * 		记住：哪个对象调用方法，该方法内部的this就代表哪个对象
 * 	（2）应用场景：
 * 		A:解决的局部变量隐藏成员变量的问题
 * 		B:其实this还有其他的应用？
 */

//利用this关键字，重构StudentPrivate类
class ThisStudent {
	private String name;
	private int age;
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
		System.out.println("姓名："+name+"，年龄"
				+age);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		ThisStudent ts = new ThisStudent();
		ts.show();
		ts.setName("Jaco");
		ts.setAge(11);
		ts.show();

	}

}




















