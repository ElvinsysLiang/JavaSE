/**
* @author Elvinsys
* @version ����ʱ�䣺2019��2��27�� ����9:19:06
* @ClassName NoNameDemo
* @Description ������������ĸ����ʹ��
*/

/*
 * 	��������
 * 	��1���������û�����ֵĶ���
 * 	��2��Ӧ�ó�����
 * 		A:���÷���������ֻ����һ�ε�ʱ��
 * 		B:������Ϊʵ�ʲ�������
 * 	��3���ô����������������Ͼ������������Ա���������������
 */

class Noname {
	public void show() {
		System.out.println("Hello World");
	}
}
class NonameShow {
	public void method(Noname n) {
		n.show();
	}
}

public class NoNameDemo {

	public static void main(String[] args) {
		//������������ͨ��StudentShow����ʹ��show()��
		//������ʵ���������������ö��������÷���
		Noname nn = new Noname();
		NonameShow ns = new NonameShow();
		ns.method(nn);
		//����������һ����ʹ�õĻ�
		//ֱ�����������󣬾Ͳ���Ҫʵ����
		System.out.println("-ʹ����������-");
		new NonameShow().method(new Noname());
	}

}
















