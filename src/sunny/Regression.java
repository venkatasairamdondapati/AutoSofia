package sunny;

import org.testng.annotations.Test;

public class Regression {
	
	launch objlun = new launch();
	log objlog = new log();
	
	 userinfo objuser = new userinfo();
	

	
	
	@Test
	public void testOne() {
		System.out.println("test NG test running");
		//objlun.fnbrowserLaunch();
		objlun.fnNavigatetourl();
		objlog.login();
	    objuser.ram();
		
	}
	
	@Test
	public void TestDummy() {
		System.out.println("Test Dummy executed");

	}
	
	
	public void TestKiran() {
		System.out.println("Test Kiran executed");

	}

}
