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
		assertEquals((Integer) 9, (Integer) maxfinder.findMax(9, 2, 4));
	}

	@Test
	public void true_if_maxint_at_second() {
		assertEquals((Integer) 20, (Integer) maxfinder.findMax(9, 20, 4));
	}

	@Test
	public void true_if_maxint_at_third() {
		assertEquals((Integer) 30, (Integer) maxfinder.findMax(9, 2, 30));
	}
	@Test
	public void true_if_maxfloat_at_first() {
		assertEquals((Float) 9.0F, (Float) maxfinder.findMax(9.0F, 2.0F, 4.0F));
	}

	@Test
	public void true_if_maxfloat_at_second() {
		assertEquals((Float) 20.0F, (Float) maxfinder.findMax(9.0F, 20.0F, 4.0F));
	}

	@Test
	public void true_if_maxfloat_at_third() {
		assertEquals((Float) 30.0F, (Float) maxfinder.findMax(9.0F, 2.0F, 30.0F));
	}
	@Test
	public void true_if_maxString_at_first() {
		assertEquals("Peach",maxfinder.findMax("Peach","Apple","Banana"));
	}
	@Test
	public void true_if_maxString_at_secind() {
		assertEquals("Peach",maxfinder.findMax("Apple","Peach","Banana"));
	}
	@Test
	public void true_if_maxString_at_third() {
		assertEquals("Peach",maxfinder.findMax( "Banana", "Apple","Peach"));
	}

}
