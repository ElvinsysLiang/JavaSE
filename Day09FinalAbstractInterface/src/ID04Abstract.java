/**
* @author Elvinsys
* @version 2019��3��8�� ����3:11:32
* @Description:������Abstract��������ʹ��
*/

/*
 *	������
 *	��1���Ѷ�����ԵĶ�����ȡ��һ�����У�������ļ̳����ƣ�������̳�֮���ĳЩ����
 *		һ���ᱻ��д�����ʱ�򣬶�����Щһ���ᱻ��д�ķ������Ͳ��ܸ�������ķ����塣
 *		û�з�����ķ���������Ϊ���󷽷����������󷽷����࣬�����������ࡣ
 *	��2����������ص�
 *		A:������ͳ��󷽷������ùؼ���abstract����
 *		B:�������в�һ���г��󷽷��������г��󷽷�����һ���ǳ�����
 *		C:�����಻��ʵ����
 *		D:����������ࣺ
 *			a:������һ�������ࡣ
 *			b:������һ�������࣬����������д�������е����г��󷽷�
 *	��3��������ĳ�Ա�ص㣺
 *		A:��Ա����
 *			�б������г���
 *		B:���췽��
 *			�й��췽��
 *		C:��Ա����
 *			�г����зǳ���
 *	��4�����������ϰ
 *		A:è��������ϰ
 *		B:��ʦ������ϰ
 *		C:ѧ��������ϰ
 *		D:Ա��������ϰ
 *	��5��������ļ���С����
 *		A:�������й��췽�������ǲ���ʵ�������乹�췽�������������ڷ��ʸ������ݵĳ�ʼ��
 *		B:һ�������û�г��󷽷���ȴ������Ϊ�����࣬��������Ϊ�˲��ø����ഴ������
 *		C:abstract���ܺ���Щ�ؼ��ֹ���
 *			a:final		��ͻ������final���ε����޷����̳У���������һ��Ҫ���̳У�
 *			b:private	��ͻ������final���εķ����޷�����д�����ǳ��󷽷�һ��Ҫ����д��
 *			c:static	������
 */

/*
 * 	��ϰ2����ʦ����
 * 	���������ࣺTeacher�࣬BasTeacher�࣬AdvTeacher��
 */

/*	Teacher�ࣨ�����ࣩ
 * 		��Ա������
 * 			private name	String
 * 			private age		int
 * 		���췽����
 * 			public Teacher() {}
 * 			public Teacher(String name, int age) {}
 * 		��Ա������	
 * 			public getName() {}	String
 * 			public setName() {}	void
 * 			public getAge() {}		int
 * 			public setAge() {}		void
 * 			public show() {}		void
 * 			public abstract work();	void//���󷽷�
 */
abstract class Teacher {
	private String name;
	private int age;
	public Teacher() {}
	public Teacher(String name, int age) {
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
		System.out.println("�����ʦ�����ֽУ�"+getName()+"�������ǣ�"
				+getAge());
	}
	public abstract void work();
}

/*	BasTeacher�ࣨ�����࣬�̳���Teacher�ࣩ
 * 		��Ա���������̳�Teacher��
 * 		���췽����
 * 			public BasTeacher() {}
 * 			public BasTeacher(String name, int age) {}
 * 		��Ա���������̳���Teacher�����Գ��󷽷�������д��
 * 			public work() {}	void
 */
class BasTeacher extends Teacher {
	public BasTeacher() {}
	public BasTeacher(String name, int age) {
		super(name, age);
	}
	public void work() {
		System.out.println("���������ʦ��JavaSE");
	}
}

/*	AdvTeacher�ࣨ�����࣬�̳���Teacher�ࣩ
 * 		��Ա���������̳�Teacher��
 * 		���췽����
 * 			public AdvTeacher() {}
 * 			public AdvTeacher(String name, int age) {}
 * 		��Ա���������̳���Teacher�����Գ��󷽷�������д��
 * 			public work() {}	void
 */
class AdvTeacher extends Teacher {
	public AdvTeacher() {}
	public AdvTeacher(String name, int age) {
		super(name, age);
	}
	public void work() {
		System.out.println("�߼������ʦ��JavaEE");
	}
}

//showInfo�࣬����ͨ������ĸ������ã���ӡ�������Ϣ
class showInfo {
	public static void show(Teacher t) {
		t.show();
		t.work();
	}
}

public class ID04Abstract {

	public static void main(String[] args) {
		P.i("���ڲ��Ծ�����BasTeacher");
		P.i("���޲ι���󣬰ѵ�ַ����Teacher�Ķ���t");
		Teacher t = new BasTeacher();
		P.i("��t������г�ʼ��...");
		t.setName("Jaco");
		t.setAge(22);
		P.i("��ӡ��ʦ����Ϣ���Լ��������ݣ�");
		//t.show();
		//t.work();
		//��һ�´�������������д���
		showInfo.show(t);
		P.c();
		
		P.i("���ڲ��Ծ�����AdvTeacher");
		P.i("�ô��ι���󣬰ѵ�ַ����Teacher�Ķ���t");
		t = new AdvTeacher("Kuto",33);
		P.i("��ӡ��ʦ����Ϣ���Լ��������ݣ�");
		//t.show();
		//t.work();
		showInfo.show(t);
	}

}
























