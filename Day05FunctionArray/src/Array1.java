/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��13�� ����5:08:24
* @ClassName Array1
* @Description ����ĸ���Լ�һά������÷�
*/

/*	����
 *	��1������洢ͬһ���������͵Ķ��Ԫ�ص�������
 *	��2���ص㣺��һ��Ԫ�ض��б�ţ���0��ʼ�����ı�ţ�������������-1��
 *	��3����ʽ��
 *		A:��������[ ] ��������//�Ƽ���������������
 *		B:�������� ������[ ]��//��ǰc���Ի��������Եĸ�ʽ
 *	��4������ĳ�ʼ��
 *		A:��̬��ʼ��
 *			�������ȣ�ϵͳ��ÿ����������Ĭ��ֵ
 *			�磺int[] arr = new int[3];
 *		B:��̬��ʼ��
 *			������ֵ��ϵͳ���о�������
 *			�磺int[] arr = new int[]{1,2,3};
 *			���ߣ�int[] arr = {1,2,3};//�Ƽ������ַ���
 *	��5��Java���ڴ����
 *			A:ջ
 *				a:�洢�ֲ�����������ʹ����ϣ�����ʧ��
 *				b:�ֲ������Ƿ���������߷��������϶���ı���
 *			B:��	
 *				a:�洢����new�����Ķ�����ÿһ��new�����Ķ��е�ַ
 *				ջ�еı�������Ĭ��ֵ
 *				byte,short,int,long	0
 *				float,double		0.0
 *				char,				'\u0000'
 *				boolean				false
 *				��������				null
 *				b:������������������������ж��ڻ��ա�
 *			C:��������������󲿷���ϸ���⣩
 *			D:���ط�������ϵͳ��أ�
 *			E:�Ĵ�����CPUʹ�ã�
 *	��6�������ڴ�ͼ
 *		һ�����飬�������飬�������飨����ջ����ֻ��ͬһ�����ڴ棩
 *	��7������ĳ�������
 *		A:����
 *			a:��ʽ1
 *			b:��ʽ2
 *		B:��ֵ
 *			a:���ֵ
 *			b:��Сֵ
 *		C:����
 *			a:��ʽ1
 *			b:��ʽ2
 *		D:ͨ������������
 *		E:ͨ�����ݲ�����
 *			a:��ʽ1
 *			b:��ʽ2
 *
 * */
public class Array1 {

	public static void main(String[] args) {
		//������Ҫ�õ��ı���
		int max = 0, min = 0, result = 0, index = 0;
		//�ö�̬��ʼ��������һ����3��Ԫ�ص�intһά����
		int[] array1Int_1 = new int[3];
		//��ʾ������ĵ�ַ���Լ�����Ԫ�صĳ�ʼ��ֵ
		System.out.println(array1Int_1);
		System.out.println(array1Int_1[0]);
		System.out.println(array1Int_1[1]);
		System.out.println(array1Int_1[2]);
		array1Int_1[0] = 4;
		array1Int_1[1] = 5;
		array1Int_1[2] = 6;
		//System.out.println("-----");
		//д�˸�����ptc�������Ϸָ���
		ptc();
		//�ñ�������1����������
		printArray1_1(array1Int_1);
		ptc();
		
		//�þ�̬��ʼ��������һ����5��Ԫ�ص�intһά����
		int[] array1Int_2 = new int[]{3,4,5,6,7};
		//�ñ�������2����������
		printArray1_2(array1Int_2);
		ptc();
		
		//�ҳ���������ֵ
		max = getMax(array1Int_2);
		System.out.println("max="+max);
		ptc();
		//�ҳ���������ֵ
		min = getMix(array1Int_2);
		System.out.println("mix="+min);
		ptc();
		
		//��������ԭ����˳��
		printArray1_2(array1Int_2);
		//���򷽷�1
		reverse1(array1Int_2);
		//�ٱ���
		printArray1_2(array1Int_2);
		ptc();
		//���򷽷�2
		reverse2(array1Int_2);
		printArray1_2(array1Int_2);
		ptc();
		
		//���������Ų�������
		result = getData(array1Int_2, 2);
		System.out.println("�ҵ��������ǣ�"+result);
		ptc();

		//�������ݣ���������ֵ
		System.out.println("�����Ѳ�����5...");
		getIndex_1(array1Int_2, 5);
		ptc();
		
		//���÷�ʽ�������ܷ��ص�����ֵ
		System.out.println("������������4...");
		index = getIndex_2(array1Int_2, 4);
		if (index != -1) {
			System.out.println("�ҵ���������ֵ������4������ֵΪ��" + index);
		} else {
			System.out.println("û�ҵ���Ӧ���ݵ�����ֵ��");
		}
		
		
	}
	
	//�ָ��
	public static void ptc() {
		System.out.println("-----");
	}
	
	//��������ķ���1
	public static void printArray1_1(int arr[]) {
		System.out.println("��������һ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//��������ķ���2
	public static void printArray1_2(int arr[]) {
		System.out.println("������������");
		for (int i = 0; i < arr.length; i++) {
			if (i==0) {
				System.out.print("[ ");
			}
			System.out.print(arr[i]+" ");
			if (i==(arr.length)-1) {
				System.out.print("]");
			}
		}
		System.out.println();
	}
	//���������ֵ�ķ���
	public static int getMax(int array[]) {
		System.out.println("�����ֵ������");
		int i = 0, max = 0;
		for (i = 0; i < array.length; i++) {
			if(i==0) {
				max = array[i];
				continue;
			}
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	//���������Сֵ�ķ���
	public static int getMix(int array[]) {
		System.out.println("����Сֵ������");
		int i = 0, min = 0;
		for (i = 0; i < array.length; i++) {
			if(i==0) {
				min = array[i];
				continue;
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	//������������򷽷�1
	public static void reverse1(int array[]) {
		System.out.println("�������з���1");
		int i = 0, temp = 0;
		for(i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
	}
	//������������򷽷�2
	public static void reverse2(int array[]) {
		System.out.println("�������з���2");
		int temp = 0;
		for(int start = 0, end = array.length-1; start<end;start++,end--) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
		}
	}
	//ͨ������ֵ��������
	public static int getData(int array[], int index){
		int result = 0;
		if((index>=0)|(index<array.length)) {
			System.out.println("���ڲ��ҵ�"+index+"��Ԫ��");
			result = array[index];
		} else {
			System.out.println("��������������Ŵ���");
			result = -1;
		}
		return result;
	}
	//ͨ�����ݲ�������ֵ�ķ���1
	public static void getIndex_1(int array[], int data) {
		for(int i = 0; i < array.length;i++) {
			if(array[i] == data) {
				System.out.println("����"+data+"������ֵΪ"+i);
				break;
			}
			if(i==array.length-1) {
				System.out.println("û�ҵ�������ݵ�����ֵ");
			}
		}
	}
	//ͨ�����ݲ�������ֵ�ķ���2
	public static int getIndex_2(int array[], int data) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == data) {
				index = i;
				break;
			}
		}
		return index;
	}

}


