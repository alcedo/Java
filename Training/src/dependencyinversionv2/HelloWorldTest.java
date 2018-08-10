package dependencyinversionv2;

import static org.junit.Assert.*;

import java.time.LocalTime;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testHelloWorldbasedOnTime() {
		HelloWorld hw=new HelloWorld();
		String actualMsg=hw.sayHello("Shubham");
		String expectedMsg="Hi Shubham Good Evening";
		assertEquals(expectedMsg, actualMsg);
	}
	
	@Test
	public void testModifiedHelloWorldbasedOnTime() {
		ModifiedHelloWorld hw=new ModifiedHelloWorld(LocalTime.now());
		String actualMsg=hw.sayHello("Shubham");
		String expectedMsg="Hi Shubham Good Evening";
		assertEquals(expectedMsg, actualMsg);
	}

	@Test
	public void testModifiedHelloWorldbasedOnTime2() {
		ModifiedHelloWorld hw=new ModifiedHelloWorld(LocalTime.of(2,2));
		String actualMsg=hw.sayHello("Shubham");
		String expectedMsg="Hi Shubham Good Morning";
		assertEquals(expectedMsg, actualMsg);
	}
	
	@Test
	public void testModifiedHelloWorldbasedOnTime12() {
		ModifiedHelloWorld hw=new ModifiedHelloWorld(LocalTime.of(12,2));
		String actualMsg=hw.sayHello("Shubham");
		String expectedMsg="Hi Shubham Good Afternoon";
		assertEquals(expectedMsg, actualMsg);
	}
	
	@Test
	public void testModifiedHelloWorldbasedOnTime16() {
		ModifiedHelloWorld hw=new ModifiedHelloWorld(LocalTime.of(16,2));
		String actualMsg=hw.sayHello("Shubham");
		String expectedMsg="Hi Shubham Good Evening";
		assertEquals(expectedMsg, actualMsg);
	}
	
	@Test
	public void testModifiedHelloWorldbasedOnTime21() {
		ModifiedHelloWorld hw=new ModifiedHelloWorld(LocalTime.of(21,2));
		String actualMsg=hw.sayHello("Shubham");
		String expectedMsg="Hi Shubham";
		assertEquals(expectedMsg, actualMsg);
	}
}
