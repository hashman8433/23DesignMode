package createmode.singleton;

/**
 * ClassName:Singleton.java
 * Reason:	 单例模式
 *
 * @author   zhaozj
 * @since    Ver 1.1
 * @Date	 2017年12月11日
 */
public class Singleton {
	private Singleton() {}
	
	private static Singleton instence = new Singleton();
	
	public static Singleton getSingleton() {
		return instence;
	}
}	
