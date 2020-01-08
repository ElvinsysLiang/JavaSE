/**
* @author Elvinsys
* @version 创建时间：2019年2月27日 上午9:19:06
* @ClassName NoNameDemo
* @Description 描述匿名对象的概念和使用
*/

/*
 * 	匿名对象
 * 	（1）概念：就是没用名字的对象？
 * 	（2）应用场景：
 * 		A:调用方法，仅仅只调用一次的时候
 * 		B:可以作为实际参数传递
 * 	（3）好处：匿名对象调用完毕就是垃圾，可以被垃圾回收器回收
 */

class Noname {
	public void show() {
		System.out.println("Hello World");
	}
}
class NonameShow {
	public void method(Noname n) {
		n.show();
	}
}

public class NoNameDemo {

	public static void main(String[] args) {
		//不用匿名对象，通过StudentShow类来使用show()；
		//必须先实例化两个对象，再用对象来调用方法
		Noname nn = new Noname();
		NonameShow ns = new NonameShow();
		ns.method(nn);
		//但，方法是一次性使用的话
		//直接用匿名对象，就不需要实例化
		System.out.println("-使用匿名对象-");
		new NonameShow().method(new Noname());
	}

}
















