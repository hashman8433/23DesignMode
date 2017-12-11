package createmode.singleton;

/**
 * ClassName:Singleton1.java
 * Reason:	 懒汉式  单例
 *
 * @author   zhaozj
 * @since    Ver 1.1
 * @Date	 2017年12月11日
 */
public class Singleton1 {
	private Singleton1() {}
	
	private static Singleton1 instance;
	
	public static  synchronized Singleton1 getInstence() {
		if (instance == null)
			instance = new Singleton1();
		return instance;
			
	}
	
}
