/**
* @author Elvinsys
* @version 2019年3月4日 上午9:21:26
* Description:测试类：MyArrayTool，描述了帮助文档的制作方法
* (主方法在MyDoc,如何制作帮助文档)
*/

/*
 *	（1）写一个测试类：MyArrayTool
 *		A：包含以下方法
 * 			1）遍历数组
 * 			2）通过元素查索引号
 *	 		3）查元素最大值
 * 			4）查元素最小值
 *	 	B：为了使得主方法能直接调用，成员方法用public static修饰
 * 		C：为了防止被实例化，无参构造方法用private修饰，忽略带参构造
 * 	（2）加入文档注释
 *	 	A:帮助文档格式：	/星星......星/
 * 		B:类的基本描述：（一般放在类的最上方
 *			1）作者：@author
 *			2）版本：@version
 *			3）类名：@ClassName
 *			4）描述：@Description
 *		C:方法使用的规则：（每个方法的上方
 *			1）参数说明：	@param
 *			2）返回值说明：	@return		
 */
public class MyArrayTool {
	
	/**
	 *	防止被实例化，无参构造用private修饰
	 */
	private MyArrayTool() {}

	/**
	 * 	遍历数组的方法
	 *	@param arr	需要遍历的数组引用
	 */
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print("["+arr[i]+"]、");
		}
		System.out.println("");
	}
	
	/**
	 *	通过元素查索引值
	 * 	@param arr	所在的数组的引用
	 *	@param x		索引值的内容
	 *	@return		int	索引值
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
	 *	求元素最大值
	 *	@param arr	所在数组的引用
	 *	@return		int	最大值
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
	 *	求元素最小值
	 *	@param arr	所在数组的引用
	 *	@return		int	最小值
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





















