/**
* @author Elvinsys
* @version 2019年6月7日 下午6:07:50
* @Description:类描述
*/

public class Demo {
	public static void main(String args[]) {
		//测试乒乓球运动员的无参构造
		PingPangPlayer ppp = new PingPangPlayer();
		ppp.setName("Jaco");
		ppp.setAge(13);
		ppp.showInfo();
		ppp.sleep();
		ppp.eat();
		ppp.study();
		ppp.speakEnglish();
		System.out.println("----------");
		//测试篮球运动员的带参构造
		BasketballPlayer bp = new BasketballPlayer("Lily", 12);
		bp.showInfo();
		bp.sleep();
		bp.eat();
		bp.study();
		System.out.println("----------");
		//测试乒乓球教练的无参构造
		PingPangCoach ppc = new PingPangCoach();
		ppc.setName("Lance");
		ppc.setAge(41);
		ppc.showInfo();
		ppc.sleep();
		ppc.eat();
		ppc.teach();
		ppc.speakEnglish();
		System.out.println("----------");
		//测试篮球教练带参构造
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
		System.out.println("每个人都要睡觉.");
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
		System.out.println("运动员的姓名叫"+getName()+"，年龄为："+getAge());
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
		System.out.println("教练的姓名叫"+getName()+"，年龄为："+getAge());
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
		System.out.println("乒乓球运动员，吃麦当劳");
	}
	public void study() {
		System.out.println("乒乓球运动员，学习接发球");
	}
	public void speakEnglish() {
		System.out.println("我是乒乓球运动员，我会讲英语.");
	}
}

class BasketballPlayer extends Player {
	public BasketballPlayer() {}
	public BasketballPlayer(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}
	public void eat() {
		System.out.println("篮球运动员，吃肯德基");
	}
	public void study() {
		System.out.println("篮球运动员，学习带球和运球");
	}
}

class PingPangCoach extends Coach implements SpeakEnglish {
	public PingPangCoach() {}
	public PingPangCoach(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}
	public void eat() {
		System.out.println("乒乓球教练，吃豆腐干");
	}
	public void teach() {
		System.out.println("乒乓球教练，教接发球");
	}
	public void speakEnglish() {
		System.out.println("我是乒乓球教练，我会说英语");
	}
}

class BasketballCoach extends Coach {
	public BasketballCoach() {}
	public BasketballCoach(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}
	public void eat() {
		System.out.println("篮球教练，吃青菜");
	}
	public void teach() {
		System.out.println("篮球教练，教带球和运球");
	}
}






























