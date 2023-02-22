package com.example.demo;

public class DetecteurAnneeBissextile {

  public boolean isBissextile(int annee) {
    return ((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0);
  }

}
