package com.dp;

import java.lang.reflect.Proxy;

public class TestMain {
	public static void main(String[] args) {
		IWaiter w = new Waiter();
		
		JdkProxy invoke = new JdkProxy(w);
		
		IWaiter p = (IWaiter)Proxy.newProxyInstance(w.getClass().getClassLoader(), w.getClass().getInterfaces(), invoke);
		p.server();
		System.out.println(p.getClass().getName());
	}
}
