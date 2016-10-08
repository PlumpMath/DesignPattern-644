package org.dp.proxy;

/**
 * @author Andy
 * 测试类
 *
 */
public class Test {
	public static void main(String[] args) {
		// 使用继承的方式实现静态代理
//		Moveable m = new Car2();
//		m.move();
		// 使用聚合的方式实现代理
//		Car car = new Car();
//		Moveable m = new CarTimeProxy(car);
//		m.move();
		
		Car car = new Car();
		
		CarLogProxy clp =  new CarLogProxy(car); 
		CarTimeProxy ctp = new CarTimeProxy(clp);
		ctp.move();
		
				
	}
}
