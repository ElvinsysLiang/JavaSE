/**
* @author Elvinsys
* @version 2019��3��4�� ����4:43:20
* Description:�̳еĸ������
*/

/*
 * 	�̳�
 * 	��1���Ѷ��������ͬ�ĳ�Ա��ȡ�������嵽һ�����������У�Ȼ���ö����
 * 		�Ͷ������������ϵ�����������;߱�����Щ���ݣ������ϵ�м̳�
 * 	��2��Java�м̳еĸ�ʽ��
 * 		A:�ùؼ���extends��ʾ
 * 		B:��ʽ��class ������ extends ������ {}
 * 	��3���̳еĺô���
 * 		A:����˴���ĸ�����
 * 		B:����˴����ά����
 * 		C:�������������һ����ϵ���Ƕ�̬��ǰ��
 * 	��4���̳еı׶ˣ�
 * 		A:������������ǿ������ĳ����ı仯���ͻ�Ӱ�������͸�����ص���
 * 			�����Ƶ�ԭ�򣺵���ϣ����ھ�
 * 			����ϣ���������������֮��Ĺ�ϵ
 * 			���ھۣ���ߵ���һ�����ܹ���ɵĹ�����
 * 		B:�����˷�װ
 * 	��5��Java�м̳е��ص�
 * 		A:Java����ֻ��֧�ֵ��̳У�����˵ֻ����һ������
 * 		B:Java�п��Զ��̳У��������һ�̳У���Ϊһ���̳���ϵ
 * 	��6��Java�м̳е�ע�����
 * 		A:���಻�ܼ̳и����˽�г�Ա
 * 		B:���಻�ܼ̳и���Ĺ��췽����������ͨ��super������
 * 		C:��ҪΪ�˲��ֹ��ܶ�ȥ�̳�
 * 	��7���ʺ�ʹ�ü̳е��龰
 * 		�̳������ˡ�X��Y���Ĺ�ϵ����ôX����ܹ��̳�Y��
 * 	��8��Java�̳��еĳ�Ա��ϵ
 * 		A:��Ա����
 * 			a:����ĳ�Ա�������ƺ͸����еĳ�Ա�������Ʋ�һ���Ļ���������
 * 			b:����ĳ�Ա�������ƺ͸����еĳ�Ա��������һ���Ļ�����������˳���ң�
 * 				�����෽���ľֲ���Χ�ң��о�����
 * 				���û�ҵ����ٵ������Ա��Χ�ң��о�����
 * 				�����û�ҵ������ȥ����ĳ�Ա��Χ�ң��о�����
 * 				���Ҳ��ţ��ͱ���
 * 		B:���췽��
 * 			a:����Ĺ��췽��Ĭ��ȥ���ʸ�����޲ι��췽����
 * 				Ŀ����������ʸ�������ݵĳ�ʼ��
 * 			b:���������û���޲ι��죬����ͨ��superȥ��ȷ���ø���Ĵ��ι���
 * 				��������ͨ��this���ñ�����������죬��һ������һ��ȥ���ʸ���
 * 					�Ƽ��ø����ṩ�޲ι���
 * 		C:��Ա����
 * 			a:����ĳ�Ա�����͸����еĳ�Ա�������Ʋ�һ�£����������
 * 			b:����ĳ�Ա�����͸����еĳ�Ա��������һ�£���������˳�����
 * 				���������� > �ڸ������� > �Ҳ����ͱ���
 * 	��9�����������⣺
 * 		A:Override��Overload������Overload�Ƿ���Ըı䷵��ֵ����
 * 			Override�Ƿ�����д��
 * 			�������еĳ�Ա�������븸���еĳ�Ա������һ������������Ѹ���Ĺ��з������¸�д��
 * 			����ֵ���ͺͲ����б���Բ�ͬ��ֻ��������ͬ
 * 			Overload�Ƿ������أ�
 * 			��ͬһ�����г��ֵķ���������ͬ��������ͬ������
 * 			���������֣�������ֵ���ͺͲ����б������ͬ
 * 		B��this��super������͸��Ե�����
 * 			this������ǰ��Ķ�������
 * 			super�������ഢ��ռ�ı�ʾ��
 * 	��10�����ݳ�ʼ����������
 * 		A:һ����ĳ�ʼ������
 * 		B:����͸���Ĺ���ִ�й���
 * 		C:�ֲ��ʼ��
 * 	��11��������
 * 		A:ѧ������ʦ�������̳�ǰ���̳к�
 * 		B:è�������ķ�����ʵ��
 */

public class ExtendsDemo {

