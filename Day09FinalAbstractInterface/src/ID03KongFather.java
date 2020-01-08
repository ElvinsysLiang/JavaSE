/**
* @author Elvinsys
* @version 2019年3月8日 下午12:48:43
* @Description:多态的问题理解：孔子装爹
*/

//孔子爹类，40岁，会教Java
class KongFather {
	public int age = 40;
	public void teach() {
		System.out.println("讲解Java");
	}
}

//孔子类，继承自他爹，20岁，不会教Java
//但是会教论语和玩英雄联盟
class Kong extends KongFather {
	public int age = 20;
	//重写方法，不会Java，但会论语
	public void teach() {
		System.out.println("讲解论语");
	}
	//新增方法，会玩英雄联盟
	public void playGame() {
		System.out.println("孔子爱玩英雄联盟");
	}
}
		
public class ID03KongFather {

	public static void main(String[] args) {
		P.i("孔子装成孔子爹，想出门教Java（向上转型）");
		
		KongFather kf = new Kong();//向上转型
		
		P.i("现在孔子装成他爹，所以他的年纪是40");
		System.out.println("kf.age="+kf.age+"岁");
		P.i("但是，一开口想装爹教Java的时候却露馅了");
		P.i("调用方法kf.teach()");
		kf.teach();
		P.i("他显得灰常慌张，想来一盘英雄联盟，但是却发现不能打");
		P.i("因为现在他正在装爹");
		//kf.playGame();
		P.i("最后他只好灰溜溜地走人了");
		P.c();
		P.i("回到家，他马上脱下他爹的衣服，做回自己（向下转型）");

		Kong k = (Kong)kf;
		
		P.i("现在他变回20岁了，并且终于能够玩英雄联盟了");
		System.out.println("变回孔子后，年龄为："+k.age+"岁");
		k.playGame();

	}

}
