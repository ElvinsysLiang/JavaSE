/**
* @author Elvinsys
* @version ����ʱ�䣺2019��2��27�� ����9:42:42
* @ClassName PrivateDemo
* @Description ��ķ�װ���ʹ��
*/

/*
 * 	��ķ�װ
 * 	��1�����
 * 		����ʵ��ϸ�ڣ��ṩ�����ķ��ʷ�ʽ
 * 	��2���ô���
 * 		A:����ʵ��ϸ�ڣ��ṩ�����ķ��ʷ�ʽ
 * 		B:��ߴ���ĸ�����
 * 		C:��ߴ���İ�ȫ��
 * 	��3�����ԭ��
 * 		�Ѳ��������֪����ʵ��ϸ�ڸ������������ṩ�����ķ��ʷ�ʽ
 * 	��4��private�Ƿ�װ��һ�����֡�
 * 		��װ���࣬������private���γ�Ա����
 * 	��5��private�ؼ��֣�
 * 		A:�������γ�Ա�����ͳ�Ա����
 * 		B:��private���κ�ĳ�Աֻ���ڱ����б�����
 * 		C:��Ա����ͨ��private����
 * 		D���ṩ��Ӧ��getXxx()/setXxx()�������ʳ�Ա����
 * 		E:��setXxx()�пɼ���У����룬��ֹ���ݴ���
 */

/*
 * 	����һ��ѧ����
 * 	��Ա������
 * 		name				string
 * 		age					int
 * 	��Ա������
 * 		getName()			String
 * 		setName(String)		void
 * 		getAge()			int
 * 		setAge(int)			void
 * 		show()				void
 */

class StudentPrivate {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		//age = a;
		//��������У�����
		if (a<0 || a>110) {
			System.out.println("��������");
			return;
		} else {
			age = a;
		}
	}
	public void show() {
		System.out.println("������"+name+
				"�����䣺"+age);
	}
}

public class PrivateDemo {

	public static void main(String[] args) {
		StudentPrivate stu = new StudentPrivate();
		stu.show();
		stu.setName("Jaco");
		stu.setAge(12);
		stu.show();
	}

}






















