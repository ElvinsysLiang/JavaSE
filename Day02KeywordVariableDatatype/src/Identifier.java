/**
* @author Elvinsys
* @version 创建时间：2019年1月10日
* @ClassName Identifier
* @Description 标识符的介绍和用法，命名规范
*/

/*	标识符(identifier)
 * 	（1）是给类，接口，方法，变量等命名的字符序列
 * 	（2）组成规则：
 * 		A:英文大小写字母
 * 		B:数字
 * 		C:$和_
 * 	（3）注意事项：
 * 		A:不能以数字开头
 * 		B:不能是Java中的关键字
 * 		C:区分大小写
 * 	（4）常见的命名规则（Java）
 * 		A:包	全部小写
 * 			单级包：小写；如：baidu.com
 * 			多挤爆：小写，并用点号隔开；如：cn.itcast.com.baidu
 * 		B:类或者接口
 * 			一个单词：首字母大写；如：Student
 * 			多个单词：每个单词首字母大写；如：StudentName
 * 		C:方法或者变量
 * 			一个单词：首字母小写；如：name
 * 			多个单词：首字母小写，从第二个单词开始，首字母大写；如：getName()
 * 		D:常量	全部大写
 * 			一个单词：大写；如：PI
 * 			多个单词：大写并用_隔开；如：STUDENT_MAX_AGE
 * */
public class Identifier {
	public static void main(String [] args) {
		int x = 100;
		System.out.println(x);
		//int 01x = 100;	以数字开头，错误
		
		int Public = 200;
		//int public =200;	关键字作为变量名，错误
		System.out.println(Public);
		System.out.println("程序编译通过，详细情况请看源码");
	}
}
