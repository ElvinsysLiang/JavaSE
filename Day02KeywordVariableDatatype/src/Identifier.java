/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��10��
* @ClassName Identifier
* @Description ��ʶ���Ľ��ܺ��÷��������淶
*/

/*	��ʶ��(identifier)
 * 	��1���Ǹ��࣬�ӿڣ��������������������ַ�����
 * 	��2����ɹ���
 * 		A:Ӣ�Ĵ�Сд��ĸ
 * 		B:����
 * 		C:$��_
 * 	��3��ע�����
 * 		A:���������ֿ�ͷ
 * 		B:������Java�еĹؼ���
 * 		C:���ִ�Сд
 * 	��4����������������Java��
 * 		A:��	ȫ��Сд
 * 			��������Сд���磺baidu.com
 * 			�༷����Сд�����õ�Ÿ������磺cn.itcast.com.baidu
 * 		B:����߽ӿ�
 * 			һ�����ʣ�����ĸ��д���磺Student
 * 			������ʣ�ÿ����������ĸ��д���磺StudentName
 * 		C:�������߱���
 * 			һ�����ʣ�����ĸСд���磺name
 * 			������ʣ�����ĸСд���ӵڶ������ʿ�ʼ������ĸ��д���磺getName()
 * 		D:����	ȫ����д
 * 			һ�����ʣ���д���磺PI
 * 			������ʣ���д����_�������磺STUDENT_MAX_AGE
 * */
public class Identifier {
	public static void main(String [] args) {
		int x = 100;
		System.out.println(x);
		//int 01x = 100;	�����ֿ�ͷ������
		
		int Public = 200;
		//int public =200;	�ؼ�����Ϊ������������
		System.out.println(Public);
		System.out.println("�������ͨ������ϸ����뿴Դ��");
	}
}
