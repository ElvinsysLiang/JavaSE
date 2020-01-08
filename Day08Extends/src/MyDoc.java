/**
* @author Elvinsys
* @version 2019年3月4日 上午8:31:26
* Description:帮助文档的制作和使用
*/

/*
 * 	如何制作帮助文档
 * 	（1）写一个测试类：MyArrayTool
 *	 	A：包含以下方法
 * 			1）遍历数组
 * 			2）通过元素查索引号
 *	 		3）查元素最大值
 * 			4）查元素最小值
 *	 	B：为了使得主方法能直接调用，成员方法用public static修饰
 * 		C：为了防止被实例化，无参构造方法用private修饰，忽略带参构造
 * 	（2）加入文档注释
 * 		A:帮助文档格式：	/星星......星/
 * 		B:类的基本描述：（一般放在类的最上方
 *			1）作者：@author
 *			2）版本：@version
 *			3）类名：@ClassName	（无法被javadoc解析
 *			4）描述：@Description	（无法被javadoc解析
 *		C:方法使用的规则：（每个方法的上方
 *			1）参数说明：	@param
 *			2）返回值说明：	@return			
 * 	（3）通过javadoc工具生成，
 * 		A:如果是通过控制台生成，格式如下：
 * 			javadoc -d dir -author -version xxx.java
 * 		B:如果是通过eclipse生成
 * 			右键项目->export->Java->JavaDoc->
 * 				选择jdk中的bin\javadoc.exe
 * 				选择doc文件保存的地方
 * 		C:查看doc文件中的index.html文件
 */

public class MyDoc {

	public static void main(String[] args) {
		P.i("创建一个一维数组");
		int arr[] = {11,22,33,44,55};
		P.i("遍历这个一维数组");
		MyArrayTool.printArray(arr);
		P.i("内容为44的索引值为："+
				MyArrayTool.searchIndex(arr, 44));
		P.i("最大值为："+MyArrayTool.searchMax(arr));
		P.i("最小值为："+MyArrayTool.searchMin(arr));
		
	}

}


















