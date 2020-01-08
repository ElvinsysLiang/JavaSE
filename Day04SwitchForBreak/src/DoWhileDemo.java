/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��12�� ����9:14:27
* @ClassName DoWhileDemo
* @Description ����do...while���Ľ��ܼ��÷�
*/

/*	do...while���
 * 	��1��������ʽ��
 * 		do{
 * 			ѭ������䣻
 * 		}while���ж�������䣩��
 * 	
 * 	��2����չ��ʽ��
 * 		��ʼ����䣻
 * 		do{
 * 			ѭ������䣻
 * 			����������䣻
 * 		}while���ж�������䣩
 * 	��3������ѭ��������
 * 		A:do...while����У�ѭ����������ٱ�ִ��һ��
 * 		B:for��while����У�Ҫ���ж������Ƿ�Ϊtrue�������ж��Ƿ�ִ��ѭ�������
 * 		C:������ѭ������У����ȿ���for��䣬�����while��䣬�����do...while���
 * 	��4��ѭ�����ʹ�õ�ע�����
 * 		A:ע�����������䣬�������������ѭ��
 * 		B:��ѭ���ĸ�ʽ
 * 			a:while��true��{
 * 				...
 * 			}
 * 
 * 			b:for��������{
 * 				...
 * 			}
 * 	��5��ѭ����Ƕ�װ���
 * 		A:���һ���������е�����ͼ��
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 * 		B:����žų˷���
 * 
 * */
public class DoWhileDemo {

	public static void main(String[] args) {
		//��������õ��ı���������ʼ��
		int i = 0, j = 0;
		
		//do...while����ʹ�ð���
		//���10��HelloWorld
		i = 0;
		do {
			System.out.println("HelloWorld");
			i++;
		}while (i<10);
		
		//һ����ѭ���İ���
		/*
		i = 0;
		while (true) {
			System.out.println(i);
			i++;
		}*/
		
		System.out.println("���һ���������е�����ͼ��");
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----");
		
		System.out.println("����žų˷���");
		/*�Ȳ������һ��9x9����������
		for(i = 1; i <10; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		//����������Ͻ����޸�
		for(i = 1; i <10; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(j+"x"+i+"="+j*i);
				System.out.print('\t');
			}
			System.out.println();
		}
		
		
		System.out.println("-----");
		
		
		
	}

}
