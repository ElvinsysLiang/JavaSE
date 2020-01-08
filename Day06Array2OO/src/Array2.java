/**
* @author Elvinsys
* @version ����ʱ�䣺2019��2��21�� ����10:51:14
* @ClassName Array2
* @Description ��ά�����ʹ�÷���
*/

/*	��ά����
 *	��1�����Ԫ����һά��������顣
 *	��2����ʽ��
 *		A:��������[][] ������ = new ��������[m][n];
 *		B:��������[][] ������ = new ��������[m][];
 *		C:��������[][] ������ = new ��������[][]{{...},{...}};
 *		D:��������[][] ������ = {{...},{...}};
 *	��3��ע�����¶��������
 *		A:	int x;			//��������x
 *		B:	int x, y;		//��������x������y
 *		C:	int[] x, y[];	//����һά����x�Ͷ�ά����y
 *	��3��������
 *		A:��ά����ı���
 *		B:��ά��������
 *		C:�������(�÷�������д��
 *	
 */
public class Array2 {

	public static void main(String[] args) {
		//���������Ҫ�õ��ı���
		int sum = 0;
		ptf("���ø�ʽ1����̬��ʼ��������һ����ά����int[3][2]");
		//�ö�ά����������һά���飬ÿ��һά������2��Ԫ��
		int[][] array2Int1 = new int[3][2];
		ptf("�����ά����ĵ�ַ");
		System.out.println(array2Int1);
		ptf("�����һ��һά����ĵ�ַ");
		System.out.println(array2Int1[0]);
		ptf("����ڶ���һά����ڶ���Ԫ��");
		System.out.println(array2Int1[1][1]);
		ptc();
		
		ptf("���ø�ʽ2����̬��3��һά�������ռ䣬Ԫ�ظ����ֱ���2,3,1");
		int [][] array2Int2 = new int[3][];
		ptf("�����ά����ĵ�ַ");
		System.out.println(array2Int2);
		ptf("�����һ��һά����ĵ�ַ");
		System.out.println(array2Int2[0]);
		ptf("������һά������ж�̬��ʼ��");
		array2Int2[0] = new int[2];
		array2Int2[1] = new int[3];
		array2Int2[2] = new int[1];
		ptf("�������һ��һά����ĵ�ַ");
		System.out.println(array2Int2[0]);
		ptf("����ڶ���һά����ĵڶ���Ԫ��ֵ");
		System.out.println(array2Int2[1][1]);
		ptf("��������ά���鸳ֵ");
		array2Int1[0][0] = 6;
		array2Int1[0][1] = 5;
		array2Int1[1][0] = 4;
		array2Int1[1][1] = 3;
		array2Int1[2][0] = 2;
		array2Int1[2][1] = 1;
		
		array2Int2[0][0] = 66;
		array2Int2[0][1] = 55;
		array2Int2[1][0] = 44;
		array2Int2[1][1] = 33;
		array2Int2[1][2] = 22;
		array2Int2[2][0] = 11;
		ptc();
		
		ptf("ʹ�ø�ʽ4����̬��ʼ��һ����ά����");
		int[][] array2Int3 = {{111,222},{333,444},{555,666}};
		ptc();
		
		ptf("��printArray2����������1����ά����");
		printArray2(array2Int1);
		ptf("������2����ά����");
		printArray2(array2Int2);
		ptf("������3����ά����");
		printArray2(array2Int3);
		ptc();
		
		ptf("���㹫˾�������ܺͣ��������£�����Ԫ��");
		ptf("��һ���ȣ�22,66,44");
		ptf("�ڶ����ȣ�77,33,88");
		ptf("�������ȣ�25,45,65");
		ptf("���ļ��ȣ�11,66,99");
		ptf("�ȴ���һ����ά�������������");
		int[][] array2Int4 = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		ptf("�÷���getSum()������ܺ�");
		sum = getSum(array2Int4);
		System.out.println("��˾�������ܶ�Ϊ��"+sum);
		ptc();
	}
	
	public static void ptf(String info) {
		//���ע�͵ķ���
		System.out.println(info);
	}
	
	public static void ptc() {
		//����ָ����ķ���
		System.out.println("---------------");
	}
	
	public static void printArray2(int[][] arr) {
		//������ά����ķ���
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	public static int getSum(int[][] arr) {
		//�����Ͷ�ά�����ܺ͵ķ���
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
}

















