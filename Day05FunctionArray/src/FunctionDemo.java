/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��13�� ����2:10:05
* @ClassName ��FunctionDemo
* @Description ���ڷ����Ľ��ܺ��÷�
*/

/*	������Function��
 * 	��1����������ض����ܵĴ���顣
 *			 �ܶ����������汻��Ϊ����	
 * 	��2����ʽ��
 * 		���η�   ����ֵ����   ����������������   ������...��{
 * 			�����壻
 * 			return����ֵ��
 * 		}
 * 	��3����ʽ�����
 * 		���η���public private protected static
 * 		����ֵ���ͣ������ض��������������
 * 		�������ͣ�����������
 * 		����������ʽ�����ı�����
 * 		�������ࣺ
 * 			ʵ�Σ�ʵ�ʲ������������
 * 			�βΣ������϶���ģ����ڽ���ʵ�ʲ����ı���
 * 		return�����ڷ��ؽ��������������
 * 		����ֵ��ͨ��return���ص�����
 * 	��4��������ȷ��
 * 		����һ�㲻д������������
 * 		����ֵ���ͣ�������ݵ�����
 * 		�����б������ĸ������Լ���Ӧ����������
 * 	��5����������
 * 		A:����ȷ����ֵ�ķ���
 * 			a:�������ã�û������
 * 			b:������ã���һ���ܺ�
 * 			c:��ֵ���ã��ѽ�����ش���һ������
 * 		B:void�������εķ���
 * 			a:ֻ�ܵ�������
 * 	��6��������ע������
 * 		A:�����ȵ��þͲ�ִ��
 * 		B:����֮����ƽ����ϵ������Ƕ�׶���
 * 		C:���������ʱ�򣬲������á��������Ÿ���
 * 		D:�����ڵ��õ�ʱ�򣬲��ô�����������
 * 		E:�����������ȷ�ķ���ֵ���ͣ��ͱ�����return��䷵��
 * 	��7����������
 * 		��ͬһ�����У���������ͬ�������б�ͬ���뷵��ֵ��ء�
 * 		�����б�ָͬ���ǣ�
 * 			a:�����ĸ�����ͬ
 * 			b:������Ӧ���������Ͳ�ͬ
 * 	��8��������
 * 		1.���������
 * 		2.�Ƚ��������еĽϴ�ֵ
 * 		3.�Ƚ����������Ƿ���ͬ
 * 		4.�Ƚ��������е����ֵ
 * 		5.���m��n�е�����
 * 		6.���n n�˷���
 * */
public class FunctionDemo {

	public static void main(String[] args) {
		
		//����Ҫ�õ��ı���������ʼ��
		int a = 0, b = 0, c = 0;
		int sum = 0, max = 0, m = 0, n = 0;
		
		System.out.println("����1.���������");
		a = 90;
		b = 11;
		sum = addFun(a,b);
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����2.�Ƚ��������еĽϴ�ֵ");
		a = 22;
		b = 144;
		max = maxFun(a,b);
		System.out.println("max="+max);
		System.out.println("-----");
		 
		System.out.println("����3.�Ƚ����������Ƿ���ͬ");
		a = 33;
		b = 33;
		equ(a,b);
		System.out.println("-----");
		 
		System.out.println("����4.�Ƚ��������е����ֵ����������");
		a = 11;
		b = 22;
		c = 33;
		max = max(a,b,c);
		System.out.println("max="+max);
		System.out.println("-----");
		
		System.out.println("����5.���m��n�е�����");
		m = 4;
		n = 6;
		star(m,n);
		System.out.println("-----");
		
		System.out.println("����6.���n n�˷���");
		n = 7;
		mult(n);
		System.out.println("-----");
		
	}
	
	//����1.���������
	public static int addFun(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	//����2.�Ƚ��������еĽϴ�ֵ
	public static int maxFun(int a, int b) {
		int max = ((a>b)?a:b);
		return max;
	}
	
	//����3.�Ƚ����������Ƿ���ͬ
	public static void equ(int a, int b) {
		if (a == b) {
			System.out.println(a+" equal "+b);
		} else {
			System.out.println(a+" not equal "+b);
		}
	}
	//����4.�Ƚ��������е����ֵ����������
	public static int max(int a, int b, int c) {
		int max = 0;
		if(a>b) {
			if(a>c) {
				max = a;
			}else {
				max = c;
			}
		}else {
			if(b>c) {
				max = b;
			}else {
				max = c;
			}
		}
		return max;
	}
	//����5.���m��n�е�����
	public static void star(int m, int n) {
		for(int i = 0; i < m; i++ ) {
			for(int j = 0; j < n; j++) {
				System.out.print("*"+'\t');
			}
			System.out.println();
		}
	}
	//����6.���n n�˷���
	public static void mult(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+j*i+'\t');
			}
			System.out.println();
		}
	}

}
