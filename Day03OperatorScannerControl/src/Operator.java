/**
* @author Elvinsys
* @version 创建时间：2019年1月10日
* @ClassName Operator
* @Description 运算符的概念及作用
*/

/*	运算符
 * 	（1）概念：对常量和变量进行操作的符号
 * 	（2）分类：算数运算符，赋值运算符，比较运算符，逻辑运算符，位运算符，三目运算符
 * 	（3）算术运算符
 * 		A:+，-，*，/，%，++，--
 * 		B:+的用法：
 * 			a:加号
 * 			b:正号
 * 			c:字符连接符
 * 		C:/和%的区别
 * 			数据做除法的时候，用/取商，用%取余
 * 		D:++和--的用法
 * 			a:作用是自增自减
 * 			b:用法
 * 				单独使用时，放左操作数的前面或后面，效果一样
 * 					如：a++或者++a，效果一样
 * 				参与操作时	放在前面，先自增自减再参与运算
 * 						如：	int a =10;
 * 							int b = ++a;//a=11,b=11
 * 						放在后面，用原来的数据参与运算，再自增自减
 * 						如：	int a = 10;
 * 							int b = a++;//a=11,b=10
 * 	（4）赋值运算符
 * 		A:=，+=，-=，*=，/=，%=
 * 		B:=叫做赋值运算符，最基本的赋值运算符
 * 			如：int a=10;//把10赋值给int类型的变量a
 * 		C:扩展的赋值运算符的特点：隐含了自动强制转换
 * 		D:面试题：以下两段代码，哪段会出问题
 * 			short s =1;
 * 			s = s + 1;
 * 			//报错，short类型的s参与运算是，会先转化为int
 * 			//运算后的结果为int，无法赋值给short类型的s
 * 
 * 			short s = 1;
 * 			s += 1;
 * 			//不报错，扩展的+=，隐含了强制类型转换
* 			//第二行代码等价于：s = (short)(s+1)
 * 	（5）比较运算符
 * 		A:==，！=，>，>=，<，<=
 * 		B:无论运算符两端表达式是简单还是复杂，最终结果是boolean型数据
 * 		C:千万不要把“==”写成“=”，“=”是赋值运算符，不是比较运算符
 * 	（6）逻辑运算符
 * 		A:&，|，^，！，&&，||
 * 		B:逻辑运算符用于连接两个boolean的表达式或标识符
 * 		C:特点：
 * 			&：有false则false
 * 			|：有true则true
 * 			^：相同则false，不同则true
 * 			！：非true则false，非false则true
 * 			&&：具有短路效果的&，遇到一个表达式是false，就不继续后面的计算
 * 			||：具有短路效果的|，遇到一个表达式是true，就不继续后面的计算
 * 	（7）位运算符
 * 		A:^的用法：一个数据对另外一个数据异或2次，数据不变
 * 		B:面试题
 * 			a:实现两个变量的数据交换(四种方法）
 * 				采用第三个变量
 * 				用位异或	左边a,b,a	右边a^b
 * 			b:用最有效的方式计算2乘以8的结果	2<<3
 * 	（8）三目运算符
 * 		A:格式	比较表达式？表达式1：表达式2
 * 		B:执行流程：
 * 			首先计算比较表达式的值
 * 			如果是true，返回表达式1的结果，
 * 			如果是false，返回表达式2的结果
 * 		C:案例：
 * 			a:比较两个数据是否相等
 * 			b:获取两个数据中的最大值
 * 			c:获取三个数据中的最大值
 * 
 * 
 * 
 * */
