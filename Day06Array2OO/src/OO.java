/**
* @author Elvinsys
* @version ����ʱ�䣺2019��2��21�� ����12:46:57
* @ClassName OO
* @Description ��������˼��
*/

/*	������������Ƶ�˼��
 * 	��1�������������ǻ���������̵ı��˼��
 * 	��2���ص㣺
 * 		A:��һ�ָ���������˼��ϰ�ߵ�˼��
 * 		B:�Ѹ��ӵ�����򵥻�
 * 		C:�����Ǵ�ִ���߱����ָ����
 * 	��3���������
 * 		A:�࣬������ʵ��������ĳ�������
 * 			���ԣ�����Ļ�������
 * 			��Ϊ������Ĺ���
 * 		B:Java������������ĵ�λ���࣬��������Ҫ��������������
 * 		C:��
 * 			��Ա����	���������
 * 			��Ա����	�������Ϊ
 * 		D:������
 * 			�ࣺѧ��
 * 			���󣺰��ϵ�С��ͬѧ
 * 	��4����Ķ��弰ʹ��
 * 		A:��Ķ���
 * 			��Ա����	�����ʽ����ǰһ����λ�ò�ͬ�������У�������
 * 			��Ա����	�����ʽ����ǰһ����ȥ��static
 * 		B��ʹ���������
 * 			1����ô����������ж����ʵ��������ʽ�ǣ�
 * 				���� ������ = new ����������
 * 			2�����ʹ�ó�Ա�����ͳ�Ա����
 * 				������.��Ա����
 * 				������.��Ա��������
 * 	��5��������
 * 		A��ѧ����Ķ����ʹ��
 * 		B���ֻ���Ķ����ʹ��
 * 	��6��Java����Ŀ�������ƺ�����
 * 		A:���������ǲ��ϵĴ�������ͨ��������ù���
 * 		B:��ƣ����ǹ����ά������֮��Ĺ�ϵ
 * 		C��������
 * 			1����װ
 * 			2���̳�
 * 			3����̬
 */

//�����ֻ���
class Phone {
	String brand;	//��Ա������Ʒ��
	int price;		//��Ա�������۸�
	String color;	//��Ա��������ɫ
	
	public Phone() {
		System.out.println("�޲�ʵ������һ��Phone��");
	}
	public void call(String name) {
		//��Ա��������绰
		System.out.println("��"+name+"��绰");
	}
	
	public void sendMessage(String name, String message) {
		//��Ա��������˭����Ϣ
		System.out.println("��"+name+"��������"+message+"����Ϣ");
	}
	
	public void printInfo() {
		//��Ա��������ӡ��Ա����������
		System.out.println("�ֻ���Ʒ���ǣ�"+brand+"���۸�Ϊ��"+price+"����ɫ�ǣ�"+color);
	}
}

//����ѧ����
class Student {
	String name;
	int age;
	String sex;
	
	public Student() {
		System.out.println("�޲�ʵ������һ��Student��");
	}
	
	public void study() {
		System.out.println("ѧ��Ҫѧϰ");
	}
	
	public void sleep() {
		System.out.println("ѧϰ����Ҫ˯��");
	}
	
	public void eat() {
		System.out.println("���˾�Ҫ�Է�");
	}
	
	public void printInfo() {
		//��Ա��������ӡ��Ա����������
		System.out.println("ѧ���������ǣ�"+name+"�����䣺"+age+"���Ա��ǣ�"+sex);
	}
}

public class OO {

	public static void main(String[] args) {
		//�������Ҫ�õ��ı���������Ӧ��ûʲô��Ҫ�õ��ı�����
		ptf("��main������ʹ�����涨��õ��ֻ���");
		ptf("ʵ����һ���ֻ���");
		Phone p = new Phone();
		ptf("��brand��price��color������Ա������ֵ������ӡ");
		p.brand = "xiaomi";
		p.price = 1000;
		p.color = "red";
		p.printInfo();
		ptf("ʹ��call����������sendMessage������Ա����");
		p.call("Jaco");
		p.sendMessage("Ai", "Hello");
		ptc();
		ptf("ʵ����һ��ѧ����");
		Student stu = new Student();
		ptf("��name��age��sex������Ա������ֵ������ӡ");
		stu.name = "Mr.King";
		stu.age = 10;
		stu.sex = "man";
		stu.printInfo();
		ptf("ʹ��study������sleep������eat����������Ա����");
		stu.study();
		stu.sleep();
		stu.eat();
		ptc();
	}

	public static void ptf(String info) {
		//���ע�͵ķ���
		System.out.println(info);
	}
	
	public static void ptc() {
		//����ָ����ķ���
		System.out.println("---------------");
	}
}





















