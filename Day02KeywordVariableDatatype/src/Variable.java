/**
* @author Elvinsys
* @version 创建时间：2019年1月10日
* @ClassName Variable
* @Description 变量的介绍和用法，以及进制的概念
*/

/*	变量(Variable)
 * 	（1）概念：在程序执行过程中，其值在某个范围内发生改变的量
 * 	（2）定义及格式：
 * 		A:	数据类型 变量名 = 初始化值；
 * 		B:	数据类型 变量名；
 * 			变量名 = 初始化值；
 * 	（3）注意：
 * 		A:初始化：
 * 			使用变量前，必须初始化变量，但不一定在定义的时候进行初始化
 * 			也可以先定义，后面需要使用的时候再进行初始化
 * 			但建议在定义的时候就进行初始化
 * 		B:作用域
 * 			变量定义在那个大括号内，就在这个大括号内生效
 * 			并且在同一个大括号内不能有同名变量
 * 		C:在一行上，建议只定义一个变量。
 * 
 * 	数据类型(DataType)
 * 	（1）概念：Java为强类型语言，针对没种数据提供对应的数据类型
 * 	（2）分类：
 * 		A:基本数据类型：4类8种
 * 		B:引用数据类型：类，接口，数组
 * 	（3）基本数据类型
 * 		A:整数		占用字节数
 * 			byte	1
 * 			short	2
 * 			int		4	（默认）
 * 			long	8	（需在后面加l或L，建议L）
 * 		B:浮点数
 * 			float	4	（需在后面加f或F，建议F）
 * 			double	8	（默认）
 * 		C:字符
 * 			char	2	（Java字符符合Unicode编码）
 * 		D:布尔
 * 			boolean	1	（true或false）
 * 
 * 	数据类型转换
 * 	（1）boolean类型不参与转换
 * 	（2）默认转换
 * 		A:从小到大
 * 		B:byte，short，char —— int —— long —— float —— double
 * 		C:byte，short，char之间不互相转换，直接转成int类型再参与运算
 * 	（3）强制类型转换
 * 		A:从大到小
 * 		B:可能会有精度的损失，一般不建议这样使用
 * 		C:格式：
 * 			目标数据类型 变量名 = （目标数据类型）（被转换的数据）；
 * 	(4)思考题和面试题：
 *		A:下面两种方式有区别吗?
 *			float f1 = 12.345f;
 *			float f2 = (float)12.345;
 *			//第一行的12.345本身就是一个float常量
 *			//第二行的12.345是一个double常量，通过强转后赋值给float的f2
 *		B:下面的程序有问题吗，如果有，在哪里呢?
 *			byte b1 = 3;
 *			byte b2 = 4;
 *			byte b3 = b1 + b2;
 *			//错误，变量b1和b2首先变成int再相加
 *			//结果为int，必须进行强转在赋值给byte的b3
 *			byte b4 = 3 + 4;
 *			//正确，常量相加，先计算出结果，再根据结果范围系统自动选定合适的类型
 *			//结果为7，在-128~127范围之内，因此为byte，一个byte赋给byte，没毛病
 *		C:下面的操作结果是什么呢?
 *			byte b = (byte)130;
 *			//byte的范围是-128~127，如果不进行强转，系统报错
 *			//强转后，结果为-126
 *		D:字符参与运算
 *			是查找ASCII里面的值
 *			'a'		97
 *			'A'		65
 *			'0'		48
 * 
 * */
public class Variable {
	public static void main(String [] args) {
		//定义一个字节变量b并输出
		byte b = 3;
		//byte b = 128;	错误，byte范围-128~127
		System.out.println(b);
		
		//定义一个短整型变量s并输出
		short s = 100;
		System.out.println(s);
		
		//定义一个整形变量i并输出
		int i = 1000;
		//i = 10000000000;错误，超出范围，应该定义long型存储
		System.out.println(i);
		
		//定义一个长整形变量l并输出
		long l = 10000000000L;
		//l = 10000000000;错误，long型数据后面要加l或L
		System.out.println(l);
		
		//定义一个浮点型变量f并输出
		float f = 10.23F;
		//f = 10.23;错误，float型数据后面要加f或F
		System.out.println(f);
		
		//定义一个浮点型变量d并输出
		double d = 122.444;
		System.out.println(d);
		
		//定义一个字符型变量c并输出
		char c = 'r';
		//c = 'rr';错误，char型只能包含一个字符
		System.out.println(c);
		
		//定义一个布尔型变量flag并输出
		boolean flag = true;
		System.out.println(flag);
		
		//测试同一个作用域中，能否定义同类型同名变量
		int x1 = 10;
		//int x1 = 20;错误，无法通过编译
		
		//测试同一个作用域中，能否定义不同类型的同名变量
		int x3 = 10;
		//char x3 = a;错误，无法通过编译
		
		//在同一行定义三个变量
		int x4 = 10, x5 = 20, x6 = 30;
		//上面代码可以通过编译，但不建议，应该分开三行
		int x7 = 10;
		int x8 = 20;
		int x9 = 30;
		
		//变量可以先定义，在使用的时候初始化
		int x10, x11;
		x10 = 20;
		x11 = 40;
		//int aa =10,int bb = 10;错误，逗号应该改成分号
		System.out.println(x1+x3+x4+x5+x6+x7+x8+x9+x10+x11);
		
		//一个byte和一个int相加，先把byte变成int，再和另一个int相加
		byte a = 3;
		int x12 = 4;
		int sum = a + x12;
		System.out.println(sum);
		
		//两个byte相加，都变成int再相加
		byte a1 = 1;
		byte a2 = 2;
		//byte sum1 = a1 + a2;错误，相加后的int无法被一个byte接收
		int sum2 = a1 + a2;
		System.out.println(sum2);
		//又或者进行强制类型转换
		byte sum3 = (byte)(a1 +a2);
		System.out.println(sum3);
		
		//把130强转成byte后，得到的结果是-126
		byte b130 = (byte)130;
		System.out.println(b130);
		
		//看程序写结果
		System.out.println("hello" + 'a' + 1);//helloa1
		System.out.println('a' + 1 + "hello");//98hello
		System.out.println("5 + 5" + 5 + 5);//5 + 555
		System.out.println(5 + 5 + "= 5 + 5");//10= 5 + 5
		
		
		
		
		
		
	}
}
