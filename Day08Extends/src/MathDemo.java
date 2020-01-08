/**
* @author Elvinsys
* @version 2019��3��4�� ����11:24:32
* Description:How to use the Java API
*/
/*
 *	ͨ��JDK�ṩ��APIѧϰMath���ʹ�÷���
 * 	��1��API(Application Programming Interface)Ӧ�ó����ɽӿ�
 * 	��2��ʹ�÷�����һ��API��ʹ�ò��裩��
 * 		A:�򿪰����ĵ�
 * 		B:�����ʾ���ҵ����������������
 * 		C:֪��Ҫ���ҵ��࣬�磺Scanner��Math֮��
 * 		D:�������������Scanner
 * 		E:������java.lang���µ��಻��Ҫ���룬����ȫ����Ҫ����
 * 			�磺java.util.Scanner
 * 		F:�򵥵ؿ�һ����Ľ��ͺ�˵�����Լ��汾��Ҫ�ڸð汾��֮����ֵ�JDK�����ʹ��
 * 		G:����Ľṹ
 * 			��Ա����	�ֶ�ժҪ
 * 			���췽��	���췽��ժҪ
 * 			��Ա����	����ժҪ
 * 		H:ѧϰ���췽��
 * 			�й��췽��		��������
 * 			û�й��췽��	��Ա�����Ǿ�̬�ģ�ֱ������������
 * 		I:����Ա����
 * 			���
 * 				�Ƿ�̬�������̬������ͨ����������
 * 				����ֵ���ͣ�����ʲô���͵����ݣ�����ʲô���͵ı���������
 * 			�ұ�
 * 				�����������������Ʋ���д��
 * 				�����б�ע��������ͣ����в�������
 * 	��3��Math���ʹ��
 * 		A:�������ѧ���в�������
 * 		B:û�й��췽������Ϊ���ĳ�Ա���Ǿ�̬��
 * 		C:����������ķ���
 * 			public static double randon():[0.0~1.0)
 * 		D:��β���һ��1-100֮��������
 * 		E:��һ����������Ϸ
 */
import java.util.Scanner;

public class MathDemo {

	public static void main(String[] args) {
		//������Ҫ�õ��ı���
		double temRadm=0.0;
		int radmNum=0, guessNum=0;
		//ʵ������������
		Scanner sc = new Scanner(System.in);
		P.i("���ȡһ�������");
		P.i("Ȼ����API��Math���в���");
		P.i("�����õķ�����public static double random() ");
		P.i("�÷�������һ��double����[0.0~1.0)֮�����");
		P.i("����Math��̳���java.lang�����Բ���Ҫ����");
		P.i("������random()������static���Σ�����ͨ����������");
		temRadm=Math.random();
		System.out.println("ͨ��radom()���ɵ�������ǣ�"+temRadm);
		P.i("����һ��[1~100)�����������");
		P.i("(int)radom()*100+1�������ǣ�");
		System.out.println((int)(Math.random()*100+1));
		P.c();
		P.i("���Դ�[1~100]�����Ĳ�������Ϸ");
		radmNum=(int)((Math.random()*100)+1);
		P.i("ϵͳ�Ѿ�������һ��1~100���������֣���������Ҫ�µ����֣�");
		while(true) {
			guessNum=sc.nextInt();
			if(guessNum==radmNum) {
				System.out.println("��ϲ�㣬��¶��ˣ�");
				break;
			} else if(guessNum>radmNum){
				System.out.println("��´��ˣ���µ������ˣ����������롣");
			} else if(guessNum<radmNum) {
				System.out.println("��´��ˣ���µ���С�ˣ����������롣");
			}
		}
		sc.close();
	}

}
















