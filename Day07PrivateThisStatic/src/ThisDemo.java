/**
* @author Elvinsys
* @version ����ʱ�䣺2019��2��27�� ����10:05:32
* @ClassName ThisDemo
* @Description this�ؼ��ֵ�ʹ��
*/

/*
 * 	This�ؼ���
 * 	��1������ǰ������ö���
 * 		��ס���ĸ�������÷������÷����ڲ���this�ʹ����ĸ�����
 * 	��2��Ӧ�ó�����
 * 		A:����ľֲ��������س�Ա����������
 * 		B:��ʵthis����������Ӧ�ã�
 */

//����this�ؼ��֣��ع�StudentPrivate��
class ThisStudent {
	private String name;
	private int age;
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
		System.out.println("������"+name+"������"
				+age);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		ThisStudent ts = new ThisStudent();
		ts.show();
		ts.setName("Jaco");
		ts.setAge(11);
		ts.show();

	}

}




















