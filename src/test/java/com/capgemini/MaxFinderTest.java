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
		assertEquals(9, maxfinder.findMax(new MaxFinder(9, 2, 4)));
	}

	@Test
	public void true_if_maxint_at_second() {
		assertEquals(20, maxfinder.findMax(new MaxFinder(9, 20, 4)));
	}

	@Test
	public void true_if_maxint_at_third() {
		assertEquals(30, maxfinder.findMax(new MaxFinder(9, 2, 30)));
	}

	@Test
	public void true_if_maxfloat_at_first() {
		assertEquals(9.0F, maxfinder.findMax(new MaxFinder(9.0F, 2.0F, 4.0F)));
	}

	@Test
	public void true_if_maxfloat_at_second() {
		assertEquals(20.0F, maxfinder.findMax(new MaxFinder(9.0F, 20.0F, 4.0F)));
	}

	@Test
	public void true_if_maxfloat_at_third() {
		assertEquals(40.0F, maxfinder.findMax(new MaxFinder(9.0F, 2.0F, 40.0F)));
	}

	@Test
	public void true_if_maxString_at_first() {
		assertEquals("Peach", maxfinder.findMax(new MaxFinder("Peach", "Apple", "Banana")));
	}

	@Test
	public void true_if_maxString_at_secind() {
		assertEquals("Peach", maxfinder.findMax(new MaxFinder("Apple", "Peach", "Banana")));
	}

	@Test
	public void true_if_maxString_at_third() {
		assertEquals("Peach", maxfinder.findMax(new MaxFinder("Banana", "Apple", "Peach")));
	}

}
