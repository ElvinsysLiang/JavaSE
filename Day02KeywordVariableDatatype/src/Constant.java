/**
* @author Elvinsys
* @version 创建时间：2019年1月10日
* @ClassName Constant
* @Description 常量的介绍和用法，以及进制的概念
*/

/*	常量(Constant)
 * 	（1）概念：在程序执行的过程中，其值不会发生变化的量
 * 	（2）分类：
 * 		A:字面值常量
 * 		B:自定义常量
 * 	（3）字面值常量：
 * 		A:字符串常量；如："hello"
 * 		B:证书常量；如：12
 * 		C:小数常量；如：12.44
 * 		D:字符常量；如：'A'
 * 		E:布尔常量；如：true
 * 		F:空常量；如：null
 * 	（4）针对整数常量提供的四种表现形式
 * 		A:二进制		0,1组成，以0b开头；如：0b1001
 * 		B:八进制		0,1，...，7组成，以0开头；如：01101
 * 		C:十进制		0,1，...，9组成，整数默认为十进制
 * 		D:十六进制	0,1，...，a，...，f组成，以0x开头；如：0x10b1
 * 	（5）进制转换(了解)
 *		(1)其他进制到十进制
 *			系数：就是每一个位上的数值
 *			基数：x进制的基数就是x
 *			权：对每一个位上的数据，从右，并且从0开始编号，对应的编号就是该数据的权。
 *			结果：系数*基数^权次幂之和。
 *		(2)十进制到其他进制
 *			除基取余，直到商为0，余数反转。
 *		(3)进制转换的快速转换法
 *			A:十进制和二进制间的转换
 *				8421码。
 *			B:二进制到八进制，十六进制的转换
 */
public class Constant {
	public static void main(String [] args) {
		//输出字符串常量；如："hello"
		System.out.println("hello");
		
		//输出证书常量；如：12
		System.out.println(12);
		
		//输出小数常量；如：12.44
		System.out.println(12.44);
		
		//输出字符常量；如：'A'
		//注意：System.out.println('AB'); 这是错误的
		System.out.println('A');
		
		//输出布尔常量；如：true
		System.out.println(true);
		
		//以下进制数，用十进制输出，println默认输出十进制
		//输出二进制		0,1组成，以0b开头；如：0b1001
		System.out.println(0b1001);
		
		//输出八进制		0,1，...，7组成，以0开头；如：01101
		System.out.println(01101);
		
		//输出十进制		0,1，...，9组成，整数默认为十进制
		System.out.println(12);
		
		//输出十六进制	0,1，...，a，...，f组成，以0x开头；如：0x10b1
		System.out.println(0x10b1);
		
	}
}
