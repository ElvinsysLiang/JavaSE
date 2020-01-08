/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��10��
* @ClassName Operator
* @Description ������ĸ������
*/

/*	�����
 * 	��1������Գ����ͱ������в����ķ���
 * 	��2�����ࣺ�������������ֵ��������Ƚ���������߼��������λ���������Ŀ�����
 * 	��3�����������
 * 		A:+��-��*��/��%��++��--
 * 		B:+���÷���
 * 			a:�Ӻ�
 * 			b:����
 * 			c:�ַ����ӷ�
 * 		C:/��%������
 * 			������������ʱ����/ȡ�̣���%ȡ��
 * 		D:++��--���÷�
 * 			a:�����������Լ�
 * 			b:�÷�
 * 				����ʹ��ʱ�������������ǰ�����棬Ч��һ��
 * 					�磺a++����++a��Ч��һ��
 * 				�������ʱ	����ǰ�棬�������Լ��ٲ�������
 * 						�磺	int a =10;
 * 							int b = ++a;//a=11,b=11
 * 						���ں��棬��ԭ�������ݲ������㣬�������Լ�
 * 						�磺	int a = 10;
 * 							int b = a++;//a=11,b=10
 * 	��4����ֵ�����
 * 		A:=��+=��-=��*=��/=��%=
 * 		B:=������ֵ�������������ĸ�ֵ�����
 * 			�磺int a=10;//��10��ֵ��int���͵ı���a
 * 		C:��չ�ĸ�ֵ��������ص㣺�������Զ�ǿ��ת��
 * 		D:�����⣺�������δ��룬�Ķλ������
 * 			short s =1;
 * 			s = s + 1;
 * 			//����short���͵�s���������ǣ�����ת��Ϊint
 * 			//�����Ľ��Ϊint���޷���ֵ��short���͵�s
 * 
 * 			short s = 1;
 * 			s += 1;
 * 			//��������չ��+=��������ǿ������ת��
* 			//�ڶ��д���ȼ��ڣ�s = (short)(s+1)
 * 	��5���Ƚ������
 * 		A:==����=��>��>=��<��<=
 * 		B:������������˱��ʽ�Ǽ򵥻��Ǹ��ӣ����ս����boolean������
 * 		C:ǧ��Ҫ�ѡ�==��д�ɡ�=������=���Ǹ�ֵ����������ǱȽ������
 * 	��6���߼������
 * 		A:&��|��^������&&��||
 * 		B:�߼������������������boolean�ı��ʽ���ʶ��
 * 		C:�ص㣺
 * 			&����false��false
 * 			|����true��true
 * 			^����ͬ��false����ͬ��true
 * 			������true��false����false��true
 * 			&&�����ж�·Ч����&������һ�����ʽ��false���Ͳ���������ļ���
 * 			||�����ж�·Ч����|������һ�����ʽ��true���Ͳ���������ļ���
 * 	��7��λ�����
 * 		A:^���÷���һ�����ݶ�����һ���������2�Σ����ݲ���
 * 		B:������
 * 			a:ʵ���������������ݽ���(���ַ�����
 * 				���õ���������
 * 				��λ���	���a,b,a	�ұ�a^b
 * 			b:������Ч�ķ�ʽ����2����8�Ľ��	2<<3
 * 	��8����Ŀ�����
 * 		A:��ʽ	�Ƚϱ��ʽ�����ʽ1�����ʽ2
 * 		B:ִ�����̣�
 * 			���ȼ���Ƚϱ��ʽ��ֵ
 * 			�����true�����ر��ʽ1�Ľ����
 * 			�����false�����ر��ʽ2�Ľ��
 * 		C:������
 * 			a:�Ƚ����������Ƿ����
 * 			b:��ȡ���������е����ֵ
 * 			c:��ȡ���������е����ֵ
 * 
 * 
 * 
 * */
