package com.neotys.poc.descartes;

import org.junit.Assert;
import org.junit.Test;

public class TestClassToTest {
    @Test
    public void testMethodToTest() {
        Assert.assertEquals(6, new ClassToTest().methodToTest(6, false));
    }

    @Test
    public void testMethodToTest3() {
        ClassToTest classToTest = new ClassToTest();

        String result1 = classToTest.methodToTest3("toto", 1);
        String result3 = classToTest.methodToTest3("toto", 18);

        Assert.assertNotNull(result1);
    }
}
