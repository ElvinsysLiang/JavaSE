/**
* @author Elvinsys
* @version 2019年3月4日 下午4:18:56
* Description:关于代码块的描述与实验
*/

/*
 * 	代码块
 * 	（1）用大括号{}括起来的代码。
 * 	（2）分类：
 * 		A:局部代码块
 * 			用于限定变量的生命周期，及早释放，提高内存利用率
 * 		B:构造代码块
 * 			把多个构造方法中相同的代码放到这里面，
 * 			用于每次调用构造方法前，对对象进行初始化
 * 			每个构造方法执行前首先执行构造代码块
 * 		C:静态代码块
 * 			对类的数据进行初始化，仅仅只执行一次
 * 	（3）静态代码块、构造代码块和构造方法的执行顺序
 * 		静态代码块 > 构造代码块 > 构造方法
 */

public class CodeBlockDemo {

	public static void main(String[] args) {
		//局部代码块
		P.i("在main方法中，先执行一个局部代码块");
		{
			System.out.println("in local block");
		}
		P.i("然后用无参构造方法实例化");
		Code d1 = new Code();
		P.i("在用带参构造实例化");
		Code d2 = new Code(1);
	}

}
class Code {
	//静态代码块
	static {
		System.out.println("in static block");
	}
	
	//构造代码块
	{
		System.out.println("in contribute funtion");
	}
	
	//无参构造方法
	public Code() {
		System.out.println("in no param contribute");
	}
	
	//带参构造
	public Code(int a) {
		System.out.println("in param contribute");
	}
}





























