package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaxFinderTest {

	MaxFinder maxfinder;

	@Before
	public void before() {
		maxfinder = new MaxFinder();
	}

	@Test
	public void true_if_maxint_at_first() {
		Integer[] array={2,5,6,8,9};
		assertEquals(9, maxfinder.findMax(new MaxFinder(array)));
	}

	@Test
	public void true_if_maxfloat() {
		Float[] array = { 2.0F, 5.0F, 6.0F, 18.0F, 90.0F };
		assertEquals(90.0F, maxfinder.findMax(new MaxFinder(array)));
	}

	@Test
	public void true_if_maxString() {
		String[] array = { "Zebra", "Apple", "Orange", "Mango", "Gauva", "Zebra" };
		assertEquals("Zebra", maxfinder.findMax(new MaxFinder(array)));
	}
}
