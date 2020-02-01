package com.test.junittest.pk8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateTest {

	@Test
	void testCalculateAdd() {
		Calculate res =new Calculate();
		assertEquals(10, res.CalculateAdd(5, 5));
//		if(res.CalculateAdd(5, 5)!=10)
//			fail("²âÊÔ²»Í¨¹ý¡£");
	}

}
