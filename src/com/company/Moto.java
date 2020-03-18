package com.company;

public class Moto extends Vehiculo implements Socorrible {

  public Moto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
    super(velocidad, aceleracion, anguloDeGiro, patente);
    this.peso = 300.0;
    this.ruedas = 2;
  }

  @Override
  public void socorrer() {
    System.out.println("Socorriendo moto " + this.getPatente());
  }
}
