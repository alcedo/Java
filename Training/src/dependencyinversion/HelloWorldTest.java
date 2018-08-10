package dependencyinversion;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testHelloWorldbasedOnTime() {
		HelloWorld hw=new HelloWorld();
		String actualMsg=hw.sayHello("Shubham");
		String expectedMsg="Hi Shubham Good Evening";
		assertEquals(expectedMsg, actualMsg);
	}

}
