package org.dp.proxy;

/**
 * @author Andy 使用聚合的方式实现代理
 *
 */
public class CarTimeProxy implements Moveable {

	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	private Moveable m;
	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行使");
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车行使结束.... 行使时间为:" + (endTime - startTime) + "毫秒");
	}

}
