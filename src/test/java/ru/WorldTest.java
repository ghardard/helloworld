package ru.helloworld;

import org.junit.Assert.assertEquals;

import org.junit.Test;

public class WorldTest {
	
	@Test
	public void greetResultsInHello() {
		World world = new World();
		assertEquals("Hello world!", world.greet());
	}
}
