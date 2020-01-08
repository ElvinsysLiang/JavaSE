/**
* @author Elvinsys
* @version 2019年3月8日 下午4:14:58
* @Description:描述接口的概念和使用方法
*/

/*
 *	接口（Interface）
 *	（1）回顾猫狗案例，他们仅仅提供一些基本功能
 *		比如，猫钻火圈，狗跳高等额外功能，不是动物本身就具备的
 *		而且，额外功能也不是每只猫或每只狗都具备的
 *		为某些特有的类增加的额外功能，就叫做接口
 *	（2）接口的特点：
 *		A:接口用关键字interface修饰
 *		B:类实现接口用implements修饰
 *		C:接口不能实例化
 *		D: 接口的实现类
 *			a:可以是一个抽象类
 *			b:也可以是一个具体类，而且必须重写接口中所有的抽象方法
 *	（3）接口的成员特点：
 *		A:成员变量
 *			只能是常量
 *			默认修饰符是：public static final
 *		B:构造方法
 *			没有构造方法
 *		C:成员方法
 *			只能是抽象方法
 *			默认修饰符是：public abstract
 *	（4）类与类，类与接口，接口与接口
 *		A:类与类
 *			继承关系，只能单继承，可以多层继承，构成一个继承体系
 *		B:类与接口
 *			实现关系，可以但实现，也可以多实现，一个类可以实现多个接口
 *		C:接口与接口
 *			继承关系，可以单继承，也可以多继承
 *	（5）抽象类和接口的区别
 *		A:成员区别
 *			抽象类：
 *				成员变量，可以变量也可以常量
 *				构造方法，有构造方法，用于作为父类对成员变量进行初始化
 *				成员方法，可以是抽象方法，也可以是非抽象方法
 *			接口：
 *				成员变量，只能是常量，
 *					默认public static final
 *				构造方法，没有构造方法
 *					子类如果没有继承任意类，则默认继承Object类，并不会继承接口类
 *				成员方法，只能是抽象方法
 *					默认public abstract修饰
 *		B:设计理念区别
 *			抽象类：is a，抽象类中定义的是带共性的功能
 *			接口：like a，接口中定义的是扩展功能
 *	（6）练习：
 *		A:猫狗案例，假如跳高功能
 *		B:老师和学生案例，加入弹吉他的功能
 */

public class ID05Interface {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
