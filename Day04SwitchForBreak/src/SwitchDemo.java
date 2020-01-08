/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��11�� ����9:41:39
* @ClassName SwitchDemo
* @Description ����switch����ѧϰ�ʼ�
*/

/*
 * 	switch���
 * 	��1����ʽ��
 * 		switch�����ʽ��{
 * 			case ֵ1��
 * 				�����1��
 * 				break��
 * 			case ֵ2��
 * 				�����2��
 * 				break��
 * 			...
 * 			default��
 * 				�����n��
 * 				break��
 * 		}
 * 		��ʽ˵����
 * 		A:switch��	��ʾswitchѡ��ṹ
 * 		B:���ʽ��	ȡֵ�޶�Ϊ��������ֵ��4+2��
 * 					byte��short��int��char
 * 					JDK5�Ժ�����ö����
 * 					JDK7�Ժ������ַ�����
 * 		C:case��		���������Ҫ����ʽ���бȽ�ƥ���ֵ
 * 		D:����壺	��ƥ��ɹ�����ִ�еĴ������
 * 		E:break��	��ʾ�жϲ�������������
 * 		F:default��	������caseƥ��ʧ�ܣ����ִ�еĴ���
 * 	��2��������
 * 		switch���ı��ʽ������byte��long��String�е�����һ����
 * 		������byte�ͣ���������long����String��JDK7�Ժ�ſ���ʹ��
 * 	��3��ִ�����̣�
 * 		A:���ȼ�����ʽ��ֵ
 * 		B:��ÿһ��case����ƥ�䣬��ƥ��ɹ�����ִ�У�����break���ж�����������
 * 		C:���ƥ��ʧ�ܣ���ִ��default�еĴ���
 * 	��4��ע�����
 * 		A:case����ֻ���ǳ����������Ǳ��������case���ܳ�����ͬ��ֵ
 * 		B:breakһ�㲻ʡ�ԣ�ʡ���˻ᷢ��case��͸�����ǹ����Ϊ֮
 * 		C:defaultһ�㲻ʡ�ԣ�������caseƥ��ʧ�ܵ�ʱ������������
 * 		D:default��һ��Ҫ������󣬵�һ���Ƿ������
 * 		E:switch�Ľ�������
 * 			a:����break
 * 			b:ִ�е�ĩβ
 * 	��5��������
 * 		A:����¼��һ�����֣�1-7���������Ӧ�����ڼ�
 * 		B:����ѡ����
 * 		C:����¼��һ���ַ���
 * 			String s = sc.nextLine����
 * 		D:���ݸ������·ݣ������Ӧ�ļ���
 * 	��6��switch�����if���Ĺ�ϵ
 * 		A:switch���
 * 			��Լ����������ж�
 * 		B:if���
 * 			���boolean�������ݵ��ж�
 * 			���һ����Χ���ж�
 * 			��Լ����������ж�
 * */

//��Ҫ�õ�����¼��
//import java.util.Scanner;

public class SwitchDemo {
	public static void main(String [] args) {
		//��������õ��ı���������ʼ��
		int day = 0, month = 0, choice = 0;
		String myStr = "";
		
		//���������������sc
		//Scanner sc = new Scanner(System.in);
		/*���Լ��������Ƿ���������
		System.out.println("input something:");
		a = sc.nextInt();
		System.out.println(a);
		���Գɹ�*/
		
		System.out.println("����A:����¼��һ�����֣�1-7���������Ӧ�����ڼ�");
		System.out.println("What day ?(1-7):");
		//day = sc.nextInt();
		day = 2;
		switch (day){
			case 1:
				System.out.println("Today is Monday!");
				break;
			case 2:
				System.out.println("Today is Tuesday!");
				break;
			case 3:
				System.out.println("Today is Wednesday!");
				break;
			case 4:
				System.out.println("Today is Thuesday!");
				break;
			case 5:
				System.out.println("Today is Friday!");
				break;
			case 6:
				System.out.println("Today is Saturday!");
				break;
			case 7:
				System.out.println("Today is Sunday!");
				break;
			default:
				System.out.println("Input wrong~");
		}
		System.out.println("-----");
		System.out.println("����B:����ѡ����");
		System.out.println("Ҧ���Ǹ���ô�����ˣ���1-4����");
		System.out.println("1.Ů��	2.������	3.�ձ���	4.�˶�Ա");
		//choice = sc.nextInt();
		choice = 4;
		switch (choice) {
			case 1:
			case 2:
			case 3:
				System.out.println("���Ĵ𰸴���");
				break;
			case 4:
				System.out.println("����ȷ");
				break;
			default:
				System.out.println("û�����ѡ��");
		}
		System.out.println("-----");
		System.out.println("����C:����¼��һ���ַ���");
		//String s = sc.nextLine����
		System.out.println("What program language:");
		//myStr = sc.nextLine();
		myStr = "java";
		switch (myStr) {
			case "java":
			case "Java":
			case "JAVA":
				System.out.println("Java good good");
				break;
			default:
				System.out.println(myStr+"? not good~");
		}
		System.out.println("-----");
		System.out.println("����D:���ݸ������·ݣ������Ӧ�ļ���");
		System.out.println("������һ���·�(1-12):");
		//month = sc.nextInt();
		month = 10;
		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("��������·�����");
		}
		System.out.println("-----");
	}
}
