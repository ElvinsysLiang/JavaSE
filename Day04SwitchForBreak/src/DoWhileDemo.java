/**
* @author Elvinsys
* @version 创建时间：2019年1月12日 下午9:14:27
* @ClassName DoWhileDemo
* @Description 关于do...while语句的介绍及用法
*/

/*	do...while语句
 * 	（1）基本格式：
 * 		do{
 * 			循环体语句；
 * 		}while（判断条件语句）；
 * 	
 * 	（2）扩展格式：
 * 		初始化语句；
 * 		do{
 * 			循环体语句；
 * 			控制条件语句；
 * 		}while（判断条件语句）
 * 	（3）三种循环的区别
 * 		A:do...while语句中，循环体语句至少被执行一次
 * 		B:for和while语句中，要先判断条件是否为true，才能判断是否执行循环体语句
 * 		C:在三种循环语句中，优先考虑for语句，其次是while语句，最后考虑do...while语句
 * 	（4）循环语句使用的注意事项：
 * 		A:注意控制条件语句，否则容易造成死循环
 * 		B:死循环的格式
 * 			a:while（true）{
 * 				...
 * 			}
 * 
 * 			b:for（；；）{
 * 				...
 * 			}
 * 	（5）循环的嵌套案例
 * 		A:输出一个四行五列的星星图像
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 * 		B:输出九九乘法表
 * 
 * */
public class DoWhileDemo {

	public static void main(String[] args) {
		//定义可能用到的变量，并初始化
		int i = 0, j = 0;
		
		//do...while语句的使用案例
		//输出10次HelloWorld
		i = 0;
		do {
			System.out.println("HelloWorld");
			i++;
		}while (i<10);
		
		//一个死循环的案例
		/*
		i = 0;
		while (true) {
			System.out.println(i);
			i++;
		}*/
		
		System.out.println("输出一个四行五列的星星图像");
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----");
		
		System.out.println("输出九九乘法表");
		/*先测试输出一个9x9的正三角形
		for(i = 1; i <10; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		//在上面代码上进行修改
		for(i = 1; i <10; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(j+"x"+i+"="+j*i);
				System.out.print('\t');
			}
			System.out.println();
		}
		
		
		System.out.println("-----");
		
		
		
	}

}
