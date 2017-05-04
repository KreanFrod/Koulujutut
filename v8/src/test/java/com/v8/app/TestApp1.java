package com.v8.app;

import junit.framework.Assert;
import org.junit.Test;

public class TestApp1 {

    @Test
    public void testPrintHelloWorld() {

        Assert.assertEquals(App.getHelloWorld(), "Hello World");

    }

}