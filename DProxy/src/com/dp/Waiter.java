package com.dp;

public class Waiter implements IWaiter {
	
	public String server() {
		
		System.out.println("hello server");
		
		return "finish";
	}
}