public class Operator {
	public static void main(String [] args) {
		//��������õ��ı���,�����г�ʼ��
		int x1=0, x2=0, x3=0, x4=0;
		int a=0,b=0,c=0;
		int y1=0, max = 0;
		boolean flag = true;
		
		//��ʾ���������,+-*/%���÷�
		x1 = 3;
		x2 = 4;
		System.out.println(x1+x2);//7
		System.out.println(x1-x2);//-1
		System.out.println(x1*x2);//12
		System.out.println(x1/x2);//0
		System.out.println(x1%x2);//3
		
		//���γ������Σ�ֻ�ܵõ����Σ���Ҫ�õ�С�������Ը���
		System.out.println(x1*1.0/x2);//0.75
		
		//��ʾ+������
		//�����ַ�����ƴ��
		System.out.println("x1="+x1);//x1=3
		//�������������
		System.out.println(x1+x2);//7
		
		//++����ʹ���ǣ����ս��û������
		x1 = 1;
		x1++;
		System.out.println(x1);//2
		x1 = 1;
		++x1;
		System.out.println(x1);//2
		
		//++��������󣬽���Ͳ�һ��
		x1 = 1;
		x2=x1++;
		System.out.println(x2);//1
		x1 = 1;
		x2=++x1;
		System.out.println(x2);//2
		
		//++,--����ϰ
		x1 = 3;
		x2 = 4;
		x3 = ++x1;
		x4 = x2--;
		System.out.println(x1);//4
		System.out.println(x2);//3
		System.out.println(x3);//4
		System.out.println(x4);//4
		System.out.println("---------------");
		
		//��ʾ�����������=��+=��-=��*=��/=��%=���÷�
		//x2 += x1���ȼ��ڣ�x2 = x2 + x1
		x1 = 5;
		x2 = 6;
		x1 += x2;//x1=x1+x2
		System.out.println(x1);//11
		x1 = 5;
		x2 = 6;
		x1 -= x2;//x1=x1-x2
		System.out.println(x1);//-1
		x1 = 5;
		x2 = 6;
		x1 *= x2;//x1=x18x2
		System.out.println(x1);//30
		x1 = 5;
		x2 = 6;
		x1 /= x2;//x1=x1/x2
		System.out.println(x1);//0
		x1 = 5;
		x2 = 6;
		x1 %= x2;//x1=x1%x2
		System.out.println(x1);//5
		System.out.println("---------------");
		
		//���´�����ʾ�Ƚ��������������
		x1 = 3;
		x2 = 4;
		x3 = 3;
		
		System.out.println(x1 == x2);//false
		System.out.println(x1 == x3);//true
		System.out.println((x1+x2) == (x1+x3));//false
		System.out.println(x1 != x3);//false
		System.out.println(x1 > x2);//false
		System.out.println(x1 >= x2);//false
		System.out.println(x1 < x2);//true
		System.out.println(x1 <= x2);//true
		
		//flag = (x1 = x2)�������Ų���һ��boolean�����ݣ����ܸ�ֵ��flag
		flag = (x1 == x2);//��ȷ
		
		x1 = (x3 = x2);
		System.out.println(x1);//4
		System.out.println(x2);//4
		System.out.println(x3);//4
		
		//�߼���������÷���ʾ
		a = 3;
		b = 4;
		c = 5;
		
		//&�߼���
		System.out.println((a > b) & (a > c)); //false & false = false
		System.out.println((a > b) & (a < c)); //false & true = false
		System.out.println((a < b) & (a > c)); //true & false = false
		System.out.println((a < b) & (a < c)); //true & true = true
		
		//|�߼���
		System.out.println((a > b) | (a > c)); //false | false = false
		System.out.println((a > b) | (a < c)); //false | true = true
		System.out.println((a < b) | (a > c)); //true | false = true
		System.out.println((a < b) | (a < c)); //true | true = true
		
		//^�߼����
		System.out.println((a > b) ^ (a > c)); //false ^ false = false
		System.out.println((a > b) ^ (a < c)); //false ^ true = true
		System.out.println((a < b) ^ (a > c)); //true ^ false = true
		System.out.println((a < b) ^ (a < c)); //true ^ true = false
		
		//!�߼���
		System.out.println(!(a > b)); //!false = true
		System.out.println(!(a < b)); //!true = false
		System.out.println(!!(a > b)); //!!false = false
		System.out.println(!!!(a > b)); //!!false = true
		
		//&&˫��
		System.out.println((a > b) && (a > c)); //false && false = false
		System.out.println((a > b) && (a < c)); //false && true = false
		System.out.println((a < b) && (a > c)); //true && false = false
		System.out.println((a < b) && (a < c)); //true && true = true
		
		x1 = 3;
		y1 = 4;
		
		//boolean b1 = ((x++ == 3) & (y++ == 4));
		//boolean b1 = ((x++ == 3) && (y++ == 4));
		//boolean b1 = ((++x == 3) & (y++ == 4));
		flag = ((++x1 == 3) && (y1++ == 4));
		System.out.println("x1:"+x1);
		System.out.println("y1:"+y1);//y1���ᷢ������
		System.out.println(flag);
		System.out.println("---------------");
		
		//λ�����������
		a = 3;
		b = 4;
		
		System.out.println(3 & 4);//0
		//0011	&	0100	=	0000
		System.out.println(3 | 4);//0111,7
		System.out.println(3 ^ 4);//0111,7
		System.out.println(~3);//1100,-4,���λ�Ƿ���λ
		
		//^���÷���һ�����ݶ���һ������������Σ�����������
		a = 10;
		b = 20;
		System.out.println(a^b^b);//10
		System.out.println(a^b^a);//20
		
		//�����⣺ʵ�����α��������ݽ���
		//����1�����õ������������н���
		a = 10;
		b = 20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		c = a;
		a = b;
		b = c;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("---");
		//����2�����������������н���
		a = 10;
		b = 20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("---");
		//����3�����ñ�����Ӽ����н���
		a = 10;
		b = 20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("---");
		//����4������3�ĸĽ�
		a = 10;
		b = 20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a = (a+b)-(a=b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("---------------");
		
		//��Ŀ�����
		a = 4;
		b = 5;
		c = (( a > b ) ? ( a - b ) : ( a + b ));
		System.out.println(c);//9
		
		//��ϰ1������Ŀ�������ȡ�����������ֵ
		a = 4;
		b = 5;
		max = 0;
		max = ((a>b) ? a : b);
		System.out.println("max="+max);//5
		
		//��ϰ2������Ŀ�������ȡ�����������ֵ
		//����1�����������ȱȽ������������ѽ���ݴ棬�ٺ͵������Ƚ�
		a = 4;
		b = 5;
		c = 6;
		max = 0;
		max = ((a>b) ? a : b);
		max = ((max>c) ? max : c);
		System.out.println("max="+max);//6
		//����2��һ�д�����ɣ������Ƽ���������
		a = 4;
		b = 5;
		c = 6;
		max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("max="+max);//6
		//max = (((a>b) ? a : b) > c) ? (((a>b) ? a : b) : c);
		//����������������
	}
}
