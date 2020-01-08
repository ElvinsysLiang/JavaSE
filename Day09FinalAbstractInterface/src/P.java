/**
* @author Elvinsys
* @version 2019年3月4日 上午9:38:53
* @Description:这个类是我自定义用来输出字符串和分隔符的方法
* 	（1）i()方法主要是用来输出注释信息
* 	（2）c()方法是用来输出分隔符
*/
public class P {
	public static void i(String info) {
		//输出注释的方法
		System.out.println("//"+info);
	}
	
	public static void c() {
		//输出分隔符的方法
		System.out.println("---------------");
	}
}