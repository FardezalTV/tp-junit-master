package com.example.demo;

public class Factorielle {

  public int calculerFactorielle(int n) {
    if(n<0) {
      throw new FactorielleNonCalculableException();
    } else if (n == 0) {
      return 1;
    } else {
      int result = 1;
      for(int i = n; i > 0; i--) {
        result = result * i;
      }
      return result;
    }
  }
}
