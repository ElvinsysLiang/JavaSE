/**
* @author Elvinsys
* @version 2019��3��8�� ����12:48:43
* @Description:��̬��������⣺����װ��
*/

//���ӵ��࣬40�꣬���Java
class KongFather {
	public int age = 40;
	public void teach() {
		System.out.println("����Java");
	}
}

//�����࣬�̳���������20�꣬�����Java
//���ǻ���������Ӣ������
class Kong extends KongFather {
	public int age = 20;
	//��д����������Java����������
	public void teach() {
		System.out.println("��������");
	}
	//��������������Ӣ������
	public void playGame() {
		System.out.println("���Ӱ���Ӣ������");
	}
}
		
public class ID03KongFather {

	public static void main(String[] args) {
		P.i("����װ�ɿ��ӵ�������Ž�Java������ת�ͣ�");
		
		KongFather kf = new Kong();//����ת��
		
		P.i("���ڿ���װ���������������������40");
		System.out.println("kf.age="+kf.age+"��");
		P.i("���ǣ�һ������װ����Java��ʱ��ȴ¶����");
		P.i("���÷���kf.teach()");
		kf.teach();
		P.i("���Եûҳ����ţ�����һ��Ӣ�����ˣ�����ȴ���ֲ��ܴ�");
		P.i("��Ϊ����������װ��");
		//kf.playGame();
		P.i("�����ֻ�û������������");
		P.c();
		P.i("�ص��ң������������������·��������Լ�������ת�ͣ�");

		Kong k = (Kong)kf;
		
		P.i("���������20���ˣ����������ܹ���Ӣ��������");
		System.out.println("��ؿ��Ӻ�����Ϊ��"+k.age+"��");
		k.playGame();

	}

}
