import java.util.Scanner;

/**
* @author Elvinsys
* @version 创建时间：2019年1月11日 下午2:12:49
* @ClassName ScannerDemo1
* @Description 键盘输入数据的一个例程
*/
public class ScannerDemo1 {
	public static void main(String [] args) {
		//练习1：从键盘中获取两个数据，并用三目运算符进行比较后输出较大值
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int max = 0;
		System.out.println("please input two number:");
		a = sc.nextInt();
		b = sc.nextInt();
		max = (a>b)?a:b;
		System.out.println("max="+max);
		sc.close();
	}
}