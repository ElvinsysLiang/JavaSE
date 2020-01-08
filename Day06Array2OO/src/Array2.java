/**
* @author Elvinsys
* @version 创建时间：2019年2月21日 上午10:51:14
* @ClassName Array2
* @Description 二维数组的使用方法
*/

/*	二维数组
 *	（1）概念：元素是一维数组的数组。
 *	（2）格式：
 *		A:数据类型[][] 数组名 = new 数据类型[m][n];
 *		B:数据类型[][] 数组名 = new 数据类型[m][];
 *		C:数据类型[][] 数组名 = new 数据类型[][]{{...},{...}};
 *		D:数据类型[][] 数组名 = {{...},{...}};
 *	（3）注意以下定义的区别
 *		A:	int x;			//定义整型x
 *		B:	int x, y;		//定义整型x和整形y
 *		C:	int[] x, y[];	//定义一维数组x和二维数组y
 *	（3）案例：
 *		A:二维数组的遍历
 *		B:二维数组的求和
 *		C:杨辉三角(好烦，不想写）
 *	
 */
public class Array2 {

	public static void main(String[] args) {
		//定义可能需要用到的变量
		int sum = 0;
		ptf("运用格式1，动态初始化，定义一个二维数组int[3][2]");
		//该二维数组有三个一维数组，每个一维数组有2个元素
		int[][] array2Int1 = new int[3][2];
		ptf("输出二维数组的地址");
		System.out.println(array2Int1);
		ptf("输出第一个一维数组的地址");
		System.out.println(array2Int1[0]);
		ptf("输出第二个一维数组第二个元素");
		System.out.println(array2Int1[1][1]);
		ptc();
		
		ptf("运用格式2，动态给3个一维数组分配空间，元素个数分别是2,3,1");
		int [][] array2Int2 = new int[3][];
		ptf("输出二维数组的地址");
		System.out.println(array2Int2);
		ptf("输出第一个一维数组的地址");
		System.out.println(array2Int2[0]);
		ptf("给三个一维数组进行动态初始化");
		array2Int2[0] = new int[2];
		array2Int2[1] = new int[3];
		array2Int2[2] = new int[1];
		ptf("再输出第一个一维数组的地址");
		System.out.println(array2Int2[0]);
		ptf("输出第二个一维数组的第二个元素值");
		System.out.println(array2Int2[1][1]);
		ptf("给两个二维数组赋值");
		array2Int1[0][0] = 6;
		array2Int1[0][1] = 5;
		array2Int1[1][0] = 4;
		array2Int1[1][1] = 3;
		array2Int1[2][0] = 2;
		array2Int1[2][1] = 1;
		
		array2Int2[0][0] = 66;
		array2Int2[0][1] = 55;
		array2Int2[1][0] = 44;
		array2Int2[1][1] = 33;
		array2Int2[1][2] = 22;
		array2Int2[2][0] = 11;
		ptc();
		
		ptf("使用格式4，静态初始化一个二维数组");
		int[][] array2Int3 = {{111,222},{333,444},{555,666}};
		ptc();
		
		ptf("用printArray2方法遍历第1个二维数组");
		printArray2(array2Int1);
		ptf("遍历第2个二维数组");
		printArray2(array2Int2);
		ptf("遍历第3个二维数组");
		printArray2(array2Int3);
		ptc();
		
		ptf("计算公司年销售总和，数据如下：（万元）");
		ptf("第一季度：22,66,44");
		ptf("第二季度：77,33,88");
		ptf("第三季度：25,45,65");
		ptf("第四季度：11,66,99");
		ptf("先创建一个二维数组来存放数据");
		int[][] array2Int4 = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		ptf("用方法getSum()来求出总和");
		sum = getSum(array2Int4);
		System.out.println("公司年销售总额为："+sum);
		ptc();
	}
	
	public static void ptf(String info) {
		//输出注释的方法
		System.out.println(info);
	}
	
	public static void ptc() {
		//输出分隔符的方法
		System.out.println("---------------");
	}
	
	public static void printArray2(int[][] arr) {
		//遍历二维数组的方法
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	public static int getSum(int[][] arr) {
		//求整型二维数组总和的方法
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
}

















