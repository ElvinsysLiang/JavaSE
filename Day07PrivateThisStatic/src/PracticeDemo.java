/**
* @author Elvinsys
* @version ����ʱ�䣺2019��2��27�� ����10:57:30
* @ClassName PracticeDemo
* @Description ������ϰ��
*/

/*
 * 	��ϰһ��Ա����Employee
 * 		��Ա������Ա����ţ�����������
 * 		���췽�����޲ι���
 * 		��Ա������getXxx()/setXxx()/show()
 * 	��ϰ����������MyMaths������ʵ�ּӼ��˳����ܣ�
 * 	��ϰ������������Rect�����ܳ������
 */

//Ա����
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
		System.out.println("Ա����ţ�"+eid+"��������"+name+"�����䣺"+age);
	}
}

//��ѧ��
class MyMaths {
	//��Ϊa��b������������MyMaths����࣬����a��b���Ǹ��������
	//��ʹ�õ�ʱ������ֱ�ӿ���ʹ����������
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

//��������
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
		//����Ա����
		Employee emp = new Employee();
		emp.show();
		emp.setEid("K2019");
		emp.setName("Jaco");
		emp.setAge(44);
		emp.show();
		System.out.println("------");
		//����MyMaths��
		System.out.println("1+2="+new MyMaths().add(1, 2));
		System.out.println("3-4="+new MyMaths().sub(3, 4));
		System.out.println("5*6="+new MyMaths().mul(5, 6));
		System.out.println("7/8="+new MyMaths().div(7, 8));
		System.out.println("------");
		//����Rect��������
		Rect rt = new Rect(11.5f, 14.4f);
		System.out.println("�������ܳ�Ϊ��"+rt.getCicl());
		System.out.println("���������Ϊ��"+rt.getArea());
	}

}



















