/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��12�� ����9:26:14
* @ClassName ForDemo
* @Description ����forѭ�����÷��밸����ʾ
*/

/*	forѭ��
 * 	��1����ʽ��
 * 		for����ʼ����䣻�ж�������䣻����������䣩{
 * 			ѭ������䣻
 * 		}
 * 	��2��ִ�����̣�
 * 		A:ִ�г�ʼ�����
 * 		B:ִ���ж��������
 * 			����true�������
 * 			����false�������ѭ��������
 * 		C:ִ��ѭ�������
 * 		D:ִ�п����������
 * 		E:�ص�b
 * 	��3��ע������
 * 		A:�ж�����������ۼ򵥻��Ǹ��ӣ��������boolean
 * 		B:ѭ����������ֻ��һ��������ʡ�Դ����ţ���������
 * 		C:�зݺþ�û��ߴ����ţ�����ߴ����ž�û�зֺ�
 * 	��4������
 * 		a:���10��HelloWorld
 * 		b:���1-10������
 * 		c:���10-1������
 * 		d:��1-10�ĺ�
 * 		e:��1-100�ĺ�
 * 		f:��1-100��ż����
 * 		g:��1-100��������
 * 		h:��5�Ľ׳�
 * 		i:�ڿ���̨��ӡˮ�ɻ���
 * 		j:ͳ��ˮ�ɻ�����
 * 			ˮ�ɻ���һ����λ���֣�
 * 			��λ������+ʮλ������+��λ������=�䱾��
 * 		k:�Ľ���Ļ�����
 * 			һ����λ��
 * 			��λ = ��λ
 * 			ʮλ = ǧλ
 * 			��λ + ʮλ + ǧλ + ��λ = ��λ
 * 		l:ͳ��1-1000֮��ͬʱ�������������������ж��ٸ�
 * 			x%3==2
 * 			x%5==3
 * 			x%7==2
 * */
public class ForDemo {

	public static void main(String[] args) {
		//�������Ҫ�õ��ı���������ʼ��
		int i = 0, sum=0;
		int dig_1=0, dig_2=0, dig_3=0, factorial = 0;
		int dig_4 = 0, dig_5 = 0;
		System.out.println("����a:���10��HelloWorld");
		for(i = 0;i<10;i++) {
			System.out.println("HelloWorld");
		}
		System.out.println("-----");
		
		System.out.println("����b:���1-10������");
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("-----");
		
		System.out.println("����c:���10-1������");
		for(i=10;i>0;i--) {
			System.out.println(i);
		}
		System.out.println("-----");
		
		System.out.println("����d:��1-10�ĺ�");
		sum = 0;
		for(i=1;i<11;i++) {
			sum += i;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����e:��1-100�ĺ�");
		sum = 0;
		for(i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����f:��1-100��ż����");
		sum = 0;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����g:��1-100��������");
		sum = 0;
		for(i=0;i<=100;i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����h:��5�Ľ׳�");
		factorial = 1;
		for(i=1;i<=5;i++) {
			factorial *= i;
		}
		System.out.println("factorial="+factorial);
		System.out.println("-----");
		
		System.out.println("����i:�ڿ���̨��ӡˮ�ɻ���");
		for(i = 100; i < 1000; i++) {
			//dig_1,dig_2,dig_3�ֱ��ʾ��λ��ʮλ����λ
			dig_1 = i%10;
			dig_2 = i/10%10;
			dig_3 = i/100%10;
			if((dig_1*dig_1*dig_1+dig_2*dig_2*dig_2+dig_3*dig_3*dig_3) == i) {
				System.out.println(i);
			}
		}
		System.out.println("-----");
		
		System.out.println("����j:ͳ��ˮ�ɻ�����");
		sum = 0;
		for(i = 100;i < 1000; i++){
			dig_1 = i % 10;
			dig_2 = i / 10 % 10;
			dig_3 = i / 100 % 10;
			if (dig_1*dig_1*dig_1+dig_2*dig_2*dig_2+dig_3*dig_3*dig_3 == i) {
				sum += 1;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����k:�Ľ���Ļ�����");
		//	һ����λ��
		//	��λ = ��λ
		//	ʮλ = ǧλ
		//	��λ + ʮλ + ǧλ + ��λ = ��λ
		sum = 0;
		for(i = 10000; i < 99999; i++) {
			dig_1 = i % 10;
			dig_2 = i / 10 % 10;
			dig_3 = i / 100 % 10;
			dig_4 = i / 1000 % 10;
			dig_5 = i / 10000 % 10;
			if ((dig_1==dig_5) && (dig_2==dig_4) && ((dig_1*2+dig_2*2)==dig_3)) {
				System.out.println(i);
				sum += 1;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		System.out.println("����l:ͳ��1-1000֮��ͬʱ�������������������ж��ٸ�");
		//	x%3==2
		//	x%5==3
		//	x%7==2
		sum = 0;
		for(i=1;i<=1000;i++) {
			if((i%3==2)&&(i%5==3)&&(i%7==2)) {
				System.out.println(i);
				sum += 1;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
	}
}
