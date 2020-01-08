/**
* @author Elvinsys
* @version 创建时间：2019年1月13日 下午2:10:05
* @ClassName 类FunctionDemo
* @Description 关于方法的介绍和用法
*/

/*	方法（Function）
 * 	（1）概念：具有特定功能的代码块。
 *			 很多编程语言里面被称为函数	
 * 	（2）格式：
 * 		修饰符   返回值类型   方法名（参数类型   参数名...）{
 * 			方法体；
 * 			return返回值；
 * 		}
 * 	（3）格式解读：
 * 		修饰符：public private protected static
 * 		返回值类型：返回特定结果的数据类型
 * 		参数类型，参数的类型
 * 		参数名：形式参数的变量名
 * 		参数分类：
 * 			实参：实际参与运算的数据
 * 			形参：方法上定义的，用于接收实际参数的变量
 * 		return：用于返回结果，并结束方法
 * 		返回值：通过return返回的数据
 * 	（4）两个明确：
 * 		方法一般不写在主方法里面
 * 		返回值类型：结果数据的类型
 * 		参数列表：参数的个数，以及对应的数据类型
 * 	（5）方法调用
 * 		A:有明确返回值的方法
 * 			a:单独调用，没有意义
 * 			b:输出调用，不一定很好
 * 			c:赋值调用，把结果返回待进一步处理
 * 		B:void类型修饰的方法
 * 			a:只能单独调用
 * 	（6）方法的注意事项
 * 		A:方法比调用就不执行
 * 		B:方法之间是平级关系，不能嵌套定义
 * 		C:方法定义的时候，参数是用“，”逗号隔开
 * 		D:方法在调用的时候，不用传递数据类型
 * 		E:如果方法有明确的返回值类型，就必须有return语句返回
 * 	（7）方法重载
 * 		在同一个类中，方法名相同，参数列表不同，与返回值唔关。
 * 		参数列表不同指的是：
 * 			a:参数的个数不同
 * 			b:参数对应的数据类型不同
 * 	（8）案例：
 * 		1.两个数求和
 * 		2.比较两个数中的较大值
 * 		3.比较两个数据是否相同
 * 		4.比较三个数中的最大值
 * 		5.输出m行n列的星型
 * 		6.输出n n乘法表
 * */
public class FunctionDemo {

	public static void main(String[] args) {
		
		//定义要用到的变量，并初始化
		int a = 0, b = 0, c = 0;
		int sum = 0, max = 0, m = 0, n = 0;
		
		System.out.println("案例1.两个数求和");
		a = 90;
		b = 11;
		sum = addFun(a,b);
		System.out.println("sum="+sum);
		System.out.println("-----");
		
		System.out.println("案例2.比较两个数中的较大值");
		a = 22;
		b = 144;
		max = maxFun(a,b);
		System.out.println("max="+max);
		System.out.println("-----");
		 
		System.out.println("案例3.比较两个数据是否相同");
		a = 33;
		b = 33;
		equ(a,b);
		System.out.println("-----");
		 
		System.out.println("案例4.比较三个数中的最大值，方法重载");
		a = 11;
		b = 22;
		c = 33;
		max = max(a,b,c);
		System.out.println("max="+max);
		System.out.println("-----");
		
		System.out.println("案例5.输出m行n列的星型");
		m = 4;
		n = 6;
		star(m,n);
		System.out.println("-----");
		
		System.out.println("案例6.输出n n乘法表");
		n = 7;
		mult(n);
		System.out.println("-----");
		
	}
	
	//方法1.两个数求和
	public static int addFun(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	//方法2.比较两个数中的较大值
	public static int maxFun(int a, int b) {
		int max = ((a>b)?a:b);
		return max;
	}
	
	//方法3.比较两个数据是否相同
	public static void equ(int a, int b) {
		if (a == b) {
			System.out.println(a+" equal "+b);
		} else {
			System.out.println(a+" not equal "+b);
		}
	}
	//方法4.比较三个数中的最大值，方法重载
	public static int max(int a, int b, int c) {
		int max = 0;
		if(a>b) {
			if(a>c) {
				max = a;
			}else {
				max = c;
			}
		}else {
			if(b>c) {
				max = b;
			}else {
				max = c;
			}
		}
		return max;
	}
	//方法5.输出m行n列的星型
	public static void star(int m, int n) {
		for(int i = 0; i < m; i++ ) {
			for(int j = 0; j < n; j++) {
				System.out.print("*"+'\t');
			}
			System.out.println();
		}
	}
	//方法6.输出n n乘法表
	public static void mult(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+j*i+'\t');
			}
			System.out.println();
		}
	}

}
