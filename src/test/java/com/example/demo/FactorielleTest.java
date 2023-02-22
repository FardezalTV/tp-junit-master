package com.example.demo;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorielleTest {
  Factorielle factorielle;

  @Before
  public void setUp() {
    this.factorielle = new Factorielle();
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testFactorielle0() {
    Assert.assertEquals(1, factorielle.calculerFactorielle(0));
  }

  @Test
  public void testFactorielle1() {
    Assert.assertEquals(1, factorielle.calculerFactorielle(1));
  }

  @Test
  public void testFactorielle8() {
    Assert.assertEquals(40320, factorielle.calculerFactorielle(8));
  }

  @Test(expected = FactorielleNonCalculableException.class)
  public void testFactorielleNegatif() {
    factorielle.calculerFactorielle(-1);
  }
}
