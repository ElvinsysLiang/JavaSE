import java.util.Scanner;

/**
* @author Elvinsys
* @version ����ʱ�䣺2019��1��11�� ����2:12:49
* @ClassName ScannerDemo1
* @Description �����������ݵ�һ������
*/
public class ScannerDemo1 {
	public static void main(String [] args) {
		//��ϰ1���Ӽ����л�ȡ�������ݣ�������Ŀ��������бȽϺ�����ϴ�ֵ
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