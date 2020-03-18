package com.company;

public class Auto extends Vehiculo implements Socorrible {

  public Auto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
    super(velocidad, aceleracion, anguloDeGiro, patente);
    this.peso = 1000.0;
    this.ruedas = 4;
  }

  @Override
  public void socorrer() {
    System.out.println("Socorriendo auto " + this.getPatente());
  }
}
