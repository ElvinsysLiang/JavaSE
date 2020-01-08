/**
* @author Elvinsys
* @version 2019��6��7�� ����6:07:50
* @Description:������
*/

public class Demo {
	public static void main(String args[]) {
		//����ƹ�����˶�Ա���޲ι���
		PingPangPlayer ppp = new PingPangPlayer();
		ppp.setName("Jaco");
		ppp.setAge(13);
		ppp.showInfo();
		ppp.sleep();
		ppp.eat();
		ppp.study();
		ppp.speakEnglish();
		System.out.println("----------");
		//���������˶�Ա�Ĵ��ι���
		BasketballPlayer bp = new BasketballPlayer("Lily", 12);
		bp.showInfo();
		bp.sleep();
		bp.eat();
		bp.study();
		System.out.println("----------");
		//����ƹ����������޲ι���
		PingPangCoach ppc = new PingPangCoach();
		ppc.setName("Lance");
		ppc.setAge(41);
		ppc.showInfo();
		ppc.sleep();
		ppc.eat();
		ppc.teach();
		ppc.speakEnglish();
		System.out.println("----------");
		//��������������ι���
		BasketballCoach bc = new BasketballCoach("Mik", 44);
		bc.showInfo();
		bc.sleep();
		bc.eat();
		bc.teach();
		System.out.println("----------");
	}
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
	public void sleep() {
		System.out.println("ÿ���˶�Ҫ˯��.");
	}
	public abstract void showInfo();
	public abstract void eat();
}

abstract class Player extends Person {
	public Player() {}
	public Player(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}
	public void showInfo() {
		System.out.println("�˶�Ա��������"+getName()+"������Ϊ��"+getAge());
	}
	public abstract void study();
}

abstract class Coach extends Person {
	public Coach() {}
	public Coach(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}
	public void showInfo() {
		System.out.println("������������"+getName()+"������Ϊ��"+getAge());
	}
	public abstract void teach();
}

interface SpeakEnglish {
	public abstract void speakEnglish();
}

class PingPangPlayer extends Player implements SpeakEnglish {
	public PingPangPlayer() {}
	public PingPangPlayer(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}
	public void eat() {
		System.out.println("ƹ�����˶�Ա��������");
	}
	public void study() {
		System.out.println("ƹ�����˶�Ա��ѧϰ�ӷ���");
	}
	public void speakEnglish() {
		System.out.println("����ƹ�����˶�Ա���һὲӢ��.");
	}
}

class BasketballPlayer extends Player {
	public BasketballPlayer() {}
	public BasketballPlayer(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}
	public void eat() {
		System.out.println("�����˶�Ա���Կϵ»�");
	}
	public void study() {
		System.out.println("�����˶�Ա��ѧϰ���������");
	}
}

class PingPangCoach extends Coach implements SpeakEnglish {
	public PingPangCoach() {}
	public PingPangCoach(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}
	public void eat() {
		System.out.println("ƹ����������Զ�����");
	}
	public void teach() {
		System.out.println("ƹ����������̽ӷ���");
	}
	public void speakEnglish() {
		System.out.println("����ƹ����������һ�˵Ӣ��");
	}
}

class BasketballCoach extends Coach {
	public BasketballCoach() {}
	public BasketballCoach(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}
	public void eat() {
		System.out.println("��������������");
	}
	public void teach() {
		System.out.println("����������̴��������");
	}
}






























