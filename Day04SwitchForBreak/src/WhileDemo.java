/**
* @author Elvinsys
* @version 创建时间：2019年1月12日 下午3:06:46
* @ClassName WhileDemo
* @Description 关于while循环的介绍及用法
*/

/*	while循环
 *	（1）基本格式：
 *		while（判断条件语句）{
 *			循环体育局；
 *		} 
 *
 *		扩展格式：
 *		初始化语句；
 *		while（判断条件语句）{
 *			循环体语句；
 *			控制条件语句；
 *		}
 *	（2）while循环和for循环语句可以等价交换
 *	（3）和for的区别
 *		a:使用上的区别
 *			for语句的控制条件变量，在循环结束后就不能再使用了
 *			while循环的可以继续使用
 *		b:使用地方不一样
 *			for语句适合在一个明确范围内进行判断
 *			while适合在范围不明的情况下进行判断
 *	（4）案例：
 * 		a:输出10次HelloWorld
 * 		b:输出1-10的数据
 * 		c:输出10-1的数据
 * 		d:求1-10的和
 * 		e:求1-100的和
 * 		f:求1-100的偶数和
 * 		g:求1-100的奇数和
 * 		h:求5的阶乘
 * 		i:在控制台打印水仙花数
 * 		j:统计水仙花个数
 * 			水仙花是一个三位数字，
 * 			个位的立方+十位的立方+百位的立方=其本身
 * 		k:改进版的回文数
 * 			一个五位数
 * 			个位 = 万位
 * 			十位 = 千位
 * 			个位 + 十位 + 千位 + 万位 = 百位
 * 		l:统计1-1000之间同时满足以下条件的数据有多少个
 * 			x%3==2
 * 			x%5==3
 * 			x%7==2
 *		m:注目朗玛峰问题
 *		n:消防存钱问题
 *		
 * 
 * 
 * 
 * */

public class WhileDemo {

	public static void main(String[] args) {
		//定义需要用到的变量，并初始化
		int i=0, sum = 0, factorial = 0, high = 0;
		int dig_1 = 0, dig_2 = 0, dig_3 = 0, dig_4 = 0, dig_5 = 0;
		//测试for语句和while语句的条件变量使用
		for(i=0; i<5;i++) {
			System.out.println("HelloWorld");
		}
		System.out.println("这个时候的变量i="+i);
		//这个时候，i的作用域是main函数以内。
		
		//假如，在for里面又想定义一个i，可行么？
		//for(int i=0;i<4;i++) {
		//	System.out.println("H2");
		//}
		//不能这样做，系统不允许在main作用域与里面循环定义同名变量
		
		//用while语句替代for语句，重构以下案例
		System.out.println("案例a:输出10次HelloWorld");
		i = 0;//i当前的值是5，为了能重新计数，i要重新初始化为0
		while (i<5) {
			System.out.println("HelloWorld");
			i++;
		}
		System.out.println("-----");
		
		System.out.println("案例b:输出1-10的数据");
		i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----");
		
		System.out.println("案例c:输出10-1的数据");
		i = 10;
		while(i >0) {
			System.out.println(i);
			i--;
		}
		System.out.println("-----");
		
		System.out.println("案例d:求1-10的和");
		i = 1;
		sum = 0;
		while (i<=10) {
			sum += i;
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例e:求1-100的和");
		i = 0;
		sum = 0;
		while (i<=100) {
			sum += i;
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例f:求1-100的偶数和");
		i = 0;
		sum = 0;
		while (i<=100) {
			if (i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例g:求1-100的奇数和");
		i = 0;
		sum = 0;
		while (i<=100) {
			if (i%2==1) {
				sum += i;
			}
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例h:求5的阶乘");
		i = 1;
		factorial = 1;
		while (i<=5) {
			factorial *= i;
			i++;
		}
		System.out.println("factorial="+factorial);
		System.out.println("-----");
		
		System.out.println("案例i:在控制台打印水仙花数");
		//水仙花是一个三位数字，
		//个位的立方+十位的立方+百位的立方=其本身
		i = 100;
		dig_1 = 0;
		dig_2 = 0;
		dig_3 = 0;
		while (i<1000) {
			dig_1 = i%10;
			dig_2 = i/10%10;
			dig_3 = i/100%10;
			if ((dig_1*dig_1*dig_1+dig_2*dig_2*dig_2+dig_3*dig_3*dig_3)==i) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("-----");
		
		System.out.println("案例j:统计水仙花个数");
		i = 100;
		sum = 0;
		dig_1 = 0;
		dig_2 = 0;
		dig_3 = 0;
		while (i<1000) {
			dig_1 = i%10;
			dig_2 = i/10%10;
			dig_3 = i/100%10;
			if ((dig_1*dig_1*dig_1+dig_2*dig_2*dig_2+dig_3*dig_3*dig_3)==i) {
				sum++;
			}
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例k:改进版的回文数");
		//一个五位数
		//个位 = 万位
		//十位 = 千位
		//个位 + 十位 + 千位 + 万位 = 百位
		i = 10000;
		sum = 0;
		while (i<=99999) {
			dig_1 = i%10;
			dig_2 = i/10%10;
			dig_3 = i/100%10;
			dig_4 = i/1000%10;
			dig_5 = i/10000%10;
			if ((dig_1==dig_5)&&(dig_2==dig_4)&&((dig_1*2+dig_2*2))==dig_3) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("-----");
		
		System.out.println("案例l:统计1-1000之间同时满足以下条件的数据有多少个");
		//x%3==2
		//x%5==3
		//x%7==2
		i = 1;
		while (i<=1000) {
			if((i%3==2)&&(i%5==3)&&(i%7==2)) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("-----");
		
		System.out.println("案例m:珠穆朗玛峰问题");
		//珠穆朗玛峰高8848m，我有一张足够大的纸，厚度为1mm
		//要折多少次才能到达珠穆朗玛峰的高度呢？
		i=0;
		high = 1;//纸的厚度为1mm
		
		while (high < 884800) {
			i++;
			high *= 2;
		}
		System.out.println("需要折"+i+"次，高度为"+high);
		System.out.println("-----");
		/*
		System.out.println("案例n:小芳存钱问题");
		System.out.println("-----");

		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
