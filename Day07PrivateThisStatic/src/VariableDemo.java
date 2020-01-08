/**
* @author Elvinsys
* @version 创建时间：2019年2月26日 下午9:20:07
* @ClassName VariableDemo
* @Description 成员变量和局部变量的区别
*/

/*
 * 	成员变量和局部变量的区别
 * 	（1）在类中的位置不同
 * 		成员变量：类中方法外
 * 		局部变量：方法定义中或者方法声明上
 * 	（2）在内存中的位置不同
 * 		成员变量：在堆中
 * 		局部变量：在栈中
 * 	（3）生命周期不同
 * 		成员变量：随着对象的创建而存在，随着对象的消失而消失
 * 		局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
 * 	（4）初始化值不同
 * 		成员变量：有默认值
 * 		局部变量：没有默认值，必须定义，赋值，然后才能使用
 */

//定义一个类来测试成员变量与局部变量的区别
class Variable {
	int num11 = 10;//成员变量，在类中方法外
	int num12;//成员变量可以没有初始值
	public void show() {
		int num21 = 20;//局部变量，在方法定义中
		//int num22;局部变量不能没有初始值，否则编译失败
		System.out.println(num21);
		//System.out.println(num22);
	}
}


public class VariableDemo {

	public static void main(String[] args) {
		Variable v = new Variable();
		v.show();
	}

}


















