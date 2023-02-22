package com.example.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnneBissextileTest {
    DetecteurAnneeBissextile detecteurAnneeBissextile;

    @Before
    public void setUp() throws Exception {
        this.detecteurAnneeBissextile = new DetecteurAnneeBissextile();
    }
    @After
    public void tearDown(){}

    @Test
    public void testBissextileSuccess(){

        Assert.assertEquals(true,this.detecteurAnneeBissextile.isBissextile(8));
        Assert.assertEquals(true,this.detecteurAnneeBissextile.isBissextile(32));
        Assert.assertEquals(true,this.detecteurAnneeBissextile.isBissextile(2000));

    }
    @Test
    public void testBissextileFailed(){

        Assert.assertEquals(false,this.detecteurAnneeBissextile.isBissextile(7));
        Assert.assertEquals(false,this.detecteurAnneeBissextile.isBissextile(33));
        Assert.assertEquals(false,this.detecteurAnneeBissextile.isBissextile(900));
    }

}
