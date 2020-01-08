/**
* @author Elvinsys
* @version 创建时间：2019年1月10日
* @ClassName Annotation
* @Description 注释的介绍和用法
*/

/*	注释(annotation)
 * 	（1）概念：对程序进行解释说明的文字
 * 	（2）分类：
 * 		A:单行注释	//
 * 		B:多行注释	/米......米/ 
 * 			注意：多行注释不能嵌套使用
 * 		C:文档注释	/米米......米/
 * 	（3）注释的作用
 * 		A:解释说明程序，提高代码的阅读性
 * 		B:可以协助调试程序，把不需要的代码行注释，能缩小调试范围
 * 	（4）注释的用法
 * 		参看下面案例
 */

/*	注释使用的案例——HelloWorld程序的注释
 * 	需求：测试Java程序，并在控制台输出HelloWorld字符串
 * 	分析：需要定义类，主方法，输出语句
 * 	实现：
 * 		A:用class定义类
 * 		B:主方法的固定格式为：
 * 			public static void main(String [] args){
 * 				......
 * 			}
 * 		C:输出方法为：
 * 			System.out.println("......");
 * 
 */

//定义一个类
public class Annotation {
	//定义主方法
	public static void main(String [] args) {
		//输出字符串到控制台
		System.out.println("Hello World~");
	}
}
