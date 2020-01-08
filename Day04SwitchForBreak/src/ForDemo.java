/**
* @author Elvinsys
* @version 创建时间：2019年1月12日 上午9:26:14
* @ClassName ForDemo
* @Description 关于for循环的用法与案例演示
*/

/*	for循环
 * 	（1）格式：
 * 		for（初始化语句；判断条件语句；控制条件语句）{
 * 			循环体语句；
 * 		}
 * 	（2）执行流程：
 * 		A:执行初始化语句
 * 		B:执行判断条件语句
 * 			若是true，则继续
 * 			若是false，则结束循环并跳出
 * 		C:执行循环体语句
 * 		D:执行控制条件语句
 * 		E:回到b
 * 	（3）注意事项
 * 		A:判断条件语句无论简单还是复杂，结果都是boolean
 * 		B:循环体语句如果只有一条，可以省略大括号，但不建议
 * 		C:有份好就没左边大括号，有左边大括号就没有分号
 * 	（4）案例
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
 * */
public class ForDemo {

	public static void main(String[] args) {
		//定义可能要用到的变量，并初始化
		int i = 0, sum=0;
		int dig_1=0, dig_2=0, dig_3=0, factorial = 0;
		int dig_4 = 0, dig_5 = 0;
		System.out.println("案例a:输出10次HelloWorld");
		for(i = 0;i<10;i++) {
			System.out.println("HelloWorld");
		}
		System.out.println("-----");
		
		System.out.println("案例b:输出1-10的数据");
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("-----");
		
		System.out.println("案例c:输出10-1的数据");
		for(i=10;i>0;i--) {
			System.out.println(i);
		}
		System.out.println("-----");
		
		System.out.println("案例d:求1-10的和");
		sum = 0;
		for(i=1;i<11;i++) {
			sum += i;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例e:求1-100的和");
		sum = 0;
		for(i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例f:求1-100的偶数和");
		sum = 0;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例g:求1-100的奇数和");
		sum = 0;
		for(i=0;i<=100;i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例h:求5的阶乘");
		factorial = 1;
		for(i=1;i<=5;i++) {
			factorial *= i;
		}
		System.out.println("factorial="+factorial);
		System.out.println("-----");
		
		System.out.println("案例i:在控制台打印水仙花数");
		for(i = 100; i < 1000; i++) {
			//dig_1,dig_2,dig_3分别表示个位，十位，百位
			dig_1 = i%10;
			dig_2 = i/10%10;
			dig_3 = i/100%10;
			if((dig_1*dig_1*dig_1+dig_2*dig_2*dig_2+dig_3*dig_3*dig_3) == i) {
				System.out.println(i);
			}
		}
		System.out.println("-----");
		
		System.out.println("案例j:统计水仙花个数");
		sum = 0;
		for(i = 100;i < 1000; i++){
			dig_1 = i % 10;
			dig_2 = i / 10 % 10;
			dig_3 = i / 100 % 10;
			if (dig_1*dig_1*dig_1+dig_2*dig_2*dig_2+dig_3*dig_3*dig_3 == i) {
				sum += 1;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例k:改进版的回文数");
		//	一个五位数
		//	个位 = 万位
		//	十位 = 千位
		//	个位 + 十位 + 千位 + 万位 = 百位
		sum = 0;
		for(i = 10000; i < 99999; i++) {
			dig_1 = i % 10;
			dig_2 = i / 10 % 10;
			dig_3 = i / 100 % 10;
			dig_4 = i / 1000 % 10;
			dig_5 = i / 10000 % 10;
			if ((dig_1==dig_5) && (dig_2==dig_4) && ((dig_1*2+dig_2*2)==dig_3)) {
				System.out.println(i);
				sum += 1;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
		System.out.println("案例l:统计1-1000之间同时满足以下条件的数据有多少个");
		//	x%3==2
		//	x%5==3
		//	x%7==2
		sum = 0;
		for(i=1;i<=1000;i++) {
			if((i%3==2)&&(i%5==3)&&(i%7==2)) {
				System.out.println(i);
				sum += 1;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("-----");
	}
}
