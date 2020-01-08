/**
* @author Elvinsys
* @version 2019年3月4日 上午11:24:32
* Description:How to use the Java API
*/
/*
 *	通过JDK提供的API学习Math类的使用方法
 * 	（1）API(Application Programming Interface)应用程序变成接口
 * 	（2）使用方法（一般API的使用步骤）：
 * 		A:打开帮助文档
 * 		B:点击显示，找到索引，看到输入框
 * 		C:知道要查找的类，如：Scanner、Math之类
 * 		D:在输入框里输入Scanner
 * 		E:看包，java.lang包下的类不需要导入，其他全部需要导入
 * 			如：java.util.Scanner
 * 		F:简单地看一下类的解释和说明，以及版本，要在该版本或之后出现的JDK或才能使用
 * 		G:看类的结构
 * 			成员变量	字段摘要
 * 			构造方法	构造方法摘要
 * 			成员方法	方法摘要
 * 		H:学习构造方法
 * 			有构造方法		创建对象
 * 			没有构造方法	成员可能是静态的，直接用类名调用
 * 		I:看成员方法
 * 			左边
 * 				是否静态：如果静态，可以通过类名调用
 * 				返回值类型：返回什么类型的数据，就用什么类型的变量来接收
 * 			右边
 * 				看方法名：方法名称不能写错
 * 				参数列表：注意参数类型，还有参数个数
 * 	（3）Math类的使用
 * 		A:是针对数学进行操作的类
 * 		B:没有构造方法，因为他的成员都是静态的
 * 		C:产生随机数的方法
 * 			public static double randon():[0.0~1.0)
 * 		D:如何产生一个1-100之间的随机数
 * 		E:做一个猜数字游戏
 */
import java.util.Scanner;

public class MathDemo {

	public static void main(String[] args) {
		//定义需要用到的变量
		double temRadm=0.0;
		int radmNum=0, guessNum=0;
		//实例化键盘输入
		Scanner sc = new Scanner(System.in);
		P.i("想获取一个随机数");
		P.i("然后再API的Math类中查找");
		P.i("可以用的方法是public static double random() ");
		P.i("该方法返回一个double，是[0.0~1.0)之间的数");
		P.i("由于Math类继承自java.lang，所以不需要导包");
		P.i("又由于random()方法是static修饰，所以通过类名调用");
		temRadm=Math.random();
		System.out.println("通过radom()生成的随机数是："+temRadm);
		P.i("生成一个[1~100)整数的随机数");
		P.i("(int)radom()*100+1，其结果是：");
		System.out.println((int)(Math.random()*100+1));
		P.c();
		P.i("测试从[1~100]整数的猜数字游戏");
		radmNum=(int)((Math.random()*100)+1);
		P.i("系统已经分配了一个1~100的整数数字，请输入你要猜的数字：");
		while(true) {
			guessNum=sc.nextInt();
			if(guessNum==radmNum) {
				System.out.println("恭喜你，你猜对了！");
				break;
			} else if(guessNum>radmNum){
				System.out.println("你猜错了，你猜的数大了，请重新输入。");
			} else if(guessNum<radmNum) {
				System.out.println("你猜错了，你猜的数小了，请重新输入。");
			}
		}
		sc.close();
	}

}
















