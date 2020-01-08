/**
* @author Elvinsys
* @version 2019��3��4�� ����9:21:26
* Description:�����ࣺMyArrayTool�������˰����ĵ�����������
* (��������MyDoc,������������ĵ�)
*/

/*
 *	��1��дһ�������ࣺMyArrayTool
 *		A���������·���
 * 			1����������
 * 			2��ͨ��Ԫ�ز�������
 *	 		3����Ԫ�����ֵ
 * 			4����Ԫ����Сֵ
 *	 	B��Ϊ��ʹ����������ֱ�ӵ��ã���Ա������public static����
 * 		C��Ϊ�˷�ֹ��ʵ�������޲ι��췽����private���Σ����Դ��ι���
 * 	��2�������ĵ�ע��
 *	 	A:�����ĵ���ʽ��	/����......��/
 * 		B:��Ļ�����������һ�����������Ϸ�
 *			1�����ߣ�@author
 *			2���汾��@version
 *			3��������@ClassName
 *			4��������@Description
 *		C:����ʹ�õĹ��򣺣�ÿ���������Ϸ�
 *			1������˵����	@param
 *			2������ֵ˵����	@return		
 */
public class MyArrayTool {
	
	/**
	 *	��ֹ��ʵ�������޲ι�����private����
	 */
	private MyArrayTool() {}

	/**
	 * 	��������ķ���
	 *	@param arr	��Ҫ��������������
	 */
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print("["+arr[i]+"]��");
		}
		System.out.println("");
	}
	
	/**
	 *	ͨ��Ԫ�ز�����ֵ
	 * 	@param arr	���ڵ����������
	 *	@param x		����ֵ������
	 *	@return		int	����ֵ
	 */
	public static int searchIndex(int[] arr, int x) {
		int index = -1;
		for(int i = 0; i<arr.length; i++) {
			if (arr[i] == x) {
				index = i;
				break;
			}
		}
		return index;
	}

	/**
	 *	��Ԫ�����ֵ
	 *	@param arr	�������������
	 *	@return		int	���ֵ
	 */
	public static int searchMax(int[] arr) {
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 *	��Ԫ����Сֵ
	 *	@param arr	�������������
	 *	@return		int	��Сֵ
	 */
	public static int searchMin(int[] arr) {
		int min = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

}





















