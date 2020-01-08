/**
* @author Elvinsys
* @version 创建时间：2019年2月27日 下午7:37:47
* @ClassName StaticDemo
* @Description static关键字的描述和使用
*/

/*
 * 	static关键字
 * 	（1）静态，用来修饰成员变量和成员方法
 * 	（2）静态的特点：
 * 		A:随着类的加载而加载
 * 		B:优先于对象存在
 * 		C:被类的所有对象共享（使用静态修饰的依据）
 * 		D:可以通过类名调用，也可以通过类名调用，建议用类名调用
 * 	（3）静态的内存图，静态的内容在方法区的静态区里
 * 	（4）静态的注意事项：
 * 		A:在静态方法中没有this对象
 * 		B:静态只能访问静态
 * 	（5）静态变量和成员变量的区别
 * 		A:所属不同
 * 			静态变量：属于类，类变量
 * 			成员变量：属于对象，对象变量，实例变量
 * 		B:内存位置不同
 * 			静态变量：方法区的静态区
 * 			成员变量：堆内存
 * 		C:生命周期不同
 * 			静态变量：随着类的加载而加载，随着类的消失而消失
 * 			成员变量：随着对象的创建而存在，随着对象的消失而消失
 * 		D:调用不同
 * 			静态变量：可以通过对象名调用、也可以通过类名调用
 * 			成员变量：只能通过对象名调用
 * 	（6）main方法是静态的
 * 		public：权限最大
 * 		static：不用创建对象即可调用
 * 		void：返回值给jvm没有意义
 * 		main：就是一个常见的名称
 * 		String[] args：可以接受数据，提高程序的灵活性
 */

/*
 * 	学生类
 * 	成员变量：
 * 		school	String
 * 		name	String
 * 		age		int
 * 	构造方法：无参，有参
 * 	成员方法：setXxx()，getXxx()
 * 	
 */

class StaStudent {
	//所有学生都在同一个学校
	private static String school;
	//每个学生都有自己的姓名和年龄
	private String name;
	private int age;
	public StaStudent() {}
	public StaStudent(String school, String name, int age) {
		setSchool(school);
		setName(name);
		setAge(age);
	}
	public String getSchool() {
		return school;
	}
	public static void setSchool(String s) {
		//只有static方法才能访问static变量，但static方法里面不能用this关键字
		school = s;
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
		System.out.println("学校："+getSchool()+"，姓名："+getName()
		+"，年龄："+getAge());
	}
	
	
}

public class StaticDemo {

	public static void main(String[] args) {
		// 测试学生类
		StaStudent stu1 = new StaStudent("QH", "Jaco", 13);
		StaStudent stu2 = new StaStudent("QH", "Ann", 11);
		StaStudent stu3 = new StaStudent();
		stu1.show();
		stu2.show();
		stu3.show();
		System.out.println("------");
		stu3.setName("Jecy");
		stu3.setAge(15);
		stu3.show();
		System.out.println("------");
		stu1.setSchool("FD");
		stu1.show();
		stu2.show();
		stu3.show();

	}

}




















