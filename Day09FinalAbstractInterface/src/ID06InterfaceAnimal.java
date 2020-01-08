/**
* @author Elvinsys
* @version 2019��3��8�� ����5:03:38
* @Description:è�������������Լ�ʵ�ֹ���
*/

/*
 * 	è���������������ߵĶ��⹦��
 * 	��1���������Ӿ��嵽����
 * 		è��
 * 			�����������������
 * 			�гԷ���˯������Ϊ
 * 		����
 * 			�����������������
 * 			�гԷ���˯������Ϊ
 * 		��˿��԰���Щ���Ե���������Ϊ��ȡΪһ������
 * 		���
 * 			����������
 * 			�Է���˯��
 * 		����˯����˯�ڵذ��ϣ�������ͬһ������ʵ��
 * 		���ǳԵĶ�����һ�������ԳԷ��ó��󷽷���ʵ��
 * 		��ˣ���������һ��������
 * 		�����ߣ����ڶ����һ����չ��Ϊ������������è�͹�
 * 		�����������Ϊ����ˣ�������Ϊһ���ӿ���ʵ��
 * 		�ӿڣ�
 * 			����	
 * 	��2��ʵ�֣��ӳ��󵽾���
 *	��3��ʹ�ã�ʹ�þ�����
 */
//�������߽ӿ�
interface Jumpping {
	public abstract void jump();
}

//���嶯����
abstract class Animal2 {
	private String name;
	private int age;
	public Animal2() {}
	public Animal2(String name, int age) {
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
		System.out.println("��ֻ��������ֽУ�"+getName()
				+"������"+getAge()+"���ˡ�");
	}
	public void sleep() {
		System.out.println("���ﶼϲ��˯��");
	}
	public abstract void eat();
}

//����è��
class Cat2 extends Animal2 {
	public Cat2() {}
	public Cat2(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("è����");
	}
}

//���幷��
class Dog2 extends Animal2 {
	public Dog2() {}
	public Dog2(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("�����й�ͷ");
	}
}

//���峬��è
class SuperCat extends Cat2 implements Jumpping {
	public SuperCat() {}
	public SuperCat(String name, int age) {
		super(name,age);
	}
	public void jump() {
		System.out.println("���è������");
	}
}

//���峬����
class SuperDog extends Dog2 implements Jumpping {
	public SuperDog() {}
	public SuperDog(String name, int age) {
		super(name,age);
	}
	public void jump() {
		System.out.println("�����������");
	}
}

public class ID06InterfaceAnimal {

	public static void main(String[] args) {
		P.i("���޲ι����������è��ʵ��������è������ֵ������������");
		Animal2 a2 = new SuperCat();
		a2.setName("Jaco");
		a2.setAge(3);
		P.i("����������Ϣ�ǣ�");
		a2.show();
		P.i("�������Ҫ˯����Ҫ�Զ�������������");
		a2.sleep();
		a2.eat();
		P.i("�������ߣ���Ϊֻ�Ǹ������һ���ͻ�����");
		//a2.jump();
		P.i("���ǣ��������Ǹ�����è�����ǰ�������ת��...");
		SuperCat sc = (SuperCat)a2;
		sc.jump();
		P.c();
		
		P.i("�ô��ι���������߹���ʵ�������߹�������ֵ������������");
		a2 = new SuperDog("Lily", 2);
		P.i("����������Ϣ�ǣ�");
		a2.show();
		P.i("�������Ҫ˯����Ҫ�Զ�������������");
		a2.sleep();
		a2.eat();
		P.i("�������ߣ���Ϊֻ�Ǹ������һ���ͻ�����");
		//a2.jump();
		P.i("���ǣ��������Ǹ����߹������ǰ�������ת��...");
		SuperDog sg = (SuperDog)a2;
		sg.jump();
	}

}





























