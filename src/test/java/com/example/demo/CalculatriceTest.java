package com.example.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {

  Calculatrice calculatrice;

  @Before
  public void setUp() {
    this.calculatrice = new Calculatrice();
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testAddition() {
    Assert.assertEquals(7, calculatrice.add(3, 4));
    Assert.assertTrue(calculatrice.add(3,4) == 7);
    Assert.assertNotNull(calculatrice);
    Calculatrice autreVariable = calculatrice;
    Assert.assertSame(autreVariable, calculatrice);
  }
}
