/**
* @author Elvinsys
* @version 2019��3��8�� ����6:03:56
* @Description:��ʦѧ���������ýӿ�ʵ�ֶ��⹦��
*/

/*
 * 	����һ���ӿ�
 * 		PlayMusic������ʵ�ֶ��⹦��
 * 	���������
 * 		Person2���ӽ�ʦ��ѧ���г�������ĳ�����
 * 		Teather2������Ľ�ʦ�࣬�̳���Person2
 * 		Student2�������ѧ���࣬�̳���Person2
 * 		SuperTeather�����ж��⹦�ܵ���ʦ���̳���Teacher2
 * 		SuperStudent�����ж��⹦�ܵ�ѧ�����̳���Student2
 */

interface PlayMusic {
	public abstract void playGuitar();
}

abstract class Person {
	private String name;
	private int age;
	public Person() {}
	public Person(String name, int age) {
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
		System.out.println("����˵����ֽУ�"+getName()
				+"�����������ǣ�"+getAge());
	}
	public abstract void eat();
}

class Teacher2 extends Person {
	public Teacher2() {}
	public Teacher2(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("ѧ����Ӧ��Ҫ����");
	}
}

class Student2 extends Person {
	public Student2() {}
	public Student2(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("��ʦҪ���ʣ��Ե��ص�");
	}
}

class SuperTeacher extends Teacher2 implements PlayMusic {
	public SuperTeacher() {}
	public SuperTeacher(String name, int age) {
		super(name, age);
	}
	public void playGuitar() {
		System.out.println("�ᵯ��������ʦ��˧��");
	}
}

class SuperStudent extends Student2 implements PlayMusic {
	public SuperStudent() {}
	public SuperStudent(String name, int age) {
		super(name, age);
	}
	public void playGuitar() {
		System.out.println("�ᵯ������ѧ�����度");
	}
}

public class ID07InterfacePerson {

	public static void main(String[] args) {
		P.i("�޲ι���ʵ����������ʦ�����ѵ�ַ�������������");
		Person p = new SuperTeacher();
		P.i("������˵���Ϣ���г�ʼ��...");
		p.setName("Jaco");
		p.setAge(33);
		P.i("�������˵���Ϣ...");
		p.show();
		P.i("������ܲ��ܵ������أ�");
		//p.playGuitar();
		P.i("�ǲ����Եģ���Ϊ���˲�һ���ᵯ���������ǣ�����һ��������ʦ");
		P.i("����ת��һ��...");
		SuperTeacher st = (SuperTeacher)p;
		st.playGuitar();
		P.c();
		
		P.i("���ι���ʵ��������ѧ�������ѵ�ַ�������������");
		p = new SuperStudent("Lisa",12);
		P.i("�������˵���Ϣ...");
		p.show();
		P.i("������ܲ��ܵ������أ�");
		//p.playGuitar();
		P.i("�ǲ����Եģ���Ϊ���˲�һ���ᵯ���������ǣ�����һ������ѧ��");
		P.i("����ת��һ��...");
		SuperStudent ss = (SuperStudent)p;
		ss.playGuitar();
		P.c();

	}

}






















