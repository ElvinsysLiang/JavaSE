/**
* @author Elvinsys
* @version ����ʱ�䣺2019��2��27�� ����10:18:55
* @ClassName ConstructDemo
* @Description ���췽���Ľ�����ʹ��
*/

/*
 * 	���췽��
 * 	��1�����ã����ڶԶ�������ݽ��г�ʼ��
 * 	��2����ʽ��
 * 		A:��������������ͬ
 * 		B:û�÷���ֵ���ͣ���void��������
 * 		C:û�з���ֵ
 * 		D:���췽��������return������������void���ͷ��������
 * 			������Э��return
 * 	��3�����췽����ע������
 * 		A:�������û�и����κι��췽����ϵͳ�ṩһ��Ĭ�ϵ��޲ι��췽��
 * 		B:������Ǹ������⹹�췽����ϵͳ�����ṩĬ�Ϲ��췽��
 * 			������вι�����޲ι���һ���ֶ�����
 * 	��4������Ա��������ʼֵ�ķ�ʽ
 * 		A:setXxx()
 * 		B:���ι��췽��
 * 		
 */

//���ù��췽������PrivateStudent������ع�
class ConStudent {
	private String name;
	private int age;
	public ConStudent() {}
	public ConStudent(String name, int age) {
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
		System.out.println("������"+name+"�����䣺"
				+age);
	}
}

public class ConstructDemo {

	public static void main(String[] args) {
		ConStudent cs1 = new ConStudent();
		cs1.show();
		cs1.setName("Jaco");
		cs1.setAge(11);
		cs1.show();
		System.out.println("---");
		ConStudent cs2 = new ConStudent("Ann",12);
		cs2.show();
		cs2.setName("Ann2");
		cs2.setAge(13);
		cs2.show();
	}

}

















