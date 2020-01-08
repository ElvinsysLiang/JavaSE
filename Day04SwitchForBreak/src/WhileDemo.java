/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��12�� ����3:06:46
* @ClassName WhileDemo
* @Description ����whileѭ���Ľ��ܼ��÷�
*/

/*	whileѭ��
 *	��1��������ʽ��
 *		while���ж�������䣩{
 *			ѭ�������֣�
 *		} 
 *
 *		��չ��ʽ��
 *		��ʼ����䣻
 *		while���ж�������䣩{
 *			ѭ������䣻
 *			����������䣻
 *		}
 *	��2��whileѭ����forѭ�������Եȼ۽���
 *	��3����for������
 *		a:ʹ���ϵ�����
 *			for���Ŀ���������������ѭ��������Ͳ�����ʹ����
 *			whileѭ���Ŀ��Լ���ʹ��
 *		b:ʹ�õط���һ��
 *			for����ʺ���һ����ȷ��Χ�ڽ����ж�
 *			while�ʺ��ڷ�Χ����������½����ж�
 *	��4��������
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
 *		m:עĿ���������
 *		n:������Ǯ����
 *		
 * 
 * 
 * 
 * */

public class WhileDemo {

	public static void main(String[] args) {
		//������Ҫ�õ��ı���������ʼ��
		int i=0, sum = 0, factorial = 0, high = 0;
		int dig_1 = 0, dig_2 = 0, dig_3 = 0, dig_4 = 0, dig_5 = 0;
		//����for����while������������ʹ��
		for(i=0; i<5;i++) {
			System.out.println("HelloWorld");
		}
		System.out.println("���ʱ��ı���i="+i);
		//���ʱ��i����������main�������ڡ�
		
		//���磬��for�������붨��һ��i������ô��
		//for(int i=0;i<4;i++) {
		//	System.out.println("H2");
		//}
		//������������ϵͳ��������main������������ѭ������ͬ������
		
		//��while������for��䣬�ع����°���
		System.out.println("����a:���10��HelloWorld");
		i = 0;//i��ǰ��ֵ��5��Ϊ�������¼�����iҪ���³�ʼ��Ϊ0
		while (i<5) {
			System.out.println("HelloWorld");
			i++;
		}
		System.out.println("-----");
		
		System.out.println("����b:���1-10������");
		i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----");
		
		System.out.println("����c:���10-1������");
		i = 10;
		while(i >0) {
			System.out.println(i);
			i--;
		}
		System.out.println("-----");
		
		System.out.println("����d:��1-10�ĺ�");
		i = 1;
		sum = 0;
		while (i<=10) {
			sum += i;
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����e:��1-100�ĺ�");
		i = 0;
		sum = 0;
		while (i<=100) {
			sum += i;
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����f:��1-100��ż����");
		i = 0;
		sum = 0;
		while (i<=100) {
			if (i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����g:��1-100��������");
		i = 0;
		sum = 0;
		while (i<=100) {
			if (i%2==1) {
				sum += i;
			}
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����h:��5�Ľ׳�");
		i = 1;
		factorial = 1;
		while (i<=5) {
			factorial *= i;
			i++;
		}
		System.out.println("factorial="+factorial);
		System.out.println("-----");
		
		System.out.println("����i:�ڿ���̨��ӡˮ�ɻ���");
		//ˮ�ɻ���һ����λ���֣�
		//��λ������+ʮλ������+��λ������=�䱾��
		i = 100;
		dig_1 = 0;
		dig_2 = 0;
		dig_3 = 0;
		while (i<1000) {
			dig_1 = i%10;
			dig_2 = i/10%10;
			dig_3 = i/100%10;
			if ((dig_1*dig_1*dig_1+dig_2*dig_2*dig_2+dig_3*dig_3*dig_3)==i) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("-----");
		
		System.out.println("����j:ͳ��ˮ�ɻ�����");
		i = 100;
		sum = 0;
		dig_1 = 0;
		dig_2 = 0;
		dig_3 = 0;
		while (i<1000) {
			dig_1 = i%10;
			dig_2 = i/10%10;
			dig_3 = i/100%10;
			if ((dig_1*dig_1*dig_1+dig_2*dig_2*dig_2+dig_3*dig_3*dig_3)==i) {
				sum++;
			}
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("����k:�Ľ���Ļ�����");
		//һ����λ��
		//��λ = ��λ
		//ʮλ = ǧλ
		//��λ + ʮλ + ǧλ + ��λ = ��λ
		i = 10000;
		sum = 0;
		while (i<=99999) {
			dig_1 = i%10;
			dig_2 = i/10%10;
			dig_3 = i/100%10;
			dig_4 = i/1000%10;
			dig_5 = i/10000%10;
			if ((dig_1==dig_5)&&(dig_2==dig_4)&&((dig_1*2+dig_2*2))==dig_3) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("-----");
		
		System.out.println("����l:ͳ��1-1000֮��ͬʱ�������������������ж��ٸ�");
		//x%3==2
		//x%5==3
		//x%7==2
		i = 1;
		while (i<=1000) {
			if((i%3==2)&&(i%5==3)&&(i%7==2)) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("-----");
		
		System.out.println("����m:�������������");
		//����������8848m������һ���㹻���ֽ�����Ϊ1mm
		//Ҫ�۶��ٴβ��ܵ������������ĸ߶��أ�
		i=0;
		high = 1;//ֽ�ĺ��Ϊ1mm
		
		while (high < 884800) {
			i++;
			high *= 2;
		}
		System.out.println("��Ҫ��"+i+"�Σ��߶�Ϊ"+high);
		System.out.println("-----");
		/*
		System.out.println("����n:С����Ǯ����");
		System.out.println("-----");

		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
