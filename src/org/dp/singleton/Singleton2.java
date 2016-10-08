package org.dp.singleton;

/**
 * 懒汉模式
 */
public class Singleton2 {
	// 1 将构造方法私有化,不允许外部直接创建对象
	private Singleton2() {
	}

	// 2 声明类的唯一实例,使用private static 修饰
	private static Singleton2 instance;

	// 3提供一个用户获取实例的方法, 使用public static修饰
	public static Singleton2 getInstance() {
		// 判断是否为空,为空的时候创建一个
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
