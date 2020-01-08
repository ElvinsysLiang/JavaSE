/**
* @author Elvinsys
* @version 创建时间：2019年1月13日 上午8:25:39
* @ClassName BreakDemo
* @Description 关于跳转语句的介绍及用法说明
*/

/*	跳转语句
 * 	（1）包括：break，continue，return
 * 	（2）break：中断
 * 		A:用于在循环或switch语句中跳出循环
 * 		B:可跳出单层循环，跳出多层循环式需要和标签语句配合使用
 * 	（3）continue：继续
 * 		A:用于在循环中离开当次循环，但不跳出整个循环
 * 		B:填空题：
 * 			for(int x=1;x<=10;x++){
 * 				if(x%3 == 0){
 * 					//补齐代码
 * 				}
 * 				System.out.println("Hello");
 * 			}
 * 			a:如何让控制台输出2次Hello
 * 			b:如何让控制台输出7次Hello
 * 			c:如何让控制台输出13次Hello
 * 	（4）return：返回
 * 		A:用于结束方法，返回方法产生的结果
 * 		B:遇到return，程序不会往下执行
 * 
 * */
public class BreakDemo {

	public static void main(String[] args) {
		//定义需要用到的变量
		int i = 0;
		
		/*填空题：
		 * 	for(int x=1;x<=10;x++){
		 * 		if(x%3 == 0){
		 * 			//补齐代码
		 * 		}
		 * 		System.out.println("Hello");
		 * 	}
		 * 	a:如何让控制台输出2次Hello
		 * 	b:如何让控制台输出7次Hello
		 * 	c:如何让控制台输出13次Hello
		 */
		for(i=1;i<=10;i++){
			if(i%3 == 0){
			//a:如何让控制台输出2次Hello
				//break;
			//b:如何让控制台输出7次Hello
				//continue;
			//c:如何让控制台输出13次Hello
				//System.out.println("Hello");
			}
			System.out.println("Hello");
		}
		
	}

}
