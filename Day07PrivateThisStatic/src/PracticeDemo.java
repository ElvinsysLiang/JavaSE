/**
* @author Elvinsys
* @version 创建时间：2019年2月27日 上午10:57:30
* @ClassName PracticeDemo
* @Description 两个练习题
*/

/*
 * 	练习一：员工类Employee
 * 		成员变量：员工编号，姓名，年龄
 * 		构造方法：无参构造
 * 		成员方法：getXxx()/setXxx()/show()
 * 	练习二：计算类MyMaths，用于实现加减乘除功能，
 * 	练习三：长方形类Rect，求周长和面积
 */

//员工类
class Employee {
	private String eid;
	private String name;
	private int age;
	public Employee() {}
	/*public Employee(String eid, String name, int age) {
		setEid(eid);
		setName(name);
		setAge(age);
	}*/
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
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
		System.out.println("员工编号："+eid+"、姓名："+name+"、年龄："+age);
	}
}

//数学类
class MyMaths {
	//因为a和b不可用来描述MyMaths这个类，所以a和b不是该类的属性
	//在使用的时候，甚至直接可以使用匿名对象
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
}

//长方形类
class Rect {
	private float length;
	private float width;
	public Rect() {}
	public Rect(float length, float width) {
		setLength(length);
		setWidth(width);
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getCicl() {
		return (this.length+this.width)*2;
	}
	public float getArea() {
		return (this.length*this.width);
	}
}

public class PracticeDemo {

	public static void main(String[] args) {
		//测试员工类
		Employee emp = new Employee();
		emp.show();
		emp.setEid("K2019");
		emp.setName("Jaco");
		emp.setAge(44);
		emp.show();
		System.out.println("------");
		//测试MyMaths类
		System.out.println("1+2="+new MyMaths().add(1, 2));
		System.out.println("3-4="+new MyMaths().sub(3, 4));
		System.out.println("5*6="+new MyMaths().mul(5, 6));
		System.out.println("7/8="+new MyMaths().div(7, 8));
		System.out.println("------");
		//测试Rect长方形类
		Rect rt = new Rect(11.5f, 14.4f);
		System.out.println("长方形周长为："+rt.getCicl());
		System.out.println("长方形面积为："+rt.getArea());
	}

}



















