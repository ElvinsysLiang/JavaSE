/**
* @author Elvinsys
* @version ����ʱ�䣺2019��2��27�� ����9:08:24
* @ClassName ArgsDemo
* @Description ��ʽ���������⣨�����������������ͣ�
*/

/*
 * 	��ʽ���������⣺
 * 	��1���������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 * 	��2���������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 */

//��ʽ�����ǻ�������
class Demo {
	public int sum(int a, int b) {
		return a+b;
	}
}

//��ʽ��������������
class Student {
	public void show() {
		System.out.println("�Ұ�ѧϰ");
	}
}

class StudentShow {
	public void method(Student s) {
		//�÷�����һ����Ķ�����Ϊ��ʽ����
		s.show();
	}
}

public class ArgsDemo {

	public static void main(String[] args) {
		//Ҫ�õ�Student.show()���ͱ�����ʵ����
		Student s = new Student();
		//Ȼ��Ѹö�����Ϊ��������ȥ
		StudentShow ss = new StudentShow();
		ss.method(s);
		//����Ҳ����������������
		System.out.println("������������");
		new StudentShow().method(new Student());
		

	}

}























