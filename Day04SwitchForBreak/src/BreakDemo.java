/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��13�� ����8:25:39
* @ClassName BreakDemo
* @Description ������ת���Ľ��ܼ��÷�˵��
*/

/*	��ת���
 * 	��1��������break��continue��return
 * 	��2��break���ж�
 * 		A:������ѭ����switch���������ѭ��
 * 		B:����������ѭ�����������ѭ��ʽ��Ҫ�ͱ�ǩ������ʹ��
 * 	��3��continue������
 * 		A:������ѭ�����뿪����ѭ����������������ѭ��
 * 		B:����⣺
 * 			for(int x=1;x<=10;x++){
 * 				if(x%3 == 0){
 * 					//�������
 * 				}
 * 				System.out.println("Hello");
 * 			}
 * 			a:����ÿ���̨���2��Hello
 * 			b:����ÿ���̨���7��Hello
 * 			c:����ÿ���̨���13��Hello
 * 	��4��return������
 * 		A:���ڽ������������ط��������Ľ��
 * 		B:����return�����򲻻�����ִ��
 * 
 * */
public class BreakDemo {

	public static void main(String[] args) {
		//������Ҫ�õ��ı���
		int i = 0;
		
		/*����⣺
		 * 	for(int x=1;x<=10;x++){
		 * 		if(x%3 == 0){
		 * 			//�������
		 * 		}
		 * 		System.out.println("Hello");
		 * 	}
		 * 	a:����ÿ���̨���2��Hello
		 * 	b:����ÿ���̨���7��Hello
		 * 	c:����ÿ���̨���13��Hello
		 */
		for(i=1;i<=10;i++){
			if(i%3 == 0){
			//a:����ÿ���̨���2��Hello
				//break;
			//b:����ÿ���̨���7��Hello
				//continue;
			//c:����ÿ���̨���13��Hello
				//System.out.println("Hello");
			}
			System.out.println("Hello");
		}
		
	}

}
