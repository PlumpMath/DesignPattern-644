package org.dp.singleton;

/**
 * 单例模式Singleton 应用场合:有些对象只需要一个就够了,eg:古代的皇帝 保证整个应用程序中某个实例有且只有一个 类型:饿汉模式,懒汉模式
 */
public class Singleton {
	// 1 将构造方法私有化,不允许外部直接创建对象
	private Singleton() {
	}

	// 2 自己创建一个类的唯一实例,当这个类加载的时候就会创建一个类的唯一实例,不管用户是否调用这个实例,它都已经加载了.
	private static Singleton instance = new Singleton();

	// 3 提供一个获取实例的方法
	public static Singleton getInstance() {
		return instance;
	}

}
