/**
* @author Elvinsys
* @version 2019��3��4�� ����8:31:26
* Description:�����ĵ���������ʹ��
*/

/*
 * 	������������ĵ�
 * 	��1��дһ�������ࣺMyArrayTool
 *	 	A���������·���
 * 			1����������
 * 			2��ͨ��Ԫ�ز�������
 *	 		3����Ԫ�����ֵ
 * 			4����Ԫ����Сֵ
 *	 	B��Ϊ��ʹ����������ֱ�ӵ��ã���Ա������public static����
 * 		C��Ϊ�˷�ֹ��ʵ�������޲ι��췽����private���Σ����Դ��ι���
 * 	��2�������ĵ�ע��
 * 		A:�����ĵ���ʽ��	/����......��/
 * 		B:��Ļ�����������һ�����������Ϸ�
 *			1�����ߣ�@author
 *			2���汾��@version
 *			3��������@ClassName	���޷���javadoc����
 *			4��������@Description	���޷���javadoc����
 *		C:����ʹ�õĹ��򣺣�ÿ���������Ϸ�
 *			1������˵����	@param
 *			2������ֵ˵����	@return			
 * 	��3��ͨ��javadoc�������ɣ�
 * 		A:�����ͨ������̨���ɣ���ʽ���£�
 * 			javadoc -d dir -author -version xxx.java
 * 		B:�����ͨ��eclipse����
 * 			�Ҽ���Ŀ->export->Java->JavaDoc->
 * 				ѡ��jdk�е�bin\javadoc.exe
 * 				ѡ��doc�ļ�����ĵط�
 * 		C:�鿴doc�ļ��е�index.html�ļ�
 */

public class MyDoc {

	public static void main(String[] args) {
		P.i("����һ��һά����");
		int arr[] = {11,22,33,44,55};
		P.i("�������һά����");
		MyArrayTool.printArray(arr);
		P.i("����Ϊ44������ֵΪ��"+
				MyArrayTool.searchIndex(arr, 44));
		P.i("���ֵΪ��"+MyArrayTool.searchMax(arr));
		P.i("��СֵΪ��"+MyArrayTool.searchMin(arr));
		
	}

}


















