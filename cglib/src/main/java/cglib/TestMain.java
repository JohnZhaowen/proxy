package cglib;

public class TestMain {
	public static void main(String[] args) {
		
		CglibProxy proxy = new CglibProxy();
		Waiter w = (Waiter)proxy.getProxy(Waiter.class);
		w.server();
	}
}
