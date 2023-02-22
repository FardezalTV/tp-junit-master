package com.example.demo;

public class Calculatrice {
  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  public float divide(int a, int b) {
    if(b == 0) {
      throw new IllegalArgumentException("Le diviseur ne peut pas être 0 !");
    } else {
      return (float)a / b;
    }
  }

  public int multiply(int a, int b) {
    return a*b;
  }
}
