/**
* @author Elvinsys
* @version 2019��3��4�� ����4:18:56
* Description:���ڴ�����������ʵ��
*/

/*
 * 	�����
 * 	��1���ô�����{}�������Ĵ��롣
 * 	��2�����ࣺ
 * 		A:�ֲ������
 * 			�����޶��������������ڣ������ͷţ�����ڴ�������
 * 		B:��������
 * 			�Ѷ�����췽������ͬ�Ĵ���ŵ������棬
 * 			����ÿ�ε��ù��췽��ǰ���Զ�����г�ʼ��
 * 			ÿ�����췽��ִ��ǰ����ִ�й�������
 * 		C:��̬�����
 * 			��������ݽ��г�ʼ��������ִֻ��һ��
 * 	��3����̬����顢��������͹��췽����ִ��˳��
 * 		��̬����� > �������� > ���췽��
 */

public class CodeBlockDemo {

	public static void main(String[] args) {
		//�ֲ������
		P.i("��main�����У���ִ��һ���ֲ������");
		{
			System.out.println("in local block");
		}
		P.i("Ȼ�����޲ι��췽��ʵ����");
		Code d1 = new Code();
		P.i("���ô��ι���ʵ����");
		Code d2 = new Code(1);
	}

}
class Code {
	//��̬�����
	static {
		System.out.println("in static block");
	}
	
	//��������
	{
		System.out.println("in contribute funtion");
	}
	
	//�޲ι��췽��
	public Code() {
		System.out.println("in no param contribute");
	}
	
	//���ι���
	public Code(int a) {
		System.out.println("in param contribute");
	}
}





























