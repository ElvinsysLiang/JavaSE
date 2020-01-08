/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��11�� ����2:34:30
* @ClassName IfDemo
* @Description ����if����ѧϰ�ʼ�
*/

/*
 * 	ѡ��ṹ����if���
 * 	��1�����ָ�ʽ��
 * 		A:��ʽһ	�������������жϵ����
 * 			if���Ƚϱ��ʽ��{
 * 				����壻
 * 			}
 * 			ִ�����̣�
 * 			a:	�жϱȽϱ��ʽ��ֵ����true����false
 * 			b:	�����true��ִ�������
 * 				�����false����ִ��
 * 		B:��ʽ��	�������������жϵ����
 * 			if���Ƚϱ��ʽ��{
 * 				�����1��
 * 			} else{
 * 				�����2��
 * 			}
 * 			ִ�����̣�
 * 			a:	�жϱȽϱ��ʽ��ֵ����true����false
 * 			b:	�����true��ִ�������1
 * 				�����false��ִ�������2
 * 		C:��ʽ��	������������жϵ����
 * 			if���Ƚϱ��ʽ1��{
 * 				�����1��
 * 			} else if���Ƚϱ��ʽ2��{
 * 				�����2��
 * 			}
 * 			...
 * 			else{
 * 				�����n��
 * 			}
 * 			ִ�����̣�
 * 			a:	�жϱȽϱ��ʽ1��ֵ����true����false
 * 			b:	�����true��ִ�������1
 * 			c��	�����false�����жϱȽϱ��ʽ����
 * 			d��	�����true��ִ�������2�������ټ����ж�
 * 			...
 * 			������϶���false�������ִ�������n
 * 	��2��ע�����
 * 		A:�Ƚϱ��ʽ���ۼ򵥻��Ǹ��ӣ��������boolean��
 * 		B:if�����Ƶ�����������һ����䣬����ʡ�Դ����ţ�����Ƕ���������ʡ��
 * 			������Զ��Ҫʡ��
 * 		C:����ߴ����ž�û�зֺţ��зֺž�û����ߴ�����
 * 		D:else�������û��ifǶ�ף���û�б��ʽ
 * 		E:����if��ʽ��ֻҪ��һ������屻ִ�У���������彫����ִ��
 * 	��3��������
 * 		A:�Ƚ��������Ƿ����
 * 		B:��ȡ�����������ֵ
 * 		C:��ȡ�����������ֵ��if����Ƕ��ʹ�ã�
 * 		D:���ݳɼ������Ӧ�ĵȼ�
 * 		E:�����·������Ӧ�ļ���
 * 		F:����x�����Ӧy��ֵ�����
 * 	��4����Ŀ�������if���֮��Ĺ�ϵ
 * 		if������滻��Ŀ�����������Ŀ������޷��滻���е�if���
 * 		�磺if���ڶ��ָ�ʽ���Ƶ��������䣬���޷�����Ŀ������滻
 * */
public class IfDemo {
	public static void main(String [] args) {
		//��������õ��ı���������ʼ��
		int x = 0, y = 0;
		int a = 0, b = 0, c = 0;
		int max = 0;
		
		//if����ʽ1
		x = 5;
		if(x > 0) {
			System.out.println("x����0");//��������
		}
		//if����ʽ2
		x = 5;
		if(x < 0) {//����������
			System.out.println("xС��0");
		} else {
			System.out.println("x����0");
		}
		//if����ʽ3���Ľ�����Ĵ���
		x = 5;
		if(x < 0) {
			System.out.println("xС��0");
		} else if(x == 0) {
			System.out.println("x����0");
		} else {
			System.out.println("x����0");
		}
		System.out.println("---------------");
		System.out.println("����A:�Ƚ��������Ƿ����");
		x = 4;
		y = 5;
		System.out.println("x="+x+" y="+y);
		if(x == y) {
			System.out.println("x����y");
		} else {
			System.out.println("x������y");
		}
		System.out.println("---------------");
		System.out.println("����B:��ȡ�����������ֵ");
		//��if���ʵ��
		x = 4;
		y = 5;
		max = 0;
		if(x > y) {
			max = x;
		} else {
			max = y;
		}
		System.out.println("max="+max);
		//����Ŀ�����ʵ��
		x = 4;
		y = 5;
		max = (x > y)?x:y;
		System.out.println("max="+max);
		System.out.println("---------------");
		System.out.println("����C:��ȡ�����������ֵ��if����Ƕ��ʹ�ã�");
		//��if�������ָ�ʽ��if����Ƕ��ʵ��
		a = 4;
		b = 5;
		c = 7;
		max = 0;
		if(a > b) {
			if(a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if(b > c) {
				max = b;
			} else {
				max =c;
			}
		}
		System.out.println("max="+max);
		System.out.println("---------------");
		System.out.println("����D:���ݳɼ������Ӧ�ĵȼ�");
		/*	90-100	����
		 *	80-90	����
		 *	70-80	�е�
		 *	60-70	����
		 *	0-60	������
		 *	������if���ĵ����ָ�ʽʵ��
		 */
		a = 87;
		if((a >= 90) && (a <= 100)) {
			System.out.println("��ĳɼ���"+a+"����������");
		} else if((a >= 80) && (a < 90)) {
			System.out.println("��ĳɼ���"+a+"����������");
		} else if((a >= 70) && (a < 80)) {
			System.out.println("��ĳɼ���"+a+"�������е�");
		} else if((a >= 60) && (a < 70)) {
			System.out.println("��ĳɼ���"+a+"�����ڼ���");
		} else if((a >= 0) && (a < 60)) {
			System.out.println("��ĳɼ���"+a+"�����ڲ�����");
		} else {
			System.out.println("������ĳɼ�����");
		} 
		System.out.println("---------------");
		System.out.println("����E:�����·������Ӧ�ļ���");
		/*
		 * 	����	3,4,5��
		 * 	�ļ�	6,7,8��
		 * 	�＾	9,10,11��
		 * 	����	12,1,2��
		 * */
		x = 1;
		if((x == 3) || (x == 4) || (x == 5)) {
			System.out.println("���·��Ǵ���");
		} else if((x == 6) || (x == 7) || (x == 8)) {
			System.out.println("���·����ļ�");
		} else if((x == 9) || (x == 10) || (x == 11)) {
			System.out.println("���·����＾");
		} else if((x == 12) || (x == 1) || (x == 2)) {
			System.out.println("���·��Ƕ���");
		} else {
			System.out.println("û������·�");
		}
		System.out.println("---------------");
		System.out.println("����F:����x�����Ӧy��ֵ�����");
		/*
		 * 	x>=3	y = 2x + 1
		 * 	-1<=x<3	y = 2x
		 * 	x<-1	y = 2x - 1
		 * */
		x = 4;
		y = 0;
		if(x >= 3) {
			y = 2 * x + 1;
		} else if((x >= -1) && (x < 3)) {
			y = 2 * x;
		} else {
			y = 2 * x - 1;
		}
		System.out.println("y="+y);
		System.out.println("---------------");
	}
}
