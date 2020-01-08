/**
* @author Elvinsys
* @version 创建时间：2019年1月11日 下午2:34:30
* @ClassName IfDemo
* @Description 关于if语句的学习笔记
*/

/*
 * 	选择结构——if语句
 * 	（1）三种格式：
 * 		A:格式一	适用于做单个判断的情况
 * 			if（比较表达式）{
 * 				语句体；
 * 			}
 * 			执行流程：
 * 			a:	判断比较表达式的值，是true还是false
 * 			b:	如果是true，执行语句体
 * 				如果是false，则不执行
 * 		B:格式二	适用于做两个判断的情况
 * 			if（比较表达式）{
 * 				语句体1；
 * 			} else{
 * 				语句体2；
 * 			}
 * 			执行流程：
 * 			a:	判断比较表达式的值，是true还是false
 * 			b:	如果是true，执行语句体1
 * 				如果是false，执行语句体2
 * 		C:格式三	适用于做多个判断的情况
 * 			if（比较表达式1）{
 * 				语句体1；
 * 			} else if（比较表达式2）{
 * 				语句体2；
 * 			}
 * 			...
 * 			else{
 * 				语句体n；
 * 			}
 * 			执行流程：
 * 			a:	判断比较表达式1的值，是true还是false
 * 			b:	如果是true，执行语句体1
 * 			c：	如果是false，则判断比较表达式二，
 * 			d：	如果是true，执行语句体2，否则再继续判断
 * 			...
 * 			如果以上都是false，则最后执行语句体n
 * 	（2）注意事项：
 * 		A:比较表达式无论简单还是复杂，结果都是boolean型
 * 		B:if语句控制的语句体如果是一条语句，可以省略大括号，如果是多条，则不能省略
 * 			建议永远不要省略
 * 		C:有左边大括号就没有分号，有分号就没有左边大括号
 * 		D:else后面如果没有if嵌套，则没有表达式
 * 		E:三种if格式，只要有一个语句体被执行，其他语句体将不会执行
 * 	（3）案例：
 * 		A:比较两个数是否相等
 * 		B:获取两个数的最大值
 * 		C:获取三个数的最大值（if语句的嵌套使用）
 * 		D:根据成绩输出对应的等级
 * 		E:根据月份输出对应的季节
 * 		F:根据x计算对应y的值并输出
 * 	（4）三目运算符与if语句之间的关系
 * 		if语句能替换三目运算符，但三目运算符无法替换所有的if语句
 * 		如：if语句第二种格式控制的是输出语句，就无法被三目运算符替换
 * */
public class IfDemo {
	public static void main(String [] args) {
		//定义可能用到的变量，并初始化
		int x = 0, y = 0;
		int a = 0, b = 0, c = 0;
		int max = 0;
		
		//if语句格式1
		x = 5;
		if(x > 0) {
			System.out.println("x大于0");//条件成立
		}
		//if语句格式2
		x = 5;
		if(x < 0) {//条件不成立
			System.out.println("x小于0");
		} else {
			System.out.println("x大于0");
		}
		//if语句格式3，改进上面的代码
		x = 5;
		if(x < 0) {
			System.out.println("x小于0");
		} else if(x == 0) {
			System.out.println("x等于0");
		} else {
			System.out.println("x大于0");
		}
		System.out.println("---------------");
		System.out.println("案例A:比较两个数是否相等");
		x = 4;
		y = 5;
		System.out.println("x="+x+" y="+y);
		if(x == y) {
			System.out.println("x等于y");
		} else {
			System.out.println("x不等于y");
		}
		System.out.println("---------------");
		System.out.println("案例B:获取两个数的最大值");
		//用if语句实现
		x = 4;
		y = 5;
		max = 0;
		if(x > y) {
			max = x;
		} else {
			max = y;
		}
		System.out.println("max="+max);
		//用三目运算符实现
		x = 4;
		y = 5;
		max = (x > y)?x:y;
		System.out.println("max="+max);
		System.out.println("---------------");
		System.out.println("案例C:获取三个数的最大值（if语句的嵌套使用）");
		//用if语句第三种格式，if语句的嵌套实现
		a = 4;
		b = 5;
		c = 7;
		max = 0;
		if(a > b) {
			if(a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if(b > c) {
				max = b;
			} else {
				max =c;
			}
		}
		System.out.println("max="+max);
		System.out.println("---------------");
		System.out.println("案例D:根据成绩输出对应的等级");
		/*	90-100	优秀
		 *	80-90	良好
		 *	70-80	中等
		 *	60-70	及格
		 *	0-60	不及格
		 *	可以用if语句的第三种格式实现
		 */
		a = 87;
		if((a >= 90) && (a <= 100)) {
			System.out.println("你的成绩是"+a+"，属于优秀");
		} else if((a >= 80) && (a < 90)) {
			System.out.println("你的成绩是"+a+"，属于良好");
		} else if((a >= 70) && (a < 80)) {
			System.out.println("你的成绩是"+a+"，属于中等");
		} else if((a >= 60) && (a < 70)) {
			System.out.println("你的成绩是"+a+"，属于及格");
		} else if((a >= 0) && (a < 60)) {
			System.out.println("你的成绩是"+a+"，属于不及格");
		} else {
			System.out.println("你输入的成绩有误。");
		} 
		System.out.println("---------------");
		System.out.println("案例E:根据月份输出对应的季节");
		/*
		 * 	春季	3,4,5月
		 * 	夏季	6,7,8月
		 * 	秋季	9,10,11月
		 * 	冬季	12,1,2月
		 * */
		x = 1;
		if((x == 3) || (x == 4) || (x == 5)) {
			System.out.println("该月份是春季");
		} else if((x == 6) || (x == 7) || (x == 8)) {
			System.out.println("该月份是夏季");
		} else if((x == 9) || (x == 10) || (x == 11)) {
			System.out.println("该月份是秋季");
		} else if((x == 12) || (x == 1) || (x == 2)) {
			System.out.println("该月份是冬季");
		} else {
			System.out.println("没有这个月份");
		}
		System.out.println("---------------");
		System.out.println("案例F:根据x计算对应y的值并输出");
		/*
		 * 	x>=3	y = 2x + 1
		 * 	-1<=x<3	y = 2x
		 * 	x<-1	y = 2x - 1
		 * */
		x = 4;
		y = 0;
		if(x >= 3) {
			y = 2 * x + 1;
		} else if((x >= -1) && (x < 3)) {
			y = 2 * x;
		} else {
			y = 2 * x - 1;
		}
		System.out.println("y="+y);
		System.out.println("---------------");
	}
}
