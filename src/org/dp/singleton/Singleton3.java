package org.dp.singleton;

/**
 * 线程安全,效率高
 */
public class Singleton3 {
	private static Singleton3 instance;
	//  将构造方法私有化,不允许外部直接创建对象
	private Singleton3(){
		
	} 
	
	public static Singleton3 getInstance(){
		 if (instance==null) {
			synchronized(Singleton3.class){
				if (instance==null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
