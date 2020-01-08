/**
* @author Elvinsys
* @version 创建时间：2019年1月11日 下午9:41:39
* @ClassName SwitchDemo
* @Description 关于switch语句的学习笔记
*/

/*
 * 	switch语句
 * 	（1）格式：
 * 		switch（表达式）{
 * 			case 值1：
 * 				语句体1；
 * 				break；
 * 			case 值2：
 * 				语句体2；
 * 				break；
 * 			...
 * 			default：
 * 				语句体n；
 * 				break；
 * 		}
 * 		格式说明：
 * 		A:switch：	表示switch选择结构
 * 		B:表达式：	取值限定为以下类型值（4+2）
 * 					byte，short，int，char
 * 					JDK5以后增加枚举型
 * 					JDK7以后增加字符串型
 * 		C:case：		后面跟的是要与表达式进行比较匹配的值
 * 		D:语句体：	若匹配成功，所执行的代码语句
 * 		E:break：	表示中断并跳出该作用域
 * 		F:default：	若以上case匹配失败，最后执行的代码
 * 	（2）面试题
 * 		switch语句的表达式可以是byte、long、String中的任意一种吗？
 * 		可以是byte和，但不能是long，而String是JDK7以后才可以使用
 * 	（3）执行流程：
 * 		A:首先计算表达式的值
 * 		B:和每一个case进行匹配，若匹配成功，则执行，遇到break就中断跳出作用域
 * 		C:如果匹配失败，则执行default中的代码
 * 	（4）注意事项：
 * 		A:case后面只能是常量，不能是变量，多个case不能出现相同的值
 * 		B:break一般不省略，省略了会发生case穿透，除非故意而为之
 * 		C:default一般不省略，用来对case匹配失败的时候进行情况修正
 * 		D:default不一定要放在最后，但一般是放在最后
 * 		E:switch的结束条件
 * 			a:遇到break
 * 			b:执行到末尾
 * 	（5）案例：
 * 		A:键盘录入一个数字（1-7），输出对应的星期几
 * 		B:单项选择题
 * 		C:键盘录入一个字符串
 * 			String s = sc.nextLine（）
 * 		D:根据给定的月份，输出对应的季节
 * 	（6）switch语句与if语句的关系
 * 		A:switch语句
 * 			针对几个常量的判断
 * 		B:if语句
 * 			针对boolean类型数据的判断
 * 			针对一个范围的判断
 * 			针对几个常量的判断
 * */

//需要用到键盘录入
//import java.util.Scanner;

public class SwitchDemo {
	public static void main(String [] args) {
		//定义可能用到的变量，并初始化
		int day = 0, month = 0, choice = 0;
		String myStr = "";
		
		//创建键盘输入对象sc
		//Scanner sc = new Scanner(System.in);
		/*测试键盘输入是否运行正常
		System.out.println("input something:");
		a = sc.nextInt();
		System.out.println(a);
		测试成功*/
		
		System.out.println("案例A:键盘录入一个数字（1-7），输出对应的星期几");
		System.out.println("What day ?(1-7):");
		//day = sc.nextInt();
		day = 2;
		switch (day){
			case 1:
				System.out.println("Today is Monday!");
				break;
			case 2:
				System.out.println("Today is Tuesday!");
				break;
			case 3:
				System.out.println("Today is Wednesday!");
				break;
			case 4:
				System.out.println("Today is Thuesday!");
				break;
			case 5:
				System.out.println("Today is Friday!");
				break;
			case 6:
				System.out.println("Today is Saturday!");
				break;
			case 7:
				System.out.println("Today is Sunday!");
				break;
			default:
				System.out.println("Input wrong~");
		}
		System.out.println("-----");
		System.out.println("案例B:单项选择题");
		System.out.println("姚明是个怎么样的人？（1-4）：");
		System.out.println("1.女人	2.矮个子	3.日本人	4.运动员");
		//choice = sc.nextInt();
		choice = 4;
		switch (choice) {
			case 1:
			case 2:
			case 3:
				System.out.println("您的答案错误");
				break;
			case 4:
				System.out.println("答案正确");
				break;
			default:
				System.out.println("没有这个选项");
		}
		System.out.println("-----");
		System.out.println("案例C:键盘录入一个字符串");
		//String s = sc.nextLine（）
		System.out.println("What program language:");
		//myStr = sc.nextLine();
		myStr = "java";
		switch (myStr) {
			case "java":
			case "Java":
			case "JAVA":
				System.out.println("Java good good");
				break;
			default:
				System.out.println(myStr+"? not good~");
		}
		System.out.println("-----");
		System.out.println("案例D:根据给定的月份，输出对应的季节");
		System.out.println("请输入一个月份(1-12):");
		//month = sc.nextInt();
		month = 10;
		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("您输入的月份有误");
		}
		System.out.println("-----");
	}
}
