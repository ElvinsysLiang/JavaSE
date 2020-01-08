/**
* @author Elvinsys
* @version 2019��3��8�� ����11:52:20
* @Description:���ڶ�̬��������ʹ��
*/

/*
 * 	��̬
 * 	��0������˵����̬����ͨ��ʵ�����²����Ȼ��ѵ�ֵַ�����ϲ����ã�
 * 		�������ϲ����÷��ʼ̳���ͬһ���ϲ�Ĳ�ͬ�²�ʵ���Ĺ��̡�
 * 	��1��ͬһ�������ڲ�ͬʱ�����ֳ����Ĳ�ͬ״̬��
 * 	��2����̬��ǰ�᣺
 * 			A:�м̳л���ʵ�ֹ�ϵ��
 * 			B:�з�����д��
 * 			C:�и�����߸��ӿ�����ָ���������
 * 		
 * 		��̬�ķ��ࣺ
 * 			A:�������̬
 * 				class Fu {}
 * 				class Zi extends Fu {}
 * 				Fu f = new Zi();
 * 			B:�������̬
 * 				abstract class Fu {}
 * 				class Zi extends Fu{}
 * 				Fu f = new Zi();
 * 			C:�ӿڶ�̬
 * 				interface class Fu {}
 * 				class Zi implements Fu {}
 * 				Fu f = new Zi();
 * 	(3)��̬�еĳ�Ա�����ص�
 * 		A:��Ա����
 * 			���뿴��ߣ����п����
 * 		B:���췽��
 * 			����Ĺ��춼��Ĭ�Ϸ��ʸ��๹��
 * 		C:��Ա����
 * 			���뿴��ߣ����п��ұ�
 * 		D:��̬����
 * 			���뿴��ߣ����п����
 * 		���ؼ��ǣ�ֻ�з�������д�����Գ�Ա���������в��ǿ��ұ�
 * 	��4����̬�ĺô���
 * 		A:��ߴ����ά���ԣ��̳����֣�
 * 		B:��߷�������չ�ԣ���̬���֣�
 * 	��5����̬�ı׶ˣ�
 * 		����Ķ����޷�ʹ�����������ض�����
 * 		��������Ե�������ʹ�ã������಻����Ϊ����ʹ�ã�
 * 	��6����̬�е�ת��
 * 		A:����ת�͡������ӵ���
 * 		B:����ת�͡����Ӹ�����
 * 	��7����̬����⣺����װ���İ���
 * 	��8����̬����ϰ��
 * 		A:è������
 * 		B:��ʦ��ѧ������
 */

//��ϰ1��è������
//���������ࣺAnimal�ࡢCat�ࡢDog��

/* 	��1��Animal��
 * 		��Ա������
 * 			private name	String
 * 			private age		int
 * 		���췽����
 * 			public Animal(){}
 * 			public Animal(String name, int age){}
 * 		��Ա������
 * 			public String getName(){}			String
 * 			public void setName(String name){}	void
 * 			public int getAge(){}				int
 * 			public void setAge(){}				void
 * 			public void show(){}				void
 * 			public void work(){}				void
 */
class Animal {
	private String name;
	private int age;
	public Animal() {};
	public Animal(String name, int age) {
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
		System.out.println("���ֽУ�"+getName()+"������Ϊ��"+getAge());
	}
	public void work() {
		System.out.println("����Ĺ�����������");
	}
}

/* 	��2��Cat��
 * 		��Ա�������̳��Ը���Animal
 * 		���췽����
 * 			public Cat(){}
 * 			public Cat(String name, int age){}
 * 		��Ա�������̳��Ը��࣬����дwork����������play����
 * 			public void work(){}					void
 * 			public void play(){}
 */
class Cat extends Animal {
	public Cat() {}
	public Cat(String name, int age) {
		super(name,age);
	}
	public void work() {
		System.out.println("è�Ĺ�����ץ����");
	}
	public void play() {
		System.out.println("èϲ��������");
	}
}

/* 	��3��Dog��
 * 		��Ա�������̳��Ը���Animal
 * 		���췽����
 * 			public Dog(){}
 * 			public Dog(String name, int age){}
 * 		��Ա�������̳��Ը��࣬����дwork����������play����
 * 			public void work(){}					void
 * 			public void play(){}		
 */
class Dog extends Animal {
	public Dog() {}
	public Dog(String name, int age) {
		super(name,age);
	}
	public void work() {
		System.out.println("���Ĺ������ǿ��ſ�");
	}
	public void play() {
		System.out.println("��ϲ����Ƥ��");
	}
}

public class ID02Poly {

	public static void main(String[] args) {
		P.i("������ϰ1��ʵ����һ��è�����������޲ι���");
		Animal a = new Cat();
		P.i("ʵ������ɣ����ѵ�ֵַ����Animal�͵�Ӧ��a");
		P.i("���ڴ�ӡһ������������Ϣ��");
		a.show();
		P.i("��û�����ݣ����ǵ�Ȼ�ģ���Ϊ�޲ι���û�н��и�ֵ");
		P.i("��������������и�ֵ...");
		a.setName("Jaco");
		a.setAge(3);
		P.i("�ٴ�ӡ����������Ϣ��");
		a.show();
		P.i("ʹ��work()����");
		a.work();
		P.i("�������������е�play()��������������ʹ�ã���Ϊʵ��������������Animal");
		//a.play();
		P.c();
		
		P.i("���ڰ���������������ת�ͣ����һ�����Ķ���");
		Cat c = (Cat)a;
		P.i("��ӡһ�����������Ϣ��");
		c.show();
		P.i("ʹ��work()����");
		c.work();
		P.i("�������ڶ���c������Cat�����Կ�����play()������");
		c.play();
		P.c();
		
		P.i("������ϰ1��ʵ����һ�������������Դ��ι���");
		a = new Dog("Lily", 2);
		P.i("ʵ������ɣ����ѵ�ֵַ����Animal�͵�Ӧ��a");
		P.i("���ڴ�ӡһ������������Ϣ��");
		a.show();
		P.i("ʹ��work()����");
		a.work();
		P.i("���ù��������е�play()��������������ʹ�ã���Ϊʵ��������������Animal");
		//a.play();
		P.c();
		
		P.i("���ڰ���������������ת�ͣ����һ�����Ķ���");
		Dog d = (Dog)a;
		P.i("��ӡһ�����������Ϣ��");
		d.show();
		P.i("ʹ��work()����");
		d.work();
		P.i("�������ڶ���d������Dog�����Կ�����play()������");
		d.play();
		P.c();
		
		
		

	}

}





















