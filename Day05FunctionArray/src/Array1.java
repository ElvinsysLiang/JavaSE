/**
* @author Elvinsys
* @version 创建时间：2019年1月13日 下午5:08:24
* @ClassName Array1
* @Description 数组的概念，以及一维数组的用法
*/

/*	数组
 *	（1）概念：存储同一种数据类型的多个元素的容器。
 *	（2）特点：配一个元素都有编号，从0开始，最大的编号（索引）长度是-1。
 *	（3）格式：
 *		A:数据类型[ ] 数组名；//推荐用这种声明方法
 *		B:数据类型 数组名[ ]；//以前c语言或其他语言的格式
 *	（4）数组的初始化
 *		A:动态初始化
 *			给定长度，系统给每个索引分配默认值
 *			如：int[] arr = new int[3];
 *		B:静态初始化
 *			给出初值，系统自行决定长度
 *			如：int[] arr = new int[]{1,2,3};
 *			或者：int[] arr = {1,2,3};//推荐用这种方法
 *	（5）Java的内存分配
 *			A:栈
 *				a:存储局部变量，数据使用完毕，就消失。
 *				b:局部变量是方法定义或者方法声明上定义的变量
 *			B:堆	
 *				a:存储所有new出来的东西，每一个new出来的都有地址
 *				栈中的变量都有默认值
 *				byte,short,int,long	0
 *				float,double		0.0
 *				char,				'\u0000'
 *				boolean				false
 *				引用类型				null
 *				b:数据用完后，由垃圾回收器进行定期回收。
 *			C:方法区（面向对象部分详细讲解）
 *			D:本地方法区（系统相关）
 *			E:寄存器（CPU使用）
 *	（6）数组内存图
 *		一个数组，两个数组，三个数组（两个栈变量只想同一个堆内存）
 *	（7）数组的常见操作
 *		A:遍历
 *			a:方式1
 *			b:方式2
 *		B:最值
 *			a:最大值
 *			b:最小值
 *		C:逆序
 *			a:方式1
 *			b:方式2
 *		D:通过索引查数据
 *		E:通过数据查索引
 *			a:方式1
 *			b:方式2
 *
 * */
public class Array1 {

	public static void main(String[] args) {
		//定义需要用到的变量
		int max = 0, min = 0, result = 0, index = 0;
		//用动态初始化，定义一个有3个元素的int一维数组
		int[] array1Int_1 = new int[3];
		//显示该数组的地址，以及三个元素的初始化值
		System.out.println(array1Int_1);
		System.out.println(array1Int_1[0]);
		System.out.println(array1Int_1[1]);
		System.out.println(array1Int_1[2]);
		array1Int_1[0] = 4;
		array1Int_1[1] = 5;
		array1Int_1[2] = 6;
		//System.out.println("-----");
		//写了个方法ptc代替以上分隔号
		ptc();
		//用遍历方法1遍历该数组
		printArray1_1(array1Int_1);
		ptc();
		
		//用静态初始化，定义一个有5个元素的int一维数组
		int[] array1Int_2 = new int[]{3,4,5,6,7};
		//用遍历方法2遍历该数组
		printArray1_2(array1Int_2);
		ptc();
		
		//找出数组的最大值
		max = getMax(array1Int_2);
		System.out.println("max="+max);
		ptc();
		//找出数组的最大值
		min = getMix(array1Int_2);
		System.out.println("mix="+min);
		ptc();
		
		//遍历数组原来的顺序
		printArray1_2(array1Int_2);
		//逆序方法1
		reverse1(array1Int_2);
		//再遍历
		printArray1_2(array1Int_2);
		ptc();
		//逆序方法2
		reverse2(array1Int_2);
		printArray1_2(array1Int_2);
		ptc();
		
		//输入索引号查找数据
		result = getData(array1Int_2, 2);
		System.out.println("找到的数据是："+result);
		ptc();

		//输入数据，查找索引值
		System.out.println("正在搜查数据5...");
		getIndex_1(array1Int_2, 5);
		ptc();
		
		//运用方式二，接受返回的索引值
		System.out.println("正在搜索数据4...");
		index = getIndex_2(array1Int_2, 4);
		if (index != -1) {
			System.out.println("找到数据索引值，数据4的索引值为：" + index);
		} else {
			System.out.println("没找到对应数据的索引值。");
		}
		
		
	}
	
	//分割方法
	public static void ptc() {
		System.out.println("-----");
	}
	
	//遍历数组的方法1
	public static void printArray1_1(int arr[]) {
		System.out.println("遍历方法一：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//遍历数组的方法2
	public static void printArray1_2(int arr[]) {
		System.out.println("遍历方法二：");
		for (int i = 0; i < arr.length; i++) {
			if (i==0) {
				System.out.print("[ ");
			}
			System.out.print(arr[i]+" ");
			if (i==(arr.length)-1) {
				System.out.print("]");
			}
		}
		System.out.println();
	}
	//求数组最大值的方法
	public static int getMax(int array[]) {
		System.out.println("求最大值方法：");
		int i = 0, max = 0;
		for (i = 0; i < array.length; i++) {
			if(i==0) {
				max = array[i];
				continue;
			}
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	//求数组的最小值的方法
	public static int getMix(int array[]) {
		System.out.println("求最小值方法：");
		int i = 0, min = 0;
		for (i = 0; i < array.length; i++) {
			if(i==0) {
				min = array[i];
				continue;
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	//数组的逆序排序方法1
	public static void reverse1(int array[]) {
		System.out.println("逆序排列方法1");
		int i = 0, temp = 0;
		for(i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
	}
	//数组的逆序排序方法2
	public static void reverse2(int array[]) {
		System.out.println("逆序排列方法2");
		int temp = 0;
		for(int start = 0, end = array.length-1; start<end;start++,end--) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
		}
	}
	//通过索引值查找数据
	public static int getData(int array[], int index){
		int result = 0;
		if((index>=0)|(index<array.length)) {
			System.out.println("正在查找第"+index+"号元素");
			result = array[index];
		} else {
			System.out.println("你所输入的索引号错误");
			result = -1;
		}
		return result;
	}
	//通过数据查找索引值的方法1
	public static void getIndex_1(int array[], int data) {
		for(int i = 0; i < array.length;i++) {
			if(array[i] == data) {
				System.out.println("数据"+data+"的索引值为"+i);
				break;
			}
			if(i==array.length-1) {
				System.out.println("没找到这个数据的索引值");
			}
		}
	}
	//通过数据查找索引值的方法2
	public static int getIndex_2(int array[], int data) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == data) {
				index = i;
				break;
			}
		}
		return index;
	}

}


