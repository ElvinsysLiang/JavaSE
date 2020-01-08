/**
* @author Elvinsys
* @version ����ʱ�䣺2019��2��27�� ����7:37:47
* @ClassName StaticDemo
* @Description static�ؼ��ֵ�������ʹ��
*/

/*
 * 	static�ؼ���
 * 	��1����̬���������γ�Ա�����ͳ�Ա����
 * 	��2����̬���ص㣺
 * 		A:������ļ��ض�����
 * 		B:�����ڶ������
 * 		C:��������ж�����ʹ�þ�̬���ε����ݣ�
 * 		D:����ͨ���������ã�Ҳ����ͨ���������ã���������������
 * 	��3����̬���ڴ�ͼ����̬�������ڷ������ľ�̬����
 * 	��4����̬��ע�����
 * 		A:�ھ�̬������û��this����
 * 		B:��ֻ̬�ܷ��ʾ�̬
 * 	��5����̬�����ͳ�Ա����������
 * 		A:������ͬ
 * 			��̬�����������࣬�����
 * 			��Ա���������ڶ��󣬶��������ʵ������
 * 		B:�ڴ�λ�ò�ͬ
 * 			��̬�������������ľ�̬��
 * 			��Ա���������ڴ�
 * 		C:�������ڲ�ͬ
 * 			��̬������������ļ��ض����أ����������ʧ����ʧ
 * 			��Ա���������Ŷ���Ĵ��������ڣ����Ŷ������ʧ����ʧ
 * 		D:���ò�ͬ
 * 			��̬����������ͨ�����������á�Ҳ����ͨ����������
 * 			��Ա������ֻ��ͨ������������
 * 	��6��main�����Ǿ�̬��
 * 		public��Ȩ�����
 * 		static�����ô������󼴿ɵ���
 * 		void������ֵ��jvmû������
 * 		main������һ������������
 * 		String[] args�����Խ������ݣ���߳���������
 */

/*
 * 	ѧ����
 * 	��Ա������
 * 		school	String
 * 		name	String
 * 		age		int
 * 	���췽�����޲Σ��в�
 * 	��Ա������setXxx()��getXxx()
 * 	
 */

class StaStudent {
	//����ѧ������ͬһ��ѧУ
	private static String school;
	//ÿ��ѧ�������Լ�������������
	private String name;
	private int age;
	public StaStudent() {}
	public StaStudent(String school, String name, int age) {
		setSchool(school);
		setName(name);
		setAge(age);
	}
	public String getSchool() {
		return school;
	}
	public static void setSchool(String s) {
		//ֻ��static�������ܷ���static��������static�������治����this�ؼ���
		school = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show() {
		System.out.println("ѧУ��"+getSchool()+"��������"+getName()
		+"�����䣺"+getAge());
	}
	
	
}

public class StaticDemo {

	public static void main(String[] args) {
		// ����ѧ����
		StaStudent stu1 = new StaStudent("QH", "Jaco", 13);
		StaStudent stu2 = new StaStudent("QH", "Ann", 11);
		StaStudent stu3 = new StaStudent();
		stu1.show();
		stu2.show();
		stu3.show();
		System.out.println("------");
		stu3.setName("Jecy");
		stu3.setAge(15);
		stu3.show();
		System.out.println("------");
		stu1.setSchool("FD");
		stu1.show();
		stu2.show();
		stu3.show();

	}

}




