public class Operator {
	public static void main(String [] args) {
		//定义可能用到的变量,并进行初始化
		int x1=0, x2=0, x3=0, x4=0;
		int a=0,b=0,c=0;
		int y1=0, max = 0;
		boolean flag = true;
		
		//演示算数运算符,+-*/%的用法
		x1 = 3;
		x2 = 4;
		System.out.println(x1+x2);//7
		System.out.println(x1-x2);//-1
		System.out.println(x1*x2);//12
		System.out.println(x1/x2);//0
		System.out.println(x1%x2);//3
		
		//整形除以整形，只能得到整形，想要得到小数，可以更改
		System.out.println(x1*1.0/x2);//0.75
		
		//演示+的作用
		//用作字符串的拼接
		System.out.println("x1="+x1);//x1=3
		//用作变量的相加
		System.out.println(x1+x2);//7
		
		//++单独使用是，最终结果没有区别
		x1 = 1;
		x1++;
		System.out.println(x1);//2
		x1 = 1;
		++x1;
		System.out.println(x1);//2
		
		//++参与运算后，结果就不一样
		x1 = 1;
		x2=x1++;
		System.out.println(x2);//1
		x1 = 1;
		x2=++x1;
		System.out.println(x2);//2
		
		//++,--的练习
		x1 = 3;
		x2 = 4;
		x3 = ++x1;
		x4 = x2--;
		System.out.println(x1);//4
		System.out.println(x2);//3
		System.out.println(x3);//4
		System.out.println(x4);//4
		System.out.println("---------------");
		
		//演示算数运算符，=，+=，-=，*=，/=，%=的用法
		//x2 += x1，等价于，x2 = x2 + x1
		x1 = 5;
		x2 = 6;
		x1 += x2;//x1=x1+x2
		System.out.println(x1);//11
		x1 = 5;
		x2 = 6;
		x1 -= x2;//x1=x1-x2
		System.out.println(x1);//-1
		x1 = 5;
		x2 = 6;
		x1 *= x2;//x1=x18x2
		System.out.println(x1);//30
		x1 = 5;
		x2 = 6;
		x1 /= x2;//x1=x1/x2
		System.out.println(x1);//0
		x1 = 5;
		x2 = 6;
		x1 %= x2;//x1=x1%x2
		System.out.println(x1);//5
		System.out.println("---------------");
		
		//以下代码演示比较运算符的运算结果
		x1 = 3;
		x2 = 4;
		x3 = 3;
		
		System.out.println(x1 == x2);//false
		System.out.println(x1 == x3);//true
		System.out.println((x1+x2) == (x1+x3));//false
		System.out.println(x1 != x3);//false
		System.out.println(x1 > x2);//false
		System.out.println(x1 >= x2);//false
		System.out.println(x1 < x2);//true
		System.out.println(x1 <= x2);//true
		
		//flag = (x1 = x2)错误，括号不是一个boolean型数据，不能赋值给flag
		flag = (x1 == x2);//正确
		
		x1 = (x3 = x2);
		System.out.println(x1);//4
		System.out.println(x2);//4
		System.out.println(x3);//4
		
		//逻辑运算符的用法演示
		a = 3;
		b = 4;
		c = 5;
		
		//&逻辑与
		System.out.println((a > b) & (a > c)); //false & false = false
		System.out.println((a > b) & (a < c)); //false & true = false
		System.out.println((a < b) & (a > c)); //true & false = false
		System.out.println((a < b) & (a < c)); //true & true = true
		
		//|逻辑或
		System.out.println((a > b) | (a > c)); //false | false = false
		System.out.println((a > b) | (a < c)); //false | true = true
		System.out.println((a < b) | (a > c)); //true | false = true
		System.out.println((a < b) | (a < c)); //true | true = true
		
		//^逻辑异或
		System.out.println((a > b) ^ (a > c)); //false ^ false = false
		System.out.println((a > b) ^ (a < c)); //false ^ true = true
		System.out.println((a < b) ^ (a > c)); //true ^ false = true
		System.out.println((a < b) ^ (a < c)); //true ^ true = false
		
		//!逻辑非
		System.out.println(!(a > b)); //!false = true
		System.out.println(!(a < b)); //!true = false
		System.out.println(!!(a > b)); //!!false = false
		System.out.println(!!!(a > b)); //!!false = true
		
		//&&双与
		System.out.println((a > b) && (a > c)); //false && false = false
		System.out.println((a > b) && (a < c)); //false && true = false
		System.out.println((a < b) && (a > c)); //true && false = false
		System.out.println((a < b) && (a < c)); //true && true = true
		
		x1 = 3;
		y1 = 4;
		
		//boolean b1 = ((x++ == 3) & (y++ == 4));
		//boolean b1 = ((x++ == 3) && (y++ == 4));
		//boolean b1 = ((++x == 3) & (y++ == 4));
		flag = ((++x1 == 3) && (y1++ == 4));
		System.out.println("x1:"+x1);
		System.out.println("y1:"+y1);//y1不会发生自增
		System.out.println(flag);
		System.out.println("---------------");
		
		//位运算符的运用
		a = 3;
		b = 4;
		
		System.out.println(3 & 4);//0
		//0011	&	0100	=	0000
		System.out.println(3 | 4);//0111,7
		System.out.println(3 ^ 4);//0111,7
		System.out.println(~3);//1100,-4,最高位是符号位
		
		//^的用法：一个数据对另一个数据异或两次，该数本身不变
		a = 10;
		b = 20;
		System.out.println(a^b^b);//10
		System.out.println(a^b^a);//20
		
		//面试题：实现整形变量的数据交换
		//方法1：利用第三个变量进行交换
		a = 10;
		b = 20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		c = a;
		a = b;
		b = c;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("---");
		//方法2：利用异或运算符进行交换
		a = 10;
		b = 20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("---");
		//方法3：利用变量相加减进行交换
		a = 10;
		b = 20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("---");
		//方法4：方法3的改进
		a = 10;
		b = 20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a = (a+b)-(a=b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("---------------");
		
		//三目运算符
		a = 4;
		b = 5;
		c = (( a > b ) ? ( a - b ) : ( a + b ));
		System.out.println(c);//9
		
		//练习1，用三目运算符，取两个数的最大值
		a = 4;
		b = 5;
		max = 0;
		max = ((a>b) ? a : b);
		System.out.println("max="+max);//5
		
		//练习2，用三目运算符，取三个数的最大值
		//方法1，分两步，先比较其中两个，把结果暂存，再和第三个比较
		a = 4;
		b = 5;
		c = 6;
		max = 0;
		max = ((a>b) ? a : b);
		max = ((max>c) ? max : c);
		System.out.println("max="+max);//6
		//方法2，一行代码完成，但不推荐这种做法
		a = 4;
		b = 5;
		c = 6;
		max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("max="+max);//6
		//max = (((a>b) ? a : b) > c) ? (((a>b) ? a : b) : c);
		//上面这种做法错误
	}
}