	public static void main(String[] args) {
		P.i("��������");
		Person per = new Person("renlei", 1000);
		System.out.println("һ�����度�����࣬���������ǣ�"+per.getName()
			+"�������ǣ�"+per.getAge());
		per.job();
		P.i("����ѧ����");
		Student stu = new Student("Jaco", 12, 99);
		System.out.println("����ôһ��ѧ������Ϊ��"+stu.getName()
			+"�������ǣ�"+stu.getAge()+"���ɼ��ǣ�"+stu.getScore());
		stu.job();
		P.i("���Խ�ʦ��");
		Teacher tc = new Teacher("Katu", 33, 3000);
		System.out.println("��ʦ�������ǣ�"+tc.getName()
			+"������Ϊ��"+tc.getAge()+"�������ǣ�"+tc.getSalary());
		tc.job();
		P.i("���ࡢѧ���ࡢ��ʦ�࣬�������");
		P.c();
		
		P.i("���ڿ�ʼ���Զ����࣬è��͹��࣬���ǣ���ʵ����");
		P.i("���Զ�����");
		Animal an = new Animal("����",3000, "��ɫ");
		System.out.println("��һ�ֶ����"+an.getName()+"����������"
			+an.getAge()+"�꣬Ƥ������ɫ��"+an.getColor());
		an.job();
		P.i("����è��");
		Cat ct = new Cat("Tom",3, "��ɫ");
		System.out.println("��һֻè�����ֽ�"+ct.getName()+"��������"
			+ct.getAge()+"��ëɫΪ"+ct.getColor());
		ct.job();
		P.i("���Թ���");
		Dog dg = new Dog("����",12, "��ɫ");
		System.out.println("��ֻ����"+dg.getName()+"��"
			+dg.getAge()+"����ô���ˣ�ëɫ��"+dg.getColor());
		dg.job();
		P.i("�����࣬è��͹��࣬�������");
		P.c();
		
	}

}
/*	����1��
 * 	���������ࣺPerson��Student��Teacher
 * 	��1��Ҫ��ʹ��Person�౻Student����Teacher�̳�
 */	

/* 	Person�ࣺ
* 		��Ա������
* 			private	name	String
* 			private	age		int
* 		���췽����
* 			public	Person(){}
* 			public	Person(){String name, int age){}
* 		��Ա������
* 			public	getName()	String
* 			public	setName()	void
* 			public	getAge()	int
* 			public	setAge()	void
* 			public	job()		void
*/
class Person {
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
	public void job() {
		System.out.println("����ı���������");
	}
}

/* 	��3��Student�ࣺ
* 		��Ա�������̳и��࣬����������������
* 			private	score		float
* 		���췽����
* 			public Student(){}
* 			public Student(String name, int age, int score){}
* 		��Ա�������̳и��࣬�������д���·���
* 			public getScore()	float
* 			public setScore()	void
* 			public job()		void
* */
class Student extends Person {
	private float score;
	public Student() {}
	public Student(String name, int age, float score) {
		super(name, age);
		setScore(score);
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public void job() {
		System.out.println("ѧ���Ĺ�����ѧϰ");
	}
}

/* 	��4��Teacher�ࣺ
* 		��Ա�������̳и��࣬����������������
* 			private	salary	float
* 		���췽����
* 			public Teacher(){}
* 			public Teacher(String name, int age, float salary){}
* 		��Ա�������̳и��࣬�������д���·���
* 			public getSalary()	float
* 			public setSalary()	void
* 			public job()		void
*/
class Teacher extends Person {
	private float salary;
	public Teacher() {}
	public Teacher(String name, int age, float salary) {
		super(name, age);
		setSalary(salary);
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void job() {
		System.out.println("��ʦ�Ĺ����ǽ���");
	}
}

/*	����2��
 * 	���������ࣺAnimal��Cat��Dog
 * 	��1��Ҫ��ʹ��Animal�౻Cat���Dog��̳�
 */

/* 	��2��Animal�ࣺ
 * 		��Ա������
 * 			private	name	String
 * 			private age		int
 * 			private color	String
 * 		���췽����
 * 			public Animal() {}
 * 			public Animal(String name, int age, String color){}
 * 		��Ա������
 * 			public getName()				String
 * 			public setName(String name)		void
 * 			public getAge()					int
 * 			public setAge(int age)			void
 * 			public getColor()				String
 * 			public setColor(String color)	void
 * 			public job()					void
 */
class Animal {
	private String name;
	private int age;
	private String color;
	public Animal() {}
	public Animal(String name, int age, String color) {
		setName(name);
		setAge(age);
		setColor(color);
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void job() {
		System.out.println("����ı��ܾ�������");
	}
}
/* 	��3��Cat�ࣺ
 * 		��Ա�������̳�Animal��
 * 		���췽����
 * 			public Cat() {}
 * 			public Cat(String name, int age) {}
 * 		��Ա�������̳�Animal�࣬����дһ�·���
 * 			public job() 					void
 */
class Cat extends Animal {
	public Cat() {}
	public Cat(String name, int age, String color) {
		super(name, age, color);
	}
	public void job() {
		System.out.println("è�Ĺ�������������");
	}
}
/* 	��4��Dog�ࣺ
 * 		��Ա�������̳�Animal��
 * 		���췽����
 * 			public Dog() {}
 * 			public Dog(String name, int age) {}
 * 		��Ա�������̳�Animal�࣬����дһ�·���
 * 			public job() 					void
 */
class Dog extends Animal {
	public Dog() {}
	public Dog(String name, int age, String color) {
		super(name, age, color);
	}
	public void job() {
		System.out.println("���Ĺ������ǿ��ſ�");
	}
}













